package com.lz.art.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;

public abstract class TeskDataLoad {
	/**
	 * 读取源文件，生成对应的对象数据
	 * 
	 * @param f
	 * @param t
	 * @return List<T>
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> readJson(File f, T t) throws IOException {
		List<T> results = com.google.common.collect.Lists.newArrayList();
		List<String> jsons = readFile(f);
		for (String json : jsons) {
			try {
				T nt = (T) new Gson().fromJson(json, t.getClass());
				results.add(nt);
			} catch (Exception e) {
				
			}
		}
		return results;
	}

	//读取源数据生成json串的list
	private List<String> readFile(File f) throws IOException {
		List<String> results = com.google.common.collect.Lists.newArrayList();
		InputStreamReader reader = new InputStreamReader(new FileInputStream(f)); // 建立一个输入流对象reader
		BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
		String line = "";
		line = br.readLine();
		while (line != null) {
			line = br.readLine();
			results.add(line);
		}

		br.close();
		reader.close();
		return results;
	}

	/**
	 * 修改对应属性
	 * @param list
	 */
	public abstract <T> void changeAttribute(List<T> list);
	

}
