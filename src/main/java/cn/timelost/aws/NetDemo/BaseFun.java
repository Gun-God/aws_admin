package cn.timelost.aws.NetDemo;

import com.sun.jna.Platform;

class BaseFun {
	// 获取操作平台信息
	public static String getOsArch() {
		String arch = System.getProperty("os.arch").toLowerCase();
		final String name = System.getProperty("os.name");
		String osArch;
		switch(Platform.getOSType()) {
			case Platform.WINDOWS: {
				if ("i386".equals(arch))
	                arch = "x86";
				else if ("x86_64".equals(arch)) {
	                arch = "amd64";
	            }
				osArch = "win32-" + arch;
			}
            break;
			default: {
				osArch = name.toLowerCase();
	            if ("x86".equals(arch)) {
	                arch = "i386";
	            }
	            if ("x86_64".equals(arch)) {
	                arch = "amd64";
	            }
	            int space = osArch.indexOf(" ");
	            if (space != -1) {
	            	osArch = osArch.substring(0, space);
	            }
	            osArch += "-" + arch;
			}
	        break;
	       
		}

		return osArch;
	}	
	
	//获取加载SDK库
	public static String LoadSDKLibrary() {
		String filePath = System.getProperty("user.dir").replaceFirst("/","").replaceAll("%20"," ");
		String loadLibrary = "";
		String OsArch = getOsArch();
		
		if(OsArch.toLowerCase().startsWith("win32-x86")) {
			loadLibrary = filePath + "\\libs\\win32\\";
		} else if(OsArch.toLowerCase().startsWith("win32-amd64") ) {
			loadLibrary = filePath + "\\libs\\win64\\";
		} 

		String loadSDKLibrary = loadLibrary + "NetDEVSDK";
		System.out.printf("[Load SDKLibrary Path : %s]\n", loadSDKLibrary);
		return loadSDKLibrary;
	}
}
