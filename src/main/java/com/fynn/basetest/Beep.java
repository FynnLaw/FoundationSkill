package com.fynn.basetest;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;

public class Beep {
	public static void main(String agrs[]){
		try {
			testBep2();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static JNative getBeepJNative() throws NativeException {
		return new JNative("kernel32.dll", "Beep");
	}

	public static void beep(JNative jn, int freq, int dwruration) throws NativeException, IllegalAccessException {
		jn.setRetVal(Type.VOID);
		jn.setParameter(0, freq);// 20--22000Hz
		jn.setParameter(1, dwruration);
		jn.invoke();
	}

	// 奏响你的都来米吧
	public static void testBep2() throws NativeException, IllegalAccessException {
		int freqs[] = {440,442};
		JNative jn = getBeepJNative();
		for (int i = 0, l = 1000; i < l; i++) {
			beep(jn, freqs[i%2], 2000);
		}
	}
}
