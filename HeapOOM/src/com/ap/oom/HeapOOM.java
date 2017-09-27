package com.ap.oom;

import java.util.ArrayList;
/**
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 将堆的最小值-Xms参数与最大值-Xmx参数设置为一样即可避免堆自动扩展
 * -XX:+HeapDumpOnOutOfMemoryError参数可以让虚拟机在出现内存溢出异常时Dump出当前
 * 的 内存堆转储快照以便事后进行分析
 * @author zhangwei
 *
 */
public class HeapOOM {
static class OOMObject{
	
}
public static void main(String[] args) {
	ArrayList<OOMObject> list = new ArrayList<OOMObject>();
	while (true){
		list.add(new OOMObject());
	}
}
}
