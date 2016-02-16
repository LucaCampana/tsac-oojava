package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	final static int TEMPERATURES_TO_READ = 1000;
	
	public static void main(String [] args){
		TemperatureSensor sensor = new TemperatureSensor();
		DoubleWrapper max = new DoubleWrapper(Double.MIN_VALUE);
		DoubleWrapper sum = new DoubleWrapper(0);
		DoubleWrapper count = new DoubleWrapper(0);
		Map <Integer, Integer> errorMap = new HashMap <>();
		sensor.setListener(new TemperatureSensorListener(){
			public void onSuccess(double temperature) {
				if (temperature > max.get()) max.set(temperature);
				sum.set(sum.get() + temperature);
				count.set(count.get() + 1);
			}
			public void onFailed(TemperatureSensorException exception) {
				try {
					throw exception;
				} 
				catch (TemperatureSensorException e) {
					if (errorMap.containsKey(e.getErrorcode())){
						errorMap.put(e.getErrorcode(), errorMap.get(e.getErrorcode()) + 1);
					}
					else errorMap.put(e.getErrorcode(), 1);
				}
			}
		});
		for (int i = 0; i < TEMPERATURES_TO_READ; i++){
			sensor.next();
		}
		System.out.println("Valore massimo: " + max.get());
		System.out.println("valore medio non arrotondato: " + sum.get() / count.get());
		System.out.println("Valore medio: " + Math.round(sum.get() / count.get()));
		Iterator <Integer> iterator = errorMap.keySet().iterator();
		int key;
		while (iterator.hasNext()){
			key = iterator.next();
			System.out.println("errorCode " + key + " "
					+ errorMap.get(key) + " volte");
		}
	}
}
