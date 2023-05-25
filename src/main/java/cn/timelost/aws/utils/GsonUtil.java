package cn.timelost.aws.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;

/**
 * 类说明 ：Json数据解析
 * 
 * @author henry
 * @date 创建时间：2017年6月5日
 * @version 版本 1.0
 */
public class GsonUtil {

	/**
	 * 将Json数据解析成相应的映射对象
	 */
	public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
		Gson gson = new Gson();
		T result = gson.fromJson(jsonData, type);
		return result;
	}

	/*
	 * public static <T> List<T> parseJsonArrayWithGson(String jsonData,
	 * Class<T> type) { Gson gson = new Gson(); List<T> result =
	 * gson.fromJson(jsonData, new TypeToken<List<T>>() { }.getType()); return
	 * result; }
	 */

	/**
	 * 将Json数组解析成相应的映射对象列表
	 */
	public static <T> ArrayList<T> fromJsonList(String json, Class<T> cls) {
		ArrayList<T> mList = new ArrayList<T>();
		Gson gson = new Gson();
		JsonArray array = new JsonParser().parse(json).getAsJsonArray();
		for (final JsonElement elem : array) {
			mList.add(gson.fromJson(elem, cls));
		}
		return mList;
	}

}
