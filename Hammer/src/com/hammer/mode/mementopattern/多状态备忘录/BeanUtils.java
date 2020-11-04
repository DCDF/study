package com.hammer.mode.mementopattern.多状态备忘录;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	public static HashMap<String, Object> backupProp(Object bean) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			// 获得Bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// 属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor des : descriptors) {
				// 名
				String name = des.getName();
				// 方法
				Method getter = des.getReadMethod();
				// 值
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (!name.equalsIgnoreCase("class")) {
					result.put(name, fieldValue);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor des : descriptors) {
				String name = des.getName();
				if (propMap.containsKey(name)) {
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[] { propMap.get(name) });
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
