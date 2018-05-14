package com.nick.algorithms;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataProvider {

	public void loadData() throws Exception {
		URL input = new URL("http://algs4.cs.princeton.edu/14analysis/1Kints.txt");
		try (Scanner scanner = new Scanner(input.openStream())) {
			List<String> dataList = new ArrayList<>();
			while (scanner.hasNext()) {
				dataList.add(scanner.next());
			}
		}
	}
}
