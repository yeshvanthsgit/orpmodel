package com.naivebayes.model;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public interface JsonCsvUtils {
	public void jsonToCsv(final String inputPath, final String outputPath) throws FileNotFoundException, IOException, ParseException;
	public void csvToJson(final String inputPath, final String outputPath) throws FileNotFoundException, IOException;
	public void jsonToCsv(JSONArray jarray, String outputPath) throws FileNotFoundException, IOException, ParseException;
}
