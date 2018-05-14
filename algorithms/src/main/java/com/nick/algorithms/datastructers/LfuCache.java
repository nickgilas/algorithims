package com.nick.algorithms.datastructers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.DateTime;

/**
 * Generic Least Frequently/Recently Used cache implementation
 * 
 * @author Nick
 *
 */
public class LfuCache<K, V> {

	class Entry {
		V value;
		K key;
		DateTime accessTime;

		Entry(K key, V value) {
			accessTime = DateTime.now();
			this.key = key;
			this.value = value;
		}
	}

	private Map<K, Entry> entries;

	private transient int intialCapacity = 10;
	
	public LfuCache(int capacity) {
		this.intialCapacity = capacity;
		entries = new ConcurrentHashMap<K, Entry>(intialCapacity);
	}
	
	public void put(K key, V value) {
		
		// if (isFull()) {
		// // remove the oldest accessed entry and add new entry
		// Entry oldEntry = entries.get(getOldestAccessKey());
		// entries.remove(oldEntry);
		// entries.put(key, new Entry(key, value));
		// } else {
		//
		// }
		
	}
	
	public V get(K key) {
		return null;
	}
	
	private K getOldestAccessKey() {
		
		// sort the 
		return null;
	}
	private boolean isFull() {
		if (entries.size() >= intialCapacity) {
			return true;
		}
		return false;
	}
}
