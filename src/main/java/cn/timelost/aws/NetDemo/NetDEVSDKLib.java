package cn.timelost.aws.NetDemo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

import java.util.List;


public interface NetDEVSDKLib extends Library {
	NetDEVSDKLib NETDEVSDK_INSTANCE = (NetDEVSDKLib)Native.loadLibrary(BaseFun.LoadSDKLibrary(), NetDEVSDKLib.class);

	public static final int  NETDEV_LEN_2   = 2;
	public static final int  NETDEV_LEN_4   = 4;
	public static final int NETDEV_IPSAN_MAX_NUM =4;
	public static final int  NETDEV_LEN_6   = 6;
	public static final int  NETDEV_LEN_8	=8;
	public static final int NETDEV_MAX_LINK_ACTION_NUM   =9;
	public static final int  NETDEV_LEN_16	= 16;
	public static final int  NETDEV_LEN_32 	= 32;
	public static final int  NETDEV_LEN_40  = 40;
	public static final int  NETDEV_LEN_64  = 64;
	public static final int  NETDEV_LEN_128 = 128;
	public static final int  NETDEV_LEN_132 = 132;
	public static final int  NETDEV_LEN_256 = 256;
	public static final int  NETDEV_LEN_260 = 260;
	public static final int   NETDEV_LEN_480 = 480;
	public static final int  NETDEV_LEN_512 = 512;
	public static final int  NETDEV_LEN_1024= 1024;
	public static final int  NETDEV_IPADDR_STR_MAX_LEN = 64;
	public static final int  NETDEV_IPV4_LEN_MAX = 16;

	public static final int NETDEV_ALARM_SOURCE_MAX_LEN = 68;
	public static final int NETDEV_MAX_EVENT_RES_SIZE = 1024;

	public static final int NETDEV_NAME_MAX_LEN = 256;
	public static final int NETDEV_DESCRIBE_MAX_LEN = 516;

	public static final int NETDEV_TMS_FACE_RECORD_ID_LEN        =  32;
	public static final int NETDEV_TMS_CAMER_ID_LEN              =   32;
	public static final int NETDEV_TMS_PASSTIME_LEN               =  32;
	public static final int NETDEV_TMS_FACE_TOLLGATE_ID_LEN      =   32;
	public static final int NETDEV_TMS_HEAT_MAP_DEVID_LEN        =   32;
	public static final int NETDEV_TMS_HEAT_MAP_RECORD_ID_LEN    =   16;
	public static final int NETDEV_TMS_HEAT_MAP_COllECT_TIME_LEN =   18;
	public static final int NETDEV_TMS_PIC_COMMON_NUM            =   10;
	public static final int NETDEV_TMS_CAR_PLATE_CAMID_LEN       =   32;
	public static final int NETDEV_TMS_CAR_PLATE_RECORDID_LEN    =   32;
	public static final int NETDEV_TMS_CAR_PLATE_TOLLGATE_LEN    =   32;
	public static final int NETDEV_TMS_CAR_PLATE_PASSTIME_LEN    =   18;
	public static final int NETDEV_TMS_CAR_PLATE_LANEID_LEN      =   18;
	public static final int NETDEV_TMS_CAR_PLATE_CARPLATE_LEN    =   32;

	public static final int NETDEV_MONTH_DAY_MAX			=31;          /* 每月天数最大值 Maximum number of days in a month */
	public static final int NETDEV_CODE_STR_MAX_LEN     	=256;
	public static final int NETDEV_VIID_CODE_LEN			=48;
	public static final int NETDEV_USERNAME_LEN				= 132;
	public static final int NETDEV_PASSWORD_LEN				= 128;
	public static final int NETDEV_MAX_URL_LEN              = 512;
	public static final int NETDEV_STREAM_MAX_NUM			= 3;
	public static final int NETDEV_MAX_PRESET_NUM			= 256;
	public static final int NETDEV_MAX_CRUISEPOINT_NUM		= 32;
	public static final int NETDEV_MAX_CRUISEROUTE_NUM		= 16;
	public static final int NETDEV_FILE_NAME_LEN			= 256;

	public static final int NETDEV_NTP_SERVER_LIST_NUM		= 5;
	public static final int NETDEV_OSD_TEXT_MAX_LEN			= 64 + 4;
	public static final int NETDEV_OSD_TEXTOVERLAY_NUM		= 6;
	public static final int NETDEV_OSD_MAX_NUM_EX			= 8;

	public static final int NETDEV_MAX_ALARM_OUT_NUM		= 64;
	public static final int NETDEV_MAX_ALARM_IN_NUM			= 64;

	public static final int NETDEV_FACE_MEMBER_CUSTOM_LEN   = 255;             /* 自定义属性值长度 */
	public static final int NETDEV_LOG_QUERY_COND_NUM       = 48;              /* 日志查询条件数量 */
	public static final int NETDEV_FACE_MEMBER_NAME_LEN     = 256;             /* 人脸库成员名称长度最大值 */
	public static final int NETDEV_FACE_MEMBER_BIRTHDAY_LEN = 31;              /* 成员出生日期字符串最大长度 */
	public static final int NETDEV_FACE_MEMBER_CUSTOM_NUM   = 5;               /* 自定义属性列表个数 */
	public static final int NETDEV_FACE_MEMBER_REGION_LEN   = 256;             /* 人脸库成员所在地区名称最大值 */
	public static final int NETDEV_FACE_IDNUMBER_LEN        = 128;             /*证件号最大范围*/
	public static final int NETDEV_FACE_MONITOR_RULE_NAME_LEN = 508;             /*人脸布控任务的布控名称最大值 */
	public static final int NETDEV_FACE_MONITOR_RULE_REASON_LEN = 508;             /*人脸布控的布控原因最大值 */
	public static final int NETDEV_CHANNEL_MAX              = 512;             /* 最大通道数 Maximum number of channel */
	public static final int NETDEV_MAX_TIME_SECTION_NUM     = 8;               /* 时间段数量 */
	public static final int NETDEV_MAX_DAY_NUM              = 8;               /* 最大天数 */
	public static final int NETDEV_FACE_FEATURE_SIZE        = 512;             /* 人脸特征信息 512B */

	public static final int NETDEV_TIME_TEMPLATE_NUM = 32; /* 时间模板数量 */

	public static final int NETDEV_DOMAIN_LEN 					= 64;         	/* 域名最大长度  Maximum length of domain name */
	public static final int NETDEV_PATH_LEN						= 128;			/* 路径最大长度:包括文件名称  Maximum length of path, including filename */
	public static final int NETDEV_DNS_LIST_NUM  				= 2;            /* DNS列表数量 */
	public static final int NETDEV_SCREEN_INFO_ROW 				= 18;           /* 屏幕信息行数  Screen Info Row */
	public static final int NETDEV_SCREEN_INFO_COLUMN   		= 22;          	/* 屏幕信息列数  Screen Info Column */
	public static final int NETDEV_PHOTO_SERVER_MAX_NUM 		= 4;           	/* 照片服务器数量上限 Maximum number of Photo Server */

	public static final int NETDEV_SCREEN_VIDEO_INFO_COLUMN     =24;          /*录像计划小时列*/
	public static final int NETDEV_SCREEN_VIDEO_INFO_Row     =8;          /*录像计划天数*/
	public static final int NETDEV_DEV_OTHER_LEN_MAX            = 32;          /* 其他字段 */
	public static final int NETDEV_DEV_NAME_LEN_MAX             = 64;          /* 设备名称长度 */
	public static final int NETDEV_INTELLIGENT_SERVER_MAX_NUM   = 4;           /* 智能服务器数量上限 Maximum number of Intelligent Server */
	public static final int  NETDEV_MANAGER_SERVER_MAX_NUM      = 4;           /* 管理服务器数量上限 Maximum number of Manager Server */
	public static final int NETDEV_DISK_SMART_MAX_NUM   		= 128;        /* 硬盘SMART信息最大数量 Maximum number of Disk Smart Info */
	public static final int NETDEV_LOCAL_DISK_MAX_NUM           = 32;          /* 本地磁盘最大数量 local Maximum number of Disk */
	public static final int NETDEV_SD_CARD_DISK_MAX_NUM       	= 16;          /* SD卡最大数量 SD Maximum number of Disk */
	public static final int NETDEV_ARRAY_MAX_NUM            	= 16;          /* 阵列最大数量 array Maximum number of Disk */
	public static final int NETDEV_EXTEND_CABINET_DISK_MAX_NUM	= 32;          /* 扩展柜硬盘最大数量 extend cabinet Maximum number of Disk */
	public static final int NETDEV_NAS_MAX_NUM                	= 16;          /* NAS最大数量 NAS Maximum number of Disk */
	public static final int NETDEV_ESATA_MAX_NUM              	= 4;           /* ESATA最大数量 eSATA Maximum number of Disk */
	public static final int NETDEV_AUDIO_IN_MAX_NUM             = 16;      	  /* 最多支持的音频口输入个数 Maximum number of Audio input count */
	public static final int NETDEV_SERIAL_IN_MAX_NUM        	= 16;              /* 最多支持的串口输入个数 Maximum number of serial input count */
	public static final int NETDEV_DISK_MAX_NUM             	= 256;         /* 磁盘最大数量 Maximum number of Disk */
	public static final int NETDEV_MAX_PRIVACY_MASK_AREA_NUM    = 8;           /* 最大可配置遮盖区域个数  Maximum number of privacy mask areas allowed */
	public static final int NETDEV_NETWORK_MACNAME_LEN          = 48;             /* MAC地址名称长度 */
	public static final int NETDEV_PEOPLE_CNT_MAX_NUM           = 60;          /* 客流量统计数组最大值（分报表） Maximum number of people count */
	public static final int NETDEV_TRACK_CRUISE_MAXNUM          = 1;           /* 支持的轨迹巡航的最大条数  Maximum number of patrol routes allowed  */
	public static final int NETDEV_VOICE_BROADCAST_CHANNEL_NUM_MAX     = 128;             /* 一个语音广播组支持最大通道个数 */
	public static final int NETDEV_AUDIO_IN_CHL_MODE_MAX_NUM    = 8;          /* 最多支持的音频输入通道模式个数 Maximum number of Audio input mode count */
	public static final int NETDEV_AUDIO_SAMPLING_RATE_MAX_NUM  = 8;          /* 最多支持的音频采样率个数 Maximum number of Audio sampling rate count */
	public static final int NETDEV_AUDIO_IN_ENCODE_FORMAT_MAX_NUM      = 16;  /* 最多支持的音频输入编码格式个数 Maximum number of Audio input encode format count
	
	/**
	 * @struct NETDEV_DEVICE_LOGIN_INFO_S
	 * @brief 设备登录信息
	 * @attention
	 */
	public class NETDEV_DEVICE_LOGIN_INFO_S extends Structure
	{
		public byte[]  	szIPAddr = new byte[NETDEV_LEN_260];	/* IP地址/域名 */
		public int 		dwPort; 								/* 端口号 */
		public byte[]  	szUserName = new byte[NETDEV_LEN_132];  /* 用户名 */
		public byte[]  	szPassword = new byte[NETDEV_LEN_128]; 	/* 密码 */
		public int 		dwLoginProto; 							/* 登录协议 0:onvif 1:私有*/
		public int      dwDeviceType; 							/* 设备类型 */
		public byte[] 	byRes = new byte[256];
	}

	/**
	 * @struct NETDEV_SELOG_INFO_S
	 * @brief 安全登录信息
	 * @attention
	 */
	public class NETDEV_SELOG_INFO_S extends Structure {
		public int 		dwSELogCount; 			/* 安全登录次数 */
		public int 		dwSELogTime;  			/* 安全登录时间 */
		public byte[] 	byRes = new byte[64];
	}

	/**
	 * @struct NETDEV_PREVIEWINFO_S
	 * @brief 实况预览参数 结构体定义 Live view parameter Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PREVIEWINFO_S extends Structure {
		public int   	dwChannelID;                 /* 通道ID  Channel ID */
		public int   	dwStreamType;                /* 码流类型,参见 枚举 #NETDEV_LIVE_STREAM_INDEX_E  Stream type, see enumeration #NETDEV_LIVE_STREAM_INDEX_E */
		public int   	dwLinkMode;                  /* 传输协议,参见 枚举 #NETDEV_PROTOCAL_E  Transport protocol, see enumeration #NETDEV_PROTOCAL_E */
		public Pointer  hPlayWnd;                    /* 播放窗口句柄 Play window handle */
		public int   	dwFluency;                   /* 图像播放流畅性优先类型,参见 枚举 #NETDEV_PICTURE_FLUENCY_E */
		public int   	dwStreamMode;                /* 流模式 参见 枚举 #NETDEV_STREAM_MODE_E  start stream mode see #NETDEV_STREAM_MODE_E*/
		public int   	dwLiveMode;                  /* 启流模式 参见 枚举 #NETDEV_PULL_STREAM_MODE_E */
		public int   	dwDisTributeCloud;           /* 分发能力 参见 枚举 #NETDEV_DISTRIBUTE_CLOUD_SRV_E */
		public int    	dwallowDistribution;         /* 该通道是否支持分发*/
		public int   	dwTransType;                    /* 传输类型，参见 枚举 #NETDEV_TRANS_TYPE_E */
		public int   	dwStreamProtocol;            /* 起流协议，参见 枚举 # NETDEV_START_STREAM_PROT_E*/
		public byte[]   byRes = new byte[236];                  /* 保留字段  Reserved */
	}

	/**
	 *@brief 启流模式类型枚举
	 *@attention 无
	 */
	public static class NETDEV_PULL_STREAM_MODE_E extends Structure {
		public static final int NETDEV_STREAM_MODE_SERVER_DISTRIBUTE   = 0;            /* 服务器分配 */
		public static final int NETDEV_STREAM_MODE_FORCE_CDN    = 1;            /* 强制分发 */
	}

	/**
	 *@brief 启流模式类型枚举
	 *@attention 无
	 */
	public static class NETDEV_START_STREAM_PROT_E extends Structure {
		public static final int NETDEV_START_STREAM_PROT_UDP   = 0;
		public static final int NETDEV_START_STREAM_PROT_TCP    = 1;
		public static final int NETDEV_START_STREAM_PROT_RTSP   = 3;
		public static final int NETDEV_START_STREAM_PROT_HTTP    = 4;
		public static final int NETDEV_START_STREAM_PROT_INVALID   = 0xff;
	}

	/**
	 * @struct NETDEV_CHANNEL_STATUS_E
	 * @brief 视频通道详细信息 结构体定义  Structure definition
	 * @attention 无 None
	 */
	public static class NETDEV_CHANNEL_STATUS_E extends Structure {
		public static final int NETDEV_CHL_STATUS_OFFLINE   = 0;            /* 通道离线  Channel offline */
		public static final int NETDEV_CHL_STATUS_ONLINE    = 1;            /* 通道在线  Channel online */
		public static final int NETDEV_CHL_STATUS_UNBIND    = 2;             /* 通道空闲  Channel unbind */
		public static final int NETDEV_CHL_STATUS_INVALID   = 0xff;
	}

	/**
	 * @struct NETDEV_MEDIA_FILE_FORMAT_E
	 * @brief 媒体文件格式 枚举 定义  Media file format Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_MEDIA_FILE_FORMAT_E extends Structure {
		public static final int NETDEV_MEDIA_FILE_MP4                   = 0;    /* MP4格式的媒体文件(音频+视频)  mp4 media file (Audio + Video) */
		public static final int NETDEV_MEDIA_FILE_TS                    = 1;    /* TS格式的媒体文件(音频+视频)   TS media file (Audio + Video) */
		public static final int NETDEV_MEDIA_FILE_MP4_ADD_TIME          = 2;    /* MP4格式的媒体文件(音频+视频) ;文件名包含时间戳  MP4 media file with time in file name (Audio + Video) */
		public static final int NETDEV_MEDIA_FILE_TS_ADD_TIME           = 3;    /* TS格式的媒体文件(音频+视频) ;文件名包含时间戳  TS media file with time in file name (Audio + Video) */
		public static final int NETDEV_MEDIA_FILE_AUDIO_TS              = 4;    /* TS格式的音频文件(仅音频)   TS audio file (Only audio) */
		public static final int NETDEV_MEDIA_FILE_AUDIO_MP4             = 5;    /* MP4格式的音频文件(仅音频)   MP4 audio file (Only audio) */
		public static final int NETDEV_MEDIA_FILE_AUDIO_TS_ADD_TIME     = 6;    /* TS格式的音频文件(仅音频);文件名包含时间戳  TS audio file with time in file name (Only audio) */
		public static final int NETDEV_MEDIA_FILE_AUDIO_MP4_ADD_TIME    = 7;    /* MP4格式的音频文件(仅音频);文件名包含时间戳  MP4 audio file with time in file name (Only audio) */
		public static final int NETDEV_MEDIA_FILE_MP4_ADD_RCD_TIME      = 8;    /* MP4格式的媒体文件(音频+视频)，文件名包含开始结束时间  MP4 media file with start and end times in file name (Audio + Video)*/
		public static final int NETDEV_MEDIA_FILE_TS_ADD_RCD_TIME       = 9;    /* TS格式的媒体文件(音频+视频)，文件名包含开始结束时间  TS media file with start and end times in file name (Audio + Video)*/
		public static final int NETDEV_MEDIA_FILE_AUDIO_MP4_ADD_RCD_TIME= 10;   /* MP4格式的音频文件(仅音频)，文件名包含开始结束时间  MP4 audio file with start and end times in file name (Only audio)*/
		public static final int NETDEV_MEDIA_FILE_AUDIO_TS_ADD_RCD_TIME = 11;   /* TS格式的音频文件(仅音频)，文件名包含开始结束时间  TS audio file with start and end times in file name (Only audio)*/
		public static final int NETDEV_MEDIA_FILE_VIDEO_MP4_ADD_RCD_TIME= 12;   /* MP4格式的媒体文件(仅视频)  mp4 media file (Only video) */
		public static final int NETDEV_MEDIA_FILE_VIDEO_TS_ADD_RCD_TIME = 13;   /* TS格式的媒体文件(仅视频)  ts media file (Only video) */

		public static final int NETDEV_MEDIA_FILE_AVI                   = 14;   /* AVI格式的媒体文件(音频+视频)   AVI media file (Audio + Video) */
		public static final int NETDEV_MEDIA_FILE_AVI_ADD_TIME          = 15;   /* AVI格式的媒体文件(音频+视频)，文件名包含开始结束时间  AVI media file with start and end times in file name (Audio + Video)*/
		public static final int NETDEV_MEDIA_FILE_AUDIO_AVI             = 16;   /* AVI格式的音频文件(仅音频)   AVI audio file (Only audio) */
		public static final int NETDEV_MEDIA_FILE_AUDIO_AVI_ADD_TIME    = 17;   /* AVI(仅音频);文件名包含时间戳  AVI audio file with time in file name (Only audio)*/
		public static final int NETDEV_MEDIA_FILE_AVI_ADD_RCD_TIME      = 18;   /* AVI格式的音频文件(音频+视频)，文件名包含开始结束时间  AVI audio file with start and end times in file name (Audio + Video)*/
		public static final int NETDEV_MEDIA_FILE_AUDIO_AVI_ADD_RCD_TIME= 19;   /* AVI格式的音频文件(仅音频)，文件名包含开始结束时间  AVI audio file with start and end times in file name (Only audio)*/
		public static final int NETDEV_MEDIA_FILE_VIDEO_AVI_ADD_RCD_TIME= 20;   /* AVI格式的媒体文件(仅视频)  AVI media file (Only video) */
		public static final int NETDEV_MEDIA_FILE_INVALID   = 0xff;
	}

	/**
	 * @struct NETDEV_CHANNEL_TYPE_E
	 * @brief 通道类型 枚举 定义 Channel type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_CHANNEL_TYPE_E extends Structure {
		public static final int NETDEV_CHL_TYPE_DIGITAL = 0;            /* 数字通道  Digital Channel */
		public static final int NETDEV_CHL_TYPE_ANALOG = 1;             /* 模拟通道  analog Channel */
		public static final int NETDEV_CHL_TYPE_INVALID   = 0xff;
	}

	/**
	 * @struct NETDEV_LIVE_STREAM_INDEX_E
	 * @brief 实况业务流索引 枚举 定 义 Live stream index Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_LIVE_STREAM_INDEX_E extends Structure {
		public static final int NETDEV_LIVE_STREAM_INDEX_MAIN       = 0;    /* 主流  Main stream */
		public static final int NETDEV_LIVE_STREAM_INDEX_AUX        = 1;    /* 辅流  Sub stream */
		public static final int NETDEV_LIVE_STREAM_INDEX_THIRD      = 2;    /* 第三流  Third stream */
		public static final int NETDEV_LIVE_STREAM_INDEX_ADAPTIVE   = 10;   /* 自适应  Adaptive stream */
		public static final int NETDEV_LIVE_STREAM_INDEX_INVALID    = 0xFF;  /* 无效值  Invalid value */
	}


	/**
	 *元数据显示类型参数
	 */
	public static class NETDEV_IVA_SHOW_RULE_E extends Structure{
		public static final int NETDEV_IVA_SHOW_RULE                    =0x00000001;    /* 显示规则线框 */
		public static final int NETDEV_IVA_SHOW_RESULT_TOUTH_RULE       =0x00000002;    /* 显示触发规则目标框 */
		public static final int NETDEV_IVA_SHOW_RESULT_UNTOUTH_RULE     =0x00000004;     /* 显示未触发规则目标框 */
		public static final int NETDEV_IVA_SHOW_TRACK                   =0x00000008;   /* 显示目标框轨迹 */
	}

	/**
	 * @struct NETDEV_VIDEO_STANDARD_E
	 * @brief 视频制式 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_VIDEO_STANDARD_E extends Structure {
		public static final int NETDEV_VIDEO_STANDARD_PAL       = 0;        /* PAL */
		public static final int NETDEV_VIDEO_STANDARD_NTSC      = 1;        /* NTSC */
		public static final int NETDEV_VIDEO_STANDARD_INVALID   = 0xFF;      /* 无效值  Invalid value */
	}

	/**
	 * @struct NETDEV_PROTOCAL_E
	 * @brief 媒体传输协议 枚举 定义  Media transport protocol Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PROTOCAL_E extends Structure {
		public static final int NETDEV_TRANSPROTOCAL_RTPUDP     = 0;    /* UDP */
		public static final int NETDEV_TRANSPROTOCAL_RTPTCP     = 1;    /* TCP */
	}

	/**
	 * @struct NETDEV_PICTURE_FORMAT_E
	 * @brief 图片格式 枚举 定义 Picture type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PICTURE_FORMAT_E extends Structure {
		public static final int NETDEV_PICTURE_BMP     = 0;    /* 图片格式为bmp格式  Picture format is bmp */
		public static final int NETDEV_PICTURE_JPG     = 1;    /* 图片格式为jpg格式  Picture format is jpg */
		public static final int NETDEV_PICTURE_INVALID   = 0xFF;
	}

	/**
	 * @struct NETDEV_RENDER_SCALE_E
	 * @brief 视频显示比例 枚举 定义  Video display ratio Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_RENDER_SCALE_E extends Structure {
		public static final int NETDEV_RENDER_SCALE_FULL     = 0;    		/* 图像填充整个播放窗格  Stretch */
		public static final int NETDEV_RENDER_SCALE_PROPORTION     = 1;    	/* 图像按比例显示  Scale */
		public static final int NETDEV_RENDER_SCALE_INVALID = 0xFF;
	}

	/**
	 * @struct NETDEV_HOSTTYPE_E
	 * @brief IP协议类型 枚举 定义  Protocol type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_HOSTTYPE_E extends Structure {
		public static final int NETDEV_NETWORK_HOSTTYPE_IPV4    = 0;        /* IPv4 */
		public static final int NETDEV_NETWORK_HOSTTYPE_IPV6    = 1;        /* IPv6 */
		public static final int NETDEV_NETWORK_HOSTTYPE_DNS     = 2;         /* 域名 */
		public static final int NETDEV_NETWORK_HOSTTYPE_INVALID     = 0xFF;     /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVEncodeChnStatus
	 * @brief 编码通道状态
	 * @attention 无 None
	 */
	public static class NETDEV_CHN_STATUS_E extends Structure {
		public static final int NETDEV_CHN_STATUS_OFFLINE          = 0;                /* 离线 offline */
		public static final int NETDEV_CHN_STATUS_ONLINE           = 1;                /* 在线 online */
		public static final int NETDEV_CHN_STATUS_VIDEO_LOSE       = 2;                /* 视频丢失 video lose */
		public static final int NETDEV_CHN_STATUS_INVALID       = 0xFF;
	}


	public static class NETDEV_DEVICE_TYPE_E extends Structure {
		public static final int NETDEV_DTYPE_UNKNOWN                        = 0;            /* Unknown type */
		public static final int NETDEV_DTYPE_IPC                            = 1;            /* IPC range */
		public static final int NETDEV_DTYPE_IPC_FISHEYE                    = 2;            /* 非经济型鱼眼IPC Certain fisheye camera models*/
		public static final int NETDEV_DTYPE_IPC_ECONOMIC_FISHEYE           = 3;            /* 经济型鱼眼IPC Certain fisheye camera models*/
		public static final int NETDEV_DTYPE_IPC_ACS						= 4;			/* 人脸门禁IPC Person verification camera models*/
		public static final int NETDEV_DTYPE_NVR                            = 101;          /* NVR range */
		public static final int NETDEV_DTYPE_NVR_BACKUP                     = 102;          /* NVR备份服务器  NVR back up */
		public static final int NETDEV_DTYPE_HNVR                           = 103;          /* 混合NVR */
		public static final int NETDEV_DTYPE_DC                             = 201;          /* DC range */
		public static final int NETDEV_DTYPE_DC_ADU                         = 202;          /* ADU range */
		public static final int NETDEV_DTYPE_EC                             = 301;          /* EC range */
		public static final int NETDEV_DTYPE_VMS                            = 501;          /* VMS range */
		public static final int NETDEV_DTYPE_FG                             = 601;          /* FG range */
		public static final int NETDEV_DTYPE_IPM							= 701;			/* IPM range */
		public static final int NETDEV_DTYPE_EDU							= 801;			/* EDU range */
		public static final int NETDEV_DTYPE_INVALID                        = 0xFFFF;        /* 无效值  Invalid value */
	}

	public static class NETDEV_PICTURE_FLUENCY_E extends Structure {
		public static final int NETDEV_PICTURE_REAL                 = 0;                /* 实时性优先 Real-time first */
		public static final int NETDEV_PICTURE_FLUENCY              = 1;                /* 流畅性优先 Fluency first */
		public static final int NETDEV_PICTURE_BALANCE_NEW          = 3;                /* 均衡 Balance */
		public static final int NETDEV_PICTURE_RTMP_FLUENCY         = 4;                /* RTMP流畅性优先 RTMP fluency first */
		public static final int NETDEV_PICTURE_USER_DEFINED         = 5;                /* 自定义-缓冲帧数可配 */
		public static final int NETDEV_PICTURE_NETADJUST            = 6;                /* 网络抖动自适应模式*/

		public static final int NETDEV_PICTURE_FLUENCY_INVALID      = 0xff;              /* 无效值 Invalid value */
	}

	public static class NETDEV_TMS_PERSION_IMAGE_FORMAT_E extends Structure {
		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_JPG  = 1;            /* JPEG */
		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_BMP  = 2;            /* BMP */
		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_PNG  = 3;            /* PNG */
		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_GIF  = 4;            /* GIF */
		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_TIFF = 5;            /* TIFF */

		public static final int NETDEV_TMS_PERSION_IMAGE_FORMAT_INVALID = 0xff;
	}

	/**
	 * @enum tagNETDEVReportType
	 * @brief 告警/事件上报类型
	 * @attention 无 None
	 */
	public static class NETDEV_REPORT_TYPE_E extends Structure {
		public static final int NETDEV_REPORT_TYPE_ALARM  = 0;            /* 上报类型：告警 */
		public static final int NETDEV_REPORT_TYPE_EVENT  = 1;            /* 上报类型：事件 */
		public static final int NETDEV_REPORT_TYPE_INVALID  = 0xff;       /* 无效值 */
	}

	/**
	 * @enum tagNETDEVEventActionType
	 * @brief 事件动作类型枚举  枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_EVENT_ACTION_TYPE_E extends Structure {
		public static final int NETDEV_EVENT_ACTION_TYPE_ADD            = 0;                /* 事件动作类型：增加 */
		public static final int NETDEV_EVENT_ACTION_TYPE_DELETE         = 1;                /* 事件动作类型：删除 */
		public static final int NETDEV_EVENT_ACTION_TYPE_MODIFY         = 2;                /* 事件动作类型：修改 */
		public static final int NETDEV_EVENT_ACTION_TYPE_ONLINE         = 3;                /* 事件动作类型：上线 */
		public static final int NETDEV_EVENT_ACTION_TYPE_OFFLINE        = 4;                /* 事件动作类型：离线 */
		public static final int NETDEV_EVENT_ACTION_TYPE_EMAP_ALARM     = 5;                /* 事件动作类型：电子地图告警 */

		public static final int NETDEV_EVENT_ACTION_TYPE_INVALID        = 0xFF;              /* 无效值 */
	}

	/**
	 * @brief 订阅告警事件类型BIT位定义 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_SUBSCRIBE_ALARM_TYPE_E extends Structure {
		public static final int NETDEV_SUBSCRIBE_ALARM_TYPE_COM             = 0X01;     /* 通用告警 */
		public static final int NETDEV_SUBSCRIBE_ALARM_TYPE_SMART           = 0X02;    	/* 智能告警 */
		public static final int NETDEV_SUBSCRIBE_ALARM_TYPE_INTELLIGENTIPC  = 0X04; 	/* 智能IPC */

		@Override
		protected List<String> getFieldOrder() {
			return null;
		}
	}

	/* 组织类型枚举  */
	public static class NETDEV_ORG_TYPE_E extends Structure {
		public static final int NETDEV_ORG_TYPE_GENERAL            = 0;            /* 普通组织 */
		public static final int NETDEV_ORG_TYPE_CLOUD              = 1;            /* 云端组织 */
		public static final int NETDEV_ORG_TYPE_VIRTUAL            = 2;            /* 逻辑组织 */
		public static final int NETDEV_ORG_TYPE_FAVORITES          = 3;            /* 收藏夹 */
		public static final int NETDEV_ORG_TYPE_DOMAIN             = 4;            /* 域名组织 */
		public static final int NETDEV_ORG_TYPE_DOORGROUP          = 5;            /* 门组 */
		public static final int NETDEV_ORG_TYPE_DEPT               = 6;            /* 部门组织 */
		public static final int NETDEV_ORG_TYPE_APARTMENT          = 7;            /* 公寓组织 */

		public static final int NETDEV_ORG_TYPE_INVALID            = 0XFF;          /* 无效值 */

		@Override
		protected List<String> getFieldOrder() {
			return null;
		}
	}

	/**
	 * @enum tagNETDEVOrgFindMode
	 * @brief 组织查找模式枚举
	 * @attention 无 None
	 */
	public static class NETDEV_ORG_FIND_MODE_E extends Structure {
		public static final int NETDEV_ORG_FIND_MODE_ID          = 0;            /* 组织ID */
		public static final int NETDEV_ORG_FIND_MODE_TYPE        = 1;            /* 组织类型 */

		public static final int NETDEV_ORG_FIND_MODE_INVALID     = 0XFF;       /* 无效值 */
	}

	public static class NETDEV_CHN_TYPE_E extends Structure {
		public static final int NETDEV_CHN_TYPE_ENCODE              = 0;                /* 编码通道; 通道状态参见 NETDEV_CHN_STATUS_E 获取数据详见 NETDEV_DEV_CHN_ENCODE_INFO_S*/
		public static final int NETDEV_CHN_TYPE_ALARMIN             = 1;                /* 告警输入通道; 通道状态参见 NETDEV_ALARM_RUNMODE_E 获取数据详见 NETDEV_DEV_CHN_ALARMIN_INFO_S*/

		public static final int NETDEV_CHN_TYPE_ALARMOUT            = 2;                /* 告警输出通道; 通道状态参见 NETDEV_ALARMOUT_CHN_STATUS_E 获取数据详见 NETDEV_DEV_CHN_ALARMOUT_INFO_S*/
		public static final int NETDEV_CHN_TYPE_DECODE              = 3;                /* 解码通道 获取数据详见 NETDEV_DEV_CHN_DECODE_INFO_S*/
		public static final int NETDEV_CHN_TYPE_AUDIO               = 4;                /* 音频通道 获取数据详见 NETDEV_DEV_CHN_AUDIO_INFO_S*/
		public static final int NETDEV_CHN_TYPE_NIC                 = 5;                /* 网卡通道 */
		public static final int NETDEV_CHN_TYPE_ALARMPOINT          = 6;                /* 报警点 获取数据详见 NETDEV_DEV_CHN_DA_INFO_S*/
		public static final int NETDEV_CHN_TYPE_DOOR                = 7;                /* 门 获取数据详见 NETDEV_DEV_CHN_DA_INFO_S*/
		public static final int NETDEV_CHN_TYPE_ADU_ENCODE          = 8;                /* ADU本地编码通道; 通道状态参见 NETDEV_CHN_STATUS_E 获取详细信息见#NETDEV_DEV_CHN_XW_ENCODE_INFO_S */
		public static final int NETDEV_CHN_TYPE_EMERGENCY           = 9;                /* 紧急铃通道 获取数据详见 NETDEV_EMERGENCY_BELL_INFO_S*/

		public static final int NETDEV_CHN_TYPE_INVALID             = 0xFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVAlarmOutChnStatus
	 * @brief 告警输出通道状态
	 * @attention 无 None
	 */
	public static class NETDEV_ALARMOUT_CHN_STATUS_E extends Structure
	{
		public static final int NETDEV_ALARMOUT_CHN_ACTIVE      = 0;
		public static final int NETDEV_ALARMOUT_CHN_INACTIVE    = 1;
		public static final int NETDEV_ALARMOUT_CHN_INVALID     = 0xFF;
	}

	/**
	 * @enum tagNETDEVAlarmInChnStatus
	 * @brief 告警输入通道状态
	 * @attention 无 None
	 */
	public static class NETDEV_ALARM_RUNMODE_E extends Structure
	{
		public static final int NETDEV_ALARM_RUNMODE_OPEN       = 0;                /* 常开  Always open */
		public static final int NETDEV_ALARM_RUNMODE_CLOSE      = 1;                /* 常闭  Always closed */
		public static final int NETDEV_ALARM_RUNMODE_INVALID    = 0xFF;
	}

	/**
	 * @enum tagNETDEVDeviceMainType
	 * @brief 设备类型枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_DEVICE_MAIN_TYPE_E extends Structure {
		public static final int NETDEV_DTYPE_MAIN_ENCODE            = 0;                /* 普通编码设备 */
		public static final int NETDEV_DTYPE_MAIN_DECODE            = 1;                /* 解码设备 */
		public static final int NETDEV_DTYPE_MAIN_VMS               = 2;                /* 一体机设备 */
		public static final int NETDEV_DTYPE_MAIN_DA                = 3;                /* 代理设备 */
		public static final int NETDEV_DTYPE_MAIN_CLOUD             = 4;                /* 云端编码设备  */
		public static final int NETDEV_DTYPE_MAIN_BAYONET           = 5;                /* 卡口设备 */
		public static final int NETDEV_DTYPE_MAIN_ACS               = 6;                /* 门禁主机设备 */
		public static final int NETDEV_DTYPE_MAIN_ALARMHOST         = 7;                /* 报警主机设备 */
		public static final int NETDEV_DTYPE_MAIN_EXITENTRANCE      = 8;                /* 出入口设备 */
		public static final int NETDEV_DTYPE_MAIN_LOCK              = 9;                /* 锁设备 */

		public static final int NETDEV_DTYPE_MAIN_PLAYER_MANAGER    = 10;               /* 播放盒管理设备 */
		public static final int NETDEV_DTYPE_MAIN_PLAYER            = 11;               /* 播放盒 */
		public static final int NETDEV_DTYPE_MAIN_UNKNOWN           = 0XFF;              /* 未知设备 */
	}

	/**
	 * @enum tagNETDEVEventResType
	 * @brief 事件资源类型枚举  枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_EVENT_RES_TYPE_E extends Structure {
		public static final int NETDEV_EVENT_RES_TYPE_USER              = 0;                /* 用户资源，用户上下线对应登录句柄，其余对应用户编号 */
		public static final int NETDEV_EVENT_RES_TYPE_DEVICE            = 1;                /* 设备资源，对应设备编号 */
		public static final int NETDEV_EVENT_RES_TYPE_CHANNEL           = 2;                /* 通道资源，对应通道编号 */
		public static final int NETDEV_EVENT_RES_TYPE_LOGOUT            = 3;                /* 强制用户退出，对应登录句柄 */
		public static final int NETDEV_EVENT_RES_TYPE_SEQUENCE          = 4;                /* 轮巡资源，对应资源ID */
		public static final int NETDEV_EVENT_RES_TYPE_EMAP_HOTPOT       = 5;                /* 电子地图热点资源，对应资源ID */
		public static final int NETDEV_EVENT_RES_TYPE_EMAP_HOTAREA      = 6;                /* 电子地图热区资源，对应资源ID */
		public static final int NETDEV_EVENT_RES_TYPE_EMAP_ALARM        = 7;                /* 电子地图告警资源，对应资源ID */
		public static final int NETDEV_EVENT_RES_TYPE_TIMETEMPLATE      = 8;                /* 告警预案模板，对应模板ID */
		public static final int NETDEV_EVENT_RES_TYPE_SYSRIGHT          = 9;                /* 系统权限资源，对应用户登录句柄 */
		public static final int NETDEV_EVENT_RES_TYPE_DEVRIGHT          = 10;               /* 设备权限资源，对应通道编号 */
		public static final int NETDEV_EVENT_RES_TYPE_ORG   = 11;   /* 组织资源，对应组织编号 */
		public static final int NETDEV_EVENT_RES_TYPE_ALARM_TASK= 12;   /* 报警任务资源，对应报警任务编号 */
		public static final int NETDEV_EVENT_RES_TYPE_SLAVE = 13;   /* 主从资源(与服务端保持一致) */
		public static final int NETDEV_EVENT_RES_TYPE_TVWALL= 14;   /* 电视墙资源，对应电视墙ID */
		public static final int NETDEV_EVENT_RES_TYPE_TVWALL_SCENE  = 15;   /* 电视墙场景资源，对应电视墙ID */
		public static final int NETDEV_EVENT_RES_TYPE_WND   = 16;   /* 电视墙窗口资源，对应窗口ID */
		public static final int NETDEV_EVENT_RES_TYPE_VIRTUAL_LED   = 17;   /* 电视墙虚拟LED资源，对应虚拟LED ID */
		public static final int NETDEV_EVENT_RES_TYPE_BROADCAST_CHANGE  = 18;   /* 广播组信息变更(值与服务端保持一致) */
		public static final int NETDEV_EVENT_RES_TYPE_LOGIC_ORG = 19;   /* 虚拟组织资源，对应组织编号，删除虚拟组织下通道时使用 */
		public static final int NETDEV_EVENT_RES_TYPE_USER_ROLE = 20;   /* 用户角色资源，对应用户登录句柄*/
		public static final int NETDEV_EVENT_RES_TYPE_ROLE_ORG  = 21;   /* 角色组织展示树资源，对应用户登录句柄 */
		public static final int NETDEV_EVENT_RES_TYPE_EMAP_PIC  = 22;   /* 图片资源，对应热区编号 */
		public static final int NETDEV_EVENT_RES_TYPE_PATROL= 23;   /* 巡航资源 */
		public static final int NETDEV_EVENT_RES_TYPE_RECORD= 24;   /* 录制轨迹资源 */
		public static final int NETDEV_EVENT_RES_TYPE_ACS_PERSON= 25;   /* 门禁人员资源，对应门禁人员ID */
		public static final int NETDEV_EVENT_RES_TYPE_ACS_PERSON_CARD   = 26;   /* 门禁卡资源，对应门禁人员ID */
		public static final int NETDEV_EVENT_RES_TYPE_TVWALL_LIST   = 27;   /* 电视墙列表，权限到电视墙 */
		public static final int NETDEV_EVENT_RES_TYPE_TVWALL_SCENE_SWITCH = 28; /* 电视墙场景切换 */

		public static final int NETDEV_EVENT_RES_TYPE_FACE_LIB  = 29;   /* 人脸库资源，对应人脸库ID */
		public static final int NETDEV_EVENT_RES_TYPE_FACE_CUSTOM   = 30;   /* 人脸库自定义属性，对应属性ID */
		public static final int NETDEV_EVENT_RES_TYPE_FACE_MEMBER   = 31;   /* 人脸成员资源，对应人脸库ID */
		public static final int NETDEV_EVENT_RES_TYPE_FACE_GUARD= 32;   /* 人脸布控资源，对应人脸布控ID */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_DETECT  = 33;   /* 智能检测资源，对应智能检测类型，人脸识别:0 */
		public static final int NETDEV_EVENT_RES_TYPE_MANUAL_STATUS = 34;   /* 手动录像状态 */
		public static final int NETDEV_EVENT_RES_TYPE_VEHICLE_GUARD = 38;   /* 车牌布控资源，对应车牌布控ID */
		public static final int NETDEV_EVENT_RES_TYPE_CDN_CHANNEL   = 39;   /* CDN通道资源变更，不上报对应变更信息，客户端收到事件后主动来查询通道列表 */
		public static final int NETDEV_EVENT_RES_TYPE_FACE_MEMBER_SORT  = 40;   /* 人脸成员划归资源，对应人脸库ID */
		public static final int NETDEV_EVENT_RES_TYPE_VEHICLE_LIB   = 41;   /* 车辆库资源，对应车辆库ID */
		public static final int NETDEV_EVENT_RES_TYPE_VEHICLE_MEMBER_SORT = 42; /* 车辆成员划归资源，对应车辆库ID */
		public static final int NETDEV_EVENT_RES_TYPE_VEHICLE_MEMBER  = 43; /* 车辆成员资源，对应车辆成员ID */

		public static final int NETDEV_EVENT_RES_TYPE_REMAIN_PARK_SPACE = 44;   /* 停车场剩余车位资源 */
		public static final int NETDEV_EVENT_RES_TYPE_ABNORMAL_CHARGE   = 45;   /* 异常收费规则资源 */
		public static final int NETDEV_EVENT_RES_TYPE_PARK_RES_CHANGE   = 46;   /* 停车场资源变更 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_PERSON   = 47;        /* 智慧社区人员资源 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_CAR      = 48;        /* 智慧社区车辆资源 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_BUILDING = 49;        /* 智慧社区楼栋资源 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_UNIT     = 50;        /* 智慧社区单元资源 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_ROOM     = 51;        /* 智慧社区房间资源 */
		public static final int NETDEV_EVENT_RES_TYPE_SMART_COMMUNITY_ORG      = 52;        /* 智慧社区组织(小区)资源 */
		public static final int NETDEV_EVENT_RES_TYPE_TEMP_VEHICLE_PAY_CHANGE = 53; /* 临时车缴费信息变更 */
		public static final int NETDEV_EVENT_RES_TYPE_THIRDPART_PAYMENT       = 54;         /* 停车场第三方支付资源 */
		public static final int NETDEV_EVENT_RES_TYPE_PAYMENT_WAIT            = 55;         /* 支付中，请等待 */
		public static final int NETDEV_EVENT_RES_TYPE_ENTRANCE_LIST = 56;   /* 出入口列表，权限到出入口 */
		public static final int NETDEV_EVENT_RES_TYPE_VIEWPLAN_RES  = 57;   /* 视图计划，对应计划ID */
		public static final int NETDEV_EVENT_RES_TYPE_SCENESPLAN_RES= 58;   /* 场景间计划，对应计划ID */
		public static final int NETDEV_EVENT_RES_TYPE_ACS_PERMISSION= 59;   /* 权限资源;  用于授权信息变更*/
		public static final int NETDEV_EVENT_RES_TYPE_ACS_GROUP = 60;   /* 门禁权限组资源，用于门禁权限组（组织）的变更 */
		public static final int NETDEV_EVENT_RES_TYPE_TVWALL_AUDIO  = 61;   /* 音频事件 */
		public static final int NETDEV_EVENT_RES_TYPE_PAYMENT_RRULE     = 62;               /* 手动添加收费规则资源  */
		public static final int NETDEV_EVENT_RES_TYPE_GIS               = 63;          /* 电子地图资源 */
		public static final int NETDEV_EVENT_RES_TYPE_INVALID   = 0xFF;  /* 无效值 */
	}

	/**
	 * @brief 告警配置操作 枚举 定义  Alarm configuration operation Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_ALARM_TYPE_E extends Structure {
		public static final int NETDEV_ALARM_MOVE_DETECT                = 1;        /* 运动检测告警  Motion detection alarm */
		public static final int NETDEV_ALARM_MOVE_DETECT_RECOVER        = 2;        /* 运动检测告警恢复  Motion detection alarm recover */
		public static final int NETDEV_ALARM_VIDEO_LOST                 = 3;        /* 视频丢失告警  Video loss alarm */
		public static final int NETDEV_ALARM_VIDEO_LOST_RECOVER         = 4;        /* 视频丢失告警恢复  Video loss alarm recover */
		public static final int NETDEV_ALARM_VIDEO_TAMPER_DETECT        = 5;        /* 遮挡侦测告警  Tampering detection alarm */
		public static final int NETDEV_ALARM_VIDEO_TAMPER_RECOVER       = 6;        /* 遮挡侦测告警恢复  Tampering detection alarm recover */
		public static final int NETDEV_ALARM_INPUT_SWITCH               = 7;        /* 输入开关量告警  boolean input alarm */
		public static final int NETDEV_ALARM_INPUT_SWITCH_RECOVER       = 8;        /* 输入开关量告警恢复  Boolean input alarm recover */
		public static final int NETDEV_ALARM_TEMPERATURE_HIGH           = 9;        /* 高温告警  High temperature alarm */
		public static final int NETDEV_ALARM_TEMPERATURE_LOW            = 10;       /* 低温告警  Low temperature alarm */
		public static final int NETDEV_ALARM_TEMPERATURE_RECOVER        = 11;       /* 温度告警恢复  Temperature alarm recover */
		public static final int NETDEV_ALARM_AUDIO_DETECT               = 12;       /* 音频异常检测告警  Audio detection alarm */
		public static final int NETDEV_ALARM_AUDIO_DETECT_RECOVER       = 13;       /* 音频异常检测告警恢复  Audio detection alarm recover */
		public static final int NETDEV_ALARM_SERVER_FAULT               = 18;       /* 服务器故障 */
		public static final int NETDEV_ALARM_SERVER_NORMAL              = 19;       /* 服务器故障恢复 */


		public static final int NETDEV_ALARM_REPORT_DEV_ONLINE          = 201;       /* 设备上线告警 */
		public static final int NETDEV_ALARM_REPORT_DEV_OFFLINE         = 202;       /* 设备下线告警 */
		public static final int NETDEV_ALARM_REPORT_DEV_REBOOT          = 203;       /* 设备重启  Device restart */
		public static final int NETDEV_ALARM_REPORT_DEV_SERVICE_REBOOT  = 204;       /* 服务重启  Service restart */
		public static final int NETDEV_ALARM_REPORT_DEV_CHL_ONLINE      = 205;       /* 视频通道: 上线 */
		public static final int NETDEV_ALARM_REPORT_DEV_CHL_OFFLINE     = 206;       /* 视频通道: 下线 */
		public static final int NETDEV_ALARM_REPORT_DEV_DELETE_CHL      = 207;       /* 视频通道: 删除 */

		public static final int NETDEV_ALARM_DEVICE_HIGHTEMP            = 246;       /* 异常类：设备高温 */
		public static final int NETDEV_ALARM_DEVICE_LOWTEMP             = 247;       /* 异常类：设备低温 */
		public static final int NETDEV_ALARM_FAN_FAULT                  = 248;       /* 异常类：风扇故障 */
		public static final int NETDEV_ALARM_LEDBOX_HIGHTEMP            = 249;       /* 异常类：电箱高温 */
		public static final int NETDEV_ALARM_LEDBOX_SMOKE               = 250;       /* 异常类：电箱烟雾告警 */
		public static final int NETDEV_ALARM_DEVICE_HIGHTEMP_RECOVER    = 251;       /* 异常类:设备温度恢复 */
		public static final int NETDEV_ALARM_DEVICE_LOWTEMP_RECOVER     = 252;       /* 异常类:设备温度恢复 */
		public static final int NETDEV_ALARM_FAN_FAULT_RECOVER          = 253;       /* 异常类:风扇故障恢复 */
		public static final int NETDEV_ALARM_LEDBOX_HIGHTEMP_RECOVER    = 254;       /* 异常类:电箱高温恢复 */
		public static final int NETDEV_ALARM_LEDBOX_SMOKE_RECOVER       = 255;       /* 异常类:电箱烟雾告警恢复 */

		/* ND 上报告警模块 */
		public static final int NETDEV_ALARM_NET_FAILED                 = 401;      /* 会话网络错误 Network error */
		public static final int NETDEV_ALARM_NET_TIMEOUT                = 402;      /* 会话网络超时 Network timeout */
		public static final int NETDEV_ALARM_SHAKE_FAILED               = 403;      /* 会话交互错误 Interaction error */
		public static final int NETDEV_ALARM_STREAMNUM_FULL             = 404;      /* 流数已经满 Stream full */
		public static final int NETDEV_ALARM_STREAM_THIRDSTOP           = 405;      /* 第三方停止流 Third party stream stopped */
		public static final int NETDEV_ALARM_FILE_END                   = 406;      /* 文件结束 File ended */
		public static final int NETDEV_ALARM_RTMP_CONNECT_FAIL          = 407;      /* RTMP连接失败 */
		public static final int NETDEV_ALARM_RTMP_INIT_FAIL             = 408;      /* RTMP初始化失败*/
		public static final int NETDEV_ALARM_STREAM_DOWNLOAD_OVER       = 409;      /* 一体机国标流下载完成 */
		public static final int NETDEV_ALARM_PLAYBACK_FINISH            = 410;      /* 回放结束 */
		public static final int NETDEV_ALARM_VIDEO_RECORD_PART          = 411;      /* 录像分段 */
		public static final int NETDEV_ALARM_FISHEYE_STREAM_EXIST       = 412;      /* 鱼眼流存在,仅用于上报 */
		public static final int NETDEV_ALARM_FISHEYE_STREAM_NOT_EXIST   = 413;      /* 鱼眼流不存在,仅用于上报 */
		public static final int NETDEV_ALARM_PTZ_RESOUCE_FAIL           = 414;      /* 四目全景ptz资源错误 */
		public static final int NETDEV_ALARM_PTZ_STREAM_EXIST           = 415;      /* 四目全景ptz流存在，仅用于上报 */
		public static final int NETDEV_ALARM_STREAM_NOT_EXIST           = 416;      /* 四目全景ptz流不存在，仅用于上报 */
		public static final int NETDEV_ALARM_INNER_TIMEOUT              = 417;      /* 内部处理超时 */
		public static final int NETDEV_ALARM_STREAM_NOT_READY           = 418;      /* 流未就绪 */
		public static final int NETDEV_ALARM_KEEP_ALIVE_FAILED          = 419;      /* 保活失败 */
		public static final int NETDEV_ALARM_OVER_ABILITY               = 420;      /* 回放能力不足 */
		public static final int NETDEV_ALARM_UNAUTHORIZED               = 421;      /* 未通过认证 */
		public static final int NETDEV_ALARM_FORIBIDDEN                 = 422;      /* 禁止 */
		public static final int NETDEV_ALARM_METHOD_NOT_ALLOWED         = 423;      /* 不允许该方法 */
		public static final int NETDEV_ALARM_PRECONDITION_FAILED        = 424;      /* 预处理失败 */
		public static final int NETDEV_ALARM_SESSION_NOT_FOUND          = 425;      /* 找不到会话 */
		public static final int NETDEV_ALARM_NOT_ENOUGH_BANDWIDTH2      = 426;      /* 带宽不足(RTSP) */
		public static final int NETDEV_ALARM_REALPLAY_ESTABLISHED       = 427;      /* 实况业务已经建立 */
		public static final int NETDEV_ALARM_REALPLAY_RES_BUSY          = 428;      /* 实况业务显示资源忙 */
		public static final int NETDEV_ALARM_MULTICAST_DISABLED         = 429;      /* 组播使能关闭 */
		public static final int NETDEV_ALARM_MULTICAST_PORT_OCCUPIED    = 430;      /* 组播端口已被占用 */
		public static final int NETDEV_ALARM_MULTICAST_PORT_EXHAUSTED   = 431;      /* 组播端口已耗尽 */
		public static final int NETDEV_ALARM_MULTICAST_USER_NOT_EXIST   = 432;      /* 组播用户不存在 */
		public static final int NETDEV_ALARM_CHANNEL_NOT_ONLINE         = 433;      /* 通道不在线 */
		public static final int NETDEV_ALARM_TALKBACK_ENCODED_INVALID   = 434;      /* 语音对讲资源编码无效 */
		public static final int NETDEV_ALARM_VOICE_RES_USED_BY_TALKBACK = 435;      /* 语音资源已被对讲使用 */
		public static final int NETDEV_ALARM_TALKBACK_EXISTS            = 436;      /* 语音对讲已存在 */
		public static final int NETDEV_ALARM_VOICE_WORK_NOT_EXIST       = 437;      /* 语音业务不存在 */
		public static final int NETDEV_ALARM_TALKBACK_TIMEOUT           = 438;      /* 建立语音对讲业务超时 */
		public static final int NETDEV_ALARM_TALKBACK_ERROR             = 439;      /* 语音对讲失败 */

		public static final int NETDEV_ALARM_DISK_ERROR                         = 601;      /* 设备磁盘错误  Disk error */
		public static final int NETDEV_ALARM_SYS_DISK_ERROR                     = 602;      /* 系统磁盘错误  Disk error */
		public static final int NETDEV_ALARM_DISK_ONLINE                        = 603;      /* 设备磁盘上线 Disk online */
		public static final int NETDEV_ALARM_SYS_DISK_ONLINE                    = 604;      /* 系统磁盘上线 Disk online */
		public static final int NETDEV_ALARM_DISK_OFFLINE                       = 605;      /* 设备磁盘离线 */
		public static final int NETDEV_ALARM_SYS_DISK_OFFLINE                   = 606;      /* 系统磁盘离线 */
		public static final int NETDEV_ALARM_DISK_ABNORMAL                      = 607;      /* 磁盘异常 Disk abnormal */
		public static final int NETDEV_ALARM_DISK_ABNORMAL_RECOVER              = 608;      /* 磁盘异常恢复 Disk abnormal recover */
		public static final int NETDEV_ALARM_DISK_STORAGE_WILL_FULL             = 609;      /* 磁盘存储空间即将满 Disk StorageGoingfull */
		public static final int NETDEV_ALARM_DISK_STORAGE_WILL_FULL_RECOVER     = 610;      /* 磁盘存储空间即将满恢复 Disk StorageGoingfull recover */
		public static final int NETDEV_ALARM_DISK_STORAGE_IS_FULL               = 611;      /* 设备存储空间满 StorageIsfull */
		public static final int NETDEV_ALARM_SYS_DISK_STORAGE_IS_FULL           = 612;      /* 系统存储空间满 StorageIsfull */
		public static final int NETDEV_ALARM_DISK_STORAGE_IS_FULL_RECOVER       = 613;      /* 存储空间满恢复 StorageIsfull recover */
		public static final int NETDEV_ALARM_DISK_RAID_DISABLED_RECOVER         = 614;      /* 阵列损坏恢复 RAIDDisabled recover */
		public static final int NETDEV_ALARM_DISK_RAID_DEGRADED                 = 615;      /* 设备阵列衰退 RAIDDegraded */
		public static final int NETDEV_ALARM_SYS_DISK_RAID_DEGRADED             = 616;      /* 系统阵列衰退 RAIDDegraded */
		public static final int NETDEV_ALARM_DISK_RAID_DISABLED                 = 617;      /* 设备阵列损坏 RAIDDisabled */
		public static final int NETDEV_ALARM_SYS_DISK_RAID_DISABLED             = 618;      /* 系统阵列损坏 RAIDDisabled */
		public static final int NETDEV_ALARM_DISK_RAID_DEGRADED_RECOVER         = 619;      /* 阵列衰退恢复 RAIDDegraded recover */
		public static final int NETDEV_ALARM_STOR_GO_FULL                       = 620;      /* 设备存储即将满告警 */
		public static final int NETDEV_ALARM_SYS_STOR_GO_FULL                   = 621;      /* 系统存储即将满告警 */
		public static final int NETDEV_ALARM_ARRAY_NORMAL                       = 622;      /* 设备阵列正常 */
		public static final int NETDEV_ALARM_SYS_ARRAY_NORMAL                   = 623;      /* 系统阵列正常 */
		public static final int NETDEV_ALARM_DISK_RAID_RECOVERED                = 624;      /* 阵列恢复正常 RAIDDegraded */
		public static final int NETDEV_ALARM_STOR_ERR                           = 625;      /* 设备存储错误  Storage error */
		public static final int NETDEV_ALARM_SYS_STOR_ERR                       = 626;      /* 系统存储错误  Storage error */
		public static final int NETDEV_ALARM_STOR_ERR_RECOVER                   = 627;      /* 存储错误恢复  Storage error recover */
		public static final int NETDEV_ALARM_STOR_DISOBEY_PLAN                  = 628;      /* 未按计划存储  Not stored as planned */
		public static final int NETDEV_ALARM_STOR_DISOBEY_PLAN_RECOVER          = 629;      /* 未按计划存储恢复  Not stored as planned recover */

		public static final int NETDEV_ALARM_BANDWITH_CHANGE                    = 801;      /* 设备出口带宽变更 */
		public static final int NETDEV_ALARM_VIDEOENCODER_CHANGE                = 802;      /* 设备码流配置变更告警 */
		public static final int NETDEV_ALARM_IP_CONFLICT                        = 803;      /* IP冲突异常告警 IP conflict exception alarm*/
		public static final int NETDEV_ALARM_IP_CONFLICT_CLEARED                = 804;      /* IP冲突异常告警恢复IP conflict exception alarm recovery */
		public static final int NETDEV_ALARM_NET_OFF                            = 805;      /* 网络断开异常告警 */
		public static final int NETDEV_ALARM_NET_RESUME_ON                      = 806;      /* 网络断开恢复告警 */

		public static final int NETDEV_ALRAM_CONFLAG_DETECT                     = 920;      /* 火点告警 Conflagration detection alarm */

		public static final int NETDEV_ALARM_ILLEGAL_ACCESS                     = 1001;          /* 设备非法访问  Illegal access */
		public static final int NETDEV_ALARM_SYS_ILLEGAL_ACCESS                 = 1002;          /* 系统非法访问  Illegal access */
		public static final int NETDEV_ALARM_LINE_CROSS                         = 1003;          /* 越界告警  Line cross */
		public static final int NETDEV_ALARM_OBJECTS_INSIDE                     = 1004;          /* 区域入侵  Objects inside */
		public static final int NETDEV_ALARM_FACE_RECOGNIZE                     = 1005;          /* 人脸识别  Face recognize */
		public static final int NETDEV_ALARM_IMAGE_BLURRY                       = 1006;          /* 图像虚焦  Image blurry */
		public static final int NETDEV_ALARM_SCENE_CHANGE                       = 1007;          /* 场景变更  Scene change */
		public static final int NETDEV_ALARM_SMART_TRACK                        = 1008;          /* 智能跟踪  Smart track */
		public static final int NETDEV_ALARM_LOITERING_DETECTOR                 = 1009;          /* 徘徊检测  Loitering Detector */
		public static final int NETDEV_ALARM_BANDWIDTH_CHANGE                   = 1010;          /* 带宽变更  Bandwidth change */
		public static final int NETDEV_ALARM_ALLTIME_FLAG_END                   = 1011;          /* 无布防告警结束标记  End marker of alarm without arming schedule */
		public static final int NETDEV_ALARM_MEDIA_CONFIG_CHANGE                = 1012;          /* 编码参数变更 media configurationchanged */
		public static final int NETDEV_ALARM_REMAIN_ARTICLE                     = 1013;          /*物品遗留告警  Remain article*/
		public static final int NETDEV_ALARM_PEOPLE_GATHER                      = 1014;          /* 人员聚集告警 People gather alarm*/
		public static final int NETDEV_ALARM_ENTER_AREA                         = 1015;          /* 进入区域 Enter area*/
		public static final int NETDEV_ALARM_LEAVE_AREA                         = 1016;          /* 离开区域 Leave area*/
		public static final int NETDEV_ALARM_ARTICLE_MOVE                       = 1017;          /* 物品搬移 Article move*/
		public static final int NETDEV_ALARM_SMART_FACE_MATCH_LIST                  = 1018;       /* 人脸识别黑名单报警 */
		public static final int NETDEV_ALARM_SMART_FACE_MATCH_LIST_RECOVER          = 1019;       /* 人脸识别黑名单报警恢复 */
		public static final int NETDEV_ALARM_SMART_FACE_MISMATCH_LIST               = 1020;       /* 人脸识别不匹配报警 */
		public static final int NETDEV_ALARM_SMART_FACE_MISMATCH_LIST_RECOVER       = 1021;       /* 人脸识别不匹配报警恢复 */
		public static final int NETDEV_ALARM_SMART_VEHICLE_MATCH_LIST               = 1022;       /* 车辆识别匹配报警 */
		public static final int NETDEV_ALARM_SMART_VEHICLE_MATCH_LIST_RECOVER       = 1023;       /* 车辆识别匹配报警恢复 */
		public static final int NETDEV_ALARM_SMART_VEHICLE_MISMATCH_LIST            = 1024;       /* 车辆识别不匹配报警 */
		public static final int NETDEV_ALARM_SMART_VEHICLE_MISMATCH_LIST_RECOVER    = 1025;       /* 车辆识别不匹配报警回复 */
		public static final int NETDEV_ALARM_IMAGE_BLURRY_RECOVER               = 1026;         /* 图像虚焦告警恢复  Image blurry recover */
		public static final int NETDEV_ALARM_SMART_TRACK_RECOVER                = 1027;         /* 智能跟踪告警恢复  Smart track recover */
		public static final int NETDEV_ALARM_SMART_READ_ERROR_RATE              = 1028;         /* 底层数据读取错误率Error reding the underlying data */
		public static final int NETDEV_ALARM_SMART_SPIN_UP_TIME                 = 1029;         /* 主轴起旋时间  Rotation time of spindle */
		public static final int NETDEV_ALARM_SMART_START_STOP_COUNT             = 1030;         /* 启停计数 Rev. Stop counting*/
		public static final int NETDEV_ALARM_SMART_REALLOCATED_SECTOR_COUNT     = 1031;         /* 重映射扇区计数  Remap sector count*/
		public static final int NETDEV_ALARM_SMART_SEEK_ERROR_RATE              = 1032;         /* 寻道错误率 Trace error rate*/
		public static final int NETDEV_ALARM_SMART_POWER_ON_HOURS               = 1033;         /* 通电时间累计，出厂后通电的总时间，一般磁盘寿命三万小时 */
		public static final int NETDEV_ALARM_SMART_SPIN_RETRY_COUNT             = 1034;         /* 主轴起旋重试次数 */
		public static final int NETDEV_ALARM_SMART_CALIBRATION_RETRY_COUNT      = 1035;         /* 磁头校准重试计数 */
		public static final int NETDEV_ALARM_SMART_POWER_CYCLE_COUNT            = 1036;         /* 通电周期计数 */
		public static final int NETDEV_ALARM_SMART_POWEROFF_RETRACT_COUNT       = 1037;         /* 断电返回计数 */
		public static final int NETDEV_ALARM_SMART_LOAD_CYCLE_COUNT             = 1038;         /* 磁头加载计数 */
		public static final int NETDEV_ALARM_SMART_TEMPERATURE_CELSIUS          = 1039;         /* 温度 */
		public static final int NETDEV_ALARM_SMART_REALLOCATED_EVENT_COUNT      = 1040;         /* 重映射事件计数 */
		public static final int NETDEV_ALARM_SMART_CURRENT_PENDING_SECTOR       = 1041;         /* 当前待映射扇区计数 */
		public static final int NETDEV_ALARM_SMART_OFFLINE_UNCORRECTABLE        = 1042;         /* 脱机无法校正的扇区计数 */
		public static final int NETDEV_ALARM_SMART_UDMA_CRC_ERROR_COUNT         = 1043;         /* 奇偶校验错误率  */
		public static final int NETDEV_ALARM_SMART_MULTI_ZONE_ERROR_RATE        = 1044;         /* 多区域错误率 */
		public static final int NETDEV_ALARM_RESOLUTION_CHANGE                  = 1045;         /* 分辨率变更 */
		public static final int NETDEV_ALARM_MANUAL                             = 1401;         /* 手动告警 */
		public static final int NETDEV_ALARM_ALARMHOST_COMMON                   = 1402;         /* 报警点事件 */
		public static final int NETDEV_ALARM_DOORHOST_COMMON                    = 1403;         /* 门禁事件 */
		public static final int NETDEV_ALARM_FACE_NOT_MATCH                     = 1411;         /* 人脸对比失败 */
		public static final int NETDEV_ALARM_FACE_MATCH_SUCCEED                 = 1412;         /* 人脸对比成功 */

		public static final int NETDEV_ALARM_VEHICLE_BLACK_LIST                 = 1420;         /* 车辆识别黑名单报警 */
		public static final int NETDEV_ALARM_HUMAN_SHAPE_DETECTION              = 1421;         /* 人形检测 */
		public static final int NETDEV_ALARM_HUMAN_SHAPE_DETECTION_RECOVER      = 1422;         /* 人形检测告警恢复 */

		public static final int NETDEV_ALARM_INVALID                            = 0xFFFF;        /* 无效值  Invalid value */
	}

	public static class NETDEV_ALARM_SUBTYPE_E extends Structure {
		public static final int NETDEV_ALARM_SUB_TYPE_NOT_CONFIGURED       = 0;                                         /*未配置报警子类型*/

		public static final int NETDEV_DEV_TYPE_BASE                       = (100000);                                /* 安防报警基数 */
		public static final int NETDEV_DEV_TROUBLE                         = (NETDEV_DEV_TYPE_BASE + 1);                /* 设备故障 */
		public static final int NETDEV_DEV_ALARM_EMERGENCY                 = (NETDEV_DEV_TYPE_BASE + 2);                /* 紧急报警 */

		/* 报警设备报警类型定义 */
		public static final int NETDEV_ALARM_EVENT_BASE                    = (100200);                                /* 报警类型定义起始位置 */
		public static final int NETDEV_ALARM_EVENT_FIRE_ALARM              = (NETDEV_ALARM_EVENT_BASE + 1);             /* 火警 */
		public static final int NETDEV_ALARM_EVENT_KEYPADFIRE              = (NETDEV_ALARM_EVENT_BASE + 2);             /* 键盘火警报警 */
		public static final int NETDEV_ALARM_EVENT_KEYPADEMERGENCY         = (NETDEV_ALARM_EVENT_BASE + 3);             /* 键盘紧急报警 */
		public static final int NETDEV_ALARM_EVENT_KEYPADMEDICAL           = (NETDEV_ALARM_EVENT_BASE + 4);             /* 键盘求助报警 */
		public static final int NETDEV_ALARM_EVENT_DURESSCODEUSED          = (NETDEV_ALARM_EVENT_BASE + 5);             /* 胁持码操作 */
		public static final int NETDEV_ALARM_EVENT_UNAUTHORIZEDENTRY       = (NETDEV_ALARM_EVENT_BASE + 6);             /* 未授权进入 */
		public static final int NETDEV_ALARM_EVENT_BURGLARPOINTALARM       = (NETDEV_ALARM_EVENT_BASE + 7);             /* 盗警防区报警 */
		public static final int NETDEV_ALARM_EVENT_SUPERVISORY             = (NETDEV_ALARM_EVENT_BASE + 8);             /* 监测故障 */
		public static final int NETDEV_ALARM_EVENT_FIRETROUBLE             = (NETDEV_ALARM_EVENT_BASE + 9);             /* 火警故障 */
		public static final int NETDEV_ALARM_EVENT_FIREPOINTTROUBLE        = (NETDEV_ALARM_EVENT_BASE + 10);            /* 火警防区故障 */
		public static final int NETDEV_ALARM_EVENT_BURGLARPOINTTROUBLE     = (NETDEV_ALARM_EVENT_BASE + 11);            /* 盗警防区故障 */
		public static final int NETDEV_ALARM_EVENT_CANCELALARM             = (NETDEV_ALARM_EVENT_BASE + 12);            /* 消警 */
		public static final int NETDEV_ALARM_EVENT_DISARM                  = (NETDEV_ALARM_EVENT_BASE + 13);            /* 撤防操作成功 */
		public static final int NETDEV_ALARM_EVENT_ARM                     = (NETDEV_ALARM_EVENT_BASE + 14);            /* 布防操作成功 */
		public static final int NETDEV_ALARM_EVENT_FORCEDBYPASS            = (NETDEV_ALARM_EVENT_BASE + 15);            /* 强制旁路操作 */
		public static final int NETDEV_ALARM_EVENT_BYPASS                  = (NETDEV_ALARM_EVENT_BASE + 16);            /* 防区旁路操作 */
		public static final int NETDEV_ALARM_EVENT_POINTRESTORAL           = (NETDEV_ALARM_EVENT_BASE + 17);            /* 防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_FAILTOCLOSE             = (NETDEV_ALARM_EVENT_BASE + 18);            /* 布防操作失败 */
		public static final int NETDEV_ALARM_EVENT_FAILTOOPEN              = (NETDEV_ALARM_EVENT_BASE + 19);            /* 撤防操作失败 */
		public static final int NETDEV_ALARM_EVENT_HISTORYBUFFERDUMP       = (NETDEV_ALARM_EVENT_BASE + 20);            /* 事件记录满 */
		public static final int NETDEV_ALARM_EVENT_TESTMSG                 = (NETDEV_ALARM_EVENT_BASE + 21);            /* 测试用 */
		public static final int NETDEV_ALARM_EVENT_ZONETROUBLE             = (NETDEV_ALARM_EVENT_BASE + 22);            /* 防区故障 */
		public static final int NETDEV_ALARM_EVENT_ZONETROUBLERESTORE      = (NETDEV_ALARM_EVENT_BASE + 23);            /* 防区故障恢复 */
		public static final int NETDEV_ALARM_EVENT_ZONESHORT               = (NETDEV_ALARM_EVENT_BASE + 24);            /* 防区短路 */
		public static final int NETDEV_ALARM_EVENT_ZONEOPEN                = (NETDEV_ALARM_EVENT_BASE + 25);            /* 防区开路 */
		public static final int NETDEV_ALARM_EVENT_ZONENORMAL              = (NETDEV_ALARM_EVENT_BASE + 26);            /* 防区正常 */
		public static final int NETDEV_ALARM_EVENT_MXDEVCLOSE              = (NETDEV_ALARM_EVENT_BASE + 27);            /* MX设备布防 */
		public static final int NETDEV_ALARM_EVENT_MXDEVOPEN               = (NETDEV_ALARM_EVENT_BASE + 28);            /* MX设备撤防 */
		public static final int NETDEV_ALARM_EVENT_MXDEV1ZONEALARM         = (NETDEV_ALARM_EVENT_BASE + 29);            /* MX设备1防区报警 */
		public static final int NETDEV_ALARM_EVENT_MXDEV2ZONEALARM         = (NETDEV_ALARM_EVENT_BASE + 30);            /* MX设备2防区报警 */
		public static final int NETDEV_ALARM_EVENT_MXDEV3ZONEALARM         = (NETDEV_ALARM_EVENT_BASE + 31);            /* MX设备3防区报警 */
		public static final int NETDEV_ALARM_EVENT_MXDEV1ZONERESTAORE      = (NETDEV_ALARM_EVENT_BASE + 32);            /* MX设备1防区恢复 */
		public static final int NETDEV_ALARM_EVENT_MXDEV2ZONERESTAORE      = (NETDEV_ALARM_EVENT_BASE + 33);            /* MX设备2防区恢复 */
		public static final int NETDEV_ALARM_EVENT_MXDEV3ZONERESTAORE      = (NETDEV_ALARM_EVENT_BASE + 34);            /* MX设备3防区恢复 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_AC              = (NETDEV_ALARM_EVENT_BASE + 35);            /* 交流电源故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_BATTERY         = (NETDEV_ALARM_EVENT_BASE + 36);            /* 备用电源故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_SNDREPORT       = (NETDEV_ALARM_EVENT_BASE + 37);            /* 报告发送故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_CONTROL         = (NETDEV_ALARM_EVENT_BASE + 38);            /* 控制故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_MXBUS           = (NETDEV_ALARM_EVENT_BASE + 39);            /* MPX总线故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_RADIOSND        = (NETDEV_ALARM_EVENT_BASE + 40);            /* 无线接收故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_ASSISTPOWER     = (NETDEV_ALARM_EVENT_BASE + 41);            /* 辅助电源故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_OPTION          = (NETDEV_ALARM_EVENT_BASE + 42);            /* option设备故障 */
		public static final int NETDEV_ALARM_EVENT_LINK_BREAK              = (NETDEV_ALARM_EVENT_BASE + 43);            /* 联机断开 */
		public static final int NETDEV_ALARM_EVENT_LINK_RESUME             = (NETDEV_ALARM_EVENT_BASE + 44);            /* 联机正常 */
		public static final int NETDEV_ALARM_EVENT_VOLTAGE_ALARM           = (NETDEV_ALARM_EVENT_BASE + 45);            /* 直流欠压报警 */
		public static final int NETDEV_ALARM_EVENT_EXTERNDEV_TROUBLE       = (NETDEV_ALARM_EVENT_BASE + 46);            /* 扩展设备故障报警 */
		public static final int NETDEV_ALARM_EVENT_EXTERNDEV_RESUME        = (NETDEV_ALARM_EVENT_BASE + 47);            /* 扩展设备恢复报警 */
		public static final int NETDEV_ALARM_EVENT_POINT_DISARM            = (NETDEV_ALARM_EVENT_BASE + 48);            /* 点位撤防 */
		public static final int NETDEV_ALARM_EVENT_POINT_ARM               = (NETDEV_ALARM_EVENT_BASE + 49);            /* 点位布防 */
		public static final int NETDEV_ALARM_EVENT_FORCE_OPEN              = (NETDEV_ALARM_EVENT_BASE + 50);            /* 报警主机被强制打开 */
		public static final int NETDEV_ALARM_EVENT_BYPASS_FAILED           = (NETDEV_ALARM_EVENT_BASE + 51);            /* 旁路操作失败 */
		public static final int NETDEV_ALARM_EVENT_RESET_FAILED            = (NETDEV_ALARM_EVENT_BASE + 52);            /* 复位操作失败 */
		public static final int NETDEV_ALARM_EVENT_POINT_FIRETROUBLE       = (NETDEV_ALARM_EVENT_BASE + 53);            /* 点位故障 */
		public static final int NETDEV_ALARM_EVENT_POINT_SEPARATE          = (NETDEV_ALARM_EVENT_BASE + 54);            /* 点位隔离 */
		public static final int NETDEV_ALARM_EVENT_POINT_ACTION            = (NETDEV_ALARM_EVENT_BASE + 55);            /* 点位动作 */
		public static final int NETDEV_ALARM_EVENT_POINT_RESUME            = (NETDEV_ALARM_EVENT_BASE + 56);            /* 点位恢复 */
		public static final int NETDEV_ALARM_EVENT_ROB_ACTION              = (NETDEV_ALARM_EVENT_BASE + 57);            /* 劫警 */

		/* 报警事件新增 */
		public static final int NETDEV_ALARM_EVENT_MISSED_ARM              = (NETDEV_ALARM_EVENT_BASE + 60);            /* 没有布防 */
		public static final int NETDEV_ALARM_EVENT_MISSED_DISARM           = (NETDEV_ALARM_EVENT_BASE + 61);            /* 没有撤防 */
		public static final int NETDEV_ALARM_EVENT_AUXILARY_RST            = (NETDEV_ALARM_EVENT_BASE + 62);            /* 辅助报警恢复 */
		public static final int NETDEV_ALARM_EVENT_AUXILARY                = (NETDEV_ALARM_EVENT_BASE + 63);            /* 辅助报警 */
		public static final int NETDEV_ALARM_EVENT_BURGLARY_RST            = (NETDEV_ALARM_EVENT_BASE + 64);            /* 窃警恢复 */
		public static final int NETDEV_ALARM_EVENT_BURGLARY                = (NETDEV_ALARM_EVENT_BASE + 65);            /* 窃警 */
		public static final int NETDEV_ALARM_EVENT_BYPASS_RST              = (NETDEV_ALARM_EVENT_BASE + 66);            /* 旁路恢复 */
		public static final int NETDEV_ALARM_EVENT_CANCEL                  = (NETDEV_ALARM_EVENT_BASE + 67);            /* 取消 */
		public static final int NETDEV_ALARM_EVENT_DUPLICATE               = (NETDEV_ALARM_EVENT_BASE + 68);            /* 重复 */
		public static final int NETDEV_ALARM_EVENT_DURESS_RST              = (NETDEV_ALARM_EVENT_BASE + 69);            /* 挟持报警恢复 */
		public static final int NETDEV_ALARM_EVENT_DURESS                  = (NETDEV_ALARM_EVENT_BASE + 70);            /* 挟持报警 */
		public static final int NETDEV_ALARM_EVENT_FIRE_RST                = (NETDEV_ALARM_EVENT_BASE + 71);            /* 火警恢复 */
		public static final int NETDEV_ALARM_EVENT_FIRE_TROUBLE            = (NETDEV_ALARM_EVENT_BASE + 72);            /* 防火探头故障 */
		public static final int NETDEV_ALARM_EVENT_FIRE_TRB_RST            = (NETDEV_ALARM_EVENT_BASE + 73);            /* 防火探头故障恢复 */
		public static final int NETDEV_ALARM_EVENT_MED_RST                 = (NETDEV_ALARM_EVENT_BASE + 74);            /* 医疗救助复位 */
		public static final int NETDEV_ALARM_EVENT_PANIC                   = (NETDEV_ALARM_EVENT_BASE + 75);            /* 紧急报警 */
		public static final int NETDEV_ALARM_EVENT_PANIC_RST               = (NETDEV_ALARM_EVENT_BASE + 76);            /* 紧急报警恢复 */
		public static final int NETDEV_ALARM_EVENT_RESET                   = (NETDEV_ALARM_EVENT_BASE + 77);            /* 复位 */
		public static final int NETDEV_ALARM_EVENT_RELAY_SHORTED           = (NETDEV_ALARM_EVENT_BASE + 78);            /* 继电器短路 */
		public static final int NETDEV_ALARM_EVENT_RELAY_RST               = (NETDEV_ALARM_EVENT_BASE + 79);            /* 继电器恢复 */
		public static final int NETDEV_ALARM_EVENT_RELAY_TROUBLE           = (NETDEV_ALARM_EVENT_BASE + 80);            /* 继电器故障 */
		public static final int NETDEV_ALARM_EVENT_TAMPER                  = (NETDEV_ALARM_EVENT_BASE + 81);            /* 防拆报警 */
		public static final int NETDEV_ALARM_EVENT_TAMPER_RST              = (NETDEV_ALARM_EVENT_BASE + 82);            /* 防拆报警恢复 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE                 = (NETDEV_ALARM_EVENT_BASE + 83);            /* 故障 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_RST             = (NETDEV_ALARM_EVENT_BASE + 84);            /* 故障恢复 */

		/* 乌审旗对接东方电子DF8900电力综合自动化系统新增 */
		public static final int NETDEV_ALARM_EVENT_DFE_REMOTE_CONTROL      = (NETDEV_ALARM_EVENT_BASE + 90);            /* 遥控 */
		public static final int NETDEV_ALARM_EVENT_DFE_SYNC                = (NETDEV_ALARM_EVENT_BASE + 91);            /* 同期 */
		public static final int NETDEV_ALARM_EVENT_DFE_LIFTING             = (NETDEV_ALARM_EVENT_BASE + 92);            /* 升降 */
		public static final int NETDEV_ALARM_EVENT_DFE_SWITCH_NORMAL       = (NETDEV_ALARM_EVENT_BASE + 93);            /* 开关正常变位 */
		public static final int NETDEV_ALARM_EVENT_DFE_SWITCH_ACCIDENT     = (NETDEV_ALARM_EVENT_BASE + 94);            /* 开关事故变位 */
		public static final int NETDEV_ALARM_EVENT_DFE_KINFE_GATE          = (NETDEV_ALARM_EVENT_BASE + 95);            /* 刀闸正常变位 */

		/* 垦华监狱晨鹰哨位集成箱报警 */
		public static final int NETDEV_ALARM_EVENT_ESCAPE                  = (NETDEV_ALARM_EVENT_BASE + 96);            /* 晨鹰哨位事件，犯人逃跑 */
		public static final int NETDEV_ALARM_EVENT_ESCAPE_END              = (NETDEV_ALARM_EVENT_BASE + 97);            /* 晨鹰哨位事件，犯人逃跑结束 */
		public static final int NETDEV_ALARM_EVENT_VIOLENCE                = (NETDEV_ALARM_EVENT_BASE + 98);            /* 晨鹰哨位事件，犯人暴狱 */
		public static final int NETDEV_ALARM_EVENT_VIOLENCE_END            = (NETDEV_ALARM_EVENT_BASE + 99);            /* 晨鹰哨位事件，犯人暴狱结束 */
		public static final int NETDEV_ALARM_EVENT_ATTACKED                = (NETDEV_ALARM_EVENT_BASE + 100);           /* 晨鹰哨位事件，目标遭袭 */
		public static final int NETDEV_ALARM_EVENT_ATTACKED_END            = (NETDEV_ALARM_EVENT_BASE + 101);           /* 晨鹰哨位事件，目标遭袭结束 */
		public static final int NETDEV_ALARM_EVENT_NATURAL_DISASTER        = (NETDEV_ALARM_EVENT_BASE + 102);           /* 晨鹰哨位事件，自然灾害 */
		public static final int NETDEV_ALARM_EVENT_NATURAL_DISASTER_END    = (NETDEV_ALARM_EVENT_BASE + 103);           /* 晨鹰哨位事件，自然灾害结束 */
		public static final int NETDEV_ALARM_EVENT_ONE_KEY_ALARM           = (NETDEV_ALARM_EVENT_BASE + 104);           /* 晨鹰哨位事件，一键报警 */
		public static final int NETDEV_ALARM_EVENT_ONE_KEY_ALARM_END       = (NETDEV_ALARM_EVENT_BASE + 105);           /* 晨鹰哨位事件，一键报警结束 */

		/* 潍北监狱中电瑞达高压电网报警 */
		public static final int NETDEV_ALARM_EVENT_CERC_NORMAL             = (NETDEV_ALARM_EVENT_BASE + 106);           /* 中电瑞达事件，高压电网正常 */
		public static final int NETDEV_ALARM_EVENT_CERC_TOUCH              = (NETDEV_ALARM_EVENT_BASE + 107);           /* 中电瑞达事件，高压电网触网 */
		public static final int NETDEV_ALARM_EVENT_CERC_BREAK              = (NETDEV_ALARM_EVENT_BASE + 108);           /* 中电瑞达事件，高压电网断路 */
		public static final int NETDEV_ALARM_EVENT_CERC_SHORT              = (NETDEV_ALARM_EVENT_BASE + 109);           /* 中电瑞达事件，高压电网短路 */
		public static final int NETDEV_ALARM_EVENT_CERC_COMMU_ERR          = (NETDEV_ALARM_EVENT_BASE + 110);           /* 中电瑞达事件，高压电网通信错误 */

		/* 潍北监狱艾博信相控阵雷达和红外光栅报警 */
		public static final int NETDEV_ALARM_EVENT_HYPERSEE_DDR_ALARM      = (NETDEV_ALARM_EVENT_BASE + 111);           /* 艾博信事件，相控阵雷达报警 */
		public static final int NETDEV_ALARM_EVENT_HYPERSEE_DDR_ALARM_RST  = (NETDEV_ALARM_EVENT_BASE + 112);           /* 艾博信事件，相控阵雷达报警恢复 */
		public static final int NETDEV_ALARM_EVENT_HYPERSEE_IR_ALARM       = (NETDEV_ALARM_EVENT_BASE + 113);           /* 艾博信事件，红外光栅报警 */
		public static final int NETDEV_ALARM_EVENT_HYPERSEE_IR_ALARM_RST   = (NETDEV_ALARM_EVENT_BASE + 114);           /* 艾博信事件，红外光栅报警恢复 */

		/* 潍北监狱中科融通陀螺仪报警 */
		public static final int NETDEV_ALARM_EVENT_UBI_ALARM               = (NETDEV_ALARM_EVENT_BASE + 115);           /* 中科融通事件，陀螺仪报警 */

		/* 新疆中泰园区中科华讯美国西南周界震动电缆报警 */
		public static final int NETDEV_ALARM_EVENT_HXTECH_CABLE_ALARM      = (NETDEV_ALARM_EVENT_BASE + 116);           /* 华讯周界事件，震动电缆报警 */

		/*精华隆数据*/
		public static final int NETDEV_ALARM_EVENT_DEVICE_UNDER_VOLTAGE_RST            = (NETDEV_ALARM_EVENT_BASE + 117);               /* 设备欠压恢复模式 */
		public static final int NETDEV_ALARM_EVENT_ZONE_NOT_READY                      = (NETDEV_ALARM_EVENT_BASE + 118);               /* 防区未准备 */
		public static final int NETDEV_ALARM_EVENT_ZONE_NOT_READY_RST                  = (NETDEV_ALARM_EVENT_BASE + 119);               /* 防区未准备恢复 */
		public static final int NETDEV_ALARM_EVENT_TELEPHONE_CABLE_FAULT               = (NETDEV_ALARM_EVENT_BASE + 120);               /* 电话线故障 */
		public static final int NETDEV_ALARM_EVENT_TELEPHONE_CABLE_FAULT_RST           = (NETDEV_ALARM_EVENT_BASE + 121);               /* 电话线故障恢复 */
		public static final int NETDEV_ALARM_EVENT_AC_POWER_FAULT                      = (NETDEV_ALARM_EVENT_BASE + 122);               /* 交流电故障 */

		/* 一体机对接艾立安告警 */
		public static final int NETDEV_ALARM_EVENT_ZONE_TOUCH                          = (NETDEV_ALARM_EVENT_BASE + 123);    /* 防区触发报警 */
		public static final int NETDEV_ALARM_EVENT_ZONE_TOUCH_RESTORE                  = (NETDEV_ALARM_EVENT_BASE + 124);    /* 防区触发恢复 */
		public static final int NETDEV_ALARM_EVENT_CAPTIVE                             = (NETDEV_ALARM_EVENT_BASE + 125);    /* 被撬 */
		public static final int NETDEV_ALARM_EVENT_CAPTIVE_RST                         = (NETDEV_ALARM_EVENT_BASE + 126);    /* 被撬恢复 */
		public static final int NETDEV_ALARM_EVENT_UNDERVOLTAGE                        = (NETDEV_ALARM_EVENT_BASE + 127);    /* 欠压 */
		public static final int NETDEV_ALARM_EVENT_UNDERVOLTAGE_RST                    = (NETDEV_ALARM_EVENT_BASE + 128);    /* 欠压恢复 */
		public static final int NETDEV_ALARM_EVENT_TROUBLE_BATTERY_RST                 = (NETDEV_ALARM_EVENT_BASE + 129);    /* 备用电池故障恢复 */
		public static final int NETDEV_ALARM_EVENT_DEV_POWER_REBOOT                    = (NETDEV_ALARM_EVENT_BASE + 130);    /* 设备上电重启 */
		public static final int NETDEV_ALARM_EVENT_TEST_FAILURE                        = (NETDEV_ALARM_EVENT_BASE + 131);    /* 设备测试失败 */
		public static final int NETDEV_ALARM_EVENT_OPERATOR_TOUCH_LONG                 = (NETDEV_ALARM_EVENT_BASE + 132);    /* 长按键操作  */
		public static final int NETDEV_ALARM_EVENT_REMOTE_ARM                          = (NETDEV_ALARM_EVENT_BASE + 133);    /* 遥控布防  */
		public static final int NETDEV_ALARM_EVENT_REMOTE_DISARM                       = (NETDEV_ALARM_EVENT_BASE + 134);    /* 遥控撤防  */
		public static final int NETDEV_ALARM_EVENT_REMOTE_STAY_ARM                     = (NETDEV_ALARM_EVENT_BASE + 135);    /* 遥控留守布防  */
		public static final int NETDEV_ALARM_EVENT_PWD_ARM                             = (NETDEV_ALARM_EVENT_BASE + 136);    /* 密码布防设备  */
		public static final int NETDEV_ALARM_EVENT_PWD_DISARM                          = (NETDEV_ALARM_EVENT_BASE + 137);    /* 密码撤防设备  */
		public static final int NETDEV_ALARM_EVENT_PWD_STAY_DEV                        = (NETDEV_ALARM_EVENT_BASE + 138);    /* 密码留守布防设备  */
		public static final int NETDEV_ALARM_EVENT_PWD_ARM_PART                        = (NETDEV_ALARM_EVENT_BASE + 139);    /* 密码布防分区  */
		public static final int NETDEV_ALARM_EVENT_PWD_DISARM_PART                     = (NETDEV_ALARM_EVENT_BASE + 140);    /* 密码撤防分区  */
		public static final int NETDEV_ALARM_EVENT_PWD_STAY_PART                       = (NETDEV_ALARM_EVENT_BASE + 141);    /* 密码留守布防分区  */
		public static final int NETDEV_ALARM_EVENT_PWD_ARM_ZONE                        = (NETDEV_ALARM_EVENT_BASE + 142);    /* 密码布防防区  */
		public static final int NETDEV_ALARM_EVENT_PWD_DISARM_ZONE                     = (NETDEV_ALARM_EVENT_BASE + 143);    /* 密码撤防防区  */
		public static final int NETDEV_ALARM_EVENT_USER_ARM                            = (NETDEV_ALARM_EVENT_BASE + 144);    /* 用户布防设备  */
		public static final int NETDEV_ALARM_EVENT_USER_DISARM                         = (NETDEV_ALARM_EVENT_BASE + 145);    /* 用户撤防设备  */
		public static final int NETDEV_ALARM_EVENT_USER_STAY_DEV                       = (NETDEV_ALARM_EVENT_BASE + 146);    /* 用户留守布防设备  */
		public static final int NETDEV_ALARM_EVENT_USER_CLEAN_ALARM                    = (NETDEV_ALARM_EVENT_BASE + 147);    /* 用户清除报警显示  */
		public static final int NETDEV_ALARM_EVENT_PWD_OPEN_DOOR                       = (NETDEV_ALARM_EVENT_BASE + 148);    /* 密码开门  */
		public static final int NETDEV_ALARM_EVENT_KEY_OPEN_DOOR                       = (NETDEV_ALARM_EVENT_BASE + 149);    /* 钥匙开门  */
		public static final int NETDEV_ALARM_EVENT_REMOTE_OPEN_DOOR                    = (NETDEV_ALARM_EVENT_BASE + 150);    /* 遥控开门  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_ARM                           = (NETDEV_ALARM_EVENT_BASE + 151);    /* 刷卡布防  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_DISARM                        = (NETDEV_ALARM_EVENT_BASE + 152);    /* 刷卡撤防  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_LOCK                          = (NETDEV_ALARM_EVENT_BASE + 153);    /* 刷卡闭锁  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_UNLOCK                        = (NETDEV_ALARM_EVENT_BASE + 154);    /* 刷卡开锁  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_RECORD                        = (NETDEV_ALARM_EVENT_BASE + 155);    /* 刷卡记录  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_ATTENDANCE_IN                 = (NETDEV_ALARM_EVENT_BASE + 156);    /* 刷卡考勤入  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_ATTENDANCE_OUT                = (NETDEV_ALARM_EVENT_BASE + 157);    /* 刷卡考勤出  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_TURNON_LIGHT                  = (NETDEV_ALARM_EVENT_BASE + 158);    /* 刷卡开灯  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_OFF_LIGHT                     = (NETDEV_ALARM_EVENT_BASE + 159);    /* 刷卡关灯  */
		public static final int NETDEV_ALARM_EVENT_SWIPE_CARD_NUM                      = (NETDEV_ALARM_EVENT_BASE + 160);    /* 刷卡上报卡物理编号  */
		public static final int NETDEV_ALARM_EVENT_MANUAL_OPEN                         = (NETDEV_ALARM_EVENT_BASE + 161);    /* 手动开门/开灯  */
		public static final int NETDEV_ALARM_EVENT_ZONE_OPEN_DOOR                      = (NETDEV_ALARM_EVENT_BASE + 162);    /* 防区触发开门  */
		public static final int NETDEV_ALARM_EVENT_ZONE_DOOR_LONGTIME                  = (NETDEV_ALARM_EVENT_BASE + 163);    /* 防区长时间未触发布防  */
		public static final int NETDEV_ALARM_EVENT_ZONE_ARM                            = (NETDEV_ALARM_EVENT_BASE + 164);    /* 防区触发布防  */
		public static final int NETDEV_ALARM_EVENT_ZONE_DISARM                         = (NETDEV_ALARM_EVENT_BASE + 165);    /* 防区触发撤防  */
		public static final int NETDEV_ALARM_EVENT_TIMER_ARM                           = (NETDEV_ALARM_EVENT_BASE + 166);    /* 定时布防  */
		public static final int NETDEV_ALARM_EVENT_TIMER_DISARM                        = (NETDEV_ALARM_EVENT_BASE + 167);    /* 定时撤防  */
		public static final int NETDEV_ALARM_EVENT_CENTRAL_COMM_NORMAL                 = (NETDEV_ALARM_EVENT_BASE + 168);    /* 中心通讯正常  */
		public static final int NETDEV_ALARM_EVENT_CENTRAL_HANDSHAKE_FAILED            = (NETDEV_ALARM_EVENT_BASE + 169);    /* 中心握手失败  */
		public static final int NETDEV_ALARM_EVENT_CENTRAL_RESPONSE_FAILED             = (NETDEV_ALARM_EVENT_BASE + 170);    /* 中心应答失败  */
		public static final int NETDEV_ALARM_EVENT_USER_CONFIRMATION                   = (NETDEV_ALARM_EVENT_BASE + 171);    /* 用户接警确认  */
		public static final int NETDEV_ALARM_EVENT_USER_TIMEOUT                        = (NETDEV_ALARM_EVENT_BASE + 172);    /* 用户接警超时  */
		public static final int NETDEV_ALARM_EVENT_TELEP_RINGING                       = (NETDEV_ALARM_EVENT_BASE + 173);    /* 电话模块接收到振铃信号  */
		public static final int NETDEV_ALARM_EVENT_TELEP_ARM                           = (NETDEV_ALARM_EVENT_BASE + 174);    /* 电话模块接收到远程撤布防一位操作密码  */
		public static final int NETDEV_ALARM_EVENT_TELEP_STATUS_OFFLINE                = (NETDEV_ALARM_EVENT_BASE + 175);    /* 电话线掉线  */
		public static final int NETDEV_ALARM_EVENT_TELEP_STATUS_ONLINE                 = (NETDEV_ALARM_EVENT_BASE + 176);    /* 电话线在线  */
		public static final int NETDEV_ALARM_EVENT_MSG_SEND_SUCC                       = (NETDEV_ALARM_EVENT_BASE + 177);    /* 短信发送成功  */
		public static final int NETDEV_ALARM_EVENT_MSG_SEND_FAILED                     = (NETDEV_ALARM_EVENT_BASE + 178);    /* 短信发送失败  */
		public static final int NETDEV_ALARM_EVENT_SWITCH_CLOSE                        = (NETDEV_ALARM_EVENT_BASE + 179);    /* 操作开关合上  */
		public static final int NETDEV_ALARM_EVENT_SWITCH_OFF                          = (NETDEV_ALARM_EVENT_BASE + 180);    /* 操作开关断开  */
		public static final int NETDEV_ALARM_EVENT_TEMPER_CHANGE                       = (NETDEV_ALARM_EVENT_BASE + 181);    /* 温度变化上报  */
		public static final int NETDEV_ALARM_EVENT_HUMIDITY_CHANGE                     = (NETDEV_ALARM_EVENT_BASE + 182);    /* 湿度变化上报  */
		public static final int NETDEV_ALARM_EVENT_DEVID_WRONG                         = (NETDEV_ALARM_EVENT_BASE + 183);    /* 设备ID错误  */
		public static final int NETDEV_ALARM_EVENT_ELEC_HIGH_ARM                       = (NETDEV_ALARM_EVENT_BASE + 184);    /* 单个电子围栏高压布防  */
		public static final int NETDEV_ALARM_EVENT_ELEC_LOW_ARM                        = (NETDEV_ALARM_EVENT_BASE + 185);    /* 单个电子围栏低压布防  */
		public static final int NETDEV_ALARM_EVENT_ELEC_ALARM_RST                      = (NETDEV_ALARM_EVENT_BASE + 186);    /* 单个电子围栏报警复位  */
		public static final int NETDEV_ALARM_EVENT_ELEC_DISARM                         = (NETDEV_ALARM_EVENT_BASE + 187);    /* 单个电子围栏撤防  */
		public static final int NETDEV_ALARM_EVENT_ELEC_ARM                            = (NETDEV_ALARM_EVENT_BASE + 188);    /* 单个电子围栏电压值布防  */
		public static final int NETDEV_ALARM_EVENT_KEY_ALARM_OVER                      = (NETDEV_ALARM_EVENT_BASE + 189);    /* 键盘所有报警处理完成  */
		public static final int NETDEV_ALARM_EVENT_KEY_PROL_TYPE                       = (NETDEV_ALARM_EVENT_BASE + 190);    /* 键盘上报协议类型（主要针对电子围栏）  */
		public static final int NETDEV_ALARM_EVENT_MOD_DEV_ADDR                        = (NETDEV_ALARM_EVENT_BASE + 191);    /* 键盘修改设备地址（主要针对电子围栏）  */
		public static final int NETDEV_ALARM_EVENT_FORWARD_CMD                         = (NETDEV_ALARM_EVENT_BASE + 192) ;   /* 通讯设备转发中心命令  */

		public static final int NETDEV_ALARM_EVENT_BASE_VALUE                          = (110000);                                    /* 报警类型定义起始位置 */
		public static final int NETDEV_ALARM_EVENT_IMMEDIATELY_DEFEND_ALARM            = (NETDEV_ALARM_EVENT_BASE_VALUE + 1);           /* 即时防区报警 */
		public static final int NETDEV_ALARM_EVENT_IMMEDIATELY_DEFEND_ALARM_RST        = (NETDEV_ALARM_EVENT_BASE_VALUE + 2);           /* 即时防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_ALL_DAY_NO_VOICE_ALARM              = (NETDEV_ALARM_EVENT_BASE_VALUE + 3);           /* 24小时无声防区报警 */
		public static final int NETDEV_ALARM_EVENT_ALL_DAY_NO_VOICE_ALARM_RST          = (NETDEV_ALARM_EVENT_BASE_VALUE + 4);           /* 24小时无声防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_ALL_DAY_VOICE_ALARM                 = (NETDEV_ALARM_EVENT_BASE_VALUE + 5);           /* 24小时有声防区报警 */
		public static final int NETDEV_ALARM_EVENT_ALL_DAY_VOICE_ALARM_RST             = (NETDEV_ALARM_EVENT_BASE_VALUE + 6);           /* 24小时有声防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_BOARD_DEFEND_ALARM                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 7);           /* 周界防区报警 */
		public static final int NETDEV_ALARM_EVENT_BOARD_DEFEND_ALARM_RST              = (NETDEV_ALARM_EVENT_BASE_VALUE + 8);           /* 周界防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_INNER_DELAY_DEFEND_ALARM            = (NETDEV_ALARM_EVENT_BASE_VALUE + 9);           /* 内部延时防区报警 */
		public static final int NETDEV_ALARM_EVENT_INNER_DELAY_DEFEND_ALARM_RST        = (NETDEV_ALARM_EVENT_BASE_VALUE + 10);          /* 内部延时防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_DELAY_DEFEND_ALARM                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 11);          /* 延时防区报警 */
		public static final int NETDEV_ALARM_EVENT_DELAY_DEFEND_ALARM_RST              = (NETDEV_ALARM_EVENT_BASE_VALUE + 12);          /* 延时防区报警恢复 */
		public static final int NETDEV_ALARM_EVENT_EXPAND_MODEL_FAULT_ALARM            = (NETDEV_ALARM_EVENT_BASE_VALUE + 13);          /* 拓展模块故障 */
		public static final int NETDEV_ALARM_EVENT_EXPAND_MODEL_FAULT_ALARM_RST        = (NETDEV_ALARM_EVENT_BASE_VALUE + 14);          /* 拓展模块故障恢复 */
		public static final int NETDEV_ALARM_EVENT_OUTER_DISARMED                      = (NETDEV_ALARM_EVENT_BASE_VALUE + 15);          /* 外出撤防 */
		public static final int NETDEV_ALARM_EVENT_OUTER_ARMED                         = (NETDEV_ALARM_EVENT_BASE_VALUE + 16);          /* 外出布防 */
		public static final int NETDEV_ALARM_EVENT_KEY_DISARMED                        = (NETDEV_ALARM_EVENT_BASE_VALUE + 17);          /* 钥匙防区撤防 */
		public static final int NETDEV_ALARM_EVENT_KEY_ARMED                           = (NETDEV_ALARM_EVENT_BASE_VALUE + 18);          /* 钥匙防区布防 */
		public static final int NETDEV_ALARM_EVENT_WIRELESS_NET_WORK_EXCEPTION         = (NETDEV_ALARM_EVENT_BASE_VALUE + 19);          /* 无线网络异常 */
		public static final int NETDEV_ALARM_EVENT_WIRELESS_NET_WORK_EXCEPTION_RST     = (NETDEV_ALARM_EVENT_BASE_VALUE + 20);          /* 无线网络异常恢复 */
		public static final int NETDEV_ALARM_EVENT_WIRED_NET_WORK_BREAK                = (NETDEV_ALARM_EVENT_BASE_VALUE + 21);          /* 有线网络故障 */
		public static final int NETDEV_ALARM_EVENT_WIRED_NET_WORK_BREAK_RST            = (NETDEV_ALARM_EVENT_BASE_VALUE + 22);          /* 有线网络故障恢复 */
		public static final int NETDEV_ALARM_EVENT_SOFT_DEFEND_URGENCY_ALARM           = (NETDEV_ALARM_EVENT_BASE_VALUE + 23);          /* 软防区紧急报警 */
		public static final int NETDEV_ALARM_EVENT_ARMED_STAY                          = (NETDEV_ALARM_EVENT_BASE_VALUE + 24);          /* 留守布防 */
		public static final int NETDEV_ALARM_EVENT_IMMEDIATELY_ARMED                   = (NETDEV_ALARM_EVENT_BASE_VALUE + 25);          /* 即时布防 */

		/* 乌审旗对接昆仑传感（烟感、水浸、继电器报警）报警新增 */
		public static final int NETDEV_ALARM_EVENT_SMOKE_ALARM                         = (NETDEV_ALARM_EVENT_BASE_VALUE + 26);          /* 昆仑传感 烟感报警 */
		public static final int NETDEV_ALARM_EVENT_SMOKE_ALARM_END                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 27);          /* 昆仑传感 烟感报警停止 */
		public static final int NETDEV_ALARM_EVENT_WATER_ALARM                         = (NETDEV_ALARM_EVENT_BASE_VALUE + 28);          /* 昆仑传感 水浸报警 */
		public static final int NETDEV_ALARM_EVENT_WATER_ALARM_END                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 29);          /* 昆仑传感 水浸报警停止 */
		public static final int NETDEV_ALARM_EVENT_IO_ON                               = (NETDEV_ALARM_EVENT_BASE_VALUE + 30);          /* 昆仑传感.开关量开 */
		public static final int NETDEV_ALARM_EVENT_IO_OFF                              = (NETDEV_ALARM_EVENT_BASE_VALUE + 31);          /* 昆仑传感.开关量关 */

		/* 长飞振动光纤新增报警定义值 */
		public static final int NETDEV_ALARM_EVENT_TOUNCH_ALARM                        = (NETDEV_ALARM_EVENT_BASE_VALUE + 32);          /* 触碰报警 */
		public static final int NETDEV_ALARM_EVENT_INVADE_ALARM                        = (NETDEV_ALARM_EVENT_BASE_VALUE + 33);          /* 入侵报警 */
		public static final int NETDEV_ALARM_EVENT_BROKEN_ALARM                        = (NETDEV_ALARM_EVENT_BASE_VALUE + 34);          /* 断裂报警 */
		public static final int NETDEV_ALARM_EVENT_HELP                                = (NETDEV_ALARM_EVENT_BASE_VALUE + 36);          /* 紧急求助 */
		public static final int NETDEV_ALARM_EVENT_DESTROY                             = (NETDEV_ALARM_EVENT_BASE_VALUE + 37);          /* 破坏报警 */
		public static final int NETDEV_ALARM_EVENT_ACS                                 = (NETDEV_ALARM_EVENT_BASE_VALUE + 38);          /* 门禁报警 */
		public static final int NETDEV_ALARM_EVENT_OTHERS                              = (NETDEV_ALARM_EVENT_BASE_VALUE + 39);          /* 其它报警 */
		public static final int NETDEV_ALARM_EVENT_ZONE_ALARM                          = (NETDEV_ALARM_EVENT_BASE_VALUE + 40);          /* 安标报警模块.防区报警 */
		public static final int NETDEV_ALARM_EVENT_ZONE_ALARM_RST                      = (NETDEV_ALARM_EVENT_BASE_VALUE + 41);          /* 安标报警模块.防区恢复 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_FENCE                    = (NETDEV_ALARM_EVENT_BASE_VALUE + 42);          /* 围栏报警 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_HOST                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 43);          /* 主机报警 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_ETCZONE                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 44);          /* 扩展防区报警 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_OFFLINE                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 45);          /* 通信掉线 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_SWITCH1                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 46);          /* 防区开关量1报警 */
		public static final int NETDEV_ALARM_EVENT_GATO_ALARM_SWITCH2                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 47);          /* 防区开关量2报警 */
		public static final int NETDEV_ALARM_EVENT_STEAL                               = (NETDEV_ALARM_EVENT_BASE_VALUE + 48);          /* 窃盗报警 */
		public static final int NETDEV_ALARM_EVENT_GAS                                 = (NETDEV_ALARM_EVENT_BASE_VALUE + 49);          /* 燃气报警 */
		public static final int NETDEV_ALARM_EVENT_SAVE                                = (NETDEV_ALARM_EVENT_BASE_VALUE + 50);          /* 救护报警 */
		public static final int NETDEV_ALARM_EVENT_INVADE_TROUBLE                      = (NETDEV_ALARM_EVENT_BASE_VALUE + 51);          /* 入侵加故障报警 */
		public static final int NETDEV_ALARM_EVENT_SYS_TROUBLE                         = (NETDEV_ALARM_EVENT_BASE_VALUE + 52);          /* 系统故障 */
		public static final int NETDEV_ALARM_EVENT_OPTICAL_FIBER_TROUBLE               = (NETDEV_ALARM_EVENT_BASE_VALUE + 53);          /* 光纤故障 */

		/* 烽火科技报警主机报警子类型 */
		public static final int NETDEV_ALARM_EVENT_MOTION_DETECTION                    = (NETDEV_ALARM_EVENT_BASE_VALUE + 62);          /* 运动检测报警 */
		public static final int NETDEV_ALARM_EVENT_CALL_REMOVE                         = (NETDEV_ALARM_EVENT_BASE_VALUE + 63);          /* 呼叫解除报警 */
		public static final int NETDEV_ALARM_EVENT_NOISE                               = (NETDEV_ALARM_EVENT_BASE_VALUE + 64);          /* 噪音报警 */
		public static final int NETDEV_ALARM_EVENT_DELAYED                             = (NETDEV_ALARM_EVENT_BASE_VALUE + 65);          /* 延时报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_INPUT_ONE                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 66);          /* 报警输入1报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_INPUT_TWO                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 67);          /* 报警输入2报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_CALL_EMERGENCY                = (NETDEV_ALARM_EVENT_BASE_VALUE + 68);          /* 紧急呼叫  */
		public static final int NETDEV_ALARM_EVENT_ALARM_CALL_CONSULTANT               = (NETDEV_ALARM_EVENT_BASE_VALUE + 69);          /* 咨询呼叫 */
		public static final int NETDEV_ALARM_EVENT_DOOR_MAGNET_OPEN                    = (NETDEV_ALARM_EVENT_BASE_VALUE + 70);          /* 门磁打开 */
		public static final int NETDEV_ALARM_EVENT_DOOR_MAGNET_CLOSE                   = (NETDEV_ALARM_EVENT_BASE_VALUE + 71);          /* 门磁关闭 */
		public static final int NETDEV_ALARM_EVENT_DOOR_LOCK_OPEN                      = (NETDEV_ALARM_EVENT_BASE_VALUE + 72);          /* 门锁打开 */
		public static final int NETDEV_ALARM_EVENT_DOOR_LOCK_CLOSE                     = (NETDEV_ALARM_EVENT_BASE_VALUE + 73);          /* 门锁关闭 */

		/*世邦报警柱报警子类型*/
		public static final int NETDEV_ALARM_EVENT_ALARM_PORT_ONE             = (NETDEV_ALARM_EVENT_BASE_VALUE + 74);          /* 端口1报警  Port 1 Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_PORT_TWO             = (NETDEV_ALARM_EVENT_BASE_VALUE + 75);          /* 端口2报警  Port 2 Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_PORTEX               = (NETDEV_ALARM_EVENT_BASE_VALUE + 76);          /* 扩展端口报警  Expansion Port Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_TUMULT               = (NETDEV_ALARM_EVENT_BASE_VALUE + 77);          /* 喧哗报警  Tumult Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_110                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 78);          /* 110报警  110 Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_119                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 79);          /* 119报警  119 Alarm */
		public static final int NETDEV_ALARM_EVENT_ALARM_120                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 80);          /* 120报警  120 Alarm */

		/* 蓝星报警主机报警子类型 */
		public static final int NETDEV_ALARM_EVENT_ALARM_FINDERCONNECT_FAILED = (NETDEV_ALARM_EVENT_BASE_VALUE + 81);          /* 探测器通讯失败 */
		public static final int NETDEV_ALARM_EVENT_ALARM_OUTAGE               = (NETDEV_ALARM_EVENT_BASE_VALUE + 82);          /* 断电报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_DISASSEMBLE          = (NETDEV_ALARM_EVENT_BASE_VALUE + 83);          /* 拆机报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_CIRCUIT              = (NETDEV_ALARM_EVENT_BASE_VALUE + 84);          /* 断路报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_TOUCHNET             = (NETDEV_ALARM_EVENT_BASE_VALUE + 85);          /* 触网报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_PREVENTCUT           = (NETDEV_ALARM_EVENT_BASE_VALUE + 86);          /* 防剪报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_COCKING              = (NETDEV_ALARM_EVENT_BASE_VALUE + 87);          /* 拉紧报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_SLACK                = (NETDEV_ALARM_EVENT_BASE_VALUE + 88);          /* 松弛报警 */
		public static final int NETDEV_ALARM_EVENT_ALARM_ZONE_FORBIDDEN       = (NETDEV_ALARM_EVENT_BASE_VALUE + 89);          /* 防区禁用 */

		/* 建大仁科 */
		public static final int NETDEV_ALARM_EVENT_HIGH_TEMP                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 90);           /* 温度超上限报警 */
		public static final int NETDEV_ALARM_EVENT_LOW_TEMP                   = (NETDEV_ALARM_EVENT_BASE_VALUE + 91);           /* 温度超下限报警 */
		public static final int NETDEV_ALARM_EVENT_HIGH_HUMI                  = (NETDEV_ALARM_EVENT_BASE_VALUE + 92);           /* 湿度超上限报警 */
		public static final int NETDEV_ALARM_EVENT_LOW_HUMI                   = (NETDEV_ALARM_EVENT_BASE_VALUE + 93);           /* 湿度超下限报警 */
		public static final int NETDEV_ALARM_MONITOR_DEVICE_ONLINE            = (NETDEV_ALARM_EVENT_BASE_VALUE + 94);           /* 监控点设备在线 */
		public static final int NETDEV_ALARM_MONITOR_DEVICE_OFFLINE           = (NETDEV_ALARM_EVENT_BASE_VALUE + 95);           /* 监控点设备离线 */

		/* 门禁上报事件类型定义*/
		public static final int NETDEV_DOOR_EVENT_BASE                         = (100400);                          /* 门禁事件类型定义起始位置 */

		public static final int NETDEV_DOOR_EVENT_DISCONNECT                   = (NETDEV_DOOR_EVENT_BASE + 1);        /* 通信中断(门禁主机与门之间) */
		public static final int NETDEV_DOOR_EVENT_INFRARED_ALARM               = (NETDEV_DOOR_EVENT_BASE + 2);        /* 红外报警 */
		public static final int NETDEV_DOOR_EVENT_ILLICIT_OPEN_DOOR            = (NETDEV_DOOR_EVENT_BASE + 3);        /* 非法开门 */
		public static final int NETDEV_DOOR_EVENT_COERCE_ALARM                 = (NETDEV_DOOR_EVENT_BASE + 4);        /* 胁迫报警 */
		public static final int NETDEV_DOOR_EVENT_OPEN_TIMEOUT                 = (NETDEV_DOOR_EVENT_BASE + 5);        /* 超时未开门 */
		public static final int NETDEV_DOOR_EVENT_CLOSE_TIMEOUT                = (NETDEV_DOOR_EVENT_BASE + 6);        /* 超时未关门 */
		public static final int NETDEV_DOOR_EVENT_ANOMALOUS_CARD               = (NETDEV_DOOR_EVENT_BASE + 7);        /* 异常刷卡 */
		public static final int NETDEV_DOOR_EVENT_CARD_OPEN_DOOR               = (NETDEV_DOOR_EVENT_BASE + 8);        /* 刷卡开门 */
		public static final int NETDEV_DOOR_EVENT_REMOTE_OPEN_DOOR             = (NETDEV_DOOR_EVENT_BASE + 9);        /* 远程开门 */
		public static final int NETDEV_DOOR_EVENT_MANUAL_OPEN_DOOR             = (NETDEV_DOOR_EVENT_BASE + 10);       /* 手动开门 */
		public static final int NETDEV_DOOR_EVENT_EMERGENCY_START              = (NETDEV_DOOR_EVENT_BASE + 11);       /* 紧急事件开始 */
		public static final int NETDEV_DOOR_EVENT_EMERGENCY_STOP               = (NETDEV_DOOR_EVENT_BASE + 12);       /* 紧急事件结束 */
		public static final int NETDEV_DOOR_EVENT_OPEN_SUCCESS                 = (NETDEV_DOOR_EVENT_BASE + 13);       /* 开门成功 */
		public static final int NETDEV_DOOR_EVENT_OPEN_FAILED                  = (NETDEV_DOOR_EVENT_BASE + 14);       /* 开门失败 */
		public static final int NETDEV_DOOR_EVENT_CLOSE                        = (NETDEV_DOOR_EVENT_BASE + 15);       /* 关门事件 */
		public static final int NETDEV_DOOR_EVENT_CLOSE_FAILED                 = (NETDEV_DOOR_EVENT_BASE + 16);       /* 关门失败 */
		public static final int NETDEV_DOOR_EVENT_CARD_NO_AUTH                 = (NETDEV_DOOR_EVENT_BASE + 17);       /* 卡无权限 */
		public static final int NETDEV_DOOR_EVENT_NO_DATE_LIMIT                = (NETDEV_DOOR_EVENT_BASE + 18);       /* 无期限 */
		public static final int NETDEV_DOOR_EVENT_CARD_ILLEGAL                 = (NETDEV_DOOR_EVENT_BASE + 19);       /* 卡非法 */
		public static final int NETDEV_DOOR_EVENT_FIREPORTECT_ALRAM            = (NETDEV_DOOR_EVENT_BASE + 20);       /* 消防报警 */
		public static final int NETDEV_DOOR_EVENT_CANCEL_FIREPORTECT           = (NETDEV_DOOR_EVENT_BASE + 21);       /* 取消消防 */
		public static final int NETDEV_DOOR_EVENT_PRYING_RESIST_ALRAM          = (NETDEV_DOOR_EVENT_BASE + 22);       /* 防撬报警 */
		public static final int NETDEV_DOOR_EVENT_SUPERPASSWD_OPEN_DOOR        = (NETDEV_DOOR_EVENT_BASE + 23);       /* 超级密码开门 */
		public static final int NETDEV_DOOR_EVENT_COERCECODE_IN                = (NETDEV_DOOR_EVENT_BASE + 24);       /* 胁迫码进入 */
		public static final int NETDEV_DOOR_EVENT_DOOR_STATUS_OPEN             = (NETDEV_DOOR_EVENT_BASE + 25);       /* 门打开 */
		public static final int NETDEV_DOOR_EVENT_DOOR_STATUS_CLOSE            = (NETDEV_DOOR_EVENT_BASE + 26);       /* 门关闭 */
		public static final int NETDEV_DOOR_EVENT_DOOR_FORCED_OPEN             = (NETDEV_DOOR_EVENT_BASE + 27);       /* 门强开 */
		public static final int NETDEV_DOOR_EVENT_DOOR_KEEP_OPEN               = (NETDEV_DOOR_EVENT_BASE + 28);       /* 门保持打开 */
		public static final int NETDEV_DOOR_EVENT_LOCK_FAILURE                 = (NETDEV_DOOR_EVENT_BASE + 29);       /* 锁失效 */
		public static final int NETDEV_DOOR_EVENT_LOST_STOLEN_CARD             = (NETDEV_DOOR_EVENT_BASE + 30);       /* 丢失或被盗卡 */

		/* 达实门禁对接新增 */
		public static final int NETDEV_DOOR_EVENT_PASSWD_WRONG                 = (NETDEV_DOOR_EVENT_BASE + 31);       /* 密码错误 */
		public static final int NETDEV_DOOR_EVENT_ALWAYS_CLOSED                = (NETDEV_DOOR_EVENT_BASE + 32);       /* 常闭未通过 */
		public static final int NETDEV_DOOR_EVENT_CARD_PASSWD_ENTER            = (NETDEV_DOOR_EVENT_BASE + 33);       /* 卡加密码进入 */
		public static final int NETDEV_DOOR_EVENT_CARD_PASSWD_WRONG            = (NETDEV_DOOR_EVENT_BASE + 34);       /* 卡加密码错误 */
		public static final int NETDEV_DOOR_EVENT_MORE_CARD_OPEN               = (NETDEV_DOOR_EVENT_BASE + 35);       /* 多卡开门 */
		public static final int NETDEV_DOOR_EVENT_FIRST_CARD_OPEN              = (NETDEV_DOOR_EVENT_BASE + 36);       /* 首卡开门 */
		public static final int NETDEV_DOOR_EVENT_CARD_OUT_DATE                = (NETDEV_DOOR_EVENT_BASE + 37);       /* 卡过期限 */
		public static final int NETDEV_DOOR_EVENT_CARD_WATCH                   = (NETDEV_DOOR_EVENT_BASE + 38);       /* 巡更卡 */

		/*海康门禁对接新增 */
		public static final int NETDEV_DOOR_EVENT_REMOTE_CLOSE_DOOR            = (NETDEV_DOOR_EVENT_BASE + 39);       /* 远程关门 */
		public static final int NETDEV_DOOR_EVENT_REMOTE_ALWAYS_OPEN           = (NETDEV_DOOR_EVENT_BASE + 40);       /* 远程常开 */
		public static final int NETDEV_DOOR_EVENT_REMOTE_ALWAYS_CLOSE          = (NETDEV_DOOR_EVENT_BASE + 41);       /* 远程常关 */
		public static final int NETDEV_DOOR_EVENT_LEGAL_CARD_PASS              = (NETDEV_DOOR_EVENT_BASE + 42);       /* 合法卡认证通过 */
		public static final int NETDEV_DOOR_EVENT_CARD_AND_PSW_PASS            = (NETDEV_DOOR_EVENT_BASE + 43);       /* 刷卡加密码认证通过 */
		public static final int NETDEV_DOOR_EVENT_CARD_AND_PSW_FAIL            = (NETDEV_DOOR_EVENT_BASE + 44);       /* 刷卡加密码认证失败） */
		public static final int NETDEV_DOOR_EVENT_CARD_AND_PSW_TIMEOUT         = (NETDEV_DOOR_EVENT_BASE + 45);       /* 数卡加密码认证超时 */
		public static final int NETDEV_DOOR_EVENT_CARD_AND_PSW_OVER_TIME       = (NETDEV_DOOR_EVENT_BASE + 46);       /* 刷卡加密码超次 */
		public static final int NETDEV_DOOR_EVENT_INVALID_CARD                 = (NETDEV_DOOR_EVENT_BASE + 47);       /* 无此卡号 */
		public static final int NETDEV_DOOR_EVENT_DOOR_BUTTON_PRESS            = (NETDEV_DOOR_EVENT_BASE + 48);       /* 开门按钮按下 */
		public static final int NETDEV_DOOR_EVENT_DOOR_BUTTON_RELEASE          = (NETDEV_DOOR_EVENT_BASE + 49);       /* 开门按钮松开 */
		public static final int NETDEV_DOOR_EVENT_CARD_READER_DESMANTLE_ALARM  = (NETDEV_DOOR_EVENT_BASE + 50);       /* 读卡器防拆报警 */
		public static final int NETDEV_DOOR_EVENT_CARD_READER_DESMANTLE_RESUME = (NETDEV_DOOR_EVENT_BASE + 51);       /* 读卡器防拆恢复 */
		public static final int NETDEV_DOOR_EVENT_DOOR_MAGNET_OPEN             = (NETDEV_DOOR_EVENT_BASE + 52);       /* 门磁打开（正常开门） */
		public static final int NETDEV_DOOR_EVENT_DOOR_MAGNET_CLOSE            = (NETDEV_DOOR_EVENT_BASE + 53);       /* 门磁关闭（正常关门 */
		public static final int NETDEV_DOOR_EVENT_DOOR_MAGNET_OPEN_ABNORMAL    = (NETDEV_DOOR_EVENT_BASE + 54);       /* 门磁异常打开（门异常打开） */
		public static final int NETDEV_DOOR_EVENT_DOOR_MAGNET_OPEN_TIMEOUT     = (NETDEV_DOOR_EVENT_BASE + 55);       /* 门磁打开超时(门打开超时) */
		public static final int NETDEV_DOOR_EVENT_ANTI_SNEAK_FAIL              = (NETDEV_DOOR_EVENT_BASE + 56);       /* 反潜回认证失败 */
		public static final int NETDEV_DOOR_EVENT_INTERLOCK_DOOR_NOT_CLOSE     = (NETDEV_DOOR_EVENT_BASE + 57);       /* 互锁门未关闭 */
		public static final int NETDEV_DOOR_EVENT_MULTI_VERIFY_SUCCESS         = (NETDEV_DOOR_EVENT_BASE + 58);       /* 多重认证成功 */
		public static final int NETDEV_DOOR_EVENT_LEADER_CARD_OPEN_BEGIN       = (NETDEV_DOOR_EVENT_BASE + 59);       /* 首卡开门开始 */
		public static final int NETDEV_DOOR_EVENT_LEADER_CARD_OPEN_END         = (NETDEV_DOOR_EVENT_BASE + 60);       /* 首卡开门结束 */
		public static final int NETDEV_DOOR_EVENT_ALWAYS_OPEN_BEGIN            = (NETDEV_DOOR_EVENT_BASE + 61);       /* 常开状态开始 */
		public static final int NETDEV_DOOR_EVENT_ALWAYS_OPEN_END              = (NETDEV_DOOR_EVENT_BASE + 62);       /* 常开状态结束 */
		public static final int NETDEV_DOOR_EVENT_ALWAYS_CLOSE_BEGIN           = (NETDEV_DOOR_EVENT_BASE + 63);       /* 常关状态开始 */
		public static final int NETDEV_DOOR_EVENT_ALWAYS_CLOSE_END             = (NETDEV_DOOR_EVENT_BASE + 64);       /* 常关状态结束 */
		public static final int NETDEV_DOOR_EVENT_KEYPRESS_OPEN_DOOR           = (NETDEV_DOOR_EVENT_BASE + 65);       /* 按键开门 */

		/* 纽贝尔门禁新协议对接事件定义 */
		public static final int NETDEV_DOOR_EVENT_COMMU_INTERRUPT              = (NETDEV_DOOR_EVENT_BASE + 81);       /* 通讯中断 */
		public static final int NETDEV_DOOR_EVENT_COMMU_RESTORE                = (NETDEV_DOOR_EVENT_BASE + 82);       /* 通讯恢复 */
		public static final int NETDEV_DOOR_EVENT_LEGAL_CREDIT_CARD            = (NETDEV_DOOR_EVENT_BASE + 83);       /* 合法刷卡 */
		public static final int NETDEV_DOOR_EVENT_LEGAL_USER_ID                = (NETDEV_DOOR_EVENT_BASE + 84);       /* 合法用户ID */
		public static final int NETDEV_DOOR_EVENT_CARD_NO_REG                  = (NETDEV_DOOR_EVENT_BASE + 85);       /* 卡未注册 */
		public static final int NETDEV_DOOR_EVENT_CARD_UNAUTH                  = (NETDEV_DOOR_EVENT_BASE + 86);       /* 卡未授权 */
		public static final int NETDEV_DOOR_EVENT_CARD_DISABLED                = (NETDEV_DOOR_EVENT_BASE + 87);       /* 卡已停用 */
		public static final int NETDEV_DOOR_EVENT_CARD_EXPIRED                 = (NETDEV_DOOR_EVENT_BASE + 88);       /* 卡已过期 */
		public static final int NETDEV_DOOR_EVENT_INVALID_TIME                 = (NETDEV_DOOR_EVENT_BASE + 89);       /* 无效时段 */
		public static final int NETDEV_DOOR_EVENT_PSW_ERROR                    = (NETDEV_DOOR_EVENT_BASE + 90);       /* 密码错误 */
		public static final int NETDEV_DOOR_EVENT_PROHIBITED                   = (NETDEV_DOOR_EVENT_BASE + 91);       /* 禁止通行 */
		public static final int NETDEV_DOOR_EVENT_REQ_CENTER_OPEN_DOOR         = (NETDEV_DOOR_EVENT_BASE + 92);       /* 请求中心开门 */
		public static final int NETDEV_DOOR_EVENT_LEGAL_CARD_OPEN_DOOR         = (NETDEV_DOOR_EVENT_BASE + 93);       /* 合法卡开门 */
		public static final int NETDEV_DOOR_EVENT_SUPER_CARD_OPEN_DOOR         = (NETDEV_DOOR_EVENT_BASE + 94);       /* 超级卡开门 */
		public static final int NETDEV_DOOR_EVENT_CENTER_OPEN_DOOR             = (NETDEV_DOOR_EVENT_BASE + 96);       /* 中心开门 */
		public static final int NETDEV_DOOR_EVENT_LINK_OPEN_DOOR               = (NETDEV_DOOR_EVENT_BASE + 97);       /* 联动开门 */
		public static final int NETDEV_DOOR_EVENT_FORCE_OPEN_DOOR              = (NETDEV_DOOR_EVENT_BASE + 98);       /* 强行开门 */
		public static final int NETDEV_DOOR_EVENT_DOOR_IS_OPEN                 = (NETDEV_DOOR_EVENT_BASE + 99);       /* 门被打开 */
		public static final int NETDEV_DOOR_EVENT_DOOR_IS_CLOSE                = (NETDEV_DOOR_EVENT_BASE + 100);      /* 门被关闭 */
		public static final int NETDEV_DOOR_EVENT_STRESS_ALARM                 = (NETDEV_DOOR_EVENT_BASE + 103);      /* 胁迫报警 */
		public static final int NETDEV_DOOR_EVENT_TRAILING_ALARM               = (NETDEV_DOOR_EVENT_BASE + 105);      /* 尾随报警 */
		public static final int NETDEV_DOOR_EVENT_DOOR_LOCK                    = (NETDEV_DOOR_EVENT_BASE + 106);      /* 门锁死 */
		public static final int NETDEV_DOOR_EVENT_LIFT_DOOR_LOCK               = (NETDEV_DOOR_EVENT_BASE + 107);      /* 门解除锁死 */
		public static final int NETDEV_DOOR_EVENT_DOOR_NOT_CLOSE               = (NETDEV_DOOR_EVENT_BASE + 108);      /* 门未关好 */
		public static final int NETDEV_DOOR_EVENT_NEED_PSW                     = (NETDEV_DOOR_EVENT_BASE + 109);      /* 需要密码 */
		public static final int NETDEV_DOOR_EVENT_NEED_FINGERPRINT             = (NETDEV_DOOR_EVENT_BASE + 110);      /* 需要指纹 */
		public static final int NETDEV_DOOR_EVENT_REQ_INTERCOM                 = (NETDEV_DOOR_EVENT_BASE + 111);      /* 请求对讲 */
		public static final int NETDEV_DOOR_EVENT_EMERGENCY                    = (NETDEV_DOOR_EVENT_BASE + 112);      /* 紧急事件 */
		public static final int NETDEV_DOOR_EVENT_PATROL_LEGAL_CREDIT_CARD     = (NETDEV_DOOR_EVENT_BASE + 113);      /* 巡更合法刷卡 */
		public static final int NETDEV_DOOR_EVENT_PATROL_LEGAL_FINGERPRINT     = (NETDEV_DOOR_EVENT_BASE + 114);      /* 巡更合法指纹 */
		public static final int NETDEV_DOOR_EVENT_PATROL_CARD_NOT_REG          = (NETDEV_DOOR_EVENT_BASE + 115);      /* 巡更卡未注册 */
		public static final int NETDEV_DOOR_EVENT_NOT_PATROL_CARD              = (NETDEV_DOOR_EVENT_BASE + 116);      /* 非巡更员刷卡 */
		public static final int NETDEV_DOOR_EVENT_NORMAL_PATROL                = (NETDEV_DOOR_EVENT_BASE + 117);      /* 正常巡更 */
		public static final int NETDEV_DOOR_EVENT_ADVANCE_PATROL               = (NETDEV_DOOR_EVENT_BASE + 118);      /* 提前巡更 */
		public static final int NETDEV_DOOR_EVENT_TIMEOUT_PATROL               = (NETDEV_DOOR_EVENT_BASE + 119);      /* 超时巡更 */
		public static final int NETDEV_DOOR_EVENT_INVALID_PATROL               = (NETDEV_DOOR_EVENT_BASE + 120);      /* 无效巡更 */
		public static final int NETDEV_DOOR_EVENT_NOT_PATROL                   = (NETDEV_DOOR_EVENT_BASE + 121);      /* 未巡更 */
		public static final int NETDEV_DOOR_EVENT_TH_ALARM                     = (NETDEV_DOOR_EVENT_BASE + 122);      /* 温湿度报警 */
		public static final int NETDEV_DOOR_EVENT_TH_RESTORE                   = (NETDEV_DOOR_EVENT_BASE + 123);      /* 温湿度恢复 */
		public static final int NETDEV_DOOR_EVENT_TH_RECORD                    = (NETDEV_DOOR_EVENT_BASE + 124);      /* 温湿度记录 */
		public static final int NETDEV_DOOR_EVENT_SMOKE_ALARM                  = (NETDEV_DOOR_EVENT_BASE + 125);      /* 烟感报警 */
		public static final int NETDEV_DOOR_EVENT_SMOKE_RESTORE                = (NETDEV_DOOR_EVENT_BASE + 126);      /* 烟感恢复 */
		public static final int NETDEV_DOOR_EVENT_SMOKE_RECORD                 = (NETDEV_DOOR_EVENT_BASE + 127);      /* 烟感记录 */

		/* 微耕门禁新协议对接事件定义 */
		public static final int NETDEV_DOOR_EVENT_PC_CONTROL                   = (NETDEV_DOOR_EVENT_BASE + 128);      /* 刷卡不通过：电脑控制 */
		public static final int NETDEV_DOOR_EVENT_LIMITED_CARD_NUM             = (NETDEV_DOOR_EVENT_BASE + 129);      /* 刷卡不通过：受刷卡次数限制 */
		public static final int NETDEV_DOOR_EVENT_REASON_UNKNOWN               = (NETDEV_DOOR_EVENT_BASE + 130);      /* 刷卡不通过：原因不明 */
		public static final int NETDEV_DOOR_EVENT_CONTROLLER_ON                = (NETDEV_DOOR_EVENT_BASE + 131);      /* 控制器上电 */
		public static final int NETDEV_DOOR_EVENT_CONTROLLER_RESERT            = (NETDEV_DOOR_EVENT_BASE + 132);      /* 控制器复位 */
		public static final int NETDEV_DOOR_EVENT_DOOR_FORCE_CLOSE             = (NETDEV_DOOR_EVENT_BASE + 133);      /* 强制关门 */
		public static final int NETDEV_DOOR_EVENT_DOOR_OFFLINE                 = (NETDEV_DOOR_EVENT_BASE + 134);      /* 门不在线 */
		public static final int NETDEV_DOOR_EVENT_FIRE                         = (NETDEV_DOOR_EVENT_BASE + 135);      /* 火警 */
		public static final int NETDEV_DOOR_EVENT_CALL_EMERGENCY               = (NETDEV_DOOR_EVENT_BASE + 136);      /* 呼叫紧急报警 */
		public static final int NETDEV_DOOR_PERSON_FACE_DOOR                   = (NETDEV_DOOR_EVENT_BASE + 137);      /* 人脸刷门 */
		public static final int NETDEV_DOOR_PERSON_INVALE_DOOR                 = (NETDEV_DOOR_EVENT_BASE + 138);      /* 人脸非法刷门 */

		/* 中控门禁对接事件定义 */
		public static final int NETDEV_DOOR_EVENT_FINGERPRINT_OPEN_DOOR        = (NETDEV_DOOR_EVENT_BASE + 153);      /* 指纹开门 */
		public static final int NETDEV_DOOR_EVENT_ANTI_SUBMARINE               = (NETDEV_DOOR_EVENT_BASE + 154);      /* 反潜报警 */
		public static final int NETDEV_DOOR_EVENT_PRESS_MISTAKE                = (NETDEV_DOOR_EVENT_BASE + 155);      /* 错按报警 */
		public static final int NETDEV_DOOR_EVENT_PF_PW_RF_OPEN_DOOR           = (NETDEV_DOOR_EVENT_BASE + 156);      /* 指纹、密码或卡验证开门 */

		/* 泰科门禁对接事件定义 */
		public static final int NETDEV_DOOR_EVENT_DOOR_FORCED_OPEN_CLEARED     = (NETDEV_DOOR_EVENT_BASE + 157);      /* 门强制打开恢复 */

		/* 通用门禁对接中控事件定义 */
		public static final int NETDEV_DOOR_EVENT_BLACKLIST                    = (NETDEV_DOOR_EVENT_BASE + 158);      /* 黑名单 */
		public static final int NETDEV_DOOR_EVENT_FAILED_SEND_CMD              = (NETDEV_DOOR_EVENT_BASE + 159);      /* 发送命令失败 */
		public static final int NETDEV_DOOR_EVENT_FAILED_OPEN_DOOE_MU_CARD     = (NETDEV_DOOR_EVENT_BASE + 160);      /* 多卡开门失败 */
		public static final int NETDEV_DOOR_EVENT_CARD_INVALID_PERIOD          = (NETDEV_DOOR_EVENT_BASE + 161);      /* 非有效时间段刷卡 */
		public static final int NETDEV_DOOR_EVENT_CARD_REPORT_LOST             = (NETDEV_DOOR_EVENT_BASE + 162);      /* 卡已挂失 */
		public static final int NETDEV_DOOR_EVENT_TAMPER_ALARM                 = (NETDEV_DOOR_EVENT_BASE + 163);      /* 防拆报警 */
		public static final int NETDEV_DOOR_EVENT_SWIPE_CARD_WHEN_NORMAL_OPEN  = (NETDEV_DOOR_EVENT_BASE + 164);      /* 常开时间段内刷卡 */
		public static final int NETDEV_DOOR_EVENT_OPEN_DOOR_BY_EMERGENCY_PWD   = (NETDEV_DOOR_EVENT_BASE + 165);      /* 紧急密码开门 */
		public static final int NETDEV_DOOR_EVENT_OPEN_DOOR_WHEN_NORMAL_OPEN   = (NETDEV_DOOR_EVENT_BASE + 166);      /* 常开时间段开门 */
		public static final int NETDEV_DOOR_EVENT_EXIT_BUTTON_DURING_ILLEGAL_PERIOD  = (NETDEV_DOOR_EVENT_BASE + 167);/* 非有效时间段按出门按钮 */
		public static final int NETDEV_DOOR_EVENT_DOOR_ALREADY_OPEN            = (NETDEV_DOOR_EVENT_BASE + 168);      /* 门已打开 */
		public static final int NETDEV_DOOR_EVENT_DOOR_ALREADY_CLOSE           = (NETDEV_DOOR_EVENT_BASE + 169);      /* 门已关闭 */
		public static final int NETDEV_DOOR_EVENT_ILLEGAL_PERIOD               = (NETDEV_DOOR_EVENT_BASE + 170);      /* 非法时间段 */
		public static final int NETDEV_DOOR_EVENT_OPEN_DOOR_BY_DURESS_PWD      = (NETDEV_DOOR_EVENT_BASE + 171);      /* 胁迫密码开门 */
		public static final int NETDEV_DOOR_EVENT_NO_MASK                      = (NETDEV_DOOR_EVENT_BASE + 172);      /* 未戴口罩 */ 
		public static final int NETDEV_DOOR_EVENT_BODY_TEMPERATURE             = (NETDEV_DOOR_EVENT_BASE + 173);      /* 体温异常 */ 
		public static final int NETDEV_DOOR_EVENT_M0NITOR_INPUT_ACTIVATED      = (NETDEV_DOOR_EVENT_BASE + 174);      /* 监视器处于活动状态 */ 
		public static final int NETDEV_DOOR_EVENT_M0NITOR_INPUT_CLEAR          = (NETDEV_DOOR_EVENT_BASE + 175);      /* 监视器已清除 */ 

		public static final int NETDEV_DOOR_EVENT_END                          = (NETDEV_DOOR_EVENT_BASE + 599);      /* 门禁事件类型定义结束位置 */

		// NETDEV_IS_DOOR_EVENT(x)    (NETDEV_DOOR_EVENT_BASE <= (x) && (x) < NETDEV_DOOR_EVENT_END)

	}

	/**
	 * @brief 告警资源类型 枚举 定义  Alarm configuration operation Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_ALARM_SRC_TYPE_E extends Structure {
		public static final int	NETDEV_ALARM_SRC_LOCAL_HARD_DISK                            = 0;        /*本地硬盘*/
		public static final int	NETDEV_ALARM_SRC_EX_CABINET_1_STORAGE_DISK                  = 1;        /*拓展柜-1存储盘*/
		public static final int	NETDEV_ALARM_SRC_EX_CABINET_2_STORAGE_DISK                  = 2;        /*拓展柜-2存储盘*/
		public static final int	NETDEV_ALARM_SRC_ARRAY_STORAGE_DISK                         = 3;        /*阵列存储盘*/
		public static final int	NETDEV_ALARM_SRC_NAS_STORAGE_DISK                           = 4;        /*NAS存储盘*/
		public static final int	NETDEV_ALARM_SRC_SAN_STORAGE_DISK                           = 5;        /*SAN存储盘*/
		public static final int	NETDEV_ALARM_SRC_ESATA_STORAGE_DISK                         = 6;        /*eSATA存储盘*/
		public static final int	NETDEV_ALARM_SRC_SD_STORAGE_DISK                            = 7;        /*SD存储盘*/
		public static final int	NETDEV_ALARM_SRC_VIDEO_CHANNEL                              = 8;        /*视频通道*/
		public static final int	NETDEV_ALARM_SRC_ALARM_INPUT_CHANNEL                        = 9;        /*报警输入通道*/
		public static final int	NETDEV_ALARM_SRC_SYSTEM                                     = 10;       /*系统*/

		public static final int	NETDEV_ALARM_SRC_AUDIO_CHANNEL                              = 11;       /*音频通道*/
		public static final int	NETDEV_ALARM_SRC_DECODE_CHANNEL                             = 12;       /*解码通道*/
		public static final int	NETDEV_ALARM_SRC_ALARM_OUTPUT_CHANNEL                       = 13;       /*报警输出通道*/
		public static final int	NETDEV_ALARM_SRC_ACCESS_CONTROL_CHANNEL                     = 14;       /*门禁通道*/
		public static final int	NETDEV_ALARM_SRC_ALARM_POINT_CHANNEL                        = 15;       /*报警点通道*/
		public static final int	NETDEV_ALARM_SRC_EMERGENCY_BELL_CHANNEL                     = 16;       /*紧急铃通道(第三方告警)*/
		public static final int	NETDEV_ALARM_SRC_DEV                                        = 17;       /*设备类*/

		public static final int	NETDEV_ALARM_SRC_INVALID                                    = 0xFFFF;    /* 无效值  Invalid value */
	}

	/**
	 * @brief 云台命令 枚举 定义 PTZ commands Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PTZ_E extends Structure {
		public static final int	NETDEV_PTZ_IRISCLOSE_STOP       =0x0101;       /* 光圈关停止  Iris close stop */
		public static final int	NETDEV_PTZ_IRISCLOSE            =0x0102;       /* 光圈关  Iris close */
		public static final int	NETDEV_PTZ_IRISOPEN_STOP        =0x0103;       /* 光圈开停止  Iris open stop */
		public static final int	NETDEV_PTZ_IRISOPEN             =0x0104;       /* 光圈开  Iris open */

		public static final int	NETDEV_PTZ_FOCUSNEAR_STOP       =0x0201;       /* 近聚集停止  Focus near stop */
		public static final int	NETDEV_PTZ_FOCUSNEAR            =0x0202;       /* 近聚集  Focus near */
		public static final int	NETDEV_PTZ_FOCUSFAR_STOP        =0x0203;       /* 远聚集停止  Focus far stop */
		public static final int	NETDEV_PTZ_FOCUSFAR             =0x0204;       /* 远聚集  Focus far */

		public static final int	NETDEV_PTZ_ZOOMTELE_STOP        = 0x0301;       /* 放大停止  Zoom in stop */
		public static final int	NETDEV_PTZ_ZOOMTELE             = 0x0302;       /* 放大  Zoom in */
		public static final int	NETDEV_PTZ_ZOOMWIDE_STOP        = 0x0303;       /* 缩小停止  Zoom out stop */
		public static final int	NETDEV_PTZ_ZOOMWIDE             = 0x0304;       /* 缩小  Zoom out */
		public static final int	NETDEV_PTZ_TILTUP               = 0x0402;       /* 向上  Tilt up */
		public static final int	NETDEV_PTZ_TILTDOWN             = 0x0404;       /* 向下  Tilt down */
		public static final int	NETDEV_PTZ_PANRIGHT             = 0x0502;       /* 向右  Pan right */
		public static final int	NETDEV_PTZ_PANLEFT              = 0x0504;       /* 向左  Pan left */
		public static final int	NETDEV_PTZ_LEFTUP               = 0x0702;       /* 左上  Move up left */
		public static final int	NETDEV_PTZ_LEFTDOWN             = 0x0704;       /* 左下  Move down left */
		public static final int	NETDEV_PTZ_RIGHTUP              = 0x0802;       /* 右上  Move up right */
		public static final int	NETDEV_PTZ_RIGHTDOWN            = 0x0804;       /* 右下  Move down right */

		public static final int	NETDEV_PTZ_ALLSTOP              = 0x0901;       /* 全停命令字  All-stop command word */
		public static final int	NETDEV_PTZ_FOCUS_AND_IRIS_STOP  = 0x0907;       /* 聚焦.光圈停止  Focus & Iris-stop command word */
		public static final int	NETDEV_PTZ_MOVE_STOP            = 0x0908;       /* 移动停止命令字  move stop command word */
		public static final int	NETDEV_PTZ_ZOOM_STOP            = 0x0909;       /* 变倍停止命令字  zoom stop command word */
		//NETDEV_PTZ_TRACKCRUISE支持IPC
		public static final int	NETDEV_PTZ_TRACKCRUISE          = 0x1001;       /* 开始轨迹巡航  Start route patrol*/
		//NETDEV_PTZ_TRACKCRUISESTOP支持IPC
		public static final int	NETDEV_PTZ_TRACKCRUISESTOP      = 0x1002;       /* 停止轨迹巡航  Stop route patrol*/
		public static final int	NETDEV_PTZ_TRACKCRUISEREC       = 0x1003;       /* 开始录制轨迹  Start recording route */
		public static final int	NETDEV_PTZ_TRACKCRUISERECSTOP   = 0x1004;       /* 停止录制轨迹  Stop recording route */
		public static final int	NETDEV_PTZ_TRACKCRUISEADD       = 0x1005;       /* 添加巡航轨迹  Add patrol route */
		public static final int	NETDEV_PTZ_TRACKCRUISEDEL       = 0x1006;       /* 删除轨迹巡航  Delete patrol route */

		public static final int	NETDEV_PTZ_AREAZOOMIN           = 0x1101;       /* 拉框放大  Zoom in area */
		public static final int	NETDEV_PTZ_AREAZOOMOUT          = 0x1102;       /* 拉框缩小  Zoom out area */
		public static final int	NETDEV_PTZ_AREAZOOM3D           = 0x1103;       /* 3D定位  3D positioning */

		public static final int	NETDEV_PTZ_BRUSHON              = 0x0A01;       /* 雨刷开  Wiper on */
		public static final int	NETDEV_PTZ_BRUSHOFF             = 0x0A02;       /* 雨刷关  Wiper off */

		public static final int	NETDEV_PTZ_LIGHTON              = 0x0B01;       /* 灯开  Lamp on */
		public static final int	NETDEV_PTZ_LIGHTOFF             = 0x0B02;       /* 灯关  Lamp off */

		public static final int	NETDEV_PTZ_HEATON               = 0x0C01;       /* 加热开  Heater on */
		public static final int	NETDEV_PTZ_HEATOFF              = 0x0C02;       /* 加热关  Heater off */

		public static final int	NETDEV_PTZ_SNOWREMOINGON        = 0x01301;       /* 除雪开  Snowremoval on */
		public static final int	NETDEV_PTZ_SNOWREMOINGOFF       = 0x01302;       /* 除雪关  Snowremoval off  */

		public static final int	NETDEV_PTZ_INFRAREDON           = 0x0D01;       /* 红外开  IR on */
		public static final int	NETDEV_PTZ_INFRAREDOFF          = 0x0D02;       /* 红外关  IR off */

		public static final int	NETDEV_PTZ_SELF_CHECKING        = 0x1801;       /* 自检:当参数dwSpeed为1时,执行云台自检;当为0时,执行恢复球机云台默认物理参数,此时会重启 */

		public static final int	NETDEV_PTZ_INVALID				= 0XFF;

	}

	/**
	 * @brief 云台预置位操作命令 枚举 定义 PTZ preset operation commands Enumeration Definition
	 * @attention 无 None
	 */
	public static class NETDEV_PTZ_PRESETCMD_E extends Structure {
		public static final int NETDEV_PTZ_SET_PRESET   = 0;             /* 设置预置位  Set preset */
		public static final int NETDEV_PTZ_CLE_PRESET   = 1;             /* 清除预置位  Clear preset */
		public static final int NETDEV_PTZ_GOTO_PRESET  = 2;             /* 转到预置位  Go to preset */
	}

	/**
	 * @brief 云台巡航操作命令 枚举 定义 PTZ patrol operation commands Enumeration Definition
	 * @attention 无 None
	 */
	public static class NETDEV_PTZ_CRUISECMD_E extends Structure {
		public static final int	NETDEV_PTZ_ADD_CRUISE      = 0;         /* 添加巡航路径   Add patrol route */
		public static final int	NETDEV_PTZ_MODIFY_CRUISE   = 1;         /* 编辑巡航路径  Edit patrol route */
		public static final int	NETDEV_PTZ_DEL_CRUISE      = 2;         /* 删除巡航路径  Delete patrol route */
		public static final int	NETDEV_PTZ_RUN_CRUISE      = 3;         /* 开始巡航  Start patrol */
		public static final int	NETDEV_PTZ_STOP_CRUISE     = 4;          /* 停止巡航  Stop patrol */
		public static final int	NETDEV_PTZ_GET_CRUISE      = 5;         /* 获取巡航路径  */    /* Get patrol route */
	}

	/**
	 * @enum tagNETDEVPLanStoreType
	 * @brief 录像存储类型 枚举 定义 Recording storage type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_STORE_TYPE_E extends Structure {
		public static final int	NETDEV_STORE_TYPE_COMMON                        = 0;                /* 常规存储 */
		public static final int	NETDEV_STORE_TYPE_DIGITIALINPUT                 = 1;                /* 开关量输入告警存储 */
		public static final int	NETDEV_STORE_TYPE_MANUL                         = 2;                /* 手动存储 */
		public static final int	NETDEV_STORE_TYPE_AUDIODETECT                   = 3;                /* 音频检测告警存储 */
		public static final int	NETDEV_STORE_TYPE_MOTION                        = 4;                /* 运动检测告警存储 */
		public static final int	NETDEV_STORE_TYPE_DIGITALINPUT                  = 5;                /* 数字输入事件存储  Digital input */
		public static final int	NETDEV_STORE_TYPE_FACEDETECT                    = 6;                /* 人脸检测告警存储 */
		public static final int	NETDEV_STORE_TYPE_VIDEO_LOSS                    = 7;                /* 视频丢失存储 */
		public static final int	NETDEV_STORE_TYPE_LINEDETECT                    = 8;                /* 越界检测告警存储 */
		public static final int	NETDEV_STORE_TYPE_FIELDDETECT                   = 9;                /* 区域入侵检测告警存储 */
		public static final int	NETDEV_STORE_TYPE_FOCUSDETECT                   = 10;               /* 图像虚焦告警存储 */
		public static final int	NETDEV_STORE_TYPE_SCENECHANGE                   = 11;               /* 场景变更告警存储 */
		public static final int	NETDEV_STORE_TYPE_ALARM                         = 12;               /* 告警 */
		public static final int	NETDEV_STORE_TYPE_ALARM_AND_MOTION              = 13;               /* 运动检测 和 告警 */
		public static final int	NETDEV_STORE_TYPE_ALARM_OR_MOTION               = 14;               /* 运动检测 或 告警 */
		public static final int	NETDEV_STORE_TYPE_CAMERA_DISCONNECT             = 15;               /* 监控点断线 */
		public static final int	NETDEV_STORE_TYPE_THIRD_STREAM                  = 16;               /* 第三流存储 */
		public static final int	NETDEV_STORE_TYPE_EVENT_ALL_ALARM               = 17;               /* 事件类型录像，包涵所有告警类型 */
		public static final int	NETDEV_STORE_TYPE_EVENT_ALL_TYPE                = 18;               /* 事件类型录像，包涵所有录像类型 */
		public static final int	NETDEV_PLAN_STORE_TYPE_EVENT_WITHOUT_RESUME     = 19;               /* 没有恢复的事件类型存储 */
		public static final int	NETDEV_STORE_TYPE_SMART_TRACK                   = 20;               /* 智能跟踪 */
		public static final int	NETDEV_STORE_TYPE_URGENT_BELL                   = 21;               /* 紧急铃 */
		public static final int	NETDEV_STORE_TYPE_REMAIN_ARTICLE                = 22;               /* 物品遗留 */
		public static final int	NETDEV_STORE_TYPE_MOVE_ARTICLE                  = 23;               /* 物品搬移 */
		public static final int	NETDEV_STORE_TYPE_SMART_RECORD                  = 24;               /* 所有智能类告警 */
		public static final int	NETDEV_PLAN_STORE_TYPE_MAX                      = 25;               /* 存储类型最大值 */
		public static final int	NETDEV_STORE_TYPE_HUMAN_DETECT                  = 26;               /* 人形检测 */

		public static final int	NETDEV_STORE_TYPE_INVALID                       = 0xFF;             /* 无效值 */
	}

	/**
	 * @enum tagNETDEVRecordLocation
	 * @brief 录像存储类型 枚举 定义 Record location Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_RECORD_LOCATION_E extends Structure {
		public static final int	NETDEV_RECORD_LOCATION_ALL                        = 0;                /* 存储位置：所有 */
		public static final int	NETDEV_RECORD_LOCATION_VMS                        = 1;                /* 存储位置：VMS */
		public static final int	NETDEV_RECORD_LOCATION_NVR                        = 2;                /* 存储位置：NVR */
		public static final int	NETDEV_RECORD_LOCATION_BACKUP                     = 3;                /* 存储位置：备份 */

		public static final int	NETDEV_RECORD_LOCATION_INVALID                    = 0xFF;              /* 无效值 */
	}

	/**
	 * @brief 回放控制命令 枚举 定义 Playback control commands Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VOD_PLAY_CTRL_E extends Structure {
		public static final int	NETDEV_PLAY_CTRL_PLAY                       = 0;        /* 开始播放  Play */
		public static final int	NETDEV_PLAY_CTRL_PAUSE                      = 1;        /* 暂停播放  Pause */
		public static final int	NETDEV_PLAY_CTRL_RESUME                     = 2;        /* 恢复播放  Resume */
		public static final int	NETDEV_PLAY_CTRL_GETPLAYTIME                = 3;        /* 获取播放进度  Obtain playing time */
		public static final int	NETDEV_PLAY_CTRL_SETPLAYTIME                = 4;        /* 设置播放进度  Configure playing time */
		public static final int	NETDEV_PLAY_CTRL_GETPLAYSPEED               = 5;        /* 获取播放速度  Obtain playing speed */
		public static final int	NETDEV_PLAY_CTRL_SETPLAYSPEED               = 6;        /* 设置播放速度  Configure playing speed */
		public static final int	NETDEV_PLAY_CTRL_SET_SINGLE_FRAME_SPEED     = 7;        /* 设置单帧播放  Configure single frame playing speed */
		public static final int	NETDEV_PLAY_CTRL_UPDATE_M3U8URL             = 8;        /* 更新M3u8URL  urlUpdate M3u8 url */
	}

	/**
	 * @brief 回放.下载状态 枚举 定义 Playback and download status Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VOD_PLAY_STATUS_E extends Structure {
		/** 播放状态  Play status */
		public static final int	NETDEV_PLAY_STATUS_16_BACKWARD          = 0;            /* 16倍速后退播放  Backward at 16x speed */
		public static final int	NETDEV_PLAY_STATUS_8_BACKWARD           = 1;            /* 8倍速后退播放  Backward at 8x speed */
		public static final int	NETDEV_PLAY_STATUS_4_BACKWARD           = 2;            /* 4倍速后退播放  Backward at 4x speed */
		public static final int	NETDEV_PLAY_STATUS_2_BACKWARD           = 3;            /* 2倍速后退播放  Backward at 2x speed */
		public static final int	NETDEV_PLAY_STATUS_1_BACKWARD           = 4;            /* 正常速度后退播放  Backward at normal speed */
		public static final int	NETDEV_PLAY_STATUS_HALF_BACKWARD        = 5;            /* 1/2倍速后退播放  Backward at 1/2 speed */
		public static final int	NETDEV_PLAY_STATUS_QUARTER_BACKWARD     = 6;            /* 1/4倍速后退播放  Backward at 1/4 speed */
		public static final int	NETDEV_PLAY_STATUS_QUARTER_FORWARD      = 7;            /* 1/4倍速播放  Play at 1/4 speed */
		public static final int	NETDEV_PLAY_STATUS_HALF_FORWARD         = 8;            /* 1/2倍速播放  Play at 1/2 speed */
		public static final int	NETDEV_PLAY_STATUS_1_FORWARD            = 9;            /* 正常速度前进播放  Forward at normal speed */
		public static final int	NETDEV_PLAY_STATUS_2_FORWARD            = 10;           /* 2倍速前进播放  Forward at 2x speed */
		public static final int	NETDEV_PLAY_STATUS_4_FORWARD            = 11;           /* 4倍速前进播放  Forward at 4x speed */
		public static final int	NETDEV_PLAY_STATUS_8_FORWARD            = 12;           /* 8倍速前进播放  Forward at 8x speed */
		public static final int	NETDEV_PLAY_STATUS_16_FORWARD           = 13;           /* 16倍速前进播放  Forward at 16x speed */
		public static final int	NETDEV_PLAY_STATUS_2_FORWARD_IFRAME     = 14;           /* 2倍速前进播放(I帧) Forward at 2x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_4_FORWARD_IFRAME     = 15;           /* 4倍速前进播放(I帧) Forward at 4x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_8_FORWARD_IFRAME     = 16;           /* 8倍速前进播放(I帧) Forward at 8x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_16_FORWARD_IFRAME    = 17;           /* 16倍速前进播放(I帧) Forward at 16x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_2_BACKWARD_IFRAME    = 18;           /* 2倍速后退播放(I帧) Backward at 2x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_4_BACKWARD_IFRAME    = 19;           /* 4倍速后退播放(I帧) Backward at 4x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_8_BACKWARD_IFRAME    = 20;           /* 8倍速后退播放(I帧) Backward at 8x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_16_BACKWARD_IFRAME   = 21;           /* 16倍速后退播放(I帧) Backward at 16x speed(I frame) */
		public static final int	NETDEV_PLAY_STATUS_INTELLIGENT_FORWARD  = 22;           /* 智能播放 Intelligent forward */
		public static final int	NETDEV_PLAY_STATUS_1_FRAME_FORWD        = 23;           /* 单帧前进播放  Forward at 1 frame speed */
		public static final int	NETDEV_PLAY_STATUS_1_FRAME_BACK         = 24;           /* 单帧后退播放 Backward at 1 frame speed */

		public static final int	NETDEV_PLAY_STATUS_40_FORWARD           = 25;           /* 40倍速前进播放 Forward at 40x speed*/

		public static final int	NETDEV_PLAY_STATUS_32_FORWARD_IFRAME    = 26;           /* 32倍速抽帧前进播放 Forward at 32x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_32_BACKWARD_IFRAME   = 27;           /* 32倍速抽帧后退播放 Backward at 32x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_64_FORWARD_IFRAME    = 28;           /* 64倍速抽帧前进播放 Forward at 64x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_64_BACKWARD_IFRAME   = 29;           /* 64倍速抽帧后退播放 Backward at 64x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_128_FORWARD_IFRAME   = 30;           /* 128倍速抽帧前进播放 Forward at 128x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_128_BACKWARD_IFRAME  = 31;           /* 128倍速抽帧后退播放 Backward at 128x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_256_FORWARD_IFRAME   = 32;           /* 256倍速抽帧前进播放 Forward at 256x speed(I frame)*/
		public static final int	NETDEV_PLAY_STATUS_256_BACKWARD_IFRAME  = 33;           /* 256倍速抽帧后退播放 Backward at 256x speed(I frame)*/

		public static final int	NETDEV_PLAY_STATUS_32_FORWARD           = 34;           /* 32倍速前进播放 */
		public static final int	NETDEV_PLAY_STATUS_32_BACKWARD          = 35;           /* 32倍速后退播放 */

		public static final int	NETDEV_PLAY_STATUS_INVALID				= 0xFF;

	}

	/**
	 * @brief 参数配置命令字 枚举 定义 Parameter configuration command words Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_CONFIG_COMMAND_E extends Structure {
		//NETDEV_GET_DEVICECFG支持NVR,IPC
		public static final int	NETDEV_GET_DEVICECFG                = 100;              /* 获取设备信息,参见 #NETDEV_DEVICE_BASICINFO_S  Get device information, see #NETDEV_DEVICE_BASICINFO_S */
		public static final int	NETDEV_SET_DEVICECFG                = 101;              /* 保留 Reserved */

		public static final int	NETDEV_GET_NTPCFG                   = 110;              /* 获取NTP参数,参见 #NETDEV_SYSTEM_NTP_INFO_S  Get NTP parameter, see #NETDEV_SYSTEM_NTP_INFO_S */
		public static final int	NETDEV_SET_NTPCFG                   = 111;              /* 设置NTP参数,参见 #NETDEV_SYSTEM_NTP_INFO_S  Set NTP parameter, see #NETDEV_SYSTEM_NTP_INFO_S */

		//NETDEV_GET_NTPCFG_EX支持NVR,IPC
		public static final int	NETDEV_GET_NTPCFG_EX                = 112;              /* 获取NTP参数(扩展，建议使用),参见 #NETDEV_SYSTEM_NTP_INFO_LIST_S  Get NTP parameter, see #NETDEV_SYSTEM_NTP_INFO_LIST_S */
		//NETDEV_SET_NTPCFG_EX支持NVR,IPC
		public static final int	NETDEV_SET_NTPCFG_EX                = 113;              /* 设置NTP参数(扩展，建议使用),参见 #NETDEV_SYSTEM_NTP_INFO_LIST_S  Set NTP parameter, see #NETDEV_SYSTEM_NTP_INFO_LIST_S */

		//NETDEV_GET_STREAMCFG支持NVR,IPC
		public static final int	NETDEV_GET_STREAMCFG                = 120;              /* 获取视频编码参数,参见 #NETDEV_VIDEO_STREAM_INFO_S  Get video encoding parameter, see #NETDEV_VIDEO_STREAM_INFO_S */
		//NETDEV_SET_STREAMCFG支持NVR,IPC
		public static final int	NETDEV_SET_STREAMCFG                = 121;              /* 设置视频编码参数,参见 #NETDEV_VIDEO_STREAM_INFO_S  Set video encoding parameter, see #NETDEV_VIDEO_STREAM_INFO_S */

		public static final int	NETDEV_GET_STREAMCFG_EX             = 122;              /* 获取视频编码参数(扩展，建议使用),参见 #NETDEV_VIDEO_STREAM_INFO_LIST_S  Get video encoding parameter, see #NETDEV_VIDEO_STREAM_INFO_LIST_S */
		public static final int	NETDEV_SET_STREAMCFG_EX             = 123;              /* 设置视频编码参数(扩展，建议使用),参见 #NETDEV_VIDEO_STREAM_INFO_LIST_S  Set video encoding parameter, see #NETDEV_VIDEO_STREAM_INFO_LIST_S */
		public static final int	NETDEV_GET_VIDEOMODECFG             = 124;              /* 获取图像采集制式，参见 #NETDEV_VIDEO_MODE_INFO_S */
		public static final int	NETDEV_SET_VIDEOMODECFG             = 125;              /* 设置图像采集制式，参见 #NETDEV_VIDEO_MODE_INFO_S */
		//NETDEV_GET_OSDCFG支持NVR,IPC
		public static final int	NETDEV_GET_OSDCFG                   = 140;              /* 获取OSD配置信息,参见 #NETDEV_VIDEO_OSD_CFG_S  Get OSD configuration information, see #NETDEV_VIDEO_OSD_CFG_S */
		//NETDEV_SET_OSDCFG支持IPC
		public static final int	NETDEV_SET_OSDCFG                   = 141;              /* 设置OSD配置信息,参见 #NETDEV_VIDEO_OSD_CFG_S  Set OSD configuration information, see #NETDEV_VIDEO_OSD_CFG_S */
		public static final int	NETDEV_GET_OSDCFG_EX                = 142;              /* 获取OSD配置列表,参见 #NETDEV_CHL_OSD_CFG_LIST_S  Get OSD configuration List, see #NETDEV_CHL_OSD_CFG_LIST_S */
		public static final int	NETDEV_SET_OSDCFG_EX                = 143;              /* 设置OSD配置列表,参见 #NETDEV_CHL_OSD_CFG_LIST_S  Set OSD configuration List, see #NETDEV_CHL_OSD_CFG_LIST_S */
		public static final int	NETDEV_GET_OSD_CONTENT_CFG          = 144;              /* 获取OSD配置信息(扩展，建议使用),参见 #NETDEV_OSD_CONTENT_S  Get OSD configuration information, see #NETDEV_OSD_CONTENT_S */
		public static final int	NETDEV_SET_OSD_CONTENT_CFG          = 145;              /* 设置OSD配置信息(扩展，建议使用),参见 #NETDEV_OSD_CONTENT_S  Set OSD configuration information, see #NETDEV_OSD_CONTENT_S */
		public static final int	NETDEV_GET_OSD_CONTENT_STYLE_CFG    = 146;              /* 获取OSD内容样式,参见 #NETDEV_OSD_CONTENT_STYLE_S  Get OSD content style, see #NETDEV_OSD_CONTENT_STYLE_S */
		public static final int	NETDEV_SET_OSD_CONTENT_STYLE_CFG    = 147;              /* 设置OSD内容样式,参见 #NETDEV_OSD_CONTENT_STYLE_S  Set OSD content style, see #NETDEV_OSD_CONTENT_STYLE_S */

		//NETDEV_GET_ALARM_OUTPUTCFG支持NVR，支持VMS
		public static final int	NETDEV_GET_ALARM_OUTPUTCFG          = 150;              /* 获取开关量输出配置信息,参见 #NETDEV_ALARM_OUTPUT_LIST_S  Get boolean configuration information, see #NETDEV_ALARM_OUTPUT_LIST_S */
		//NETDEV_SET_ALARM_OUTPUTCFG支持NVR
		public static final int	NETDEV_SET_ALARM_OUTPUTCFG          = 151;              /* 设置开关量输出配置信息,参见 #NETDEV_ALARM_OUTPUT_LIST_S  Set boolean configuration information, see #NETDEV_ALARM_OUTPUT_LIST_S */
		//NETDEV_TRIGGER_ALARM_OUTPUT支持NVR
		public static final int	NETDEV_TRIGGER_ALARM_OUTPUT         = 152;              /* 触发开关量,参见 #NETDEV_TRIGGER_ALARM_OUTPUT_S        Trigger boolean, see #NETDEV_TRIGGER_ALARM_OUTPUT_S */

		public static final int	NETDEV_GET_ALARM_INPUTCFG           = 153;              /* 获取开关量输入数量,参见 #NETDEV_ALARM_INPUT_LIST_S   Get the number of boolean inputs, see #NETDEV_ALARM_INPUT_LIST_S */
		public static final int	NETDEV_GET_MANUAL_ALARM_CFG         = 154;              /* 获取手动告警开关量配置信息，参见 #NETDEV_OUTPUT_SWITCH_ALARM_STATUS_LIST_S  Get manual alarm boolean configuration information, see #NETDEV_OUTPUT_SWITCH_ALARM_STATUS_LIST_S*/
		public static final int	NETDEV_SET_MANUAL_ALARM_CFG         = 155;              /* 设置手动告警开关量配置信息，参见 #NETDEV_OUTPUT_SWITCH_MANUAL_ALARM_INFO_S  Set manual alarm boolean configuration information, see #NETDEV_OUTPUT_SWITCH_MANUAL_ALARM_INFO_S */
		//NETDEV_GET_INPUTSWITCH_LIST_CFG支持NVR,IPC
		public static final int	NETDEV_GET_INPUTSWITCH_LIST_CFG     = 156;              /* 获取所有输入开关量配置，参见 #NETDEV_INPUT_SWITCH_INFO_LIST_S  Get all input switch information, see #NETDEV_INPUT_SWITCH_INFO_LIST_S*/

		//NETDEV_GET_IMAGECFG支持NVR,IPC
		public static final int	NETDEV_GET_IMAGECFG                 = 160;              /* 获取图像配置信息,参见 #NETDEV_IMAGE_SETTING_S  Get image configuration information, see #NETDEV_IMAGE_SETTING_S */
		//NETDEV_SET_IMAGECFG支持NVR,IPC
		public static final int	NETDEV_SET_IMAGECFG                 = 161;              /* 设置图像配置信息,参见 #NETDEV_IMAGE_SETTING_S  Set image configuration information, see #NETDEV_IMAGE_SETTING_S */
		//NETDEV_GET_IMAGE_EXPOSURE支持IPC
		public static final int	NETDEV_GET_IMAGE_EXPOSURE           = 162;              /* 获取通道的图像曝光参数,参见 #NETDEV_IMAGE_EXPOSURE_S  get image Exposure configuration information, see #NETDEV_IMAGE_EXPOSURE_S */
		//NETDEV_SET_IMAGE_EXPOSURE支持NVR,IPC
		public static final int	NETDEV_SET_IMAGE_EXPOSURE           = 163;              /* 设置通道的图像曝光参数,参见 #NETDEV_IMAGE_EXPOSURE_S  Set image Exposure configuration information, see #NETDEV_IMAGE_EXPOSURE_S */
		public static final int	NETDEV_GET_IMAGE_LAMP_CTRLCFG       = 164;              /* 获取补光灯参数,参见 #NETDEV_LAMP_CTRL_INFO_S  get channel lampctrl configuration information, see #NETDEV_LAMP_CTRL_INFO_S */
		public static final int	NETDEV_SET_IMAGE_LAMP_CTRLCFG       = 165;              /* 设置补光灯参数,参见 #NETDEV_LAMP_CTRL_INFO_S  set channel lampctrl configuration information, see #NETDEV_LAMP_CTRL_INFO_S */
		public static final int	NETDEV_GET_IMAGE_WHITE_BALANCE      = 166;              /* 获取图像白平衡参数,参见 #NETDEV_LAMP_CTRL_INFO_S  get channel lampctrl configuration information, see #NETDEV_LAMP_CTRL_INFO_S */
		public static final int	NETDEV_SET_IMAGE_WHITE_BALANCE      = 167;              /* 设置图像白平衡参数,参见 #NETDEV_LAMP_CTRL_INFO_S  set channel lampctrl configuration information, see #NETDEV_LAMP_CTRL_INFO_S */
		public static final int	NETDEV_SET_IMAGE_PARAM_RESET        = 168;              /* 设置图像参数默认值set channel image param reset */
		//NETDEV_GET_NETWORKCFG支持NVR,IPC
		public static final int	NETDEV_GET_NETWORKCFG               = 170;              /* 获取网络配置信息,参见 #NETDEV_NETWORKCFG_S  Get network configuration information, see #NETDEV_NETWORKCFG_S */
		public static final int	NETDEV_SET_NETWORKCFG               = 171;              /* 设置网络配置信息,参见 #NETDEV_NETWORKCFG_S  Set network configuration information, see #NETDEV_NETWORKCFG_S */

		public static final int	NETDEV_GET_VPN_CFG                  = 172;              /* 获取VPN客户端指定模式信息 参见 #NETDEV_VPN_CLIENT_INFO_S get the VPN client specified mode information, see #NETDEV_VPN_CLIENT_INFO_S*/
		public static final int	NETDEV_SET_VPN_CFG                  = 173;              /* 设置VPN客户端指定模式信息 参见 #NETDEV_VPN_CLIENT_INFO_S set the VPN client specified mode information, see #NETDEV_VPN_CLIENT_INFO_S*/
		public static final int	NETDEV_SET_DNS_CFG                  = 174;              /*设置DNS地址信息 参见 #NETDEV_DNS_INFO_S Set DNS info see #NETDEV_DNS_INFO_S*/
		public static final int	NETDEV_GET_DNS_CFG                  = 175;              /*获取DNS地址信息 参见 #NETDEV_DNS_INFO_S Get DNS info see #NETDEV_DNS_INFO_S*/
		public static final int	NETDEV_SET_NETWORK_CARDS            = 176;              /*设置设备所有网卡的配置信息 参见 #NETDEV_NETWORK_CARD_INFO_S set device networkcards infos see #NETDEV_NETWORK_CARD_INFO_S*/
		public static final int	NETDEV_GET_NETWORK_CARDS            = 177;              /*获取设备所有网卡的配置信息 参见 #NETDEV_NETWORK_CARD_INFO_S get device networkcards infos see #NETDEV_NETWORK_CARD_INFO_S*/

		public static final int	NETDEV_SET_NETWORK_PORTS            = 178;              /*设置设备网络端口信息 参见 #NETDEV_NETWORK_PORTS_INFO_S set device network ports infos see #NETDEV_NETWORK_PORT_INFO_S*/
		public static final int	NETDEV_GET_NETWORK_PORTS            = 179;              /*获取设备网络端口信息 参见 #NETDEV_NETWORK_PORTS_INFO_S get device network ports infos see #NETDEV_NETWORK_PORT_INFO_S*/

		//NETDEV_GET_PRIVACYMASKCFG支持NVR,IPC
		public static final int	NETDEV_GET_PRIVACYMASKCFG           = 180;              /* 获取隐私遮盖配置信息,参见 #NETDEV_PRIVACY_MASK_CFG_S  Get privacy mask configuration information, see #NETDEV_PRIVACY_MASK_CFG_S */
		//NETDEV_SET_PRIVACYMASKCFG支持NVR,IPC
		public static final int	NETDEV_SET_PRIVACYMASKCFG           = 181;              /* 设置隐私遮盖配置信息,参见 #NETDEV_PRIVACY_MASK_CFG_S  Set privacy mask configuration information, see #NETDEV_PRIVACY_MASK_CFG_S */
		//NETDEV_DELETE_PRIVACYMASKCFG支持NVR,IPC
		public static final int	NETDEV_DELETE_PRIVACYMASKCFG        = 182;              /* 删除隐私遮盖配置信息  Delete privacy mask configuration information */
		//NETDEV_GET_TAMPERALARM支持NVR,IPC
		public static final int	NETDEV_GET_TAMPERALARM              = 190;              /* 获取遮挡检测告警信息  参见 #NETDEV_TAMPER_ALARM_INFO_S  Get tamper alarm configuration information, see #NETDEV_TAMPER_ALARM_INFO_S */
		//NETDEV_SET_TAMPERALARM支持NVR,IPC
		public static final int	NETDEV_SET_TAMPERALARM              = 191;              /* 设置遮挡检测告警信息  参见 #NETDEV_TAMPER_ALARM_INFO_S  Set tamper alarm configuration information, see #NETDEV_TAMPER_ALARM_INFO_S */
		//NETDEV_GET_MOTIONALARM支持NVR,IPC
		public static final int	NETDEV_GET_MOTIONALARM              = 200;              /* 获取运动检测告警信息 参见 #NETDEV_MOTION_ALARM_INFO_S  Get motion alarm configuration information, see #NETDEV_MOTION_ALARM_INFO_S */
		//NETDEV_SET_MOTIONALARM支持NVR,IPC
		public static final int	NETDEV_SET_MOTIONALARM              = 201;              /* 设置运动检测告警信息 参见 #NETDEV_MOTION_ALARM_INFO_S  Set motion alarm configuration information, see #NETDEV_MOTION_ALARM_INFO_S */

		public static final int	NETDEV_GET_CROSSLINEALARM           = 202;              /* 获取越界检测告警信息 参见 NETDEV_CROSS_LINE_ALARM_INFO_S Get Cross Line alarm configuration information, see #NETDEV_CROSS_LINE_ALARM_INFO_S*/
		public static final int	NETDEV_SET_CROSSLINEALARM           = 203;              /* 设置越界检测告警信息 参见 NETDEV_CROSS_LINE_ALARM_INFO_S Set Cross Line alarm configuration information, see #NETDEV_CROSS_LINE_ALARM_INFO_S*/

		public static final int	NETDEV_GET_INTRUSIONALARM           = 204;              /* 获取入侵检测告警信息 参见 NETDEV_INTRUSION_ALARM_INFO_S Get intrusion alarm configuration information, see #NETDEV_INTRUSION_ALARM_INFO_S*/
		public static final int	NETDEV_SET_INTRUSIONALARM           = 205;              /* 设置入侵检测告警信息 参见 NETDEV_INTRUSION_ALARM_INFO_S Set intrusion alarm configuration information, see #NETDEV_INTRUSION_ALARM_INFO_S*/

		//NETDEV_GET_DISKSINFO支持NVR
		public static final int	NETDEV_GET_DISKSINFO                = 210;              /* 获取硬盘信息 参见 #NETDEV_DISK_INFO_LIST_S  Get disks information, see #NETDEV_DISK_INFO_LIST_S */
		public static final int	NETDEV_SET_DISKSINFO                = 211;              /* 设置硬盘信息 保留 */

		public static final int	NETDEV_GET_FOCUSINFO                = 230;              /* 获取聚焦信息 参见 #NETDEV_FOCUS_INFO_S Get focus info, see #NETDEV_FOCUS_INFO_S */
		public static final int	NETDEV_SET_FOCUSINFO                = 231;              /* 设置聚焦信息 参见 #NETDEV_FOCUS_INFO_S Set focus info, see #NETDEV_FOCUS_INFO_S */
		public static final int	NETDEV_GET_IRCUTFILTERINFO          = 232;              /* 获取昼夜模式信息 参见 #NETDEV_IRCUT_FILTER_INFO_S Get IRcut filter info, see #NETDEV_IRCUT_FILTER_INFO_S */
		public static final int	NETDEV_SET_IRCUTFILTERINFO          = 233;              /* 设置昼夜模式信息 参见 #NETDEV_IRCUT_FILTER_INFO_S Set IRcut filter info, see #NETDEV_IRCUT_FILTER_INFO_S */
		public static final int	NETDEV_GET_DEFOGGINGINFO            = 234;              /* 获取透雾模式信息 参见 #NETDEV_DEFOGGING_INFO_S Get defogging info, see #NETDEV_DEFOGGING_INFO_S */
		public static final int	NETDEV_SET_DEFOGGINGINFO            = 235;              /* 设置透雾模式信息 参见 #NETDEV_DEFOGGING_INFO_S Set defogging info, see #NETDEV_DEFOGGING_INFO_S */
		public static final int	NETDEV_SET_CHL_IMAGE_ENHANCE        = 236;              /* 设置通道的图像增强参数set channel image Enhance */
		public static final int	NETDEV_GET_CHL_IMAGE_ENHANCE        = 237;              /* 获取通道的图像增强参数get channel image Enhance */

		public static final int	NETDEV_GET_AUDIOIN_CFG              = 240;              /* 获取音频输入参数配置信息 参见 #NETDEV_AUDIO_INPUT_CFG_INFO_S get audio input config info see #NETDEV_AUDIO_INPUT_CFG_INFO_S */
		public static final int	NETDEV_SET_AUDIOIN_CFG              = 241;              /* 设置音频输入参数配置信息 参见 #NETDEV_AUDIO_INPUT_CFG_INFO_S set audio input config info see #NETDEV_AUDIO_INPUT_CFG_INFO_S */

		public static final int	NETDEV_GET_DST_CFG                  = 260;              /* 获取夏令时配置信息 参见 #NETDEV_DST_CFG_S Get defogging info, see #NETDEV_DST_CFG_S */
		public static final int	NETDEV_SET_DST_CFG                  = 261;              /* 设置夏令时配置信息 参见 #NETDEV_DST_CFG_S Set defogging info, see #NETDEV_DST_CFG_S */

		public static final int	NETDEV_GET_RECORDPLANINFO           = 270;              /* 获取录像计划配置信息 支持NVR VMS 参见 #NETDEV_RECORD_PLAN_CFG_INFO_S */
		public static final int	NETDEV_SET_RECORDPLANINFO           = 271;              /* 设置录像计划配置信息 支持NVR VMS 参见 #NETDEV_RECORD_PLAN_CFG_INFO_S */
		public static final int	NETDEV_SET_SNAPSHOT_CFG             = 272;              /* 设置指定通道的抓图参数 参见 #NETDEV_VIDEO_SNAPSHOT_S Set snapshot info see #NETDEV_VIDEO_SNAPSHOT_S */
		public static final int	NETDEV_GET_SNAPSHOT_CFG             = 273;              /* 获取指定通道的抓图参数 参见 #NETDEV_VIDEO_SNAPSHOT_S Get snapshot info see #NETDEV_VIDEO_SNAPSHOT_S */

		public static final int	NETDEV_GET_MOTIONDETECTION_WEEKPLAN     = 280;              /* 获取移动侦测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get motion detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_MOTIONDETECTION_WEEKPLAN     = 281;              /* 设置移动侦测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set motion detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_CROSSLINEDETECTION_WEEKPLAN  = 282;              /* 获取越界检测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get CrossLine detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_CROSSLINEDETECTION_WEEKPLAN  = 283;              /* 设置越界检测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set CrossLine detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_INTRUSIONDETECTION_WEEKPLAN  = 284;              /* 获取区域入侵布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get Intrusion detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_INTRUSIONDETECTION_WEEKPLAN  = 285;              /* 设置区域入侵布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set Intrusion detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_AUDIODETECTION_WEEKPLAN      = 286;              /* 获取音频检测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get Audio detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_AUDIODETECTION_WEEKPLAN      = 287;              /* 设置音频检测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set Audio detection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_OBJTRACK_WEEKPLAN            = 288;              /* 获取目标跟踪布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get ObjTrack deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_OBJTRACK_WEEKPLAN            = 289;              /* 设置目标跟踪布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set ObjTrack deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_VIDEOLOSS_WEEKPLAN           = 290;              /* 获取视频丢失的布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get VideoLoss deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_VIDEOLOSS_WEEKPLAN           = 291;              /* 设置视频丢失的布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set VideoLoss deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_TAMPERDETECTION_WEEKPLAN     = 292;              /* 获取遮挡检测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get TamperDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_TAMPERDETECTION_WEEKPLAN     = 293;              /* 设置遮挡检测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set TamperDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_INPUTSWITCHES_WEEKPLAN       = 294;              /* 获取输入开关量布防计划,参见 #NETDEV_SWITCH_WEEK_PLAN_INFO_S  Get InputSwitches deployment plan, see #NETDEV_SWITCH_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_INPUTSWITCHES_WEEKPLAN       = 295;              /* 设置输入开关量布防计划,,参见 #NETDEV_SWITCH_WEEK_PLAN_INFO_S  Set InputSwitches deployment plan, see #NETDEV_SWITCH_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_OUTPUTSWITCHES_WEEKPLAN      = 296;              /* 获取输出开关量布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get OutputSwitches deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_OUTPUTSWITCHES_WEEKPLAN      = 297;              /* 设置输出开关量布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set OutputSwitches deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_DEFOCUSDETECTION_WEEKPLAN    = 298;              /* 获取虚焦检测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get DefocusDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_DEFOCUSDETECTION_WEEKPLAN    = 299;              /* 设置虚焦检测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set DefocusDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_SCENECHANGE_WEEKPLAN         = 300;              /* 获取场景变更布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get SceneChange deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_SCENECHANGE_WEEKPLAN         = 301;              /* 设置场景变更布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set SceneChange deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_GET_FACEDETECTION_WEEKPLAN       = 302;              /* 获取人脸检测布防计划,参见 #NETDEV_WEEK_PLAN_INFO_S  Get FaceDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */
		public static final int	NETDEV_SET_FACEDETECTION_WEEKPLAN       = 303;              /* 设置人脸检测布防计划,,参见 #NETDEV_WEEK_PLAN_INFO_S  Set FaceDetection deployment plan, see #NETDEV_WEEK_PLAN_INFO_S */

		public static final int	NETDEV_GET_RECORD_STATUS                = 320;              /* 获取录像状态信息 参见 #NETDEV_RECORD_STATUS_LIST_S  Get video status information*/

		public static final int	NETDEV_GET_SERIAL_CFG                   = 330;              /* 获取串口配置 参见 #NETDEV_SERIAL_PORTS_S Get serail info, see # NETDEV_SERIAL_PORTS_S */
		public static final int	NETDEV_SET_SERIAL_CFG                   = 331;              /* 设置串口配置 参见 #NETDEV_SERIAL_PORTS_S Set serail info, see # NETDEV_SERIAL_PORTS_S */


		public static final int	NETDEV_GET_AUDIO_DECODE_STATUS              = 340;          /* 获取通道所有随路音频解码状态 参见 #NETDEV_AUDIO_DECODE_STATUS_LIST_S */
		public static final int	NETDEV_SET_AUDIO_DECODE_STATUS              = 341;          /* 设置通道所有随路音频解码状态 参见 #NETDEV_AUDIO_DECODE_STATUS_LIST_S */

		public static final int	NETDEV_GET_VIDEO_LOSS_RULE_INFO             = 400;          /* 获取视频丢失告警的配置信息 参见 #NETDEV_VIDEO_LOSS_RULE_INFO_S */
		public static final int	NETDEV_SET_VIDEO_LOSS_RULE_INFO             = 401;          /* 设置视频丢失告警的配置信息 参见 #NETDEV_VIDEO_LOSS_RULE_INFO_S */

		public static final int	NETDEV_GET_VIDEO_LOSS_LINKAGE_ACTIONS       = 410;           /* 获取视频丢失告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */
		public static final int	NETDEV_SET_VIDEO_LOSS_LINKAGE_ACTIONS       = 411;          /* 设置视频丢失告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */


		public static final int	NETDEV_GET_TAMPER_DETECTION_RULE_INFO       = 420;          /* 获取视频输入通道的遮挡检测告警的配置 参见 #NETDEV_TAMPER_DETECTION_RULE_INFO_S */
		public static final int	NETDEV_SET_TAMPER_DETECTION_RULE_INFO       = 421;          /* 设置视频输入通道的遮挡检测告警的配置 参见 #NETDEV_TAMPER_DETECTION_RULE_INFO_S */

		public static final int	NETDEV_GET_TAMPER_DETECTION_LINKAGE_ACTIONS = 430;           /* 获取遮挡检测告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */
		public static final int	NETDEV_SET_TAMPER_DETECTION_LINKAGE_ACTIONS = 431;          /* 设置遮挡检测告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */



		public static final int	NETDEV_GET_MOTION_DETECTION_AREA_TYPE       = 440;          /* 获取视频输入通道运动检测的区域类型 参见 #NETDEV_MOTION_DETECTION_AREA_TYPE_S */
		public static final int	NETDEV_SET_MOTION_DETECTION_AREA_TYPE       = 441;          /* 设置视频输入通道运动检测的区域类型 参见 #NETDEV_MOTION_DETECTION_AREA_TYPE_S */
		public static final int	NETDEV_GET_MOTION_DETECTION_AREA_GRID_INFO  = 442;          /* 获取视频输入通道运动检测的所有宏块区域信息 参见 #NETDEV_MOTION_DETECTION_AREA_GRID_INFO_S */
		public static final int	NETDEV_SET_MOTION_DETECTION_AREA_GRID_INFO  = 443;          /* 设置视频输入通道运动检测的所有宏块区域信息 参见 #NETDEV_MOTION_DETECTION_AREA_GRID_INFO_S */
		public static final int	NETDEV_GET_MOTION_DETECTION_AREA_RECTANGLE_INFO_LIST  = 444;    /* 获取视频输入通道运动检测中的所有矩形区域信息 参见 #NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_LIST_S */
		public static final int	NETDEV_SET_MOTION_DETECTION_AREA_RECTANGLE_INFO_LIST  = 445;    /* 设置视频输入通道运动检测中的所有矩形区域信息 参见 #NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_LIST_S */
		public static final int	NETDEV_GET_MOTION_DETECTION_LINKAGE_ACTIONS = 450;          /* 获取运动检测告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */
		public static final int	NETDEV_SET_MOTION_DETECTION_LINKAGE_ACTIONS = 451;          /* 设置运动检测告警的联动动作 参见 #NETDEV_LINKAGE_ACTION_LIST_S */
		public static final int	NETDEV_GET_INPUT_SWITCHES_LINKAGE_ACTIONS   = 460;          /* 获取输入开关量告警的联动动作 参见 #NETDEV_SWITCH_LINKAGE_ACTION_S */
		public static final int	NETDEV_SET_INPUT_SWITCHES_LINKAGE_ACTIONS   = 461;          /* 设置输入开关量告警的联动动作 参见 #NETDEV_SWITCH_LINKAGE_ACTION_S */

		public static final int	NETDEV_GET_RAID_STATUS                      = 470;          /* 获取阵列状态 参见 #NETDEV_RAID_STATUS_S */
		public static final int	NETDEV_GET_RAID_STORAGE_CONTAINER_INFO_LIST = 471;          /* 先使用 NETDEV_GET_RAID_STATUS 命令获取阵列状态，阵列状态使能时，获取存储容器信息列表 参见 #NETDEV_HDD_INFO_LIST_S */
		public static final int	NETDEV_GET_STORAGE_CONTAINER_INFO_LIST      = 472;          /* 先使用 NETDEV_GET_RAID_STATUS 命令获取阵列状态，阵列状态不使能时，获取存储容器信息列表 参见 #NETDEV_STORAGE_CONTAINER_INFO_LIST_S */
		public static final int	NETDEV_GET_HDD_SMART_INFO                   = 473;          /* 获取指定硬盘的Smart检测信息 参见 #NETDEV_HDD_SMART_INFO_S */
		public static final int	NETDEV_SET_HDD_SMART_INFO                   = 474;          /* 设置指定硬盘的Smart检测信息 参见 #NETDEV_HDD_SMART_CHECK_INFO_S */
		public static final int	NETDEV_GET_RAID_STATUS_V30                  = 475;          /* 获取阵列状态 支持VMS/NVR 参见 #NETDEV_RAID_STATUS_S */
		public static final int	NETDEV_SET_RAID_STATUS_V30                  = 476;          /* 设置阵列状态 支持VMS/NVR 参见 #NETDEV_RAID_STATUS_S */

		public static final int	NETDEV_GET_PHOTO_SERVER_INFO                = 482;          /* 获取照片接收服务器配置信息 参见 # NETDEV_PHOTO_SERVER_CFG_INFO_LIST_S */
		public static final int	NETDEV_SET_PHOTO_SERVER_INFO                = 483;          /* 设置照片接收服务器配置 参见 # NETDEV_PHOTO_SERVER_CFG_INFO_LIST_S */

		public static final int	NETDEV_GET_ENHANCED_CONFIG                  = 484;          /* 获取一体机增强配置信息,参见 # NETDEV_ENHANCED_CONFIG_INFO_S */
		public static final int	NETDEV_SET_ENHANCED_CONFIG                  = 485;          /* 设置一体机增强配置信息,参见 # NETDEV_ENHANCED_CONFIG_INFO_S */

		public static final int	NETDEV_GET_INTELLIGENT_SERVER_INFO          = 486;          /* 获取智能服务器配置 参见 # NETDEV_DATA_SERVER_LIST */
		public static final int	NETDEV_SET_INTELLIGENT_SERVER_INFO          = 487;          /* 设置智能服务器配置 参见 # NETDEV_DATA_SERVER_LIST */

		public static final int	NETDEV_GET_MOTION_INTERVAL_INFO             = 490;               /* 查询指定视频输入通道运动检测告警的报警间隔参数 参见  NETDEV_MOTION_INTERVAL_INFO_S */
		public static final int	NETDEV_SET_MOTION_INTERVAL_INFO             = 491;               /* 设置指定视频输入通道运动检测告警的报警间隔参数 参见  NETDEV_MOTION_INTERVAL_INFO_S */

		public static final int	NETDEV_GET_MANAGER_SERVER_INFO              = 492;          /* 获取管理服务器配置 参见 # NETDEV_MANAGER_SERVER_LIST_S */
		public static final int	NETDEV_SET_MANAGER_SERVER_INFO              = 493;          /* 设置管理服务器配置 参见 # NETDEV_MANAGER_SERVER_LIST_S */

		public static final int	NETDEV_GET_VISIBLE_RANGE_INFO               = 494;          /* 获取可视域参数信息 参见 # NETDEV_VISIBLE_RANGE_INFO_S */
		public static final int	NETDEV_SET_VISIBLE_RANGE_INFO               = 495;          /* 设置可视域参数信息 参见 # NETDEV_VISIBLE_RANGE_INFO_S */

		public static final int	NETDEV_GET_RESET_PWD_VERTIFY_INFO           = 496;          /* 获取找回用户密码的验证信息 参见#NETDEV_RESET_PWD_VERTIFY_INFO_S*/
		public static final int	NETDEV_SET_RESET_PWD_VERTIFY_INFO           = 497;          /* 设置找回用户密码的验证信息  参见#NETDEV_RESET_PWD_VERTIFY_INFO_S*/

		public static final int	NETDEV_GET_CHL_STORAGE_QUOTA_INFO           = 498;          /* 获取通道的具体配额信息 参见 #NETDEV_STORAGE_QUOTA_INFO_S */
		public static final int	NETDEV_SET_CHL_STORAGE_QUOTA_INFO           = 499;          /* 设置通道的具体配额信息 参见 #NETDEV_STORAGE_QUOTA_INFO_S */

		public static final int	NETDEV_GET_CUSTOM_PROTOCOL_INFO             = 501;          /* 获取自定义协议配置信息 参见 # NETDEV_CUSTON_PROTOCOL_INFO_S */
		public static final int	NETDEV_SET_CUSTOM_PROTOCOL_INFO             = 502;          /* 设置自定义协议配置信息 参见 # NETDEV_CUSTON_PROTOCOL_INFO_S */
		public static final int	NETDEV_GET_CUSTOM_PROTOCOL_INFOLIST         = 503;          /* 获取自定义协议配置信息列表 参见 # NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_LIST_S */

		public static final int	NETDEV_GET_CHL_STORAGE_STRATEGY             = 504;          /* 获取通道存储策略信息 参见 #NETDEV_STORAGE_STRATEGY_S */
		public static final int	NETDEV_SET_CHL_STORAGE_STRATEGY             = 505;          /* 设置通道存储策略信息 参见 #NETDEV_STORAGE_STRATEGY_S */

		public static final int NETDEV_GET_DEVICE_TIME_SYNCMODE             = 512;          /* 查询设备时间同步方式，参见 NETDEV_TIME_SYNCMODE_S */
		public static final int NETDEV_SET_DEVICE_TIME_SYNCMODE             = 513;          /* 设置设备时间同步方式，参见 NETDEV_TIME_SYNCMODE_S */ 
		
		public static final int	NETDEV_CFG_INVALID                          = 0xFFFF;                /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVPicStorageMode
	 * @brief 图片存储模式 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_PIC_STORAGE_MODE_E extends Structure {
		public static final int	NETDEV_PIC_STORAGE_MODE_NORMAL             = 0;     /* 正常，上传服务器成功后删掉SD中的文件 */
		public static final int	NETDEV_PIC_STORAGE_MODE_PERMANENT          = 1;     /* 永存，上传服务器不管是否成功，都会保存SD卡中的文件 */
		public static final int	NETDEV_PIC_STORAGE_MODE_RETAIN             = 2;     /* 保留，上传服务器失败后保留SD卡上的文件 */
		public static final int	NETDEV_PIC_STORAGE_MODE_INVALID            = 0xff;   /* 无效值 */
	}

	/**
	 * @enum tagNETDEVFullStrategyType
	 * @brief 满存储策略 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_FULL_STRATEGY_TYPE_E extends Structure {
		public static final int	NETDEV_FULL_STRATEGY_TYPE_FULL_COVERAGE              = 0;       /* 满覆盖 */
		public static final int	NETDEV_FULL_STRATEGY_TYPE_FULL_STOP                  = 1;       /* 满即停 */
		public static final int	NETDEV_FULL_STRATEGY_TYPE_INVALIDP                   = 0xff;     /* 无效值 */
	}

	/**
	 * @struct tagNETDEVPicStorageStrategyInfo
	 * @brief 图片存储策略信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_PIC_STORAGE_STRATEGY_INFO_S extends Structure {
		public int     dwStorageMode;        /* 存储模式，参见 枚举 #NETDEV_PIC_STORAGE_MODE_E */
		public int     dwFullStrategy;       /* 慢策略参数，默认满覆盖，参见 枚举 #NETDEV_FULL_STRATEGY_TYPE_E */
		public byte[]  byRes = new byte[256];           /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVRecStorageStrategyInfo
	 * @brief 视频存储策略信息 结构体定义
	 * @attention 流类型只支持主码流、辅码流
	 */
	public class NETDEV_REC_STORAGE_STRATEGY_INFO_S extends Structure {
		public int      bStoregeEnabled;      /* 存储使能,0:开启,1:关闭 */
		public int     dwFullStrategy;       /* 慢策略参数，默认满覆盖，参见 枚举 #NETDEV_FULL_STRATEGY_TYPE_E */
		public int     dwPlanStreamType;     /* 计划存储流类型，参见 #NETDEV_LIVE_STREAM_INDEX_E */
		public int     dwManualStreamType;   /* 手动存储流类型，参见 #NETDEV_LIVE_STREAM_INDEX_E */
		public int     dwEventStreamType;    /* 告警存储流类型，参见 #NETDEV_LIVE_STREAM_INDEX_E */
		public byte[]  byRes = new byte[256];           /* 保留字段 */
	}

	/**
	 * @enum tagNETDEVStorageResType
	 * @brief 存储资源 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_STORAGE_RES_TYPE_E extends Structure {
		public static final int	NETDEV_STORAGE_RES_TYPE_SD        = 0;     /* SD卡 */
		public static final int	NETDEV_STORAGE_RES_TYPE_NAS       = 1;     /* NAS */
		public static final int	NETDEV_STORAGE_RES_TYPE_INVALID   = 0xff;   /* 无效值 */
	}

	/**
	 * @struct tagNETDEVStorageStrategy
	 * @brief 存储策略信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_STORAGE_STRATEGY_S extends Structure {
		public int                                dwStorageRes;               /* 存储资源, IPC必选,参见 #NETDEV_STORAGE_RES_TYPE_E */
		public NETDEV_REC_STORAGE_STRATEGY_INFO_S        stRecStoreStrategyInfo;     /* 视频存储策略信息 */
		public NETDEV_PIC_STORAGE_STRATEGY_INFO_S        stPicStoreStrategyInfo;     /* 普通抓拍图片存储策略信息 */
		public NETDEV_PIC_STORAGE_STRATEGY_INFO_S        stAIPicStoreStrategyInfo;   /* 智能抓拍图片存储策略信息 */
		public byte[]                             byRes = new byte[512];                 /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVCustomProSimpleInfoList
	 * @brief 自定义协议配置单例信息列表
	 * @attention 无 None
	 */
	public class NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_LIST_S extends Structure {
		public int                                      udwNum;                                         /* 自定义协议数量, 当前最大支持64 */
		public NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_S[]            astCustomProSimpleList = new NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_S[NETDEV_LEN_64];          /* 自定义协议列表 */
		public byte[]                                   byRes = new byte[512];                                     /* 保留字节 */
	}

	/*
	 * @struct tagNETDEVCustomStreamInfo
	 * @brief 自定义流协议信息
	 * @attention 无 None
	 */
	public class NETDEV_CUSTON_STREAM_INFO_S extends Structure {
		public int                                          udwEnable;                                      /* 1:使能; 0:不使能 */
		public byte[]                                       szStreamURL = new byte[NETDEV_LEN_128];                      /* 实况URL地址[0, 128] */
		public byte[]                                       szPlaybackStreamURL = new byte[NETDEV_LEN_128];            /* 回放URL地址[0, 128] */
		public byte[]                                       byRes = new byte[384];                                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVCustomProSimpleInfo
	 * @brief 自定义协议配置信息
	 * @attention 无 None
	 */
	public class NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_S extends Structure {
		public int                       udwProID;                                       /* 自定义协议号, 必填 */
		public byte[]                    szProName = new byte[NETDEV_LEN_64];                       /* 自定义协名称[0, 64] */
		public byte[]                    byRes = new byte[128];                                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVCustomProInfo
	 * @brief 自定义协议信息
	 * @attention 无 None
	 */
	public class NETDEV_CUSTON_PROTOCOL_INFO_S extends Structure {
		public int                             udwTransport;                                   /* 传输模式, 参见 枚举  NETDEV_TRANS_PROTOCOL_E */
		public int                             udwPort;                                        /* 端口 */
		public NETDEV_CUSTON_PROTOCOL_SIMPLE_INFO_S            stCustomProSimpleInfo;                          /* 自定义协议配置信息 */
		public NETDEV_CUSTON_STREAM_INFO_S                     stMainStream;                                   /* 主流协议信息 */
		public NETDEV_CUSTON_STREAM_INFO_S                     stSubStream;                                    /* 辅流协议信息 */
		public NETDEV_CUSTON_STREAM_INFO_S                     stThirdStream;                                  /* 三流协议信息 */

		public byte[]                                   byRes = new byte[512];                                     /* 保留字节 */
	}

	/**
	 * @enum tagNETDEVStorageCapUnit
	 * @brief 存储容量单位 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_STORAGE_CAP_UNIT_E extends Structure {
		public static final int	NETDEV_TYPE_STORAGE_CAP_UNIT_GB               = 0;        /* GB */
		public static final int	NETDEV_TYPE_STORAGE_CAP_UNIT_MB               = 1;        /* MB */
		public static final int	NETDEV_TYPE_STORAGE_CAP_UNIT_INVALID          = 0xff;      /* 无效值 */
	}

	/**
	 * @struct tagNETDEVStorageQuotaInfo
	 * @brief 存储配额信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_STORAGE_QUOTA_INFO_S extends Structure {
		public int      dwStorageCapUnit;             /* 存储容量单位(默认为GB),参见 #NETDEV_STORAGE_CAP_UNIT_E */
		public int      dwRecUsedCap;                 /* 通道录像已用容量 */
		public int      dwPicUsedCap;                 /* 通道抓图已用容量 */
		public int      dwAIPicUsedCap;               /* 通道智能抓拍照片已用容量，IPC必选 */
		public int      dwUsedCap;                    /* 通道存储空间已使用容量，IPC必选 */
		public int      dwTotalCap;                   /* 通道存储空间总容量 */
		public int      dwRecQuota;                   /* 通道录像配额容量 */
		public int      dwPicQuota;                   /* 通道抓图配额容量 */
		public int      dwAIPicQuota;                 /* 通道智能抓拍图片配额容量，IPC必选 */
		public int      dwGroupID;                    /* 盘组ID号 */
		public int      dwGroupTotalCap;              /* 所选牌组的总容量 */
		public byte[]       byRes = new byte[256];    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVVisibleRangeInfo
	 * @brief 可视域参数信息
	 * @attention
	 */
	public class NETDEV_VISIBLE_RANGE_INFO_S extends Structure {
		public Double                         dAzimuthHorizontal;                                 /* 水平方位角度（可视域在水平界面上投影的夹角的中轴线与水平面基准轴的角的角度）单位:弧度表示 范围:[-1.0000,+1.0000] */
		public Double                          dAzimuthVertical;                                   /* 垂直方位角度（可视域在垂直面上投影的夹角的中轴线与垂直面上基准轴的角的角度）单位:弧度表示精确到小数点后4位 范围:[-1.0000,+1.0000] */
		public Double                          dInclinationHorizontal;                             /* 水平倾斜角度（设备水平基准面与水平面的夹角） 单位:弧度表示精确到小数点后4位 范围:[-1.0000,+1.0000] */
		public Double                          dAngelHorizontal;                                   /* 水平可视角度 单位:度精确到小数点后4位 */
		public Double                          dAngelVertical;                                     /* 垂直可视角度 单位:度精确到小数点后4位 */
		public Double                          dDistance;                                          /* 可视距离 单位:米精确到小数点后4位 */
		public Double                          dInstallationHeight;                                /* 安装高度 单位：米，精确到小数点后4位 */
		public byte[]                            byRes = new byte[248];                                         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVManagerServerInfo
	 * @brief 管理服务器配置信息
	 * @attention
	 */
	public class NETDEV_MANAGER_SERVER_INFO_S extends Structure {
		public int                          udwIndex;                                           /* 管理服务器索引 从0开始 */
		public int                          udwMngProtocol;                                     /* 通信协议类型 见# NETDEV_MANAGER_SERVER_PROTOCOL_TYPE_E */
		public byte[]                            szDeviceID = new byte[NETDEV_LEN_64];                          /* 前端设备的设备ID[1, 32] */
		public byte[]                            szServerID = new byte[NETDEV_LEN_64];                          /* 注册服务器ID [1, 32] */
		public byte[]                            szDeviceName = new byte[NETDEV_DEV_NAME_LEN_MAX];              /* 设备名称[0, 20] */
		public byte[]                            szRegPassword = new byte[NETDEV_LEN_32];                       /* 注册服务器密码(0, 16] */
		public byte[]                            szVideoChlID = new byte[NETDEV_LEN_64];                        /* 视频通道ID[0,32] */
		public byte[]                            szAudioChlID = new byte[NETDEV_LEN_64];                        /* 音频通道ID[0,32] */
		public int                          udwExpire;                                          /* 注册有效期[3600,36000]秒 */
		public byte[]                            szAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];               /* 服务器IPv4地址 */
		public int                          udwPort;                                            /* 服务器端口 */
		public byte[]                            byRes = new byte[256];                                         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVManagerServerList
	 * @brief 管理服务器配置列表
	 * @attention
	 */
	public class NETDEV_MANAGER_SERVER_LIST_S extends Structure {
		public int                          udwNum;                                               /* 管理服务器个数 当前支持数量为2 */
		public NETDEV_MANAGER_SERVER_INFO_S[]    astManagerServerList = new NETDEV_MANAGER_SERVER_INFO_S[NETDEV_MANAGER_SERVER_MAX_NUM];  /* 管理服务器列表 */
		public byte[]                       byRes = new byte[128];                                           /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVMotionIntervalInfo
	 * @brief 运动检测告警参数 Motion Interval Info
	 * @attention 无 None
	 */
	public class NETDEV_MOTION_INTERVAL_INFO_S extends Structure {
		public int     udwSuppressTime;                                     /* 报警抑制间隔时间,单位:秒,范围[5, 3600] */
		public int     udwClearTime;                                        /* 报警恢复间隔时间,单位:秒,范围[1,600] */

		public byte[]  byRes = new byte[512];                                            /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVServerUserInfo
	 * @brief 服务器用户信息
	 * @attention
	 */
	public class NETDEV_SERVER_USER_INFO_S extends Structure {
		public byte[]                            szUserName = new byte[NETDEV_USERNAME_LEN];    /* 用户名[1,32] */
		public int                           bModifyPasswd;                      /* 是否需修改密码 0:不修改 1:修改*/
		public byte[]                            szPasswd = new byte[NETDEV_PASSWORD_LEN];      /* 平台接入密码 [0,32] 空密码则下发空字符串 */
		public byte[]                            byRes = new byte[256];                         /* 保留字段 */
	}
	
	/**
	 * @struct tagNETDEVViidCfg
	 * @brief 视图库信息
	 * @attention 
	 */
	public class NETDEV_VIID_CFG_S extends Structure {
	    public int                udwCoordinateType;                      /* 坐标类型，0:万分比坐标(范围为[0,9999])1:像素坐标 2:归一化坐标(范围0~1) NETDEV_INVALID_PARAM表示无效值 */
	    public byte[]             szViidServerID= new byte [NETDEV_LEN_64];          /* 服务器编号，字符串长度范围[1,32]，IPC支持 */
	    public int                udwConnectMode;                         /* 连接模式：0：标准模式；1：短连接模式；NETDEV_INVALID_PARAM表示无效值 */
	    public int                udwObjectType;                          /* 目标类型（仅视图库协议对接，且需要上报指定目标类型时可选）。按Bit位进行组合，每个Bit位对应一种目标类型，值为0代表不上报，1代表上报。Bit0：人脸，Bit1：人体，Bit2：机动车，Bit3：非机动车 */
	    public byte[]             byRes = new byte[32];                              /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVDataServerInfo
	 * @brief 智能服务器配置信息
	 * @attention
	 */
	public class NETDEV_DATA_SERVER_INFO extends Structure {
		public int                               udwIndex;                                           /* 智能服务器索引 从0开始 */
		public int                               bEnable;                                            /* 智能服务器使能开关 */
		public int                               udwProtocol;                                        /* 通信协议类型 目前只支持： 1:TCP传输(我司V2 TMS) 见# NETDEV_DATA_SERVER_PROTOCOL_TYPE_E */
		public byte[]                            szCameraID = new byte[NETDEV_LEN_128];              /* 相机编号(0, 36] 长度为0代表不修改*/
		public byte[]                            szTollgateID = new byte[NETDEV_LEN_128];            /* 卡口编号(0, 36] 长度为0代表不修改 */
		public byte[]                            szServerAddr = new byte[NETDEV_LEN_32];             /* 服务器IPv4地址 */
		public int                               udwServerPort;                                      /* 服务器端口 */
		public byte[]                            szDrivewayID = new byte[NETDEV_LEN_64];             /* 道路编号 IPC支持 */
		public byte[]                            szDirectionID = new byte[NETDEV_LEN_64];            /* 方向编号 IPC支持 */
		public byte[]                            szDeviceID = new byte[NETDEV_LEN_64];               /* 设备编号 IPC支持 */
		public byte[]                            szAreaId = new byte[NETDEV_LEN_64];                 /* 管辖区域 IPC支持 */
		public NETDEV_SERVER_USER_INFO_S         stServerUserInfo;                                   /* 用户信息 */
		public NETDEV_VIID_CFG_S                 stViidCfg;                                          /* 视图库信息，详见# NETDEV_VIID_CFG_S */
		public byte[]                            byRes = new byte[148];                              /* 保留字段 */                                          /* 保留字段 */
	}

	/**
	 * @enum tagNETDEVDataServerProtocolType
	 * @brief 智能服务器接入协议类型 枚举定义
	 * @attention 无 None
	 */
	public class NETDEV_DATA_SERVER_PROTOCOL_TYPE_E extends Structure {
		public static final int	NETDEV_DATA_SERVER_PROTOCOL_TYPE_TCP   = 1;   /* TCP传输: 我司V2（对应当前tms） */

		public static final int	NETDEV_DATA_SERVER_PROTOCOL_TYPE_TFTP_COMMOM = 4;   /* FTP传输: 通用FTP  */

		public static final int	NETDEV_DATA_SERVER_PROTOCOL_TYPE_HTTP_GA     = 51;   /* HTTP传输: 视图库 */                              /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVDataServerList
	 * @brief 智能服务器配置列表
	 * @attention
	 */
	public class NETDEV_DATA_SERVER_LIST extends Structure {
		public int   udwNum;                                               /* 智能服务器个数 当前支持数量为2 */
		public NETDEV_DATA_SERVER_INFO[] astDataServerList = new NETDEV_DATA_SERVER_INFO[NETDEV_INTELLIGENT_SERVER_MAX_NUM]; /* 智能服务器列表 */
		public byte[]  byRes = new byte[128];                                           /* 保留字段 */
	}

	/**
	 * @brief 功能增强配置信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_ENHANCED_CONFIG_INFO_S extends Structure {
		public int    bEnabledStorage;        /* UNP/云设备存储开关使能状态，0:关闭，1:开启 */
		public byte[]    byRes = new byte[512];                         /* 保留字段  Reserved */
	}

	/**
	 * @brief 警前预录时间枚举定义          PreRecordTime Enumeration definition
	 * @attention
	 */
	public static class NETDEV_PRE_RECORD_TIME_E extends Structure {
		public static final int	NETDEV_PRE_RECORD_TIME_ZERO =  0;            /* 0秒 */
		public static final int	NETDEV_PRE_RECORD_TIME_FIVE =  5;            /* 5秒 */
		public static final int	NETDEV_PRE_RECORD_TIME_TEN =   10;           /* 10秒 */
		public static final int	NETDEV_PRE_RECORD_TIME_TWENTY =20;           /* 20秒 */
		public static final int	NETDEV_PRE_RECORD_TIME_THIRTY =30;           /* 30秒 */
		public static final int	NETDEV_PRE_RECORD_TIME_SIXTY = 60;            /* 60秒 */
	}

	/**
	 * @brief 警后预录时间枚举定义          PostRecordTime Enumeration definition
	 * @attention
	 */
	public static class NETDEV_POST_RECORD_TIME_E extends Structure {
		public static final int	NETDEV_POST_RECORD_TIME_FIVE =                   5;             /* 5秒 */
		public static final int	NETDEV_POST_RECORD_TIME_TEN =                    10;            /* 10 秒*/
		public static final int	NETDEV_POST_RECORD_TIME_THIRTY =                 30;            /* 30 秒*/
		public static final int	NETDEV_POST_RECORD_TIME_SIXTY =                  60;            /* 60 秒*/
		public static final int	NETDEV_POST_RECORD_TIME_ONE_HUNDRED_AND_TWENTY = 120;           /* 120 秒*/
		public static final int	NETDEV_POST_RECORD_TIME_THREE_HUNDRED =          300;           /* 300秒 */
		public static final int	NETDEV_POST_RECORD_TIME_SIX_HUNDRED =            600;            /* 600秒 */
	}

	/**
	 * @brief  录像计划规则 结构体定义   Record Rule Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_RECORD_RULE_S extends Structure {
		public int  udwPreRecordTime;                                  /* 警前预录时间,参考 NETDEV_PRE_RECORD_TIME_E */
		public int  udwPostRecordTime;                                 /* 警后录像时间,参考 NETDEV_POST_RECORD_TIME_E */
		public byte[] byRes = new byte[32];                                         /* 保留字段 */
	}

	/**
	 * @brief  录像计划配置信息 结构体定义   Record plan config info Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_RECORD_PLAN_CFG_INFO_S extends Structure {
		public int 							bPlanEnable;                                        /* 计划使能 */
		public int 							bRedundantStorage;                                  /* 冗余录像使能 仅NVR支持 */
		public NETDEV_RECORD_RULE_S       	stRecordRule;                                       /* 录像计划规则 仅NVR支持 */
		public NETDEV_VIDEO_WEEK_PLAN_S   	stWeekPlan;                                         /* 计划配置 仅NVR支持 */
		public int                     		udwChlID;                                           /* 视频输入通道号 批量获取/添加时使用 */
		public int                     		udwReqSeq;                                          /* 请求数据序号 [1, 50] 仅VMS支持 添加录像计划Post必选 */
		public int                     		udwTamplateID;                                      /* 时间模板ID 仅VMS支持 */
		public byte[]                       szTamplateName = new byte[NETDEV_NAME_MAX_LEN];                /* 时间模板名称 仅VMS支持 Get接口返回 */
		public byte[]                       byRes = new byte[116];                                         /* 保留字段 */
	}

	/**
	 * @brief 视频编码格式 枚举 定义  Video encoding format Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VIDEO_CODE_TYPE_E extends Structure {
		public static final int	NETDEV_VIDEO_CODE_MJPEG     = 0;          /* MJPEG */
		public static final int	NETDEV_VIDEO_CODE_H264      = 1;          /* H.264 */
		public static final int	NETDEV_VIDEO_CODE_H265      = 2;          /* H.265 */
		public static final int	NETDEV_VIDEO_CODE_INVALID	= 0xFF;
	}

	/**
	 * @brief 视频图像质量 枚举 定义  Video image quality Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VIDEO_QUALITY_E extends Structure {
		public static final int NETDEV_VQ_L0 = 0;                    /* 最高  Highest */
		public static final int NETDEV_VQ_L1 = 1;
		public static final int NETDEV_VQ_L2 = 4;                    /* 较高  Higher */
		public static final int NETDEV_VQ_L3 = 8;
		public static final int NETDEV_VQ_L4 = 12;                   /* 中  Medium */
		public static final int NETDEV_VQ_L5 = 16;
		public static final int NETDEV_VQ_L6 = 20;                   /* 低  Low */
		public static final int NETDEV_VQ_L7 = 24;
		public static final int NETDEV_VQ_L8 = 28;                   /* 较低  Lower */
		public static final int NETDEV_VQ_L9 = 31;                   /* 最低  Lowest */

		public static final int NETDEV_VQ_LEVEL_INVALID = -1;         /* 无效  Valid */
	}

	/**
	 * @brief 主码流类型 枚举 定义 Enumeration of main stream type
	 * @attention 无 None
	 */
	public static class NETDEV_MAIN_STREAM_TYPE_E extends Structure {
		public static final int NETDEV_MAIN_STREAM_TYPE_TIME     = 0;       /* 定时主码流 Scheduled main stream*/
		public static final int NETDEV_MAIN_STREAM_TYPE_EVENT    = 1;       /* 事件主码流 Event main stream*/
	}

	/**
	 * @brief 码率模式类型 枚举 定义 Enumeration of bit rate mode
	 * @attention 无 None
	 */
	public static class NETDEV_BIT_RATE_TYPE_E extends Structure {
		public static final int NETDEV_BIT_RATE_TYPE_CBR      = 0;          /* CBR模式 CBR mode*/
		public static final int NETDEV_BIT_RATE_TYPE_VBR      = 1;          /* VBR模式 VBR mode*/
	}

	/**
	 * @brief GOP类型 枚举 定义 Enumeration of GOP type
	 * @attention 无 None
	 */
	public static class NETDEV_GOP_TYPE_E extends Structure {
		public static final int NETDEV_GOP_TYPE_IP       = 0;       /* IP */
		public static final int NETDEV_GOP_TYPE_IBP      = 1;       /* IBP */
		public static final int NETDEV_GOP_TYPE_IBBP     = 2;       /* IBBP */
		public static final int NETDEV_GOP_TYPE_I        = 3;       /* I */
	}

	/**
	 * @brief 日期格式能力集 枚举 定义 OSD date format capabilities enumeration
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_DATE_FORMAT_CAP_E extends Structure {
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_MD_YYYY          = 0;        /* M/d/yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_MMDD_YYYY        = 1;        /* MM/dd/yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_DDMM_YYYY        = 2;        /* dd/MM/yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_YYYY_MMDD        = 3;        /* yyyy/MM/dd */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_YYYYMMDDB        = 4;        /* yyyy-MM-dd */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_XX_MMDD_YYYY     = 5;        /* dddd, MMMM dd, yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_MMMMDD_YYYY      = 6;        /* MMMM dd, yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CAP_DDMMMM_YYYY      = 7;         /* dd MMMM, yyyy */
	}

	/**
	 * @brief OSD时间格式能力集枚举  OSD time format capabilities enumeration
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_TIME_FORMAT_CAP_E extends Structure {
		public static final int NETDEV_OSD_TIME_FORMAT_CAP_HHMMSS = 0;                       /* HH:mm:ss */
		public static final int NETDEV_OSD_TIME_FORMAT_CAP_HH_MM_SS_PM = 1;                  /* hh:mm:ss tt */
	}

	public static class NETDEV_OSD_TEXT_TYPE_E extends Structure {
		public static final int NETDEV_OSD_TEXT_DATAANDTIME = 0;   /*日期.时间, 如yyyy-MM-dd.HH:mm:ss, 日期格式参见 #NETDEV_OSD_DATE_FORMAT_CAP_E, 时间格式参见 #NETDEV_OSD_TIME_FORMAT_CAP_E */
		public static final int NETDEV_OSD_TEXT_PLAIN = 1;
	}

	/**
	 * @brief OSD内容类型 枚举 定义 Enumeration of content type
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_CONTENT_TYPE_E extends Structure {
		public static final int	NETDEV_OSD_CONTENT_TYPE_NOTUSE                      = 0;                    /* 不使用 Not used*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_CUSTOM                      = 1;                    /* 自定义 Custom*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_DATE_AND_TIME               = 2;                    /* 时间日期 Time and date*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PTZ_CONTROLLER              = 3;                    /* 云台控制者 PTZ controller*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PTZ_COORDINATES             = 4;                    /* 云台坐标 PTZ Coordinates*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_CRUISE                      = 5;                    /* 巡航信息 Patrol*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_ZOOM                        = 6;                    /* 变倍信息 Zoom*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PRESET                      = 7;                    /* 预置位信息  Preset*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_ALARM_INFO                  = 8;                    /* 报警信息 Alarm */
		public static final int	NETDEV_OSD_CONTENT_TYPE_ENCODE                      = 9;                    /* 编码信息 Encoding*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_SERIAL_PORT                 = 10;                   /* 串口OSD Serial Port OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PTZ_ORIENTATION             = 11;                   /* 云台方位信息 PZT direction*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_CHN_NAME                    = 12;                   /* 通道名称 Channel name*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_DEBUG                       = 13;                   /* 调试OSD  Debug OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PEOPLE_COUNTING             = 14;                   /* 人数统计OSD People counting OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_NETWORK_PORT                = 15;                   /* 网口OSD Network Port OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_TIME                        = 16;                   /* 时间 Time*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_DATE                        = 17;                   /* 日期 Date*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_SMART_CONTENT               = 18;                   /* 超感类OSD Sensing OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_BATTERY                     = 19;                   /* 电池OSD Battery OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_SCROLL_OSD                  = 20;                   /* 滚动字幕OSD Scroll text OSD*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PICTURE_OVERLAY             = 21;                   /* LOGO OSD */
		public static final int	NETDEV_OSD_CONTENT_TYPE_MOTOR_VEHICLE_NUM           = 22;                   /* 天网卡口机动车流量 Vehicle flow of LPR*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_NON_MOTOR_VEHICLE_NUM       = 23;                   /* 天网卡口非机动车流量 Non-vehicle flow of LPR*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_PEOPLE_NUM                  = 24;                   /* 天网卡口行人流量 Pedestrian flow of LPR*/
		public static final int	NETDEV_OSD_CONTENT_TYPE_INFOOSD_NUM                 = 25;                    /* INFOOSD类型数目 Number of INFOOSDtype*/
	}

	/**
	 * @brief 输入开关量运行模式 Boolean input operation mode
	 * @attention 无 None
	 */
	public static class NETDEV_BOOLEAN_MODE_E extends Structure {
		public static final int NETDEV_BOOLEAN_MODE_OPEN   = 1;                         /* 常开  Always open */
		public static final int NETDEV_BOOLEAN_MODE_CLOSE  = 2;                         /* 常闭  Always closed */
		public static final int NETDEV_BOOLEAN_MODE_INVALID = 0xFF;
	}

	/**
	 * @brief 开关量状态 Boolean input operation mode
	 * @attention 无 None
	 */
	public static class NETDEV_RELAYOUTPUT_STATE_E extends Structure {
		public static final int NETDEV_BOOLEAN_STATUS_ACTIVE    = 0;                 /* 触发状态  Triggered */
		public static final int NETDEV_BOOLEAN_STATUS_INACTIVE  = 1;                 /* 非触发状态 Not triggered */
	}

	/**
	 * @brief 控制手动告警开关量状态命令
	 * @attention 无 None
	 */
	public static class NETDEV_MANUAL_ALARM_CMD_E extends Structure {
		public static final int NETDEV_MANUAL_ALARM_CMD_CLOSE    = 0;               /* 关闭 close */
		public static final int NETDEV_MANUAL_ALARM_CMD_TRIGGER  = 1;               /* 触发  Triggered */
	}

	/**
	 * @brief 5ePTZ显示模式 枚举 定义  5ePTZ display mode Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PTZ_DISPLAY_MODE_E extends Structure {
		public static final int NETDEV_PTZ_DISPLAY_ORIGINAL = 0;        /*原始图像*/
		public static final int NETDEV_PTZ_DISPLAY_5PTZ     = 1;        /*全景+5ePTZ模式*/

		public static final int NETDEV_PTZ_DISPLAY_INVALID  = 0xff;     /* 无效值 */
	}

	/**
	 * @brief 音频位宽
	 * @attention 无
	 */
	public static class NETDEV_AUDIO_SAMPLE_FORMAT_E extends Structure {
		public static final int NETDEV_AUDIO_SAMPLE_FMT_NONE = -1;
		public static final int NETDEV_AUDIO_SAMPLE_FMT_U8      = 0;            /* 无符号8位整型 */
		public static final int NETDEV_AUDIO_SAMPLE_FMT_S16     = 1;            /* 有符号16位整型 */
		public static final int NETDEV_AUDIO_SAMPLE_FMT_S32     = 2;            /* 有符号32位整型 */
		public static final int NETDEV_AUDIO_SAMPLE_FMT_FLT     = 3;            /* 浮点型 */
		public static final int NETDEV_AUDIO_SAMPLE_FMT_DBL     = 4;            /* double型 */
	}

	/**
	 * @brief 录像下载速度  Recording download speed
	 * @attention 无 None
	 */
	public static class NETDEV_E_DOWNLOAD_SPEED_E extends Structure {
		public static final int	NETDEV_DOWNLOAD_SPEED_ONE           = 0;            /* 一倍速 */
		public static final int	NETDEV_DOWNLOAD_SPEED_TWO           = 1;            /* 二倍速 */
		public static final int	NETDEV_DOWNLOAD_SPEED_FOUR          = 2;            /* 四倍速 */
		public static final int	NETDEV_DOWNLOAD_SPEED_EIGHT         = 3;            /* 八倍速 */
		public static final int	NETDEV_DOWNLOAD_SPEED_TWO_IFRAME    = 4;            /* 二倍速I帧 */
		public static final int	NETDEV_DOWNLOAD_SPEED_FOUR_IFRAME   = 5;            /* 四倍速I帧 */
		public static final int	NETDEV_DOWNLOAD_SPEED_EIGHT_IFRAME  = 6;            /* 八倍速I帧 */
		public static final int	NETDEV_DOWNLOAD_SPEED_HALF          = 7;            /* 1/2倍速  1/2x */
		public static final int	NETDEV_DOWNLOAD_SPEED_FORTY         = 8;            /* 40倍速 40x */

		public static final int	NETDEV_DOWNLOAD_SPEED_INVALID       = 0xFF;          /* 无效值 */
	}

	/**
	 * @enum tagNETDEVGenderType
	 * @brief 成员性别
	 * @attention 无 None
	 */
	public static class NETDEV_GENDER_TYPE_E extends Structure {
		public static final int NETDEV_GENDER_TYPE_UNKNOW       = 0;         /* 0-未知的性别 */
		public static final int NETDEV_GENDER_TYPE_MAN          = 1;         /* 1-男 */
		public static final int NETDEV_GENDER_TYPE_WOMAN        = 2;         /* 2-女 */
		public static final int NETDEV_GENDER_TYPE_UNEXPLAINED  = 9;         /* 9-未说明的性别 */
		public static final int NETDEV_GENDER_TYPE_INVALID      = 0xFF;      /* 无效值 */
	}

	/**
	 * @enum tagNETDEVAgeRange
	 * @brief 年龄段
	 * @attention
	 */
	public static class NETDEV_AGE_RANGE_E extends Structure {
		public static final int NETDEV_AGE_RANGE_UNKNOW                                = 0;                /* 未知 */
		public static final int NETDEV_AGE_RANGE_CHILD                                 = 1;                /* 儿童 */
		public static final int NETDEV_AGE_RANGE_JUVENILE                              = 2;                /* 少年 */
		public static final int NETDEV_AGE_RANGE_Youth                                 = 3;                /* 青年 */
		public static final int NETDEV_AGE_RANGE_MIDDLEAGE                             = 4;                /* 中年 */
		public static final int NETDEV_AGE_RANGE_OLDAGE                                = 5;                /* 老年 */
		public static final int NETDEV_AGE_RANGE_INVALID                               = 0xFF;             /* 无效年龄段 */
	}

	/**
	 * @enum tagNETDEVGlassFlag
	 * @brief 是否戴眼镜标志
	 * @attention
	 */
	public static class NETDEV_GLASS_FLAG_E extends Structure {
		public static final int NETDEV_GLASS_FLAG_UNKNOW                              = 0;                 /* 未知 */
		public static final int NETDEV_GLASS_FLAG_NO                                  = 1;                 /* 不戴 */
		public static final int NETDEV_GLASS_FLAG_YES                                 = 2;                 /* 戴 */
		public static final int NETDEV_GLASS_FLAG_INVALID                             = 0xFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVGlassesStyle
	 * @brief 眼镜款式
	 * @attention
	 */
	public static class NETDEV_GLASSES_STYLE_E extends Structure {
		public static final int NETDEV_GLASSES_STYLE_UNKNOW                            = 0;                 /* 未知 */
		public static final int NETDEV_GLASSES_STYLE_GENERAL                           = 1;                 /* 普通眼镜 */
		public static final int NETDEV_GLASSES_STYLE_SUNLIGHT                          = 2;                 /* 太阳眼镜 */
		public static final int NETDEV_GLASSES_STYLE_OTHER                             = 99;                /* 其它 */
		public static final int NETDEV_GLASSES_STYLE_INVALID                           = 0xFF;              /* 无效值 */
	}
	/**
	 * @enum tagNETDEVMaskFlag
	 * @brief 是否戴口罩
	 * @attention
	 */
	public static class NETDEV_MASK_FLAG_E extends Structure {
		public static final int NETDEV_MASK_FLAG_UNKNOW                        = 0;                 /* 未知 */
		public static final int NETDEV_MASK_FLAG_NOT_WEAR                      = 1;                 /* 不戴 */
		public static final int NETDEV_MASK_FLAG_WEAR                          = 2;                 /* 戴 */
		public static final int NETDEV_MASK_FLAG_INVALID                       = 0xFF;               /* 无效值 */
	}
	/**
	 * @enum tagNETDEVSleevesLength
	 * @brief 上衣长短款式
	 * @attention
	 */
	public static class NETDEV_SLEEVES_LENGTH_E extends Structure {
		public static final int NETDEV_SLEEVES_LENGTH_UNKNOW                           = 0;                 /* 未知 */
		public static final int NETDEV_SLEEVES_LENGTH_SHORT                            = 1;                 /* 短袖 */
		public static final int NETDEV_SLEEVES_LENGTH_LONG                             = 2;                 /* 长袖 */
		public static final int NETDEV_SLEEVES_LENGTH_INVALID                          = 0xFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVClothesColor
	 * @brief 衣服颜色
	 * @attention 无 None
	 */
	public static class NETDEV_CLOTHES_COLOR_E extends Structure {
		public static final int	NETDEV_CLOTHES_COLOR_BLACK_E           = 0;            /* 黑色 */
		public static final int	NETDEV_CLOTHES_COLOR_WHITE_E           = 1;           /* 白色 */
		public static final int	NETDEV_CLOTHES_COLOR_GRAY_E            = 2;           /* 灰色 */
		public static final int	NETDEV_CLOTHES_COLOR_RED_E             = 3;           /* 红色 */
		public static final int	NETDEV_CLOTHES_COLOR_BLUE_E            = 4;           /* 蓝色 */
		public static final int	NETDEV_CLOTHES_COLOR_YELLOW_E          = 5;           /* 黄色 */
		public static final int	NETDEV_CLOTHES_COLOR_ORANGE_E          = 6;           /* 橙色 */
		public static final int	NETDEV_CLOTHES_COLOR_BROWN_E           = 7;           /* 棕色 */
		public static final int	NETDEV_CLOTHES_COLOR_GREEN_E           = 8;           /* 绿色 */
		public static final int	NETDEV_CLOTHES_COLOR_PURPLE_E          = 9;           /* 紫色 */
		public static final int	NETDEV_CLOTHES_COLOR_CYAN_E            = 10;          /* 青色 */
		public static final int	NETDEV_CLOTHES_COLOR_PINK_E            = 11;          /* 粉色 */
		public static final int	NETDEV_CLOTHES_COLOR_TRANSPARENT_E     = 12;          /* 透明 */
		public static final int	NETDEV_CLOTHES_COLOR_SILVERYWHITE_E    = 13;          /* 银白 */
		public static final int	NETDEV_CLOTHES_COLOR_DARK_E            = 14;          /* 深色 */
		public static final int	NETDEV_CLOTHES_COLOR_LIGHT_E           = 15;          /* 浅色 */
		public static final int	NETDEV_CLOTHES_COLOR_COLOURLESS        = 16;          /* 无色 */
		public static final int	NETDEV_CLOTHES_COLOR_YELLOWGREEN       = 17;          /* 黄绿双色 */
		public static final int	NETDEV_CLOTHES_COLOR_GRADUALGREEN      = 18;          /* 渐变绿色 */
		public static final int	NETDEV_CLOTHES_COLOR_OTHER_E           = 99;          /* 其他 */
		public static final int	NETDEV_CLOTHES_COLOR_UNKNOW_E          = 100;         /* 未知 */
		public static final int	NETDEV_CLOTHES_COLOR_INVALID           = 0xFF;         /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVBodyToward
	 * @brief 身体抓拍朝向
	 * @attention
	 */
	public static class NETDEV_BODY_TOWARD_E extends Structure {
		public static final int NETDEV_BODY_TOWARD_UNKNOW                              = 0;                 /* 未知 */
		public static final int NETDEV_BODY_TOWARD_POSITIVE                            = 1;                 /* 正面 */
		public static final int NETDEV_BODY_TOWARD_SIDE                                = 2;                 /* 侧面 */
		public static final int NETDEV_BODY_TOWARD_BACK                                = 3;                 /* 背面 */
		public static final int NETDEV_BODY_TOWARD_INVALID                             = 0xFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVShoesTubeLength
	 * @brief 鞋子长短款式
	 * @attention
	 */
	public static class NETDEV_SHOES_TUBE_LENGTH_E extends Structure {
		public static final int NETDEV_SHOES_TUBE_LENGTH_UNKNOW                       = 0;                  /* 未知 */
		public static final int NETDEV_SHOES_TUBE_LENGTH_LONG                         = 1;                  /* 长筒靴 */
		public static final int NETDEV_SHOES_TUBE_LENGTH_SHORT                        = 2;                  /* 短筒靴/普通鞋 */
		public static final int NETDEV_SHOES_TUBE_LENGTH_INVALID                      = 0xFF;               /* 无效值 */
	}

	/**
	 * @enum tagNETDEVHairLength
	 * @brief 发型长短
	 * @attention
	 */
	public static class NETDEV_HAIR_LENGTH_E extends Structure {
		public static final int NETDEV_HAIR_LENGTH_UNKNOW                            = 0;                   /* 未知 */
		public static final int NETDEV_HAIR_LENGTH_LONG                              = 1;                   /* 长发 */
		public static final int NETDEV_HAIR_LENGTH_SHORT                             = 2;                   /* 短发 */
		public static final int NETDEV_HAIR_LENGTH_INVALID                           = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVBagFlag
	 * @brief 是否携包标志
	 * @attention
	 */
	public static class NETDEV_BAG_FLAG_E extends Structure {
		public static final int NETDEV_BAG_FLAG_NO                                   = 0;                   /* 未带包 */
		public static final int NETDEV_BAG_FLAG_CARRY                                = 1;                   /* 拎包 */
		public static final int NETDEV_BAG_FLAG_BACK                                 = 2;                   /* 背包 */
		public static final int NETDEV_BAG_FLAG_INVALID                              = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVSpeedType
	 * @brief 结构化场景中非机动车速度类型
	 * @attention
	 */
	public static class NETDEV_SPEED_TYPE_E extends Structure {
		public static final int NETDEV_SPEED_TYPE_UNKNOW                             = 0;                   /* 未知 */
		public static final int NETDEV_SPEED_TYPE_STATIC                             = 1;                   /* 静止 */
		public static final int NETDEV_SPEED_TYPE_SLOW                               = 2;                   /* 慢速 */
		public static final int NETDEV_SPEED_TYPE_MEDIUM                             = 3;                   /* 中速 */
		public static final int NETDEV_SPEED_TYPE_FAST                               = 4;                   /* 快速 */
		public static final int NETDEV_SPEED_TYPE_INVALID                            = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVImageDirection
	 * @brief 结构化场景中非机动车相对画面运动方向
	 * @attention
	 */
	public static class NETDEV_IMAGE_DIRECTION_E extends Structure {
		public static final int NETDEV_IMAGE_DIRECTION_UNKNOW                        = 0;                   /* 未知 */
		public static final int NETDEV_IMAGE_DIRECTION_STATIC                        = 1;                   /* 静止 */
		public static final int NETDEV_IMAGE_DIRECTION_UP                            = 2;                   /* 向上 */
		public static final int NETDEV_IMAGE_DIRECTION_DOWN                          = 3;                   /* 向下 */
		public static final int NETDEV_IMAGE_DIRECTION_LEFT                          = 4;                   /* 向左 */
		public static final int NETDEV_IMAGE_DIRECTION_RIGHT                         = 5;                   /* 向右 */
		public static final int NETDEV_IMAGE_DIRECTION_LEFTUP                        = 6;                   /* 左上 */
		public static final int NETDEV_IMAGE_DIRECTION_LEFTDOWN                      = 7;                   /* 左下 */
		public static final int NETDEV_IMAGE_DIRECTION_RIGHTUP                       = 8;                   /* 右上 */
		public static final int NETDEV_IMAGE_DIRECTION_RIGHTDOWN                     = 9;                   /* 右下 */
		public static final int NETDEV_IMAGE_DIRECTION_INVALID                       = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVNonVehType
	 * @brief 非机动车类型
	 * @attention
	 */
	public static class NETDEV_NON_VEH_TYPE_E extends Structure {
		public static final int NETDEV_NON_VEH_TYPE_UNKNOW                           = 0;                   /* 未知 */
		public static final int NETDEV_NON_VEH_TYPE_BICYCLE                          = 1;                   /* 人力自行车 */
		public static final int NETDEV_NON_VEH_TYPE_TRIYCLE                          = 2;                   /* 三轮车 */
		public static final int NETDEV_NON_VEH_TYPE_MOTORCYCLE                       = 3;                   /* 摩托车 */
		public static final int NETDEV_NON_VEH_TYPE_ELECTRIC_BICYCLE                 = 4;                   /* 电动自行车 */
		public static final int NETDEV_NON_VEH_TYPE_TWOWHEEL_VEHICLE                 = 5;                   /* 二轮车（摩托车/人力自行车/电动自行车) */
		public static final int NETDEV_NON_VEH_TYPE_INVALID                          = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVVehicleType
	 * @brief 车辆类型 枚举 定义 plate type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VEHICLE_TYPE_E extends Structure {
		public static final int	NETDEV_VEHICLE_TYPE_TRICYCLE_E       = 0;                /* 三轮车 */
		public static final int	NETDEV_VEHICLE_TYPE_MOTOR_BUS_E      = 1;                /* 大客车 */
		public static final int	NETDEV_VEHICLE_TYPE_MIDDLE_E         = 2;                /* 中型车 */
		public static final int	NETDEV_VEHICLE_TYPE_SMALL_E          = 3;                /* 小型车 */
		public static final int	NETDEV_VEHICLE_TYPE_BIG_E            = 4;                /* 大型车 */
		public static final int	NETDEV_VEHICLE_TYPE_TWOWHEELVEH      = 5;                /* 二轮车 */
		public static final int	NETDEV_VEHICLE_TYPE_MOTORCYCLE_E     = 6;                /* 摩托车 */
		public static final int	NETDEV_VEHICLE_TYPE_TRACTOR_E        = 7;                /* 拖拉机 */
		public static final int	NETDEV_VEHICLE_TYPE_AGRICULTURAL_E   = 8;                /* 农用货车 */
		public static final int	NETDEV_VEHICLE_TYPE_SEADAN           = 9;                /* 轿车 */
		public static final int	NETDEV_VEHICLE_TYPE_SUV_E            = 10;               /* SUV */
		public static final int	NETDEV_VEHICLE_TYPE_VAN_E            = 11;               /* 面包车 */
		public static final int	NETDEV_VEHICLE_TYPE_SMALLTRUCK_E     = 12;               /* 小货车 */
		public static final int	NETDEV_VEHICLE_TYPE_MEDIUMCAR_E      = 13;               /* 中巴车/中型客车 */
		public static final int	NETDEV_VEHICLE_TYPE_LARGEBUS_E       = 14;               /* 大客车/大型客车 */
		public static final int	NETDEV_VEHICLE_TYPE_LARGETRUCK_E     = 15;               /* 大货车/大型货车 */
		public static final int	NETDEV_VEHICLE_TYPE_PICKUPTRUCK_E    = 16;               /* 皮卡车 */
		public static final int	NETDEV_VEHICLE_TYPE_BUSINESSVEH_E    = 17;               /* MPV 商务车 */
		public static final int	NETDEV_VEHICLE_TYPE_SPORTSCAR_E      = 18;               /* 跑车 */
		public static final int	NETDEV_VEHICLE_TYPE_MINICAR_E        = 19;               /* 微型轿车 */
		public static final int	NETDEV_VEHICLE_TYPE_HATCHBACKCAR_E   = 20;               /* 两厢轿车 */
		public static final int	NETDEV_VEHICLE_TYPE_THREEBOX_E       = 21;               /* 三厢轿车 */
		public static final int	NETDEV_VEHICLE_TYPE_LIGHTBUS_E       = 22;               /* 轻型客车 */
		public static final int	NETDEV_VEHICLE_TYPE_MEDIUNTRUCK_E    = 23;               /* 中型货车 */
		public static final int	NETDEV_VEHICLE_TYPE_TRAILER_E        = 24;               /* 挂车 */
		public static final int	NETDEV_VEHICLE_TYPE_TANK_E           = 25;               /* 槽罐车 */
		public static final int	NETDEV_VEHICLE_TYPE_WATERCAR_E       = 26;               /* 洒水车 */
		public static final int	NETDEV_VEHICLE_TYPE_OTHER_E          = 998;              /* 其他 */
		public static final int	NETDEV_VEHICLE_TYPE_UNKNOW_E         = 999;              /* 未知 */
		public static final int	NETDEV_VEHICLE_TYPE_INDISTINGUISH_E  = 1000;             /* 不区分车辆类型 */
		public static final int	NETDEV_VEHICLE_TYPE_INVALID          = 0xFFFF;            /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVVehicleMonitorType
	 * @brief 车辆布控类型 枚举 定义 monitor type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VEHICLE_MONITOR_TYPE_E extends Structure {
		public static final int NETDEV_VEHICLE_MONITOR_TYPE_ROB_E         = 0;           /* 被抢车 */
		public static final int NETDEV_VEHICLE_MONITOR_TYPE_STEAL_E       = 1;           /* 被盗车 */
		public static final int NETDEV_VEHICLE_MONITOR_TYPE_SUSPICION_E   = 2;           /* 嫌疑车 */
		public static final int NETDEV_VEHICLE_MONITOR_TYPE_ILLEGAL_E     = 3;           /* 交通违法车 */
		public static final int NETDEV_VEHICLE_MONITOR_TYPE_SUREILLANCE_E = 4;           /* 紧急查控车 */

		public static final int NETDEV_VEHICLE_MONITOR_TYPE_ALL_E         = 255;         /* 所有布控车 */

		public static final int NETDEV_VEHICLE_MONITOR_TYPE_INVALID = 0xFFFF;            /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVPlateColor
	 * @brief 车牌颜色 枚举 定义 plate color Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PLATE_COLOR_E extends Structure {
		public static final int NETDEV_PLATE_COLOR_BLACK_E           = 0;           /* 黑色 */
		public static final int NETDEV_PLATE_COLOR_WHITE_E           = 1;           /* 白色 */
		public static final int NETDEV_PLATE_COLOR_GRAY_E            = 2;           /* 灰色 */
		public static final int NETDEV_PLATE_COLOR_RED_E             = 3;           /* 红色 */
		public static final int NETDEV_PLATE_COLOR_BLUE_E            = 4;           /* 蓝色 */
		public static final int NETDEV_PLATE_COLOR_YELLOW_E          = 5;           /* 黄色 */
		public static final int NETDEV_PLATE_COLOR_ORANGE_E          = 6;           /* 橙色 */
		public static final int NETDEV_PLATE_COLOR_BROWN_E           = 7;           /* 棕色 */
		public static final int NETDEV_PLATE_COLOR_GREEN_E           = 8;           /* 绿色 */
		public static final int NETDEV_PLATE_COLOR_PURPLE_E          = 9;           /* 紫色 */
		public static final int NETDEV_PLATE_COLOR_CYAN_E            = 10;          /* 青色 */
		public static final int NETDEV_PLATE_COLOR_PINK_E            = 11;          /* 粉色 */
		public static final int NETDEV_PLATE_COLOR_TRANSPARENT_E     = 12;          /* 透明 */
		public static final int NETDEV_PLATE_COLOR_SILVERYWHITE_E    = 13;          /* 银白 */
		public static final int NETDEV_PLATE_COLOR_DARK_E            = 14;          /* 深色 */
		public static final int NETDEV_PLATE_COLOR_LIGHT_E           = 15;          /* 浅色 */
		public static final int NETDEV_PLATE_COLOR_COLOURLESS        = 16;          /* 无色 */
		public static final int NETDEV_PLATE_COLOR_YELLOWGREEN       = 17;          /* 黄绿双色 */
		public static final int NETDEV_PLATE_COLOR_GRADUALGREEN      = 18;          /* 渐变绿色 */
		public static final int NETDEV_PLATE_COLOR_OTHER_E           = 99;          /* 其他 */
		public static final int NETDEV_PLATE_COLOR_UNKNOW_E          = 100;         /* 未知 */
		public static final int NETDEV_PLATE_COLOR_INVALID           = 0xFF;        /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVPlateType
	 * @brief 车牌类型 枚举 定义 plate type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PLATE_TYPE_E extends Structure {
		public static final int	NETDEV_PLATE_TYPE_BIG_CAR_E = 0;                     /* 大型汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_MINI_CAR_E = 1;                    /* 小型汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_EMBASSY_CAR_E = 2;                 /* 使馆汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_CONSULATE_CAR_E = 3;               /* 领馆汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_OVERSEAS_CAR_E = 4;                /* 境外汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_FOREIGN_CAR_E = 5;                 /* 外籍汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_COMMON_MOTORBIKE_E = 6;            /* 普通摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_HANDINESS_MOTORBIKE_E = 7;         /* 轻便摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_EMBASSY_MOTORBIKE_E = 8;           /* 使馆摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_CONSULATE_MOTORBIKE_E = 9;         /* 领馆摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_OVERSEAS_MOTORBIKE_E = 10;         /* 境外摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_FOREIGN_MOTORBIKE_E = 11;          /* 外籍摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_LOW_SPEED_CAR_E = 12;              /* 低速车号牌 */
		public static final int	NETDEV_PLATE_TYPE_TRACTOR_E = 13;                    /* 拖拉机号牌 */
		public static final int	NETDEV_PLATE_TYPE_TRAILER_E = 14;                    /* 挂车号牌 */
		public static final int	NETDEV_PLATE_TYPE_COACH_CAR_E = 15;                  /* 教练汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_COACH_MOTORBIKE_E = 16;            /* 教练摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_TEMPORARY_ENTRY_CAR_E = 17;        /* 临时入境汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_TEMPORARY_ENTRY_MOTORBIKE_E = 18;  /* 临时入境摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_TEMPORARY_DRIVING_E = 19;          /* 临时行驶车号牌 */
		public static final int	NETDEV_PLATE_TYPE_POLICE_CAR_E = 20;                 /* 警用汽车号牌 */
		public static final int	NETDEV_PLATE_TYPE_POLICE_MOTORBIKE_E = 21;           /* 警用摩托车号牌 */
		public static final int	NETDEV_PLATE_TYPE_AGRICULTURAL_E = 22;               /* 原农机号牌 */
		public static final int	NETDEV_PLATE_TYPE_HONGKONG_ENTRY_EXIT_E = 23;        /* 香港入出境号牌 */
		public static final int	NETDEV_PLATE_TYPE_MACAO_ENTRY_EXIT_E = 24;           /* 澳门入出境号牌 */
		public static final int	NETDEV_PLATE_TYPE_ARMED_POLICE_E = 25;               /* 武警号牌 */
		public static final int	NETDEV_PLATE_TYPE_ARMY_E = 26;                       /* 军队号牌 */

		public static final int	NETDEV_PLATE_TYPE_OTHER_E = 99;                      /* 其他号牌 */


		public static final int	NETDEV_PLATE_TYPE_INVALID = 0xFF;                     /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVImageFormat
	 * @brief 图像格式
	 * @attention
	 */
	public static class NETDEV_IMAGE_FORMAT_E extends Structure {
		public static final int NETDEV_IMAGE_FORMAT_JPG                              = 0;                   /* JPG */
		public static final int NETDEV_IMAGE_FORMAT_BMP                              = 1;                   /* BMP */
		public static final int NETDEV_IMAGE_FORMAT_PNG                              = 2;                   /* PNG */
		public static final int NETDEV_IMAGE_FORMAT_GIF                              = 3;                   /* GIF */
		public static final int NETDEV_IMAGE_FORMAT_TIFF                             = 4;                   /* TIFF */
		public static final int NETDEV_IMAGE_FORMAT_INVALID                          = 0xFF;                /* 无效值 */
	}

	/**
	 * @enum tagNETDEVPeopleLibType
	 * @brief 人员库类型
	 * @attention 无 None
	 */
	public static class NETDEV_PEOPLE_LIB_TYPE_E extends Structure {
		public static final int NETDEV_PEOPLE_LIB_TYPE_DEFAULT      = 0;        /* 默认无效值 */
		public static final int NETDEV_PEOPLE_LIB_TYPE_BLACKLIST    = 1;        /* 黑名单 */
		public static final int NETDEV_PEOPLE_LIB_TYPE_STRANGER     = 2;        /* 灰名单/陌生人 */
		public static final int NETDEV_PEOPLE_LIB_TYPE_STAFF        = 3;        /* 员工 */
		public static final int NETDEV_PEOPLE_LIB_TYPE_VISITOR      = 4;        /* 访客 */
		public static final int NETDEV_PEOPLE_LIB_TYPE_INVALID      = 0xFF;     /* 无效值 */
	}

	/**
	 * @enum tagNETDEVSearchType
	 * @brief 人脸查找类型
	 * @attention 无
	 */
	public static class NETDEV_SEARCH_TYPE_E extends Structure {
		public static final int	NETDEV_SEARCH_TYPE_FACE        = 0;             /* 人脸检索 */
		public static final int	NETDEV_SEARCH_TYPE_FACE_COMPARE_SUCCESS = 1;    /* 人脸比对成功  */
		public static final int	NETDEV_SEARCH_TYPE_FACE_COMPARE_FAIL    = 2;    /* 人脸比对失败  */

		public static final int	NETDEV_SEARCH_TYPE_INVALID              = 0xff;  /* 无效值 */
	}

	/**
	 * @enum tagNETDEVQueryCondType
	 * @brief 查询条件类型
	 * @attention 无 None
	 */
	public static class NETDEV_QUERYCOND_TYPE_E extends Structure {
		public static final int	NETDEV_QUERYCOND_USERNAME          = 0;                /* 查询条件：用户名称 */
		public static final int	NETDEV_QUERYCOND_ORGNAME           = 1;                /* 查询条件：组织名称 */
		public static final int	NETDEV_QUERYCOND_DEVNAME           = 2;                /* 查询条件：设备名称 */
		public static final int	NETDEV_QUERYCOND_CHNNAME           = 3;                /* 查询条件：通道名称 */
		public static final int	NETDEV_QUERYCOND_TIME              = 4;                /* 查询条件：时间 */
		public static final int	NETDEV_QUERYCOND_BUSINESSTYPE      = 5;                /* 查询条件：业务类型 */
		public static final int	NETDEV_QUERYCOND_OPERATETYPE       = 6;                /* 查询条件：操作类型 */
		public static final int	NETDEV_QUERYCOND_OPEROBJECT        = 7;                /* 查询条件：操作对象 */
		public static final int	NETDEV_QUERYCOND_ALARMTYPE         = 8;                /* 查询条件：告警类型 参见 枚举 NETDEV_ALARM_TYPE_E*/
		public static final int	NETDEV_QUERYCOND_ALARMSRCNAME      = 9;                /* 查询条件：告警源名称 */
		public static final int	NETDEV_QUERYCOND_ALARMLEVEL        = 10;               /* 查询条件：告警级别 */
		public static final int	NETDEV_QUERYCOND_ALARMCHECKED      = 11;               /* 查询条件：告警是否确认 */
		public static final int	NETDEV_QUERYCOND_ALARMCHECKUSER    = 12;               /* 查询条件：告警确认用户 */
		public static final int	NETDEV_QUERYCOND_ALARMCHECKTIME    = 13;               /* 查询条件：告警确认时间 */
		public static final int	NETDEV_QUERYCOND_ALARM_DEVID       = 14;               /* 查询条件：告警设备ID */
		public static final int	NETDEV_QUERYCOND_ALARM_CHNID       = 15;               /* 查询条件：告警通道ID */
		public static final int	NETDEV_QUERYCOND_ALARM_SUBTYPE     = 16;               /* 查询条件：告警子类型 */
		public static final int	NETDEV_QUERYCOND_ALARM_SERVER      = 17;               /* 查询条件：归属服务器 */
		public static final int	NETDEV_QUERYCOND_DOOR_NUM          = 18;               /* 查询条件：门编号 */
		public static final int	NETDEV_QUERYCOND_CARD_NUM          = 19;               /* 查询条件：卡号 */
		public static final int	NETDEV_QUERYCOND_ALARM_GENDER      = 20;               /* 查询条件：性别 */
		public static final int	NETDEV_QUERYCOND_ALARM_BIRTHDAY    = 21;               /* 查询条件：出生年月 */
		public static final int	NETDEV_QUERYCOND_MONITOY_REASON    = 22;               /* 查询条件：布控原因 */
		public static final int	NETDEV_QUERYCOND_PLATE_NUM         = 23;               /* 查询条件：车牌号码 */
		public static final int	NETDEV_QUERYCOND_VEHICLE_TYPE      = 24;               /* 查询条件：车辆类型 */
		public static final int	NETDEV_QUERYCOND_PLATE_COLOR       = 25;               /* 查询条件：车牌颜色 */
		public static final int	NETDEV_QUERYCOND_VEHICLE_COLOR     = 26;               /* 查询条件：车身颜色 */
		public static final int	NETDEV_QUERYCOND_PERSON_NUMBER     = 27;               /* 查询条件：员工编号*/
		public static final int	NETDEV_QUERYCOND_PERSON_TYPE       = 28;               /* 查询条件：人员类型*/
		public static final int	NETDEV_QUERYCOND_DIRECT            = 29;               /* 查询条件：方向*/
		public static final int	NETDEV_QUERYCOND_ORGID             = 30;               /* 组织ID */
		public static final int	NETDEV_QUERYCOND_ORGPID            = 31;               /* 组织PID */
		public static final int	NETDEV_QUERYCOND_DEVICEID          = 32;               /* 设备ID */
		public static final int	NETDEV_QUERYCOND_DEVICE_TYPE       = 33;               /* 设备类型 */
		public static final int	NETDEV_QUERYCOND_DEVICE_SUBTYPE    = 34;               /* 设备子类型 */
		public static final int	NETDEV_QUERYCOND_CHANNELID         = 35;               /* 通道ID */
		public static final int	NETDEV_QUERYCOND_CHANNEL_TYPE      = 36;               /* 通道类型 */
		public static final int	NETDEV_QUERYCOND_ONLINE_STATE      = 37;               /* 在线状态 */
		public static final int	NETDEV_DATABASE_ID                 = 38;               /* 查询条件：库ID */
		public static final int	NETDEV_QUERY_TYPE_PLATECLASS       = 39;               /* 查询条件：车牌类型 */
		public static final int	NETDEV_QUERYCOND_RANGE             = 40;               /* 查询条件：告警查询范围 0是设备，1是服务器*/
		public static final int	NETDEV_QUERYCOND_BEGIN_TIME          = 41;             /* 查询条件：访客预约开始时间*/
		public static final int	NETDEV_QUERYCOND_END_TIME            = 42;             /* 查询条件：访客预约结束时间*/
		public static final int	NETDEV_QUERYCOND_INTERVIEWEE_NAME    = 43;             /* 查询条件：受访人姓名*/
		public static final int	NETDEV_QUERYCOND_INTERVIEWEE_STATUS  = 44;             /* 查询条件：受访人状态*/
		public static final int	NETDEV_QUERYCOND_PARK_NAME         = 45;               /* 查询条件：停车场名称 */
		public static final int	NETDEV_QUERYCOND_CONFIDENCE_LEVEL  = 46;               /* 查询条件：置信度 */
		public static final int	NETDEV_QUERYCOND_PARK_TIME         = 47;               /* 查询条件：停车时长 */
		public static final int	NETDEV_QUERYCOND_CONTRACT_RULE     = 48;               /* 查询条件：包期规则 */
		public static final int	NETDEV_QUERYCOND_PAYMENT_METHOD    = 49;               /* 查询条件：付款方式 */
		public static final int	NETDEV_QUERYCOND_PASSING_DIRECTION = 50;               /* 查询条件：过车方向 */
		public static final int	NETDEV_QUERYCOND_VEHICLE_ATTR      = 51;               /* 查询条件：车辆属性 */
		public static final int	NETDEV_QUERYCOND_STATISTICS_UNITS  = 52;               /* 查询条件：统计单位 */
		public static final int	NETDEV_QUERYCOND_EXITENTRANCE_NAME = 53;               /* 查询条件：出入口名称 */
		public static final int	NETDEV_QUERYCOND_PICTURE_DATA      = 54;               /* 查询条件：图片数据 */
		public static final int	NETDEV_QUERYCOND_PERSON_NAME       = 55;               /* 查询条件：人员姓名 */
		public static final int	NETDEV_QUERYCOND_SIMILARITY        = 56;               /* 查询条件：相似度 */
		public static final int	NETDEV_QUERYCOND_SEARCH_TYPE       = 57;               /* 查询条件：检索类型，参见 枚举 值 NETDEV_SEARCH_TYPE_E */
		public static final int	NETDEV_QUERYCOND_ID_NUMBER         = 58;               /* 查询条件：证件号 */
		public static final int	NETDEV_QUERYCOND_AGERANGE          = 59;               /* 查询条件：年龄段 */
		public static final int	NETDEV_QUERYCOND_GLASSES_STYLE     = 61;               /* 查询条件：眼镜款式 */
		public static final int	NETDEV_QUERYCOND_SLEEVES_LENGTH    = 62;               /* 查询条件：上衣长短款式 */
		public static final int	NETDEV_QUERYCOND_COAT_COLOR        = 63;               /* 查询条件：上衣颜色 */
		public static final int	NETDEV_QUERYCOND_TROUSERS_STYLE    = 64;               /* 查询条件：下衣长短款式 */
		public static final int	NETDEV_QUERYCOND_TROUSERS_COLOR    = 65;               /* 查询条件：下衣颜色 */
		public static final int	NETDEV_QUERYCOND_SNAP_TOWARD       = 66;               /* 查询条件：抓拍朝向 */
		public static final int	NETDEV_QUERYCOND_SHOES_TUBE_LENGTH = 67;               /* 查询条件：鞋子长短款式 */
		public static final int	NETDEV_QUERYCOND_HAIR_LENGTH       = 68;               /* 查询条件：发型长短 */
		public static final int	NETDEV_QUERYCOND_BAG_FLAG          = 69;               /* 查询条件：是否携包 */
		public static final int	NETDEV_QUERYCOND_SPEED_TYPE        = 70;               /* 查询条件：速度类型 */
		public static final int	NETDEV_QUERYCOND_NON_VEH_TYPE      = 71;               /* 查询条件：非机动车类型 */
		public static final int	NETDEV_QUERYCOND_VEH_BRAND         = 72;               /* 查询条件：车辆品牌 */
		public static final int	NETDEV_QUERYCOND_VEH_DATA_TYPE     = 73;               /* 查询条件：车辆数据类型（0：普通抓拍数据，1：结构化抓拍数据） */
		public static final int	NETDEV_QUERYCOND_PROTOCOL_TYPE             = 74;       /* 查询条件：设备接入协议 */
		public static final int	NETDEV_QUERYCOND_RELEVANT_ROOM             = 75;       /* 查询条件：关联房间 */
		public static final int	NETDEV_QUERYCOND_LOCK_SIGNAL               = 76;       /* 查询条件：智能锁信号 */
		public static final int	NETDEV_QUERYCOND_BIND_RELATION_DOORLOCK    = 77;       /* 查询条件：门锁绑定关系 */
		public static final int	NETDEV_QUERYCOND_BIND_RELATION_PERSON_CARD = 78;       /* 查询条件：人卡绑定关系 */
		public static final int	NETDEV_QUERYCOND_PERSONID                  = 79;       /* 查询条件：人员ID */
		public static final int	NETDEV_QUERYCOND_PARKINGLOTID              = 80;       /* 查询条件：停车场ID */
		public static final int	NETDEV_QUERYCOND_ENTREXITID                = 81;       /* 查询条件：出入口ID */
		public static final int	NETDEV_QUERYCOND_RECORDID                  = 82;       /* 查询条件：记录ID */
		public static final int	NETDEV_QUERYCOND_VEH_GROUPINGID            = 83;       /* 查询条件：车辆分组ID */
		public static final int	NETDEV_QUERYCOND_KEYWORD                   = 84;       /* 查询条件：关键字 */
		public static final int	NETDEV_QUERYCOND_PUBULISH_TYPE             = 85;       /* 查询条件：发布类型 (0：即时发布, 1：排程发布) */
		public static final int	NETDEV_QUERYCOND_PROGRAM_NAME              = 86;       /* 查询条件：节目名称 */
		public static final int	NETDEV_QUERYCOND_ORG_TYPE                  = 87;       /* 查询条件：组织类型 见 NETDEV_ORG_TYPE_E */
		public static final int	NETDEV_QUERYCOND_VALID_DATE                = 88;       /* 查询条件：有效日期 */
		public static final int	NETDEV_QUERYCOND_VALID_TIME                = 89;       /* 查询条件：有效时间 */
		public static final int	NETDEV_QUERYCOND_VALID_WEEK                = 90;       /* 查询条件：有效星期 */
		public static final int	NETDEV_QUERYCOND_MASK_FLAG                 = 92;       /* 查询条件：口罩标志(0：未知，1：不戴，2：戴) */
		public static final int	NETDEV_QUERYCOND_TEMPERATURE               = 93;       /* 查询条件：人员体温 */
		public static final int NETDEV_QUERYCOND_SKINCOLOR_TYPE            = 95;       /* 查询条件：肤色 参见枚举 NETDEV_SKINCOLOR_TYPE_E */
	    public static final int NETDEV_QUERYCOND_BEARD_FLAG                = 96;       /* 查询条件：胡子标志 参见枚举 NETDEV_BEARD_FLAG_E */
	    public static final int NETDEV_QUERYCOND_OBJECT_TYPE               = 97;       /* 查询条件：目标类型 参见枚举  NETDEV_OBJECT_TYPE_E 查询全部目标类型时不下发此字段 */
		public static final int	NETDEV_QUERYCOND_INVALID                   = 0xFF;     /* 无效 */
	}
	
	/**
	 * @enum tagNETDEVQueryCondLogic
	 * @brief 查询条件逻辑类型
	 * @attention 无 None
	 */
	public static class NETDEV_QUERYCOND_LOGICTYPE_E extends Structure {
		public static final int NETDEV_QUERYCOND_LOGIC_EQUAL             = 0;                /* 查询条件逻辑类型：等于 */
		public static final int NETDEV_QUERYCOND_LOGIC_GREATER           = 1;                /* 查询条件逻辑类型：大于 */
		public static final int NETDEV_QUERYCOND_LOGIC_LESS              = 2;                /* 查询条件逻辑类型：小于 */
		public static final int NETDEV_QUERYCOND_LOGIC_NO_LESS           = 3;                /* 查询条件逻辑类型：不小于 */
		public static final int NETDEV_QUERYCOND_LOGIC_NO_GREATER        = 4;                /* 查询条件逻辑类型：不大于 */
		public static final int NETDEV_QUERYCOND_LOGIC_NO_EQUAL          = 5;                /* 查询条件逻辑类型：不等于 */
		public static final int NETDEV_QUERYCOND_LOGIC_DIM_QUERY         = 6;                /* 查询条件逻辑类型：模糊查询 */
		public static final int NETDEV_QUERYCOND_LOGIC_CONTAIN           = 7;                /* 查询条件逻辑类型：包括 */
		public static final int NETDEV_QUERYCOND_LOGIC_ASC_ORDER         = 8;                /* 查询条件逻辑类型：升序 */
		public static final int NETDEV_QUERYCOND_LOGIC_DESC_ORDER        = 9;                /* 查询条件逻辑类型：降序 */
	}

	/**
	 * @enum tagNETDEVCertificateType
	 * @brief 证件类型
	 * @attention 无 None
	 */
	public static class NETDEV_ID_TYPE_E extends Structure {
		public static final int NETDEV_CERTIFICATE_TYPE_ID                  = 0;        /*0:身份证 */
		public static final int NETDEV_CERTIFICATE_TYPE_IC                  = 1;        /* 1:IC卡 */
		public static final int NETDEV_CERTIFICATE_TYPE_PASSPORT            = 2;        /* 2:护照 */
		public static final int NETDEV_CERTIFICATE_TYPE_DRIVING_LICENSE     = 3;        /* 3:行驶证 */
		public static final int NETDEV_CERTIFICATE_TYPE_OTHER               = 99;       /* 99:其他 */
		public static final int NETDEV_CERTIFICATE_TYPE_INVALID             = 0xFF;     /* 无效值 */
	}

	/**
	 * @enum tagNETDEVFileType
	 * @brief 文件信息
	 * @attention 无 None
	 */
	public static class NETDEV_FILE_TYPE_E extends Structure {
		public static final int NETDEV_TYPE_FOLDER  = 0;     /* 文件夹 */
		public static final int NETDEV_TYPE_FILE    = 1;     /* 文件 */
		public static final int NETDEV_TYPE_INVALID = 0xff;  /* 无效值 */
	}

	/**
	 * @enum tagNETDEVPersonResultCode
	 * @brief 人脸处理结果状态码
	 * @attention 无 None
	 */
	public static class NETDEV_PERSON_RESULT_CODE_E extends Structure {
		public static final int	NETDEV_PERSON_CODE_SUCCEED                        = 0;               /* 成功 */
		public static final int	NETDEV_PERSON_CODE_COMMON_FAIL                    = 1;               /* 通用执行失败 */
		public static final int	NETDEV_PERSON_CODE_SENDING                        = 2;               /* 下发中 */
		public static final int	NETDEV_PERSON_CODE_DEV_NOT_SUPPORT                = 4;               /* 设备不支持 */
		public static final int	NETDEV_PERSON_CODE_ARGORITHM_INIT_FAIL            = 1000;            /* 算法初始化失败 */
		public static final int	NETDEV_PERSON_CODE_FACE_DETECT_FAIL               = 1001;            /* 人脸检测失败 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_NO_FACE                = 1002;            /* 图片未检测到人脸 */
		public static final int	NETDEV_PERSON_CODE_JPEG_DECODE_FAIL               = 1003;            /* jpeg照片解码失败 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_QUALITY_LOW            = 1004;            /* 图片质量分数不满足 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_ZOOM_FAIL              = 1005;            /* 图片缩放失败 */
		public static final int	NETDEV_PERSON_CODE_INTELLECT_DISABLE              = 1006;            /* 未启用智能 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_TOO_SMALL              = 1007;            /* 导入图片过小 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_TOO_LARGE              = 1008;            /* 导入图片过大 */
		public static final int	NETDEV_PERSON_CODE_RESOLUTION_TOO_LARGE           = 1009;            /* 导入图片分辨率超过1920*1080 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_NON_EXISTENT           = 1010;            /* 导入图片不存在 */
		public static final int	NETDEV_PERSON_CODE_FACE_ELEMENTS_LIMIT            = 1011;            /* 人脸元素个数已达到上限 */
		public static final int	NETDEV_PERSON_CODE_INTELLECT_MODULE_MISMATCH      = 1012;            /* 智能棒算法模型不匹配 */
		public static final int	NETDEV_PERSON_CODE_DOCUMENT_ID_INVLID             = 1013;            /* 人脸导入库成员证件号非法 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_FORMAT_ERROR           = 1014;            /* 人脸导入库成员图片格式错误 */
		public static final int	NETDEV_PERSON_CODE_MONITOR_DEVICE_LIMIT           = 1015;            /* 通道布控已达设备能力上限 */
		public static final int	NETDEV_PERSON_CODE_FACE_LIBRARY_LOCKED            = 1016;            /* 其它客户端正在进行操作人脸库 */
		public static final int	NETDEV_PERSON_CODE_FACE_LIBRARY_UPDATING          = 1017;            /* 人脸库文件正在更新中 */
		public static final int	NETDEV_PERSON_CODE_JSON_DESERIALIZE_FAIL          = 1018;            /* Json反序列化失败 */
		public static final int	NETDEV_PERSON_CODE_BASE64_DECODE_FAIL             = 1019;            /* Base64解码失败 */
		public static final int	NETDEV_PERSON_CODE_PICTURE_SIZE_MISMATCH          = 1020;            /* 人脸照片，编码后的大小和实际接收到的长度不一致 */
		public static final int	NETDEV_PERSON_CODE_DEV_PROTOCOL_DIFFER            = 1021;            /* 布控任务只能选择相同图片接入协议的设备 */
		public static final int NETDEV_PERSON_CODE_REACH_LIMIT                    = 1022;            /* 设备人脸库达到上限 */
		public static final int NETDEV_PERSON_CODE_NO_SMART                       = 1023;            /* 无智能棒 */
		public static final int NETDEV_PERSON_CODE_DEV_BUSY                       = 1024;            /* 设备正忙 */
		public static final int	NETDEV_PERSON_CODE_INVALID                        = 0xff;             /* 无效值 */
	}

	/**
	 * @enum tagNETDEVFaceMemberIDType
	 * @brief 人脸成员证件类型
	 * @attention 无 None
	 */
	public static class NETDEV_FACE_MEMBER_ID_TYPE_E extends Structure {
		public static final int NETDEV_FACE_MEMBER_ID_TYPE_ID_CARD                 = 0;               /* 身份证 */
		public static final int NETDEV_FACE_MEMBER_ID_TYPE_IC_CARD                 = 1;               /* IC卡 */
		public static final int NETDEV_FACE_MEMBER_ID_TYPE_PASSPORT                = 2;               /* 护照 */
		public static final int NETDEV_FACE_MEMBER_ID_TYPE_DRIVING                 = 3;               /* 驾照 */
		public static final int NETDEV_FACE_MEMBER_ID_TYPE_OTHER                   = 99;              /* 其他 */

		public static final int NETDEV_FACE_MEMBER_ID_TYPE_INVALID                 = 0xFF;            /* 无效值 */
	}

	/**
	 * @struct tagNETDEVFacePassRecordType
	 * @brief 人脸通行记录类型
	 * @attention 无 None
	 */
	public static class NETDEV_FACE_PASS_RECORD_TYPE_E extends Structure {
	    public static final int NETDEV_TYPE_FACE_PASS_SNAPSHOT          = 0;                /* 人脸抓拍 */
		public static final int NETDEV_TYPE_FACE_PASS_COM_SUCCESS       = 1;                /* 比对成功告警 */
		public static final int NETDEV_TYPE_FACE_PASS_COM_FAIL          = 2;                /* 比对失败告警 */
		public static final int NETDEV_TYPE_FACE_PASS_INVALID           = 0xff;             /* 无效值 */
	}

	/**
	 * @enum tagNETDEVAlarmActID
	 * @brief 使能联动参数
	 * @attention
	 */
	public static class NETDEV_ALARM_ACT_ID_E extends Structure {
		public static final int	ALARM_ACTION_TYPE_NVR_PREVIEW                = 0;                    /* 联动NVR预览，ActParam见 NETDEV_CHANNEL_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_BUZZER                     = 1;                    /* 联动蜂鸣器，IPC暂不支持,NVR ActParam见 NETDEV_ENABLED_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_E_MAIL                     = 2;                    /* 联动E-Mail，IPC暂不支持，NVR ActParam见 NETDEV_ENABLED_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_RECORD                     = 3;                    /* 联动存储，IPC暂不支持，NVR ActParam见 NETDEV_CHANNEL_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_PRESET                     = 4;                    /* 联动云台预置位，ActParam见 NETDEV_PRESET_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_OUTPUT_SWITCH              = 5;                    /* 联动开关量输出，ActParam见 NETDEV_OUTPUT_SWITCH_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_SNAP                       = 6;                    /* 联动抓拍，IPC无需填写ActParam ，NVR ActParam见 NETDEV_CHANNEL_ACT_PARAM_INFO_S*/
		public static final int	ALARM_ACTION_TYPE_BOX                        = 7;                    /* 告警弹框，IPC暂不支持，NVR ActParam见 NETDEV_ENABLED_ACT_PARAM_INFO_S */
		public static final int	ALARM_ACTION_TYPE_CENTER_RECORD              = 8;                    /* 联动中心存储，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_START_LOCAL_RECORD         = 9;                    /* 联动启动本地存储，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_STOP_LOCAL_RECORD          = 10;                   /* 联动停止本地存储，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_SNAP_UP_FTP                = 11;                   /* 联动抓拍上传FTP，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_SNAP_UP_EMAIL              = 12;                   /* 联动抓拍上传EMail，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_SNAP_UP_FTP_AND_EMAIL      = 13;                   /* 联动抓拍上传FTP和EMail，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_SMART_SNAP_UP              = 14;                   /* 智能联动抓拍上传，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_FACE_PIC_SNAP_UP           = 15;                   /* 联动人脸小图抓拍上传，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_ALARM_REPORT               = 16;                   /* 联动告警上报，IPC无需填写ActParam，NVR不支持 */
		public static final int	ALARM_ACTION_TYPE_PTZ_ZOOM                   = 17;                   /* 联动云台变倍， */
		public static final int	ALARM_ACTION_TYPE_INVALID                    = 0xff;                  /* 无效参数 */
	}

	/**
	 * @struct tagLinkageStrategy
	 * @brief 告警联动配置信息 结构体定义
	 * @attention 无 None
	 */
	public static class NETDEV_PERSON_COMPARE_RESULT_TYPE_E extends Structure {
		public static final int NETDEV_TYPE_COMPARE_SUCCESS = 1;
		public static final int NETDEV_TYPE_COMPARE_FAILED = 2;
		public static final int NETDEV_TYPE_COMPARE_INVALID = 0xff;
	}

	/**
	 * @brief 告警布防类型枚举 定义          Alarm And Defence Type Enumeration definition
	 * @attention 各类告警布防只支持定时类型，录像/抓图计划全支持，IPC只支持定时，不需要带字段，默认是定时
	 */
	public static class NETDEV_ARMING_TYPE_E extends Structure {
		public static final int NETDEV_ARMING_TYPE_TIMING                   = 0;        /* 定时 */
		public static final int NETDEV_ARMING_TYPE_MOTIONDETEC              = 1;        /* 动检 */
		public static final int NETDEV_ARMING_TYPE_ALARM                    = 2;        /* 报警 */
		public static final int NETDEV_ARMING_TYPE_MOTIONDETEC_AND_ALARM    = 3;        /* 动检和报警 */
		public static final int NETDEV_ARMING_TYPE_MOTIONDETEC_OR_ALARM     = 4;        /* 动检或报警 */
		public static final int NETDEV_ARMING_TYPE_NO_PLAN                  = 5;        /* 无计划 */
		public static final int NETDEV_ARMING_TYPE_EVENT                    = 10;       /* 事件 */
	}

	/* 星期几 */
	public static class NETDEV_LAPI_WEEK_INFO_E extends Structure {
		public static final int NETDEV_LAPI_WEEK_MONDAY                  = 1;                  /* 星期一  Monday */
		public static final int NETDEV_LAPI_WEEK_TUESDAY                 = 2;                  /* 星期二  Tuesday */
		public static final int NETDEV_LAPI_WEEK_WEDNESDAY               = 3;                  /* 星期三  Wednesday */
		public static final int NETDEV_LAPI_WEEK_THURSDAY                = 4;                  /* 星期四  Thursday */
		public static final int NETDEV_LAPI_WEEK_FRIDAY                  = 5;                  /* 星期五  Friday */
		public static final int NETDEV_LAPI_WEEK_SATURDAY                = 6;                  /* 星期六  Saturday */
		public static final int NETDEV_LAPI_WEEK_SUNDAY                  = 7;                  /* 星期日  Sunday */
		public static final int NETDEV_LAPI_WEEK_HOLIDAY                 = 8;                  /* 假日 Holiday */
		public static final int NETDEV_LAPI_WEEK_INVALID                 = 0xff;               /* 无效值 */
	}

	/**
	 * @brief 布防计划使能 枚举 定义          Defence Plan Enable Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_DEFENCE_PLAN_ENABLE_E extends Structure {
		public static final int NETDEV_DEFENCE_PLAN_DISABLE     = 0;        /* 不使能 */
		public static final int NETDEV_DEFENCE_PLAN_ENABLE      =  1;       /* 使能 */
	}

	/**
	 * @enum tagNETDEVPersonMonitorOptResCode
	 * @brief 人脸布控操作结果错误码
	 * @attention 仅VMS支持
	 */
	public static class NETDEV_PERSON_MONITOR_OPT_RES_CODE_E extends Structure {
		public static final int	NETDEV_PERSON_MONITOR_CODE_INIT_DETECT_FAIL             = 11702;           /* 初始化检测失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_FACE_DETECT_FAIL             = 11703;           /* 人脸检测失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_IMAGE_NOT_FIND_FACE          = 11704;           /* 图片未检测到人脸 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_JPEG_PARSE_FAIL              = 11705;           /* jpeg照片解码失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_IMAGE_MASS_NOT_ENOUGH        = 11706;           /* 人脸图片质量分数不满足 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_IMAGE_ZOOM_FAIL              = 11707;           /* 图片缩放失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_NOT_START_SMART              = 11708;           /* 未启用智能 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_PICTURE_TOO_SMALL            = 11709;           /* 导入图片过小 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_CREATE_FACE_LIB_FAIL         = 11710;           /* 创建人脸库失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_CREATE_MONITOR_FAIL          = 11711;           /* 创建布控任务失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_PICTURE_TOO_LARGE            = 11714;           /* 导入图片过大 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_RESOLUTION_TOO_LARGE         = 11715;           /* 导入图片分辨率超过1920*1080 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_PICTURE_NON_EXISTENT         = 11716;           /* 导入图片不存在 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_FACE_ELEMENTS_LIMIT          = 11717;           /* 人脸元素个数已达到上限 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_INTELLECT_MODULE_MISMATCH    = 11718;           /* 智能棒算法模型不匹配 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_DOCUMENT_ID_INVLID           = 11719;           /* 人脸导入库成员证件号非法 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_PICTURE_FORMAT_ERROR         = 11720;           /* 人脸导入库成员图片格式错误 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_MONITOR_DEVICE_LIMIT         = 11721;           /* 通道布控已达设备能力上限 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_FACE_LIBRARY_LOCKED          = 11722;           /* 其它客户端正在进行操作人脸库 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_FACE_LIBRARY_UPDATING        = 11723;           /* 人脸库文件正在更新中 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_JSON_DESERIALIZE_FAIL        = 11724;           /* Json反序列化失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_BASE64_DECODE_FAIL           = 11725;           /* Base64解码失败 */
		public static final int	NETDEV_PERSON_MONITOR_CODE_PICTURE_SIZE_MISMATCH        = 11726;            /* 人脸照片，编码后的大小和实际接收到的长度不一致 */
	}

	/* 视图库布控错误码 */
	public static class NETDEV_MONITOR_ERR_CODE_E extends Structure {
		public static final int NETDEV_E_VIID_DISPOSE_DEV_BUSY                  = 25006;  /* 视图库布控错误，设备忙 View library layout control error, equipment busy */
		public static final int NETDEV_E_VIID_DISPOSE_DATABASE_FULL             = 25007;  /* 视图库布控错误,人脸库已达上限 View database layout control error, face database has reached the upper limit */
		public static final int NETDEV_E_VIID_DISPOSE_MEMBER_FULL               = 25008;  /* 视图库布控错误,人脸成员已达上限 View database layout control error, face members have reached the upper limit */
		public static final int NETDEV_E_VIID_DISPOSE_NO_SMARTBAR               = 25009;  /* 视图库布控错误,设备智能棒不存在 View Library Layout Control Error, Device Smart Bar does not exist */
		public static final int NETDEV_E_VIID_DISPOSE_VIID_OFFLINE              = 25010;  /* 视图库布控错误,设备视图库未连接 View Library Layout Error, Device View Library Not Connected */
	}

	/**
	 * @enum tagNETDEVSmartAlarmType
	 * @brief 智能告警类型
	 * @attention 无
	 */
	public static class NETDEV_SMART_ALARM_TYPE_E extends Structure {
		public static final int NETDEV_SMART_ALARM_TYPE_FACE_SNAP         = 0;             /* 人脸识别抓图 */
		public static final int NETDEV_SMART_ALARM_TYPE_VEHICLE_SNAP      = 1;             /* 车牌识别抓图 */
		public static final int NETDEV_SMART_ALARM_TYPE_VIDEO_STRUCT_SNAP = 3;             /* 视频结构化抓图 */
		public static final int NETDEV_SMART_ALARM_TYPE_INVALID           = 0xFF;          /* 无效值 */
	}

	/**
	 * @enum tagNETDEVNotificationType
	 * @brief 通知类型
	 * @attention 无 None
	 */
	public static class NETDEV_NOTIFICATION_TYPE_E extends Structure {
		public static final int NETDEV_NOTIFICATION_TYPE_REALTIME        = 0;           /* 实时通知 */
		public static final int NETDEV_NOTIFICATION_TYPE_HISTORY         = 1;           /* 历史通知 */
		public static final int NETDEV_NOTIFICATION_TYPE_EARLYWARN       = 2;           /* 预警通知 */
	}

	/**
	 * @enum tagNETDEVVehReleaseType
	 * @brief 车辆放行类型
	 * @attention 无 None
	 */
	public static class NETDEV_VEH_RELEASE_TYPE_E extends Structure {
		public static final int NETDEV_VEH_RELEASE_TYPE_AUTO                 = 0;               /* 自动放行 */
		public static final int NETDEV_VEH_RELEASE_TYPE_MANUAL               = 1;               /* 手动放行 */
		public static final int NETDEV_VEH_RELEASE_TYPE_INVALID              = 0xFF;            /* 无效值 */
	}

	/**
	 * @enum tagNETDEVVehLaneType
	 * @brief 车道类型
	 * @attention 无 None
	 */
	public static class NETDEV_VEH_LANE_TYPE_E extends Structure {
		public static final int NETDEV_VEH_LANE_TYPE_ENTRANCE                = 0;               /* 入口 */
		public static final int NETDEV_VEH_LANE_TYPE_EXIT_NOCHARGE           = 1;               /* 出口，不收费 */
		public static final int NETDEV_VEH_LANE_TYPE_EXITE_CHARGE            = 2;               /* 出口，收费 */
		public static final int NETDEV_VEH_LANE_TYPE_INVALID                 = 0xFF;            /* 无效值 */
	}

	/**
	 * @enum tagNETDEVChgType
	 * @brief 收费类型
	 * @attention 无 None
	 */
	public static class NETDEV_CHG_TYPE_E extends Structure {
		public static final int NETDEV_CHG_TYPE_CASH                             = 0;                /* 现金收费 */
		public static final int NETDEV_CHG_TYPE_ALIPY                            = 1;                /* 支付宝收费 */
		public static final int NETDEV_CHG_TYPE_WECHAT                           = 2;                /* 微信收费 */
		public static final int NETDEV_CHG_TYPE_UNIONPAY                         = 3;                /* 微信收费 */
		public static final int NETDEV_CHG_TYPE_INVALID                          = 0xFF;             /* 无效值 */
	}

	/**
	 * @enum tagNETDEVOrderStatus
	 * @brief 订单支付状态
	 * @attention 无 None
	 */
	public static class NETDEV_ORDER_STATUS_E extends Structure {
		public static final int NETDEV_ORDER_STATUS_FINISH            = 0;        /* 未支付 */
		public static final int NETDEV_ORDER_STATUS_UNFINISH          = 1;        /* 已支付 */
		public static final int NETDEV_ORDER_STATUS_PREPAYMENT        = 2;        /* 预支付 */
		public static final int NETDEV_ORDER_STATUS_INVALID           = 0xff;     /* 无效值 Invalid value */
	}

	/**
	 * @enum tagNETDEVPayType
	 * @brief 支付类型
	 * @attention 无 None
	 */
	public static class NETDEV_PAY_TYPE_E extends Structure {
		public static final int NETDEV_PAY_TYPE_CASH              = 0;        /* 现金支付 */
		public static final int NETDEV_PAY_TYPE_ALIPAY            = 1;        /* 支付宝支付 */
		public static final int NETDEV_PAY_TYPE_WECHAT            = 2;        /* 微信支付 */
		public static final int NETDEV_PAY_TYPE_INVALID           = 0xff;     /* 无效值 Invalid value */
	}

	/**
	 * @enum tagNETDEVVehAttrType
	 * @brief 车辆属性(停车场专用)
	 * @attention 无 None
	 */
	public static class NETDEV_VEH_ATTR_TYPE_E extends Structure {
		public static final int NETDEV_VEH_ATTR_FIXED                         = 0;                /* 固定车 */
		public static final int NETDEV_VEH_ATTR_TEMPORARY                     = 1;                /* 临时车 */
		public static final int NETDEV_VEH_ATTR_FIXEDOVERDUE                  = 2;                /* 固定车过期 */
		public static final int NETDEV_VEH_ATTR_INVALID                       = 0xFF;             /* 无效值 */
	}

	/**
	 * @enum tagNETDEVVehicleColor
	 * @brief 车辆颜色 枚举 定义 plate color Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_VEHICLE_COLOR_E extends Structure {
		public static final int	NETDEV_VEHICLE_COLOR_BLACK_E          = 0;        /* 黑色 */
		public static final int	NETDEV_VEHICLE_COLOR_WHITE_E          = 1;        /* 白色 */
		public static final int	NETDEV_VEHICLE_COLOR_GRAY_E           = 2;        /* 灰色 */
		public static final int	NETDEV_VEHICLE_COLOR_RED_E            = 3;        /* 红色 */
		public static final int	NETDEV_VEHICLE_COLOR_BLUE_E           = 4;        /* 蓝色 */
		public static final int	NETDEV_VEHICLE_COLOR_YELLOW_E         = 5;        /* 黄色 */
		public static final int	NETDEV_VEHICLE_COLOR_ORANGE_E         = 6;        /* 橙色 */
		public static final int	NETDEV_VEHICLE_COLOR_BROWN_E          = 7;        /* 棕色 */
		public static final int	NETDEV_VEHICLE_COLOR_GREEN_E          = 8;        /* 绿色 */
		public static final int	NETDEV_VEHICLE_COLOR_PURPLE_E         = 9;        /* 紫色 */
		public static final int	NETDEV_VEHICLE_COLOR_CYAN_E           = 10;       /* 青色 */
		public static final int	NETDEV_VEHICLE_COLOR_PINK_E           = 11;       /* 粉色 */
		public static final int	NETDEV_VEHICLE_COLOR_TRANSPARENT_E    = 12;       /* 透明 */
		public static final int	NETDEV_VEHICLE_COLOR_OTHER_E          = 99;       /* 其他 */

		public static final int	NETDEV_VEHICLE_COLOR_INVALID        = 0xFF;      /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVCapSrc
	 * @brief 采集来源
	 * @attention 无 None
	 */
	public static class NETDEV_CAP_SRC_E extends Structure {
		public static final int NETDEV_CAP_SRC_FACE                      = 1;          /* 人脸识别终端采集的人脸信息 */
		public static final int NETDEV_CAP_SRC_ENTRANCE_GUARDCARD        = 2;          /* 读卡器采集的门禁卡信息 */
		public static final int NETDEV_CAP_SRC_ID                        = 3;          /* 读卡器采集的身份证信息 */
		public static final int NETDEV_CAP_SRC_GATE                      = 4;          /* 闸机采集的闸机信息 */
		public static final int NETDEV_CAP_SRC_INVALID                   = 0xff;       /* 无效值 Invalid value */
	}

	/**
	 * @enum tagNETDEVMatchStatus
	 * @brief 匹配状态
	 * @attention 无 None
	 */
	public static class NETDEV_MATCH_STATUS_E extends Structure {
		public static final int NETDEV_MATCH_STATUS_SUCCESS               = 1;          /* 核验成功 */
		public static final int NETDEV_MATCH_STATUS_FAIL                  = 2;          /* 核验失败（比对失败) */
		public static final int NETDEV_MATCH_STATUS_NO_MONITOR_TIME       = 3;          /* 核验失败（对比成功，不在布控时间）*/
		public static final int NETDEV_MATCH_STATUS_ATTR_ABNORMAL         = 10;         /* 核验失败（对比成功，属性异常) */
		public static final int NETDEV_MATCH_STATUS_BASE_MAP_COLLECT_SUCC = 41;          /* 底图采集成功 */
		public static final int NETDEV_MATCH_STATUS_BASE_MAP_COLLECT_FAIL = 42;          /* 底图采集失败 */
		public static final int NETDEV_MATCH_STATUS_INVALID               = 0xff;       /* 无效值 Invalid value */
	}

	/**
	 * @brief 媒体数据流格式
	 * @attention 无
	 */
	public static class NETDEV_MEDIA_DATA_FORMAT_E extends Structure {
		public static final int NETDEV_MEDIA_DATA_TS            = 0;            /* TS */
		public static final int NETDEV_MEDIA_DATA_RTP_ES        = 3;            /* RTP + ES */
	}

	/**
	 * @brief 异常回调的消息类型 枚举 定义 Exception callback message types Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_EXCEPTION_TYPE_E extends Structure {
	    public static final int NETDEV_EXCEPTION_REPORT_REMUXING_FINISH     = 284;          /* 转封装完成 */

		/* 回放业务异常上报  Playback exceptions report 300~399 */
		public static final int	NETDEV_EXCEPTION_REPORT_VOD_END             = 300;          /* 回放结束  Playback ended*/
		public static final int	NETDEV_EXCEPTION_REPORT_VOD_ABEND           = 301;          /* 回放异常  Playback exception occured */
		public static final int	NETDEV_EXCEPTION_REPORT_BACKUP_END          = 302;          /* 备份结束  Backup ended */
		public static final int	NETDEV_EXCEPTION_REPORT_BACKUP_DISC_OUT     = 303;          /* 磁盘被拔出  Disk removed */
		public static final int	NETDEV_EXCEPTION_REPORT_BACKUP_DISC_FULL    = 304;          /* 磁盘已满  Disk full */
		public static final int	NETDEV_EXCEPTION_REPORT_BACKUP_ABEND        = 305;          /* 其他原因导致备份失败   Backup failure caused by other reasons */

		public static final int	NETDEV_EXCEPTION_EXCHANGE                   = 0x8000;       /* 用户交互时异常（用户保活超时）  Exception occurred during user interaction (keep-alive timeout) */
		public static final int	NETDEV_EXCEPTION_REPORT_ALARM_INTERRUPT     = 0x8001;       /* 告警上报异常结束 保活失败或者长连接断开 Failure to report abnormal termination of life preservation or disconnection of long connection */

		public static final int	NETDEV_EXCEPTION_REPORT_MAX                 = 0x8002;    /* 最大值  Maximum value */
		public static final int	NETDEV_EXCEPTION_REPORT_NOT_VALID_PERIOD    = 0x8003;    /* 不在有效期内 Not Valid period */
		public static final int	NETDEV_EXCEPTION_REPORT_NOT_VALID_TIME      = 0x8004;    /* 不在有效时段内 Not Valid Time */

		public static final int	NETDEV_EXCEPTION_REPORT_INVALID             = 0xFFFF;        /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNetDEVFishEyePtzMode
	 * @brief 鱼眼设备矫正模式枚举 变量
	 * @attention 无
	 */
	public static class NETDEV_FISHEYE_PTZ_MODE_E extends Structure {
		public static final int	NETDEV_FISHEYE_MODE_ORIGINAL            = 0;                /* 原始图像 */
		public static final int	NETDEV_FISHEYE_MODE_180                 = 1;                /* 2*180度模式 */
		public static final int	NETDEV_FISHEYE_MODE_360_1PTZ            = 2;                /* 360度+1PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_360_6PTZ            = 3;                /* 360度+6PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_3PTZ                = 4;                /* 鱼眼+3PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_MID_ON_4PTZ         = 5;                /* 鱼眼图像在中间且显示+4PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_MID_OFF_4PTZ        = 6;                /* 鱼眼图像在中间但不显示+4PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_LEFT_4PTZ           = 7;                /* 鱼眼左边+4PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_8PTZ                = 8;                /* 鱼眼+8PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_PANORAMA            = 9;                /* 全景模式 */
		public static final int	NETDEV_FISHEYE_MODE_PR_3PTZ             = 10;               /* 全景+3PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_PR_4PTZ             = 11;               /* 全景+4PTZ模式 */
		public static final int	NETDEV_FISHEYE_MODE_PR_8PTZ             = 12;               /* 全景+8PTZ模式 */

		public static final int	NETDEV_FISHEYE_MODE_INVALID             = 0xFF;             /* 非法值 */
	}

	/**
	 * @enum tagNETDEVfInstallMode
	 * @brief 设备安装模式
	 * @attention 无
	 */
	public static class NETDEV_INSTALL_MODE_E extends Structure {
		public static final int NETDEV_INSTALL_MODE_TOP             = 0;            /* 顶部安装 */
		public static final int NETDEV_INSTALL_MODE_BOTTOM          = 1;            /* 底部安装 */
		public static final int NETDEV_INSTALL_MODE_SIDE            = 2;            /* 侧面安装 */

		public static final int NETDEV_INSTALL_MODE_INVALID         = 0xFF;         /* 非法值 */
	}

	/**
	 * @enum tagNETDEVfMouseMoveMode
	 * @brief 鼠标移动模式
	 * @attention 无
	 */
	public static class NETDEV_MOUSE_MOVE_MODE_E extends Structure {
		public static final int NETDEV_MOUSE_MOVE                   = 0;            /* 鼠标位移 */
		public static final int NETDEV_MOUSE_LEFT_BTN_DOWN          = 1;            /* 左键按下 */
		public static final int NETDEV_MOUSE_LEFT_BTN_UP            = 2;            /* 左键弹起 */
		public static final int NETDEV_MOUSE_WHEEL                  = 3;            /* 滚轮操作 */

		public static final int NETDEV_MOUSE_INVALID                = 0xFF;         /* 非法值 */
	}

	/**
	 * @enum tagNETDEVACSVisitStaus
	 * @brief 访客状态
	 * @attention 无 None
	 */
	public static class NETDEV_ACS_VISIT_STATUS_E extends Structure {
		public static final int NETDEV_ACS_VISIT_STATUS_SCHEDULE                 = 0;               /* 预约 */
		public static final int NETDEV_ACS_VISIT_STATUS_VISITING                 = 1;               /* 在访 */
		public static final int NETDEV_ACS_VISIT_STATUS_LEAVE                    = 2;               /* 离访 */
		public static final int NETDEV_ACS_VISIT_STATUS_SCHEDULE_CANCEL          = 3;               /* 预约取消 */
		public static final int NETDEV_ACS_VISIT_STATUS_TIMEOUT                  = 4;               /* 超时 */

		public static final int NETDEV_ACS_VISIT_STATUS_INVALID                  = 0xFF;            /* 无效值 */
	}

	/**
	 * @enum tagNETDEVACSPersonType
	 * @brief 人员类型
	 * @attention 无 None
	 */
	public static class NETDEV_ACS_PERSON_TYPE_E extends Structure {
		public static final int NETDEV_ACS_PERSON_TYPE_STAFF                      = 0;               /* 员工 */
		public static final int NETDEV_ACS_PERSON_TYPE_VISITOR                    = 1;               /* 访客 */
		public static final int NETDEV_ACS_PERSON_TYPE_STRANGER                   = 2;               /* 陌生人 */
		public static final int NETDEV_ACS_PERSON_TYPE_BLACKLIST                  = 3;               /* 黑名单人员 */

		public static final int NETDEV_ACS_PERSON_TYPE_INVALID                    = 0xFF;            /* 无效值 */
	}

	/* 门禁人员模块错误码  */
	public static class NETDEV_PACS_ECODE_E extends Structure {
		public static final int	NETDEV_E_PACS_PERSON_NO_EXIST               = 17000;    /* 门禁人员不存在 No entrance guards exist */
		public static final int	NETDEV_E_PACS_PERSON_EXIST                  = 17001;    /* 门禁人员已存在 Access guards already exist */
		public static final int	NETDEV_E_PACS_PERSON_CARD_EXIST             = 17002;    /* 门禁卡已存在 Access card already exists */
		public static final int	NETDEV_E_PACS_PERSON_CARD_NO_EXIST          = 17003;    /* 门禁卡不存在 No access card exists*/
		public static final int	NETDEV_E_PACS_PERSON_CARD_REACH_LIMIT       = 17004;    /* 门禁卡个数已达上限 The number of access cards has reached the upper limit. */
		public static final int	NETDEV_E_PACS_ACCESS_RECORD_NO_EXIST        = 17005;    /* 人员出入记录不存在 Personnel access records do not exist*/
		public static final int	NETDEV_E_PACS_CHL_NO_EXIST                  = 17006;    /* 门禁通道不存在 Access control channel does not exist*/
		public static final int	NETDEV_E_PACS_PRMISS_ID_EXIST               = 17007;    /* 门禁权限人员不存在  Personnel with access control authority do not exist*/
		public static final int	NETDEV_E_PACS_PERSON_DEPT_ID_NO_EXIST       = 17008;    /* 门禁人员的人员部门ID不存在 Personnel Departmental ID of Access Control Personnel does not exist*/
		public static final int	NETDEV_E_PACS_PERSON_RECORD_ID_NO_EXIST     = 17009;    /* 人员出入记录ID不存在 Personnel access record ID does not exist*/
		public static final int	NETDEV_E_PACS_DEPT_ID_PREMISSIONED          = 17010;    /* 部门权限已存在  Departmental authority already exists*/
		public static final int	NETDEV_E_PACS_PERMISSION_EXIT_PERSON        = 17011;    /* 权限组存在人员，不能删除 The permission group has Person and cannot be deleted. */
		public static final int	NETDEV_E_PACS_BLACKLIST_PERSON_EXIST        = 17012;    /* 已存在黑名单访客 Existing blacklist Persons . */
		public static final int	NETDEV_E_PACS_BLACKLIST_NOT_ADD             = 17013;    /* 黑名单访客不能添加 Blacklist visitors cannot be added. */
		public static final int	NETDEV_E_PACS_MAX                           = 17999;     /* PACS模块错误码最大值 Maximum Error Code of PACS Module */
	}

	/**
	 * @enum tagNETDEVACSPersonCommondType
	 * @brief 门禁人员管理命令(添加和删除使用批量接口)
	 * @attention
	 */
	public static class NETDEV_ACS_PERSON_COMMOND_TYPE_E extends Structure {
		public static final int NETDEV_ACS_PERSON_COMMOND_TYPE_GET            = 0;                /* 获取 */
		public static final int NETDEV_ACS_PERSON_COMMOND_TYPE_MOD            = 1;                /* 修改 */

		public static final int NETDEV_ACS_PERSON_COMMOND_TYPE_INVALID        = 0xFF;             /* 无效值 */
	}

	/**
	 * @brief 基本权限
	 * @attention 无
	 */
	public static class NETDEV_USER_BASE_PERMISSION_E extends Structure {
		public static final int NETDEV_USER_BASE_PER_CONFIG           = (0x1 << 0);           /* 配置*/
		public static final int NETDEV_USER_BASE_PER_UPGRADE          = (0x1 << 1);           /* 升级 */
		public static final int NETDEV_USER_BASE_PER_LOG              = (0x1 << 2);           /* 日志查看和导出 */
		public static final int NETDEV_USER_BASE_PER_REBOOT           = (0x1 << 3);           /* 重启 */
	}

	/**
	 * @brief 通道权限枚举
	 * @attention 按位表示 若拥有该通道实况和对讲权限和云台控制权限，该字段填3
	 */
	public static class NETDEV_CHN_PERMISSION_TYPE_E extends Structure {
		public static final int NETDEV_CHN_PERMISSION_LIVE                  = (0x1 << 0);                 /* 实况和语音对讲 */
		public static final int NETDEV_CHN_PERMISSION_PTZ                   = (0x1 << 1);                 /* 云台控制 */
		public static final int NETDEV_CHN_PERMISSION_PLAYBACK              = (0x1 << 2);                 /* 回放 */
		public static final int NETDEV_CHN_PERMISSION_MANU_RECORD           = (0x1 << 3);                 /* 手动录像 */
		public static final int NETDEV_CHN_PERMISSION_LOCAL_BACK            = (0x1 << 4);                 /* 本地备份 */

		public static final int NETDEV_CHN_PERMISSION_INVALID               = 0XFFFFFFFF;        /* 无效值 */
	}

	/**
	 * @brief 用户级别,仅管理员用户可以修改权限
	 * @attention 无
	 */
	public static class NETDEV_USER_LEVEL_E extends Structure {
		public static final int NETDEV_USER_LEVEL_ADMINISTRATOR  = 0;           /* 管理员 不可配置*/
		public static final int NETDEV_USER_LEVEL_OPERATOR       = 1;           /* 操作员 */
		public static final int NETDEV_USER_LEVEL_USER           = 2;           /* 普通用户 */
		public static final int NETDEV_USER_LEVEL_Default        = 3;           /* 默认用户 不可配置 */
		public static final int NETDEV_USER_LEVEL_PUBLISH        = 4;           /* 默认用户 不可配置 */
	}

	/**
	 * @brief 时区 Time Zone
	 * @attention 无 None
	 */
	public static class NETDEV_TIME_ZONE_E extends Structure {
		public static final int	NETDEV_TIME_ZONE_W1200 = 0;              /* W12 */
		public static final int	NETDEV_TIME_ZONE_W1100 = 1;              /* W11 */
		public static final int	NETDEV_TIME_ZONE_W1000 = 2;              /* W10 */
		public static final int	NETDEV_TIME_ZONE_W0900 = 3;              /* W9 */
		public static final int	NETDEV_TIME_ZONE_W0800 = 4;              /* W8 */
		public static final int	NETDEV_TIME_ZONE_W0700 = 5;              /* W7 */
		public static final int	NETDEV_TIME_ZONE_W0600 = 6;              /* W6 */
		public static final int	NETDEV_TIME_ZONE_W0500 = 7;              /* W5 */
		public static final int	NETDEV_TIME_ZONE_W0430 = 8;              /* W4:30 */
		public static final int	NETDEV_TIME_ZONE_W0400 = 9;              /* W4 */
		public static final int	NETDEV_TIME_ZONE_W0330 = 10;             /* W3:30 */
		public static final int	NETDEV_TIME_ZONE_W0300 = 11;             /* W3 */
		public static final int	NETDEV_TIME_ZONE_W0200 = 12;             /* W2 */
		public static final int	NETDEV_TIME_ZONE_W0100 = 13;             /* W1 */
		public static final int	NETDEV_TIME_ZONE_0000  = 14;             /* W0 */
		public static final int	NETDEV_TIME_ZONE_E0100 = 15;             /* E1 */
		public static final int	NETDEV_TIME_ZONE_E0200 = 16;             /* E2 */
		public static final int	NETDEV_TIME_ZONE_E0300 = 17;             /* E3 */
		public static final int	NETDEV_TIME_ZONE_E0330 = 18;             /* E3:30 */
		public static final int	NETDEV_TIME_ZONE_E0400 = 19;             /* E4 */
		public static final int	NETDEV_TIME_ZONE_E0430 = 20;             /* E4:30 */
		public static final int	NETDEV_TIME_ZONE_E0500 = 21;             /* E5 */
		public static final int	NETDEV_TIME_ZONE_E0530 = 22;             /* E5:30 */
		public static final int	NETDEV_TIME_ZONE_E0545 = 23;             /* E5:45 */
		public static final int	NETDEV_TIME_ZONE_E0600 = 24;             /* E6 */
		public static final int	NETDEV_TIME_ZONE_E0630 = 25;             /* E6:30 */
		public static final int	NETDEV_TIME_ZONE_E0700 = 26;             /* E7 */
		public static final int	NETDEV_TIME_ZONE_E0800 = 27;             /* E8 */
		public static final int	NETDEV_TIME_ZONE_E0900 = 28;             /* E9 */
		public static final int	NETDEV_TIME_ZONE_E0930 = 29;             /* E9:30 */
		public static final int	NETDEV_TIME_ZONE_E1000 = 30;             /* E10 */
		public static final int	NETDEV_TIME_ZONE_E1100 = 31;             /* E11 */
		public static final int	NETDEV_TIME_ZONE_E1200 = 32;             /* E12 */
		public static final int	NETDEV_TIME_ZONE_E1300 = 33;             /* E13 */
		public static final int	NETDEV_TIME_ZONE_W0930 = 34;             /* W9:30 */
		public static final int	NETDEV_TIME_ZONE_E0830 = 35;             /* E8:30 */
		public static final int	NETDEV_TIME_ZONE_E0845 = 36;             /* E8:45 */
		public static final int	NETDEV_TIME_ZONE_E1030 = 37;             /* E10:30 */
		public static final int	NETDEV_TIME_ZONE_E1245 = 38;             /* E12:45 */
		public static final int	NETDEV_TIME_ZONE_E1400 = 39;             /* E14 */

		public static final int	NETDEV_TIME_ZONE_INVALID = 0xFF;          /* Invalid value */
	}

	/**
	 * @brief Week emnu
	 * @attention 无
	 */
	public static class NETDEV_DAY_IN_WEEK_E extends Structure
	{
		public static final int NETDEV_WEEK_SUNDAY                  = 0;                  /* 星期日  Sunday */
		public static final int NETDEV_WEEK_MONDAY                  = 1;                  /* 星期一  Monday */
		public static final int NETDEV_WEEK_TUESDAY                 = 2;                  /* 星期二  Tuesday */
		public static final int NETDEV_WEEK_WEDNESDAY               = 3;                  /* 星期三  Wednesday */
		public static final int NETDEV_WEEK_THURSDAY                = 4;                  /* 星期四  Thursday */
		public static final int NETDEV_WEEK_FRIDAY                  = 5;                  /* 星期五  Friday */
		public static final int NETDEV_WEEK_SATURDAY                = 6;                 /* 星期六  Saturday */
		public static final int NETDEV_WEEK_INVALID               = 0xff;                  /* 无效值 Invalid value */
	}

	public static class NETDEV_DST_OFFSET_TIME extends Structure {
		public static final int NETDEV_DST_OFFSET_TIME_30MIN                 = 30;         /* 30分钟  30Minutes */
		public static final int NETDEV_DST_OFFSET_TIME_60MIN                 = 60;          /* 60分钟  60Minutes */
		public static final int NETDEV_DST_OFFSET_TIME_90MIN                 = 90;          /* 90分钟  90Minutes */
		public static final int NETDEV_DST_OFFSET_TIME_120MIN                = 120;         /* 120分钟  120Minutes */
		public static final int NETDEV_DST_OFFSET_TIME_INVALID               = 0xff;         /* 无效值 Invalid value */
	}
	/**
	 * @brief 磁盘工作状态枚举  Disk work status
	 * @attention 无 None
	 */
	public  class NETDEV_DISK_WORK_STATUS_E extends Structure {
		public static final int NETDEV_DISK_WORK_STATUS_EMPTY       = 0;            /* 空状态 Empty */
		public static final int NETDEV_DISK_WORK_STATUS_UNFORMAT    = 1;            /* 未格式化状态 Unformat */
		public static final int NETDEV_DISK_WORK_STATUS_FORMATING   = 2;            /* 格式化状态 Formating */
		public static final int NETDEV_DISK_WORK_STATUS_RUNNING     = 3;            /* 运行状态 Running */
		public static final int NETDEV_DISK_WORK_STATUS_HIBERNATE   = 4;            /* 休眠状态 Hibernate */
		public static final int NETDEV_DISK_WORK_STATUS_ABNORMAL    = 5;            /* 异常状态 Abnormal */
		public static final int NETDEV_DISK_WORK_STATUS_UNKNOWN     = 6;            /* 未知状态 Unknown */

		public int NETDEV_DISK_WORK_STATUS_INVALID					= 0xff;            /* 未知状态 Unknown */
	}

	/**
	 * @brief 协议类型
	 * @attention 无
	 */
	public static class NETDEV_PROTOCOL_TYPE_E extends Structure {
		public static final int NETDEV_PROTOCOL_TYPE_HTTP  = 0;
		public static final int NETDEV_PROTOCOL_TYPE_HTTPS = 1;
		public static final int NETDEV_PROTOCOL_TYPE_RTSP  = 2;
	}

	/**
	 * @brief 客流量统计模式类型 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_TRAFFIC_STATISTICS_TYPE_E extends Structure {
		public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_IN   = 0;        /* 统计类型：进入 Statistics type : Enter */
		public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_OUT  = 1;        /* 统计类型：离开 Statistics type : Exit */
		public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_ALL  = 2;        /* 统计类型：所有 Statistics type : All */
		public int NETDEV_TRAFFIC_STATISTICS_TYPE_BUTT				= 3;
	}

	/**
	 *@enum tagNETDEVTrafficStatisticsFormType
	 *@brief 客流量报表类型 枚举 定义
	 *@attention 无 None
	 */
	public static class NETDEV_TRAFFIC_STATIC_FORM_TYPE_E extends Structure {
		public static final int NETDEV_TRAFFIC_STAT_FORM_BY_MINUTE = 0;                  /* 按分钟*/
		public static final int NETDEV_TRAFFIC_STAT_FORM_BY_HOUR = 1;                    /* 按小时*/
		public static final int NETDEV_TRAFFIC_STAT_FORM_BY_DAY = 2;                     /* 按天*/
		public static final int NETDEV_TRAFFIC_STAT_FORM_BY_MONTH = 3;                   /* 按月*/
		public static final int NETDEV_TRAFFIC_STAT_FORM_BY_BUTT  = 4;
	}

	/**
	 * @enum tagNETDEVTimeTemplateType
	 * @brief 时间模板类型
	 * @attention 无 None
	 */
	public static class NETDEV_TIME_TEMPLATE_TYPE_E extends Structure {
		public static final int NETDEV_TIMETEMPLATE_TYPE_RECORD     = 0;                /* 录像计划 */
		public static final int NETDEV_TIMETEMPLATE_TYPE_ALARM      = 1;                /* 告警计划 */
		/* 2和3CS暂不使用，web端使用 2是用户时间模板， 3是微信小程序使用 */
		public static final int NETDEV_TIMETEMPLATE_TYPE_SEQUENCE   = 4;                /* 轮巡 */
		public static final int NETDEV_TIMETEMPLATE_TYPE_ACS        = 5;                /* 门禁管理 */
		public static final int NETDEV_TIMETEMPLATE_TYPE_INVALID    = 0xFF;             /* 无效 */
	}

	/**
	 * @brief 录像类型 Record Type
	 * @attention 无
	 */
	public static class NETDEV_RECORD_TYPE_E extends Structure {
		public static final int NETDEV_RECORD_TYPE_MANUAL  = 0;
		public static final int NETDEV_RECORD_TYPE_NORMAL = 1;
	}

	/* 升级类别 */
	public static class NETDEV_UPGRADE_TYPE_E extends Structure {
		public static final int NETDEV_UPGRADE_TYPE_CLOUD    = 1;               /* 云升级 */
		public static final int NETDEV_UPGRADE_TYPE_UDISK    = 2;               /* U盘升级 */
		public static final int NETDEV_UPGRADE_TYPE_LOCAL    = 3;               /* 本地升级 */
		public static final int NETDEV_UPGRADE_TYPE_BUTT					 = 4;               
	}

	/* 升级状态 */
	public static class  NETDEV_UPGRADE_STATUS_E extends Structure {
		public static final int	NETDEV_UPGRADE_STATUS_INITING        = 0;       /* 初始化中 */
		public static final int	NETDEV_UPGRADE_STATUS_QUERYING       = 1;       /* 查询中 */
		public static final int	NETDEV_UPGRADE_STATUS_DOWNLOADING    = 2;       /* 下载中 */
		public static final int	NETDEV_UPGRADE_STATUS_TRANSMITTING   = 3;       /* 传输中 */
		public static final int	NETDEV_UPGRADE_STATUS_UPGRATING      = 4;       /* 升级中 */
		public static final int	NETDEV_UPGRADE_STATUS_UPGRATEERROR   = 5;       /* 升级出错 */
		public static final int	NETDEV_UPGRADE_STATUS_NEWEST         = 6;       /* 已是最新版本 */
		public static final int	NETDEV_UPGRADE_STATUS_HAVEHIGHTER    = 7;       /* 有更高版本 */
		public static final int	NETDEV_UPGRADE_STATUS_UPGRADEOVER    = 8;       /* 升级完成 */
		public static final int	NETDEV_UPGRADE_STATUS_GETSTATUSFAIL  = 9;       /* 获取升级进度失败 */
		public static final int	NETDEV_UPGRADE_STATUS_NOTMATCH       = 10;      /* 版本不匹配 */
		public static final int	NETDEV_UPGRADE_STATUS_NOTMUTIPROCESS = 11;      /* 不能同时加载多个升级进程 */
		public static final int	NETDEV_UPGRADE_STATUS_UPGRADETIMEOUT = 12;      /* 获取升级进度超时*/
		public static final int	NETDEV_UPGRADE_STATUS_BUTT = 0xff;
	};
	
	/**
	 * @enum tagNETDEVObjectRecordType
	 * @brief 目标记录类型 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_OBJECT_RECORD_TYPE_E extends Structure {
		public int	NETDEV_OBJECT_RECORD_TYPE_CROSSLINE_DETECTION     = 0;                /* 越界检测 */
		public int	NETDEV_OBJECT_RECORD_TYPE_INTRUSION_DETECTION     = 1;                /* 区域入侵 */
		public int	NETDEV_OBJECT_RECORD_TYPE_ENTER_ZONE              = 2;                /* 进入区域 */
		public int	NETDEV_OBJECT_RECORD_TYPE_LEAVE_ZONE              = 3;                /* 离开区域 */
		public int	NETDEV_OBJECT_RECORD_TYPE_INVALID                 = 0xffff;           /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVObjectType
	 * @brief 目标类型 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_OBJECT_TYPE_E extends Structure {
		public int	NETDEV_OBJECT_TYPE_FACE        = 0;                /* 人脸 */
		public int	NETDEV_OBJECT_TYPE_PERSON      = 1;                /* 人员 */
		public int	NETDEV_OBJECT_TYPE_NON_MOTOR   = 2;                /* 非机动车 */
		public int	NETDEV_OBJECT_TYPE_MOTOR       = 3;                /* 机动车 */
		public int	NETDEV_OBJECT_TYPE_UNKNOWN     = 255;              /* 未知/未识别的目标类型 */
		public int  NETDEV_OBJECT_TYPE_INVALID     = 0xffff;           /* 无效值 */
	}
	
	
	/**
	 * @enum tagNETDEVEmotionFlag
	 * @brief 情绪情况
	 * @attention 
	 */
	public static class NETDEV_EMOTION_FLAG_E extends Structure {
		public int      NETDEV_EMOTION_FLAG_UNKNOW                        = 0;                 /* 未知 */
		public int      NETDEV_EMOTION_FLAG_ANGER                         = 1;                 /* 生气的 */
		public int	    NETDEV_EMOTION_FLAG_CALM                          = 2;                 /* 平静的 */
		public int	    NETDEV_EMOTION_FLAG_CONFUSED                      = 3;                 /* 迷茫的 */
		public int	    NETDEV_EMOTION_FLAG_ABHORRENT                     = 4;                 /* 厌恶的 */
		public int	    NETDEV_EMOTION_FLAG_HAPPY                         = 5;                 /* 高兴的 */
		public int	    NETDEV_EMOTION_FLAG_SAD                           = 6;                 /* 悲伤的 */
		public int	    NETDEV_EMOTION_FLAG_AFRAID                        = 7;                 /* 害怕的 */
		public int      NETDEV_EMOTION_FLAG_AMAZED                        = 8;                 /* 吃惊的 */
		public int      NETDEV_EMOTION_FLAG_SQUINT                        = 9;                 /* 眯眼的 */
		public int      NETDEV_EMOTION_FLAG_SCREAM                        = 10;                /* 尖叫的 */
		public int      NETDEV_EMOTION_FLAG_OTHER                         = 11;                /* 其他 */
		public int      NETDEV_EMOTION_FLAG_INVALID                       = 0xFF;              /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVSmileFlag
	 * @brief 微笑标志
	 * @attention 
	 */
	public static class NETDEV_SMILE_FLAG_E extends Structure {
		public int          NETDEV_SMILE_FLAG_UNKNOW                        = 0;                /* 未知 */
		public int  	    NETDEV_SMILE_FLAG_NO                            = 1;                /* 不微笑 */
		public int  	    NETDEV_SMILE_FLAG_YES                           = 2;                /* 微笑 */
		public int  	    NETDEV_SMILE_FLAG_INVALID                       = 0xFF;             /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVSkinColorType
	 * @brief 肤色
	 * @attention 
	 */
	public static class NETDEV_SKINCOLOR_TYPE_E extends Structure
	{
		public int NETDEV_SKINCOLOR_TYPE_UNKNOW                           = 0;                    /* 未知 */
		public int NETDEV_SKINCOLOR_TYPE_WHITE                            = 2011;                 /* 白皮肤 */
		public int NETDEV_SKINCOLOR_TYPE_BLACK                            = 2012;                 /* 黑皮肤 */
		public int NETDEV_SKINCOLOR_TYPE_YELLOW                           = 2013;                 /* 黄皮肤 */
		public int NETDEV_SKINCOLOR_TYPE_BROWN                            = 2014;                 /* 棕皮肤 */
		public int NETDEV_SKINCOLOR_TYPE_INVALID                          = 0xFF;                 /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVBeardFlag
	 * @brief 胡子标志
	 * @attention 
	 */
	public static class NETDEV_BEARD_FLAG_E extends Structure
	{
		public int      NETDEV_BEARD_FLAG_UNKNOW                        = 0;                 /* 未知 */
		public int	    NETDEV_BEARD_FLAG_UNEXIST                       = 1;                 /* 没胡子 */
		public int      NETDEV_BEARD_FLAG_EXIST                         = 2;                 /* 有胡子 */
		public int      NETDEV_BEARD_FLAG_INVALID                       = 0xFF;              /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVRuleType
	 * @brief 规则类型 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_RULE_TYPE_E extends Structure
	{
		public int    NETDEV_RULE_TYPE_INTRUSION_DETECTION                    = 0;       /* 区域入侵 */
		public int    NETDEV_RULE_TYPE_CROSSLINE_DETECTION                    = 1;       /* 越界检测 */
		public int    NETDEV_RULE_TYPE_LEAVE_ZONE                             = 2;       /* 离开区域 */
		public int    NETDEV_RULE_TYPE_ENTER_ZONE                             = 3;       /* 进入区域 */
		public int    NETDEV_RULE_TYPE_INVALID                                = 0xff;    /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVRuleTriggerType
	 * @brief 规则触发类型 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_RULE_TRIGGER_TYPE_E extends Structure
	{
		public int    NETDEV_RULE_TRIGGER_TYPE_NO_TRIGGER                          = 0;       /* 无触发类型 */
		public int    NETDEV_RULE_TRIGGER_TYPE_DUPLEX                              = 1;       /* 双向触发 */
		public int    NETDEV_RULE_TRIGGER_TYPE_CLOCKWISE                           = 2;       /* 顺时针触发 */
		public int    NETDEV_RULE_TRIGGER_TYPE_ANTIC_CLOCKWISE                     = 3;       /* 逆时针触发 */
		public int    NETDEV_RULE_TRIGGER_TYPE_ACCESS                              = 4;       /* 进入触发 */
		public int    NETDEV_RULE_TRIGGER_TYPE_LEAVE                               = 5;       /* 离开触发 */
		public int    NETDEV_RULE_TRIGGER_TYPE_INVALID                             = 0xff;    /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVPersonMaskFlag
	 * @brief 是否戴口罩
	 * @attention 
	 */
	public static class NETDEV_PERSON_MASK_FLAG_E extends Structure
	{
		public int      NETDEV_PERSON_MASK_FLAG_NOT_WEAR                      = 1;                 /* 不戴 */
		public int	    NETDEV_PERSON_MASK_FLAG_WEAR                          = 2;                 /* 戴 */
		public int	    NETDEV_PERSON_MASK_FLAG_UNKNOW                        = 255;               /* 未知 */
		public int	    NETDEV_PERSON_MASK_FLAG_INVALID                       = 0xFFFF;            /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVCoatTexture
	 * @brief 上衣纹理
	 * @attention 无 None
	 */
	public static class NETDEV_CLOTHES_TEXTURE_E extends Structure
	{
		public int      NETDEV_CLOTHES_TEXTURE_NO_PATTERNS                  = 1;         /* 无花纹 */
		public int	    NETDEV_CLOTHES_TEXTURE_EXIST_PATTERNS               = 2;         /* 有花纹 */
		public int	    NETDEV_CLOTHES_TEXTURE_UNKNOW                       = 255;       /* 未知 */
		public int	    NETDEV_CLOTHES_TEXTURE_INVALIDP                     = 0xFFFF;    /* 无效值 */
	}
	
	/**
	 * @enum tagNETDEVMoveDirection
	 * @brief 人员运动方向
	 * @attention 
	 */
	public static class NETDEV_MOVE_DIRECTION_E extends Structure
	{
		public int      NETDEV_MOVE_DIRECTION_STATIC                        = 1;                   /* 静止 */
		public int	    NETDEV_MOVE_DIRECTION_UP                            = 2;                   /* 向上 */
		public int	    NETDEV_MOVE_DIRECTION_DOWN                          = 3;                   /* 向下 */
		public int	    NETDEV_MOVE_DIRECTION_LEFT                          = 4;                   /* 向左 */
		public int	    NETDEV_MOVE_DIRECTION_RIGHT                         = 5;                   /* 向右 */
		public int	    NETDEV_MOVE_DIRECTION_LEFTUP                        = 6;                   /* 左上 */
		public int	    NETDEV_MOVE_DIRECTION_LEFTDOWN                      = 7;                   /* 左下 */
		public int	    NETDEV_MOVE_DIRECTION_RIGHTUP                       = 8;                   /* 右上 */
		public int	    NETDEV_MOVE_DIRECTION_RIGHTDOWN                     = 9;                   /* 右下 */
		public int	    NETDEV_MOVE_DIRECTION_UNKNOW                        = 255;                 /* 未知 */
		public int	    NETDEV_MOVE_DIRECTION_INVALID                       = 0xFFFF;              /* 无效值 */
	}

	/**
	 * @struct tagNETDEVUpgradeDevice
	 * @brief 升级设备所需信息 结构体定义 Basic device information Structure definition
	 * @attention 无 None
	 */
	public static class  NETDEV_UPGRADE_DEVICE_S extends Structure {
		public int dwUpgradeType;                    				/* 升级类型 参考枚举#NETDEV_UPGRADE_TYPE_E */
		public int dwSize;                           				/* 需升级通道个数 ,为0时默认给NVR自身升级 */
		public int[] adwChannelID = new int[NETDEV_CHANNEL_MAX]; 	/* 需升级的通道 */
		public byte[]  szPath = new byte[NETDEV_PATH_LEN];          /* 升级文件所在路径 */
		public byte[]  byRes = new byte[256];                       /* 保留字  Reserved */
	};

	/**
	 * @struct tagNETDEVDeviceBaseInfo
	 * @brief 设备信息
	 * @attention 无
	 */
	public static class  NETDEV_DEVICE_BASE_INFO_S extends Structure {
		public int dwChlID;                                              /* 视频输入通道号  Video input channel ID */
		public int dwDeviceType;                                         /* 设备类型  Device Type */
		public int dwDevCode;                                            /* 设备编号  Device code */
		public int dwCurrentLang;                                        /* 设备当前语言 参见枚举#NETDEV_LANG_TYPE_E Current language NETDEV_LANG_TYPE_E*/
		public NETDEV_DATE_INFO_S stBuildDate;                             /* 发布时间  Release time */
		public byte[] szSerialNum = new byte[NETDEV_LEN_32];                            /* 设备序列号  Device serial number */
		public byte[] szMacAddress = new byte[NETDEV_LEN_64];                           /* IPv4的Mac地址  MAC address of IPv4 */
		public byte[] szDevName = new byte[NETDEV_CODE_STR_MAX_LEN];                    /* 设备名称  Device name */
		public byte[] szDevModel = new byte[NETDEV_CODE_STR_MAX_LEN];                   /* 设备型号  Device model */
		public byte[] szVIIDVersion = new byte[NETDEV_CODE_STR_MAX_LEN];                /* 视图库组件版本号  VIIDVersion version */
		public byte[] szSoftwareVersion = new byte[NETDEV_CODE_STR_MAX_LEN];            /* 内部软件版本 Internal software version */
		public byte[] szFirmwareVersion = new byte[NETDEV_CODE_STR_MAX_LEN];            /* 软件版本号  Software version */
		public byte[] szHardewareID = new byte[NETDEV_CODE_STR_MAX_LEN];                /* 硬件标识  Hardware ID */
		public byte[] szUbootVersion = new byte[NETDEV_CODE_STR_MAX_LEN];               /* UBOOT引导版本  UBOOT version */
		public byte[] szManufacturer = new byte[NETDEV_LEN_64];                         /* 厂商名称，字符串长度[1,64]  Manufacturer */
		public NETDEV_CLIENT_VERSION_INFO_LIST_S stClientVersionsInfo;     /* 版本信息，可选：仅一体机支持  Client Versions Infos */
		public byte[] szProtoName = new byte[NETDEV_LEN_256];                           /* 设备原型机名称 */

		public byte[] byRes = new byte[216];                                        /* 保留字段 Reserved */
	};

	/**
	 * @struct tagstNETDEVDateInfo
	 * @brief 时间信息
	 * @attention
	 */
	public static class  NETDEV_DATE_INFO_S extends Structure {
		public int     dwYear;                               /* 所在年份 */
		public int     dwMonth;                              /* 所在月份 */
		public int     dwDay;                                /* 具体日期 */
		public int     dwHour;                               /* 具体小时 */
		public int     dwMinute;                             /* 具体分钟 */
		public byte[] byRes = new byte[32];                            /* 保留字段 */
	};

	/**
	 * @struct tagstNETDEVClientVersionsInfoList
	 * @brief 客户端版本信息列表
	 * @attention
	 */
	public static class  NETDEV_CLIENT_VERSION_INFO_LIST_S extends Structure {
		public int    		udwNum;                                          /* 数量 */
		public Pointer    	pstClientVersionsInfo;                           /* 客户端版本信息列表 参见# */

		public byte[]  		byRes = new byte[32];                                       /* 保留字段 */
	};

	/**
	 * @struct tagstNETDEVClientVersionsInfo
	 * @brief 客户端版本信息
	 * @attention
	 */
	public static class  NETDEV_CLIENT_VERSION_INFO_S extends Structure {
		public int     udwType;                                            /* 客户端类型 参见枚举# NETDEV_CLIENT_TYPE_E */
		public byte[]  szVersion = new byte[NETDEV_LEN_256];                          /* 客户端独立版本号， 范围[0, 255] */

		public byte[]  byRes = new byte[32];                                          /* 保留字段 */
	};

	/**
	 * @struct tagNETDEVUpgradeStatus
	 * @brief 升级设备状态信息 结构体定义 Basic device information Structure definition
	 * @attention 无 None
	 */
	public static class  NETDEV_UPGRADE_STATUS_S extends Structure {
		public int dwStatus;             /* 升级状态,参考枚举#NETDEV_UPGRADE_STATUS_E */
		public int dwPercent;            /* 百分比 */
		public int dwChannelID;          /* 通道号 */
		byte[] byRes = new byte[256];           /* 保留字段 */
	};

	public static class NETDEV_ALARM_SNAPSHOT_TYPE_E extends Structure {
		public static final int	NETDEV_ALARM_SNAPSHOT_MOTION_DETECT                     = 0;            /* 移动告警 */
		public static final int	NETDEV_ALARM_SNAPSHOT_VIDEO_LOST                        = 1;            /* 视频丢失告警 */
		public static final int	NETDEV_ALARM_SNAPSHOT_AUDIO_DETECTION                   = 2;            /* 声音检测告警 */
		public static final int	NETDEV_ALARM_SNAPSHOT_INPUT_SWITCH                      = 3;            /* 开关量输入告警 */
		public static final int	NETDEV_ALARM_SNAPSHOT_IPC_OFFLINE                       = 4;            /* IPC离线 */
		public static final int	NETDEV_ALARM_SNAPSHOT_TAMPER_DETECT                     = 5;            /* 遮挡检测 */

		public static final int	NETDEV_ALARM_SNAPSHOT_CROSS_LINE                        = 6;            /* 越界检测，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_INTROSION_ZONE                    = 7;            /* 区域入侵，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_FACE_DETECT                       = 8;            /* 人脸检测，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_SCENCECHANGE                      = 9;            /* 场景变更，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_OUT_FOCUS                         = 10;           /* 虚焦检测，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_FACE_MATCH                        = 11;           /* 人脸识别匹配告警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_FACE_NOT_MATCH                    = 12;           /* 人脸识别不匹配报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_GATHER                            = 13;           /* 人员聚集，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_REMAIN_ARTICLE                    = 14;           /* 物品遗留，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_SMART_TRACK                       = 15;           /* 智能跟踪，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_LOITERING_DETECTOR                = 16;           /* 徘徊检测，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_VEHICLE_MATCH                     = 17;           /* 车辆识别匹配报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_VEHICLE_NOT_MATCH                 = 18;           /* 车辆识别不匹配报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_ENTER_AREA                        = 19;           /* 进入区域，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_LEAVE_AREA                        = 20;           /* 离开区域，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_ARTICLE_MOVE                      = 21;           /* 物品搬移，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_DURESS                            = 22;           /* 挟持报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_ANRIDISASSEMBLY                   = 23;           /* 防拆报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_ANRIDISASSEMBLY_RECOVER           = 24;           /* 防拆报警恢复，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_BYPASS_OPERATION                  = 25;           /* 防区旁路操作，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_CF_BJ_EMBNAM_ZONE                 = 26;           /* 安标报警模块.防区报警，仅一体机支持 */
		public static final int	NETDEV_ALARM_SNAPSHOT_CONFLAGRATION                     = 27;           /* 火点告警 */
		public static final int NETDEV_ALARM_SNAPSHOT_HUMAN_SHAPE_DETECT                = 28;           /* 人形检测告警 */

		public static final int	NETDEV_ALARM_SNAPSHOT_INVALID                        = 0xFFFF;        /* 无效值  Invalid value */
	}

	/**
	 * @brief 通道下接入的设备类型(2018-07-26 目前仅NVR使用) 枚举 定义 Channel device type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_CHANNEL_CAMERA_TYPE_E extends Structure {
		public static final int NETDEV_CHL_CAMERA_TYPE_FIXED        = 0;        /* 固定摄像机  fixed camera */
		public static final int NETDEV_CHL_CAMERA_TYPE_PTZ          = 1;        /* 云台摄像机  PTZ camera */
		public static final int NETDEV_CHL_CAMERA_TYPE_FISH_EYE     = 2;        /* 鱼眼相机（鱼眼镜头+自身矫正功能）fish-eye camera */
		public static final int NETDEV_CHL_CAMERA_TYPE_WIDE_ANGLE   = 3;        /* 超广角相机（包含鱼眼镜头、大视角的镜头的相机  但是不具备自身矫正功能）wide-Angle camera*/

		public static final int NETDEV_CHL_CAMERA_TYPE_INVALID      = 0xff;
	}

	/**
	 * @enum tagNETDEVCloudDeviceType
	 * @brief 云端设备类型
	 * @attention 无 None
	 */
	public static class NETDEV_CLOUD_DEVICE_TYPE extends Structure {
		public static final int NETDEV_CLOUD_DEV_TYPE_IPC                 = 0;          /* IPC设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_NVR                 = 1;          /* NVR设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_VMS                 = 2;          /* 一体机设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_DVR                 = 3;          /* DVR设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_EC                  = 4;          /* 编码器设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_DC                  = 5;          /* 解码器设备 */
		public static final int NETDEV_CLOUD_DEV_TYPE_INVALID            = 0xff;         /* 无效值 */
	}

	/**
	 *@brief 分发模式类型枚举
	 *@attention 无
	 */
	public static class NETDEV_DISTRIBUTE_CLOUD_SRV_E extends Structure {
		public static final int NETDEV_DISTRIBUTE_CLOUD_NONE      = 0;            /* 不启用分发 */
		public static final int NETDEV_DISTRIBUTE_CLOUD_KS        = 1;            /* 启用金山云分发 */
		public static final int NETDEV_DISTRIBUTE_CLOUD_UN        = 2;            /* 启用我司云分发 */
		public static final int NETDEV_DISTRIBUTE_CLOUD_TEN       = 3;            /* 启用腾讯云分发 */
	}

	/**
	 *@enum tagNETDEVCloudStorageType
	 *@brief 云存储支持类型
	 *@attention 无
	 */
	public static class NETDEV_CLOUD_STORAGE_TYPE_E extends Structure {
		public static final int NETDEV_CLOUD_STORAGE_TYPE_PIC                 = 1;            /* 开启云存储图片告警 */
		public static final int NETDEV_CLOUD_STORAGE_TYPE_VIDEO               = 2;            /* 开启视频回放云存储 */
		public static final int NETDEV_CLOUD_STORAGE_TYPE_PIC_AND_VIDEO       = 3;            /* 开启云存储图片告警及视频回放云存储*/
		public static final int NETDEV_CLOUD_STORAGE_TYPE_INVALID 						 = 4;
	}

	/**
	 * @enum tagPictureFluency
	 * @brief 媒体类型枚举 类型定义
	 * @attention 无
	 */
	public static class NETDEV_MEDIA_MODE_E extends Structure {
		public static final int NETDEV_MEDIA_MODE_LOCAL             = 0;                        /* 本地文件播放 */
		public static final int NETDEV_MEDIA_MODE_REALPLAY          = 1;                        /* 网络流媒体实况播放 */
		public static final int NETDEV_MEDIA_MODE_PLAYBACK          = 2;                        /* 网络流媒体回放播放 */
		public static final int NETDEV_MEDIA_MODE_DOWNLOAD          = 3;                        /* 网络流媒体下载 */
		public static final int NETDEV_MEDIA_MODE_VOICECOM          = 4;                        /* 语音对讲 */
		public static final int NETDEV_MEDIA_MODE_VOICESRV          = 5;                        /* 语音数据服务 */
		public static final int NETDEV_MEDIA_MODE_M3U8PLAY          = 6;                        /* M3u8文件播放 */

		public static final int NETDEV_MEDIA_MODE_UNKNOWN           = 0xff;                      /* 未知模式 */
	}

	/**
	 * @brief 录像查询位置 Video Position
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_POSITION_E extends Structure {
		public static final int NETDEV_POSITION_LOCAL       = 1;            /* 设备自身录像 */
		public static final int NETDEV_POSITION_CHANNEL     = 2;            /* 设备下的通道录像 */
		public static final int NETDEV_POSITION_INVALID		= 0xff;
	}

	/**
	 * @brief 录像状态 Video Status
	 * @attention 无 None
	 */
	public static class NETDEV_VIDEO_STATUS_E extends Structure {
		public static final int NETDEV_VIDEO_NONE       = 0;        /* 无录像 No video */
		public static final int NETDEV_VIDEO_EVENT      = 1;        /* 事件录像 Event video */
		public static final int NETDEV_VIDEO_NORMAL     = 2;        /* 普通录像 Normal video */
		public static final int NETDEV_VIDEO_INVALID	= 0xff;
	}


	/* 响应状态类型枚举  */
	public static class NETDEV_ORG_RESPONSE_STAUTE_E extends Structure {
		public static final int NETDEV_ORG_RESPONSE_SUCCESS           = 0;            /* 响应成功 */
		public static final int NETDEV_ORG_RESPONSE_FAIL              = 1;             /* 响应失败 */
	}


	/**
	 * @brief 传输协议 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_TRANS_PROTOCOL_E extends Structure {
		public static final int NETDEV_TRANS_PROTOCOL_TCP = 0;              /* TCP */
		public static final int NETDEV_TRANS_PROTOCOL_UDP = 1;             /* UDP */
	}

	public static class NETDEV_DEVICE_STATUS_E extends Structure {
		public static final int NETDEV_DEV_STATUS_OFFLINE                   = 0;                /* 离线 */
		public static final int NETDEV_DEV_STATUS_ONLINE                    = 1;                /* 在线 */
		public static final int NETDEV_DEV_STATUS_CONNECTING                = 2;                /* 连接中 */
		public static final int NETDEV_DEV_STATUS_PWD_ERROR                 = 3;                /* 用户名或密码错误 */
		public static final int NETDEV_DEV_STATUS_NOT_SUPPORT               = 4;                /* 设备不支持 */
		public static final int NETDEV_DEV_STATUS_TIMEOUT                   = 5;                /* 设备连接超时 */
		public static final int NETDEV_DEV_STATUS_WEAK_PWD_ERROR            = 6;                /* 远程用户弱密码错误 */
		public static final int NETDEV_DEV_STATUS_NO_DYNAMIC_PWD            = 7;                /* 设备不支持动态密码 */

		public static final int NETDEV_DEV_STATUS_INVALID                   = 0XFF;              /* 无效值 */
	}

	/**
	 * @brief 设备子类型
	 * @attention 无 None
	 */
	public static class NETDEV_DEVICE_SUB_TYPE_E extends Structure {
		public static final int	NETDEV_DTYPE_SUB_NVR                    = 0;                /* NVR */
		public static final int	NETDEV_DTYPE_SUB_IPC                    = 1;                /* IPC */
		public static final int	NETDEV_DTYPE_SUB_DC_INNER               = 2;                /* 内置DC */
		public static final int	NETDEV_DTYPE_SUB_DC_EXT                 = 3;                /* 外置DC */
		public static final int	NETDEV_DTYPE_SUB_EC                     = 4;                /* EC */
		public static final int	NETDEV_DTYPE_SUB_VMS                    = 5;                /* 一体机 */
		public static final int	NETDEV_DTYPE_SUB_DA                     = 6;                /* 代理设备 */
		public static final int	NETDEV_DTYPE_SUB_ADU                    = 7;                /* ADU拼控设备 */
		public static final int	NETDEV_DTYPE_SUB_FISHEYE_IPC            = 8;                /* 鱼眼设备 */
		public static final int	NETDEV_DTYPE_SUB_DECARD                 = 9;                /* 解码卡设备 */
		public static final int	NETDEV_DTYPE_SUB_FACE_IPC               = 10;               /* 人脸识别相机 */
		public static final int	NETDEV_DTYPE_SUB_ALARMHOST              = 11;               /* 报警主机设备 */
		public static final int	NETDEV_DTYPE_SUB_ACS                    = 12;               /* 第三方门禁设备 */
		public static final int	NETDEV_DTYPE_SUB_FG                     = 13;               /* 人脸速通门设备*/
		public static final int	NETDEV_DTYPE_SUB_FACE_ACS               = 14;               /* 人脸门禁设备 */
		public static final int	NETDEV_DTYPE_SUB_PRIVATE_GENERAL_ACS    = 15;               /* 我司通用门禁设备 */
		public static final int	NETDEV_DTYPE_SUB_PRIVATE_ALARMHOST      = 16;               /* 我司报警主机设备 */
		public static final int	NETDEV_DTYPE_SUB_LOCK_WIFI              = 17;               /* WIFI锁*/
		public static final int NETDEV_DTYPE_SUB_LOCK_NBIoT             = 18;               /* NBIoT锁 */
		public static final int NETDEV_DTYPE_SUB_ID_RECOGNIZE           = 19;               /* 人证识别设备 */

		public static final int	NETDEV_DTYPE_SUB_UNKNOW                 = 0xFF;              /* 未知设备 */
	}

	public static class NETDEV_ACCESS_PROTOCOL_E extends Structure {
		public static final int NETDEV_ACCESS_PROTOCOL_ONVIF                = 1;                /* onvif协议 */
		public static final int NETDEV_ACCESS_PROTOCOL_PRIVATER             = 2;                /* 私有协议 */
		public static final int NETDEV_ACCESS_PROTOCOL_GB                   = 3;                /* 国标 */
		public static final int NETDEV_ACCESS_PROTOCOL_RTSP					= 4;				/* RTSP */
		public static final int NETDEV_ACCESS_PROTOCOL_BAOXIN               = 5;                /* 宝信协议 */
		public static final int NETDEV_ACCESS_PROTOCOL_INVALID              = 0xFF;              /* 无效值 */
	}

	public static class NETDEV_DEVICE_ACCESS_MODE_E extends Structure {
		public static final int NETDEV_DEV_ACCESS_MODE_IP_DOMAIN            = 0;                /* IP、域名接入 */
		public static final int NETDEV_DEV_ACCESS_MODE_P2P                  = 1;                /* P2P接入 */
		public static final int NETDEV_DEV_ACCESS_MODE_UNP                  = 2;                /* UNP接入 */

		public static final int NETDEV_DEV_ACCESS_MODE_INVALID              = 0XFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVProtocal
	 * @brief 媒体传输协议 枚举 定义  Media transport protocol Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_TRANS_PROTOCAL_E extends Structure {
		public static final int NETDEV_TRANS_PROTOCAL_UDP     = 0;            /* UDP */
		public static final int NETDEV_TRANS_PROTOCAL_TCP     = 1;             /* TCP */
	}

	/**
	 * @brief 启流模式 枚举 定义  start stream mode Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_STREAM_MODE_E extends Structure {
		public static final int NETDEV_STREAM_MODE_ALL      = 0x0000;   /* 音频 + 视频 audio & Video */
		public static final int NETDEV_STREAM_MODE_VIDEO    = 0x8000;    /* 仅视频 only video */
	}

	/* 传输类型 */
	public static class NETDEV_TRANS_TYPE_E extends Structure {
		public static final int NETDEV_TRANS_TYPE_FORWORD     = 0;                        /* 一体机转发 */
		public static final int NETDEV_TRANS_TYPE_STRAIGHT    = 1;                         /* 下行设备直连*/
	}

	/**
	 * @brief 图像扩展编码模式类型 枚举 定义 Enumeration of smart image encoding mode
	 * @attention 无 None
	 */
	public static class NETDEV_SMART_ENCODE_MODE_E extends Structure {
		public static final int NETDEV_SMART_ENCODE_MODE_OFF      = 0;      /* 关闭 Off*/
		public static final int NETDEV_SMART_ENCODE_MODE_BASIC    = 1;      /* 基础智能编码模式 Basic mode*/
		public static final int NETDEV_SMART_ENCODE_MODE_ADVANCED = 2;          				/* 高级智能编码模式 Advanced mode*/
	}

	/**
	 * @brief OSD字体形式枚举  Enumeration of OSD font style
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_FONT_STYLE_E extends Structure {
		public static final int NETDEV_OSD_FONT_STYLE_BACKGROUND    = 0;                  /* 背景 Background*/
		public static final int NETDEV_OSD_FONT_STYLE_STROKE        = 1;                  /* 描边 Stroke*/
		public static final int NETDEV_OSD_FONT_STYLE_HOLLOW        = 2;                  /* 空心 Hollow*/
		public static final int NETDEV_OSD_FONT_STYLE_NORMAL        = 3;                   /* 正常 Normal*/
	}

	/**
	 * @brief OSD字体大小枚举  Enumeration of OSD font size
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_FONT_SIZE_E extends Structure {
		public static final int NETDEV_OSD_FONT_SIZE_LARGE      = 0;                  /* 特大 X-large*/
		public static final int NETDEV_OSD_FONT_SIZE_BIG        = 1;                  /* 大 Large*/
		public static final int NETDEV_OSD_FONT_SIZE_MEDIUM     = 2;                  /* 中 Medium*/
		public static final int NETDEV_OSD_FONT_SIZE_SMALL      = 3;                   /* 小 Small*/
	}

	/**
	 * @brief 日期格式 枚举 定义 Enumeration of date format
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_DATE_FORMAT_E extends Structure {
		public static final int	NETDEV_OSD_DATE_FORMAT_YYYY_MMDD                = 0;           /* yyyy-MM-dd */
		public static final int	NETDEV_OSD_DATE_FORMAT_MMDD_YYYY                = 1;           /* MM-dd-yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_CHINESE_YYYY_MMDD        = 2;           /* yyyy年MM月dd日 yyyy/MM/dd*/
		public static final int	NETDEV_OSD_DATE_FORMAT_CHINESE_MMDD_YYYY        = 3;           /* MM月dd日yyyy年 MM/dd/yyyy*/
		public static final int	NETDEV_OSD_DATE_FORMAT_CHINESE_YYY_MMDD_X       = 4;           /*  yyyy年MM月dd日 星期X。 dddd yyyy MM dd*/
		public static final int	NETDEV_OSD_DATE_FORMAT_CHINESE_MMDD_YYYY_X      = 5;           /* MM月dd日yyyy年 星期X。 dddd MM dd yyyy*/
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_DDMM_YYYY        = 100;         /* dd/MM/yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_MMDD_YYYY        = 101;         /* MM/dd/yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_DDMMMM_YYYY      = 102;         /* dd MMMM, yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_MMMMDD_YYYY      = 103;         /* MMMM dd, yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_DDDDDDMMMM_YYYY  = 104;         /* dddd, dd MMMM, yyyy  */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_DDDDDDMMMM_DDYYYY = 105;        /* dddd, MMMM dd, yyyy */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_YYYY_MMDD        = 106;         /*  yyyy/MM/dd */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_YYYY_MMMMDD      = 107;         /*  yyyy, MMMM dd */
		public static final int	NETDEV_OSD_DATE_FORMAT_ENGLISH_DDDDYY_MMDD      = 108;         /*  dddd, yy, MM dd */
	}

	/**
	 * @brief OSD时间格式枚举  Enumeration of OSD time format
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_TIME_FORMAT_E extends Structure {
		public static final int NETDEV_OSD_TIME_FORMAT_HHMMSS         = 0;                  /* HH:mm:ss */
		public static final int NETDEV_OSD_TIME_FORMAT_HH_MM_SS_T     = 1;                  /* hh:mm:ss t.t. */
		public static final int NETDEV_OSD_TIME_FORMAT_HH_MM_SS_TT    = 2;                  /* hh:mm:ss tt */
		public static final int NETDEV_OSD_TIME_FORMAT_TT_HH_MM_SS    = 3;                  /*  tt hh:mm:ss */
		public static final int NETDEV_OSD_TIME_FORMAT_PM_HH_MM_SS    = 4;                  /* 下午 hh:mm:ss  P.M. hh:mm:ss*/
		public static final int NETDEV_OSD_TIME_FORMAT_HH_MM_SS_XX    = 5;                  /* HH:mm:ss.xxx */
		public static final int NETDEV_OSD_TIME_FORMAT_HH_MM_SS_XX_TT = 6;                   /* hh:mm:ss.xxx tt */

	}

	/**
	 * @brief OSD区域内对齐枚举  Enumeration of OSD align
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_ALIGN_E extends Structure {
		public static final int NETDEV_OSD_ALIGN_LEFT       = 0;               /* 左对齐 Left*/
		public static final int NETDEV_OSD_ALIGN_RIGHT      = 1;                /* 右对齐 Right*/
	}

	/**
	 * @brief OSD字体大小枚举  Enumeration of OSD font size
	 * @attention 无 None
	 */
	public static class NETDEV_OSD_MIN_MARGIN_E extends Structure {
		public static final int NETDEV_OSD_MIN_MARGIN_NONE    = 0;               /* 无 None*/
		public static final int NETDEV_OSD_MIN_MARGIN_SINGLE  = 1;               /* 一个字符宽度 One char width*/
		public static final int NETDEV_OSD_MIN_MARGIN_DOUBLE  = 2;                /* 两个字符宽度 Two char width*/
	}

	/**
	 * @brief 录像存储类型 枚举 定义 Recording storage type Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_PLAN_STORE_TYPE_E extends Structure {
		public static final int NETDEV_TYPE_STORE_TYPE_ALL                  = 0;            /* 常规存储  All */

		public static final int NETDEV_EVENT_STORE_TYPE_NORMAL              = 1;            /* 常规存储，携带文件大小,  All */
		public static final int NETDEV_EVENT_STORE_TYPE_MOTIONDETECTION     = 4;            /* 运动检测事件存储，携带文件大小  Motion detection */
		public static final int NETDEV_EVENT_STORE_TYPE_DIGITALINPUT        = 5;            /* 数字输入事件存储，携带文件大小  Digital input */
		public static final int NETDEV_EVENT_STORE_TYPE_VIDEOLOSS           = 7;            /* 视频丢失事件存储，携带文件大小  Video loss */

		public static final int NETDEV_TYPE_STORE_TYPE_INVALID              = 0xFF;          /* 无效值  Invalid value */
	}

	/**
	 * @enum tagNETDEVShutterTimeRange
	 * @brief 快门时间支持的取值 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_SHUTTER_TIME_RANGE_E extends Structure {
		public static final int	NETDEV_SHUTTER_TIME_AUTOMATIC   = 0;            /* 快门时间为自动*/
		public static final int	NETDEV_SHUTTER_TIME_1           = 1;            /* 1/1 */
		public static final int	NETDEV_SHUTTER_TIME_1_2         = 2;            /* 1/2 */
		public static final int	NETDEV_SHUTTER_TIME_1_3         = 3;            /* 1/3 */
		public static final int	NETDEV_SHUTTER_TIME_1_4         = 4;            /* 1/4 */
		public static final int	NETDEV_SHUTTER_TIME_1_6         = 6;            /* 1/6 */
		public static final int	NETDEV_SHUTTER_TIME_1_8         = 8;            /* 1/8 */
		public static final int	NETDEV_SHUTTER_TIME_1_10        = 10;           /* 1/10*/
		public static final int	NETDEV_SHUTTER_TIME_1_12        = 12;           /* 1/12*/
		public static final int	NETDEV_SHUTTER_TIME_1_15        = 15;           /* 1/15*/
		public static final int	NETDEV_SHUTTER_TIME_1_20        = 20;           /* 1/20*/
		public static final int	NETDEV_SHUTTER_TIME_1_25        = 25;           /* 1/25*/
		public static final int	NETDEV_SHUTTER_TIME_1_30        = 30;           /* 1/30*/
		public static final int	NETDEV_SHUTTER_TIME_1_50        = 50;           /* 1/50*/
		public static final int	NETDEV_SHUTTER_TIME_1_60        = 60;           /* 1/60*/
		public static final int	NETDEV_SHUTTER_TIME_1_100       = 100;          /* 1/100*/
		public static final int	NETDEV_SHUTTER_TIME_1_120       = 120;          /* 1/120*/
		public static final int	NETDEV_SHUTTER_TIME_1_150       = 150;          /* 1/150*/
		public static final int	NETDEV_SHUTTER_TIME_1_180       = 180;          /* 1/180*/
		public static final int	NETDEV_SHUTTER_TIME_1_200       = 200;          /* 1/200*/
		public static final int	NETDEV_SHUTTER_TIME_1_250       = 250;          /* 1/250*/
		public static final int	NETDEV_SHUTTER_TIME_1_500       = 500;          /* 1/500*/
		public static final int	NETDEV_SHUTTER_TIME_1_1000      = 1000;         /* 1/1000*/
		public static final int	NETDEV_SHUTTER_TIME_1_2000      = 2000;         /* 1/2000*/
		public static final int	NETDEV_SHUTTER_TIME_1_4000      = 4000;         /* 1/4000*/
		public static final int	NETDEV_SHUTTER_TIME_1_8000      = 8000;         /* 1/8000*/
		public static final int	NETDEV_SHUTTER_TIME_1_50000     = 50000;        /* 1/50000*/
		public static final int	NETDEV_SHUTTER_TIME_1_100000    = 100000;       /* 1/100000*/

		public static final int NETDEV_SHUTTER_TIME_INVALID = 0xFF;                  /* 无效值 */
	}

	/**
	 * @enum tagNETDEVWideDynamicMode
	 * @brief 测光控制模式 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_WIDE_DYNAMIC_MODE_E extends Structure {
		public static final int NETDEV_WDM_CLOSED   = 0;    /* 关闭*/
		public static final int NETDEV_WDM_OPEN     = 1;    /* 开启*/
		public static final int NETDEV_WDM_AUTO     = 2;    /* 自动*/

		public static final int NETDEV_WDM_INVALID  = 0xFF;  /* 无效值 */
	}

	/**
	 * @enum tagNETDEVLampType
	 * @brief 昼夜模式类型 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_DAY_NIGHT_MODE_E extends Structure {
		public static final int NETDEV_DNM_AUTO                     = 0;        /* 自动模式*/
		public static final int NETDEV_DNM_DAY_COLOR                = 1;        /* 白天--彩色 */
		public static final int NETDEV_DNM_NIGHT_BAW                = 2;        /* 夜晚--黑白 */
		public static final int NETDEV_DNM_LINK_COLOR_TO_BLACK      = 3;        /* 联动彩转黑*/

		public static final int NETDEV_DNM_INVALID                  = 0xFF;      /* 无效值 */
	}

	/**
	 * @enum tagNETDEVWhiteBalance
	 * @brief 白平衡模式 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_WHITE_BALANCE_MODE_E extends Structure {
		public static final int NETDEV_WBM_AUTO                         = 0;        /*自动模式*/
		public static final int NETDEV_WBM_TRIMMING                     = 1;        /*微调模式*/
		public static final int NETDEV_WBM_INDOOR                       = 2;        /*室内模式*/
		public static final int NETDEV_WBM_OUTDOOR                      = 3;        /*室外模式*/
		public static final int NETDEV_WBM_AUTO_MERCURY_LAMP            = 4;        /*自动水银灯模式*/
		public static final int NETDEV_WBM_NIGHT_TRIMMING               = 5;        /*夜间微调模式*/
		public static final int NETDEV_WBM_AUTO_NA_LAMP                 = 6;        /*自动钠灯模式*/
		public static final int NETDEV_WBM_LOCK                         = 7;        /*锁定模式*/
		public static final int NETDEV_WBM_SELF_ADAPT_NIGHT_TRIMMING    = 8;        /*自适应夜间微调模式*/
		public static final int NETDEV_WBM_AUTO_SECOND                  = 9;        /*自动模式2*/
		public static final int NETDEV_WBM_INVALID                      = 0xFF;      /* 无效值 */
	}

	/**
	 * @brief 聚焦模式枚举  Focus mode
	 * @attention 无 None
	 */
	public static class NETDEV_FOCUS_MODE_E extends Structure {
		public static final int NETDEV_FOCUS_AUTO           = 1;            /* 自动聚焦 Auto */
		public static final int NETDEV_FOCUS_MANUAL         = 2;             /* 手动聚焦 Manual */
	}

	/**
	 * @brief 昼夜模式 IRCut filter mode
	 * @attention 无 None
	 */
	public static class NETDEV_IR_CUT_FILTER_MODE_E extends Structure {
		public static final int NETDEV_IR_CUT_FILTER_ON     = 0;            /* 白天模式 On */
		public static final int NETDEV_IR_CUT_FILTER_OFF    = 1;            /* 夜晚模式 Off */
		public static final int NETDEV_IR_CUT_FILTER_AUTO   = 2;             /* 自动模式 Auto */
	}

	/**
	 * @brief 透雾模式枚举  Defogging mode
	 * @attention 无 None
	 */
	public static class NETDEV_DEFOGGING_MODE_E extends Structure {
		public static final int NETDEV_DEFOGGING_ON = 0;            /* 开 On */
		public static final int NETDEV_DEFOGGING_OFF = 1;                /* 关 Off */
	}

	/* 音频输入模式枚举  */
	public static class NETDEV_AUDIO_CHL_MODE_E extends Structure {
		public static final int NETDEV_AUDIO_CHL_MODE_LINE              = 0;        /* LINE */
		public static final int NETDEV_AUDIO_CHL_MODE_MIC               = 1;        /*  MIC */
		public static final int NETDEV_AUDIO_CHL_MODE_RS485             = 2;        /* RS485数字拾音器 */
		public static final int NETDEV_AUDIO_CHL_MODE_SPEAKER           = 3;        /* SpeaKer */
		public static final int NETDEV_AUDIO_CHL_MODE_INVALID           = 0xFF;      /* 无效值 */
	}

	/* 音频采集口枚举  */
	public static class NETDEV_AUDIO_COLLECTION_PORT_TYPE_E extends Structure {
		public static final int NETDEV_AUDIO_COLLECTION_PORT_TYPE_AUDIO_IN              = 0;        /* 音频输入口 */
		public static final int NETDEV_AUDIO_COLLECTION_PORT_TYPE_SERIAL_IN             = 1;        /* 串口 */
		public static final int NETDEV_AUDIO_COLLECTION_PORT_TYPE_INVALID               = 0xFF;      /* 无效值 */
	}


	/* 音频编码格式类型枚举  */
	public static class NETDEV_AUDIO_ENCODE_FORMAT_TYPE_E extends Structure {
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_MPEG1           = 0;       /* MPEG1 */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_G711A           = 1;       /* G.711A */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_G711U           = 2;       /* G.711U */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_ADPCM           = 3;       /* ADPCM */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_OGG             = 4;       /* OGG */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_Auto            = 5;       /* Auto */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_AACLC           = 6;       /* AAC-LC */
		public static final int NETDEV_AUDIO_ENCODE_FORMAT_TYPE_INVALID         = 0xFF;     /* 无效值 */
	}

	/* 音频采样率枚举  */
	public static class NETDEV_AUDIO_SAMPLING_RATE_E extends Structure {
		public static final int NETDEV_AUDIO_SAMPLING_RATE_8KHZ             = 0;       /* 8KHz */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_16KHZ            = 1;       /* 16KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_22_05KHZ         = 2;       /* 22.05KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_24KHZ            = 3;       /* 24KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_32KHZ            = 4;       /* 32KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_44_1KHZ          = 5;       /* 44.1KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_48KHZ            = 6;       /* 48KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_96KHZ            = 7;       /* 96KHZ */
		public static final int NETDEV_AUDIO_SAMPLING_RATE_INVALID          = 0xFF;     /* 无效值 */
	}

	/**
	 * @enum  tagNETDEVMotionDetectAreaType
	 * @brief 运动检测区域类型枚举  motion detection area type emnu
	 * @attention 无
	 */
	public static class NETDEV_MOTION_DETECTION_AREA_TYPE_E extends Structure {
		public static final int NETDEV_MOTION_DETECTION_AREA_TYPE_RECTANGLE         = 0;        /* 矩形区域  rectangle */
		public static final int NETDEV_MOTION_DETECTION_AREA_TYPE_MB                = 1;        /* 宏块区域  macro block */
		public static final int NETDEV_MOTION_DETECTION_AREA_TYPE_INVALID           = 0xff;      /* 无效值 Invalid value */
	}


	/**
	 * @enum tagNETDEVHDDType
	 * @brief 磁盘类型
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_TYPE_E extends Structure {
		public static final int NETDEV_HDD_TYPE_LOCAL_HDD       = 0;            /* LocalHDD */
		public static final int NETDEV_HDD_TYPE_NO1_EXTEND_HDD  = 1;            /* No1ExtendCabinetHDD */
		public static final int NETDEV_HDD_TYPE_NO2_EXTEND_HDD  = 2;            /* No2ExtendCabinetHDD */

		public static final int NETDEV_HDD_TYPE_INVALID = 0xFF;                  /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDWorkMode
	 * @brief 磁盘工作模式
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_WORK_MODE_E extends Structure {
		public static final int NETDEV_HDD_WORK_MODE_COMMON     = 0;        /* 普通盘 */
		public static final int NETDEV_HDD_WORK_MODE_RAID       = 1;        /* 阵列盘 */
		public static final int NETDEV_HDD_WORK_MODE_HOT_BACKUP = 2;        /* 热备盘 */

		public static final int NETDEV_HDD_WORK_MODE_INVALID    = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDStatus
	 * @brief 磁盘状态
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_STATUS_E extends Structure {
		public static final int NETDEV_HDD_STATUS_NO        = 0;            /* 无硬盘 */
		public static final int NETDEV_HDD_STATUS_NORMAL    = 1;            /* 正常 */
		public static final int NETDEV_HDD_STATUS_ABNORMAL  = 2;            /* 异常 */

		public static final int NETDEV_HDD_STATUS_INVALID = 0xFF;            /* Invalid value */
	}

	/**
	 * @brief 地址类型 枚举 定义
	 * @attention 无 None
	 */
	public static class NETDEV_ADDR_TYPE_E extends Structure {
		public static final int NETDEV_ADDR_TYPE_IPV4       = 0;             /* IPV4 */
		public static final int NETDEV_ADDR_TYPE_IPV6       = 1;             /* IPV6 */
		public static final int NETDEV_ADDR_TYPE_DOMAIN     = 2;             /* 域名 */
		public static final int NETDEV_ADDR_TYPE_IPV4_IPV6  = 3;             /* IPV4和IPV6都需要 */
		public static final int NETDEV_ADDR_TYPE_INVALID    = 0XFFFF;         /* 无效值 */
	}

	/**
	 * @enum tagNETDEVStorageContainerUsageType
	 * @brief 存储容器用途
	 * @attention 无 None
	 */
	public static class NETDEV_STORAGE_CONTAINER_USAGE_TYPE_E extends Structure {
		public static final int NETDEV_STORAGE_CONTAINER_USAGE_TYPE_RECORD_CAPTURE   = 0;        /* 录像/抓图 */
		public static final int NETDEV_STORAGE_CONTAINER_USAGE_TYPE_BACKUP           = 1;        /* 备份 */

		public static final int NETDEV_STORAGE_CONTAINER_USAGE_TYPE_INVALID          = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVStorageContainerStatus
	 * @brief 存储容器状态
	 * @attention 无 None
	 */
	public static class NETDEV_STORAGE_CONTAINER_STATUS_E extends Structure {
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_NO                      = 0;            /* 无硬盘/空闲 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_UNFORMATTED             = 1;            /* 未格式化 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_FORMATTING       = 2;            /* 正在格式化 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_NORMAL           = 3;            /* 硬盘状态良好 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_SLEEP            = 4;            /* 休眠 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_ABNORMAL                = 5;            /* 异常 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_SWITCH           = 6;            /* 切换中 */
		public static final int NETDEV_STORAGE_CONTAINER_STATUS_UNINSTALLED      = 7;            /* 已卸载 */

		public static final int NETDEV_STORAGE_CONTAINER_STATUS_INVALID                 = 0xFF;          /* Invalid value */
	}

	/**
	 * @enum tagNETDEVStorageContainerProperty
	 * @brief 存储容器属性
	 * @attention 无 None
	 */
	public static class NETDEV_STORAGE_CONTAINER_PROPERTY_E extends Structure {
		public static final int NETDEV_STORAGE_CONTAINER_PROPERTY_RW                = 0;            /* 读写 */
		public static final int NETDEV_STORAGE_CONTAINER_PROPERTY_R                 = 1;            /* 只读 */
		public static final int NETDEV_STORAGE_CONTAINER_PROPERTY_REDUNDANT         = 2;            /* 冗余 */

		public static final int NETDEV_STORAGE_CONTAINER_PROPERTY_INVALID           = 0xFF;          /* Invalid value */
	}

	/**
	 * @enum tagNETDEVPhotoServerProType
	 * @brief 照片服务器通信协议类型
	 * @attention 无 None
	 */
	public static class NETDEV_PHOTO_SERVER_PRO_TYPE_E extends Structure {
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO1          = 0;        /* TCP传输: 我司V1（对应泓鎏） */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO2          = 1;        /* TCP传输: 我司V2（对应当前tms） */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO3          = 2;        /* TCP传输: 先创 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO4          = 3;        /* FTP传输: 泉视通 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO5          = 4;        /* FTP传输: 通用FTP */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO6          = 5;        /* FTP传输: 正直 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO7          = 6;        /* webserver: 海康协议 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO8          = 7;        /* FTP传输: 中通 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO9          = 8;        /* FTP传输: 泉视通2 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO10          = 9;       /* 银江，照片信息webserver 照片数据FTP传输 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO11          = 10;      /* TCP传输:立元 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO12          = 11;      /* 翔讯，照片信息TCP 照片数据FTP传输 */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO31          = 12;      /* TCP传输: 我司V2（对应当前tms短连接） */
		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_PRO34          = 13;      /* HTTP传输: 松立 */

		public static final int NETDEV_PHOTO_SERVER_PRO_TYPE_INVALID        = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVPhotoServerSubProtocolType
	 * @brief 照片服务器通信子协议类型
	 * @attention 无 None
	 */
	public static class NETDEV_PHOTO_SERVER_SUBPRO_TYPE_E extends Structure {
		public static final int NETDEV_PHOTO_SERVER_SUBPRO_TYPE_2011          = 0;        /* 我司智慧物联2011命令 */
		public static final int NETDEV_PHOTO_SERVER_SUBPRO_TYPE_2025          = 1;        /* 我司智慧物联2025命令 */
		public static final int NETDEV_PHOTO_SERVER_SUBPRO_TYPE_6130          = 2;        /* 我司智慧物联6130命令 */


		public static final int NETDEV_PHOTO_SERVER_SUBPRO_TYPE_INVALID        = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDSmartAssessmentStatus
	 * @brief 硬盘Smart评估状态
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_SMART_ASSESSMENT_STATUS_E extends Structure {
		public static final int NETDEV_HDD_SMART_ASSESSMENT_STATUS_NORMAL       = 0;        /* 良好 */
		public static final int NETDEV_HDD_SMART_ASSESSMENT_STATUS_WARNING      = 1;        /* 警告 */
		public static final int NETDEV_HDD_SMART_ASSESSMENT_STATUS_FAULT        = 2;        /* 故障 */

		public static final int NETDEV_HDD_SMART_ASSESSMENT_STATUS_INVALID      = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDHealthAssessmentStatus
	 * @brief 硬盘健康评估状态
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_E extends Structure {
		public static final int NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_NORMAL           = 0;        /* 健康状态良好 */
		public static final int NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_PART_DAMAGE      = 1;        /* 存在坏扇区 */
		public static final int NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_FAULT            = 2;        /* 故障 */

		public static final int NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_INVALID        = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDSmartCheckStatus
	 * @brief 硬盘Smart检测状态
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_SMART_CHECK_STATUS_E extends Structure {
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_NOT                = 0;        /* 未检测 */
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_IN_PORGRESS        = 1;        /* 正在自检 */
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_SUCCESS            = 2;        /* 自检成功 */
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_RECOGNITION_FAIL   = 3;        /* 硬盘识别失败 */
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_FAIL               = 4;        /* SMART自检失败 */
		public static final int NETDEV_HDD_SMART_CHECK_STATUS_NOT_SUPPORT        = 5;        /* 硬盘不支持检测 */

		public static final int NETDEV_HDD_SMART_CHECK_STATUS_INVALID            = 0xFF;      /* Invalid value */
	}

	/**
	 * @enum tagNETDEVHDDSmartCheckType
	 * @brief 硬盘Smart检测类型
	 * @attention 无 None
	 */
	public static class NETDEV_HDD_SMART_CHECK_TYPE_E extends Structure {
		public static final int NETDEV_HDD_SMART_CHECK_TYPE_BRIEF          = 0;        /* 简短型 */
		public static final int NETDEV_HDD_SMART_CHECK_TYPE_EXTEND         = 1;        /* 扩展型 */
		public static final int NETDEV_HDD_SMART_CHECK_TYPE_TRANSMISSION   = 2;        /* 传输型 */

		public static final int NETDEV_HDD_SMART_CHECK_TYPE_INVALID        = 0xFF;      /* Invalid value */
	}

	/**
	 * @brief 日志主类型枚举  枚举 定义 Major types of logs Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_LOG_MAIN_TYPE_E extends Structure {
		/* 仅NVR支持 */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALL                                        = 0;                /* 全部类型的日志 NVR Logs of all types */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM                                      = 1;                /* 告警类  Alarms */
		public static final int	NETDEV_LOG_MAIN_TYPE_EXCEPTION                                  = 2;                /* 异常类  Exceptions */
		public static final int	NETDEV_LOG_MAIN_TYPE_OPERATION                                  = 3;                /* 操作类  Operations */
		public static final int	NETDEV_LOG_MAIN_TYPE_MESSAGE                                    = 4;                /* 信息类  Messages */

		/* VMS操作日志主类型*/
		public static final int	NETDEV_LOG_MAIN_TYPE_VMS_ALL                                    =  90;              /* 全部主类型 VMS Logs of all types */
		public static final int	NETDEV_LOG_MAIN_TYPE_LOGIN                                      =  91;              /* 登录 Login */

		public static final int	NETDEV_LOG_MAIN_TYPE_ORGANIZATION_CONFIG                        = 100;              /* 组织配置 Organization Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_USER_CONFIG                                = 101;              /* 用户配置 User Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ROLE_CONFIG                                = 102;              /* 角色配置 Role Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DEVICE_CONFIG                              = 103;              /* 设备配置 Device Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_CHANNE_LCONFIG                             = 104;              /* 通道配置 Channel Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SERVER_CONFIG                              = 105;              /* 主从服务器配置 Server Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_PTZ_CONFIG                                 = 106;              /* 云台配置 PTZ Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_VIDEOWALL_CONFIG                           = 107;              /* 电视墙配置 Video Wall Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_EMAP_CONFIG                                = 108;              /* 地图配置 EMap Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SYSTEM_CONFIG                              = 109;              /* 系统配置(含基本配置、硬盘配置、网络配置和系统维护) System Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SEQUENCE_PLAN_CONFIG                       = 110;              /* 轮巡预案配置 Sequence Plan Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_NETWORK_KEYPAD_CONFIG                      = 111;              /* 网络键盘通道配置 Network Keypad Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SEQUENCE_RESOURCE_CONFIG                   = 112;              /* 轮巡资源配置 Sequence Resource Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_HOT_SPOT_AND_ZONE_CONFIG                   = 113;              /* 热点、热区配置 Hot Spot And Zone Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_USER_TIME_TEMPLATE_CONFIG                  = 114;              /* 用户时间模板配置 User Time Template Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SERVER_WORK_MODE                           = 115;              /* 服务器工作模式配置 Server Work Mode */
		public static final int	NETDEV_LOG_MAIN_TYPE_PERMISSION_TIME_TEMPLATE_CONFIG            = 116;              /* 权限时间模板配置 Permission Time Template Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_TIME_CONFIG                                = 117;              /* 手动时间配置 Time Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_TIMESYNC_CONFIG                            = 118;              /* 时间同步 Time Sync Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_HOLIDAY_CONFIG                             = 119;              /* 假日启动时间 Holiday Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_NTPTIME_CONFIG                             = 120;              /* NTP时间配置 NTP Time Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DST_CONFIG                                 = 121;              /* 夏令时配置 DST Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_RESRELATION_CONFIG                         = 122;              /* 关联资源配置 Resource Relation Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DEVICE_TIME_SYNC                           = 123;              /* 设备时间同步 Device Time Sync */
		public static final int	NETDEV_LOG_MAIN_TYPE_TCPIP_CONFIG                               = 124;              /* tcp/ip TCP/IP Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_EZCLOUD_CONFIG                             = 125;              /* 云服务 EZCloud Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DDNS_CONFIG                                = 126;              /* DDNS DDNS Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_PORT_CONFIG                                = 127;              /* 端口 Port Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_PORTMAPPING_CONFIG                         = 128;              /* 端口映射 Port Mapping Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_EMAIL_CONFIG                               = 129;              /* 邮件 Email Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_GBSERVER_CONFIG                            = 130;              /* 国标服务器配置 GB Server Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_GBT28181_LOCAL_CONFIG                      = 131;              /* 本地服务器配置 GBT28181 Local Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_UNP_CLIENT_CONFIG                          = 132;              /* UNP客户端 UNP Client Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_UNP_SERVER_CONFIG                          = 133;              /* UNP服务器 UNP Server Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_STATIC_ROUTE_CONFIG                        = 134;              /* 静态路由操作 Static Route Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_802DOT1X_CONFIG                            = 135;              /* 8021X 802Dot1x Config" */
		public static final int	NETDEV_LOG_MAIN_TYPE_ARP_CONFIG                                 = 136;              /* ARP ARP Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_HTTPS_CONFIG                               = 137;              /* https HTTPS Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_TELNET_CONFIG                              = 138;              /* telnet Telnet Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SECURITY_PSW_CONFIG                        = 139;              /* 安全密码 Security Passwd Config */

		public static final int	NETDEV_LOG_MAIN_TYPE_IP_FILTER_RULE_CONFIG                      = 140;              /* IP过滤规则配置 IP Filter Rule Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_MAINTENANCE_CONFIG                         = 141;              /* 系统维护 Maintenance Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_SET_MAX_LOG_RETENTION_TIME                 = 142;              /* 日志清理天数配置 Set Max Log Retention Time */
		public static final int	NETDEV_LOG_MAIN_TYPE_STREAM_TRANSMISSION_POLICY_CONFIG          = 143;              /* 媒体流传输策略配置 Stream Transmission Policy Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_BATCH_CONFIG                               = 144;              /* 批量配置 Batch Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_RAIDMODE_CONFIG                            = 145;              /* RAID模式配置 RAID Mode Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ARRAY_CONFIG                               = 146;              /* 阵列配置 Array Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DISK_MANAGEMENT_CONFIG                     = 147;              /* 硬盘管理 Disk Management Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_CHANNEL_SPACE_CONFIG                       = 148;              /* 通道容量配置 Channel Space Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_OVER_WRITE_POLICY_CONFIG                   = 149;              /* 满策略配置 Overwrite Policy Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DISKTEST_CONFIG                            = 150;              /* 硬盘检测配置 Disk Test Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_NET_DISK_CONFIG                            = 151;              /* 网络硬盘配置 Net Disk Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_RECORDING_SCHEDULE_CONFIG                  = 152;              /* 录像计划配置 Recording Schedule Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_RECORDING_TIME_TEMPLATE_CONFIG             = 153;              /* 录像时间模板 Recording Time Template Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM_CONFIG                               = 154;              /* 告警配置 Alarm Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM_TIMETEMPLATE_CONFIG                  = 155;              /* 告警时间模板 Alarm Time Template Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_CONTACT_CONFIG                             = 156;              /* 联系人配置 Contact Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM_TO_VIDEO_WALL_CONFIG                 = 157;              /* 告警联动上墙配置 Alarmto Video Wall Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_VIDEO_WALL_SCENE_CONFIG                    = 158;              /* 电视墙场景配置 Video Wall Scene Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_VIDEO_WALL_WINDOW_CONFIG                   = 159;              /* 电视墙窗口配置 Video Wall Window Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_VIDEO_WALL_VIRTUALLED_CONFIG               = 160;              /* 电视墙虚拟LED配置 Video Wall Virtual LED Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_EXTERNAL_ALARM_CONFIG                      = 161;              /* 紧急铃配置  External Alarm Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_DISK_GROUP_CONFIG                          = 162;              /* 盘组配置 Disk Group Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_BK_PLAN_CONFIG                             = 163;              /* 备份计划 BK Plan Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_BK_TASK_CONFIG                             = 164;              /* 备份任务 BK Task Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_LOCAL_BK_TASKCONFIG                        = 165;              /* 本地备份任务 Local BK Task Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_TVWALL_AUDIO_CONFIG                        = 166;              /* 电视墙音频输出配置 Tvwall Audio Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_LIVEVIEW                                   = 167;              /* 实况预览操作 Live View */
		public static final int	NETDEV_LOG_MAIN_TYPE_PLAYBACK                                   = 168;              /* 录像回放操作 Playback */
		public static final int	NETDEV_LOG_MAIN_TYPE_TWO_WAY_AUDIO                              = 169;              /* 语音操作 Two Way Audio */
		public static final int	NETDEV_LOG_MAIN_TYPE_PTZ                                        = 170;              /* 云台操作 PTZ */
		public static final int	NETDEV_LOG_MAIN_TYPE_DOWNLOAD                                   = 171;              /* 下载操作 Download */
		public static final int	NETDEV_LOG_MAIN_TYPE_LIVEVIEW_ON_VIDEO_WALL                     = 172;              /* 实况上墙操作 Live Viewon Video Wall */
		public static final int	NETDEV_LOG_MAIN_TYPE_PLAYBACK_ON_VIDEO_WALL                     = 173;              /* 回放上墙操作 Playback On Video Wall */
		public static final int	NETDEV_LOG_MAIN_TYPE_EMAP_OPERATION                             = 174;              /* 电子地图操作 EMap Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_DC_SEQUENCE_OPERATION                      = 175;              /* DC轮巡业务操作 DC Sequence Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_VIDEO_WALL_PLAYING_BY_NETWROK_KEYPAD       = 176;              /* 网络键盘操作实况上墙 Video Wall Playing by Netwrok Keypad */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM_TO_VIDEO_WALL                        = 177;              /* 报警联动上墙操作 Alarm to Video Wall */
		public static final int	NETDEV_LOG_MAIN_TYPE_ALARM_SUBSCRIPTION                         = 178;              /* 告警订阅 Alarm Subscription */
		public static final int	NETDEV_LOG_MAIN_TYPE_PRESET_PATROL_CONFIG                       = 179;              /* 预置位巡航配置 Preset Patrol Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_AUTOGUARD_CONFIG                           = 180;              /* 守望配置 Auto Guard Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_RECORDED_PATROL_CONFIG                     = 181;              /* 轨迹巡航配置 Recorded Patrol Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_ACCESS_CONTROL_PERSONNEL_MANAGEMENT        = 182;              /* 门禁人员操作 Access Control Personnel Management */
		public static final int	NETDEV_LOG_MAIN_TYPE_ACCESS_CONTROL_CARD_MANAGEMENT             = 183;              /* 门禁卡操作 Access Control Card Management */
		public static final int	NETDEV_LOG_MAIN_TYPE_ZONE_OPERATION                             = 184;              /* 报警点操作 Zone Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_ACCESS_CONTROL_DOOR                        = 185;              /* 门操作 Access Control Door */
		public static final int	NETDEV_LOG_MAIN_TYPE_TRIGGER_ALARMOUTPUT                        = 186;              /* 报警输出触发操作 Trigger Alarm Output */
		public static final int	NETDEV_LOG_MAIN_TYPE_CENTER_RECORD                              = 187;              /* 中心录像操作 Center Record */
		public static final int	NETDEV_LOG_MAIN_TYPE_FACE_LIBRARY_OPERATION                     = 188;              /* 人脸库操作 Face Library Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_FACE_MEMBER_OPERATION                      = 189;              /* 人脸成员操作 Face Member Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_FACE_CUSTOM_OPERATION                      = 190;              /* 人脸自定义属性操作 Face Custom Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_FACE_MEMBER_SORT_OPERATION                 = 191;              /* 人脸库划归操作 Face Member Sort Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_FACE_MONITORING_TASKO_PERATION             = 192;              /* 人脸布控操作 Face Monitoring Task Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_VEHICLE_LIBRARY_OPERATION                  = 193;              /* 车辆库操作 Vehicle Library Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_VEHICLE_MEMBER_SORT_OPERATION              = 194;              /* 车辆库划归操作 Vehicle Member Sort Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_VEHICLE_MEMBER_OPERATION                   = 195;              /* 车辆成员操作 Vehicle Member Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_CAP_PAC_TASK                               = 196;              /* 抓包操作 Cap Pac Task */
		public static final int	NETDEV_LOG_MAIN_TYPE_RECORD_BK_CONFIG                           = 197;              /* 录像备份 Record BK Config */
		public static final int	NETDEV_LOG_MAIN_TYPE_USB_OPERATION                              = 198;              /* U盘操作 USB Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_VEHICLE_MONITORING_TASK_OPERATION          = 199;              /* 车辆布控操作 Vehicle Monitoring Task Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_PERMISSION_ASSIGNMENT_OPERATION            = 200;              /* 授权操作 Permission Assignment Operation */
		public static final int	NETDEV_LOG_MAIN_TYPE_INVALID                                    = 0xFFFF;            /* 无效值  Invalid value */

	}

	/**
	 * @brief 日志次类型ID 枚举 定义 Minor type IDs of logs Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_LOG_SUB_TYPE_E extends Structure {
		public static final int	NETDEV_LOG_ALL_SUB_TYPES                     = 0x0101;          /* 所有信息类日志  All information logs */

		/* 信息类日志  Information logs */
		public static final int	NETDEV_LOG_MSG_HDD_INFO                     = 300;              /* 硬盘信息  HDD information */
		public static final int	NETDEV_LOG_MSG_SMART_INFO                   = 301;              /* S.M.A.R.T信息  S.M.A.R.T information */
		public static final int	NETDEV_LOG_MSG_REC_OVERDUE                  = 302;              /* 过期录像删除  Expired recording deletion */
		public static final int	NETDEV_LOG_MSG_PIC_REC_OVERDUE              = 303;              /* 过期图片文件删除  Expired image deletion */

		/* 通知类日志  notification logs */
		public static final int	NETDEV_LOG_NOTICE_IPC_ONLINE                = 310;              /* 设备上线  Device online */
		public static final int	NETDEV_LOG_NOTICE_IPC_OFFLINE               = 311;              /* 设备下线  Device offline */
		public static final int	NETDEV_LOG_NOTICE_ARRAY_RECOVER             = 312;              /* 阵列恢复正常  arrayRecover */
		public static final int	NETDEV_LOG_NOTICE_INIT_ARRARY               = 313;              /* 阵列初始化  initializeArray */
		public static final int	NETDEV_LOG_NOTICE_REBUILD_ARRARY            = 314;              /* 阵列重建  rebuildArray */
		public static final int	NETDEV_LOG_NOTICE_POE_PORT_STATUS           = 315;              /* PoE网口状态  poePortStatus */
		public static final int	NETDEV_LOG_NOTICE_NETWORK_PORT_STATUS       = 316;              /* 交换网口状态 networkPortStatus */
		public static final int	NETDEV_LOG_NOTICE_DISK_ONLINE               = 317;              /* 磁盘上线  Disk online */

		/* 告警类日志的子类型日志ID  Sub type log ID of alarm logs */
		public static final int	NETDEV_LOG_ALARM_MOTION_DETECT              = 350;              /* 移动侦测告警  Motion detection alarm */
		public static final int	NETDEV_LOG_ALARM_MOTION_DETECT_RESUME       = 351;              /* 移动侦测告警恢复  Motion detection alarm recover */
		public static final int	NETDEV_LOG_ALARM_VIDEO_LOST                 = 352;              /* 视频丢失告警  Video loss alarm */
		public static final int	NETDEV_LOG_ALARM_VIDEO_LOST_RESUME          = 353;              /* 视频丢失告警恢复  Video loss alarm recover */
		public static final int	NETDEV_LOG_ALARM_VIDEO_TAMPER_DETECT        = 354;              /* 遮挡侦测告警  Tampering detection alarm */
		public static final int	NETDEV_LOG_ALARM_VIDEO_TAMPER_RESUME        = 355;              /* 遮挡侦测告警恢复  Tampering detection alarm recover */
		public static final int	NETDEV_LOG_ALARM_INPUT_SW                   = 356;              /* 输入开关量告警  Boolean input alarm */
		public static final int	NETDEV_LOG_ALARM_INPUT_SW_RESUME            = 357;              /* 输入开关量告警恢复  Boolean input alarm recover */
		public static final int	NETDEV_LOG_ALARM_IPC_ONLINE                 = 358;              /* 设备上线  Device online */
		public static final int	NETDEV_LOG_ALARM_IPC_OFFLINE                = 359;              /* 设备下线  Device offline */

		public static final int	NETDEV_LOG_ALARM_AUDIO_DETECTION_START      = 360;              /* 音频检测开始  Audio detection start */
		public static final int	NETDEV_LOG_ALARM_AUDIO_DETECTION_END        = 361;              /* 音频检测结束  Audio detection end */
		public static final int	NETDEV_LOG_ALARM_CROSS_LINE_DETECT          = 362;              /* 越界检测报警  CrossLine detection */
		public static final int	NETDEV_LOG_ALARM_FACE_DETECT                = 363;              /* 人脸检测报警  Face Detection */
		public static final int	NETDEV_LOG_ALARM_INTRUSION_DETECT           = 364;              /* 区域入侵报警  Intrusion Detection */
		public static final int	NETDEV_LOG_ALARM_POS                        = 365;              /* POS报警  POS Alarm */
		public static final int	NETDEV_LOG_ALARM_IMAGETOOBLURRY_ON          = 366;              /* 虚焦检测开始  Defocus detection started*/
		public static final int	NETDEV_LOG_ALARM_IMAGETOOBLURRY_OFF         = 367;              /* 虚焦检测结束  Defocus detection ended*/
		public static final int	NETDEV_LOG_ALARM_GLOBAL_SCENE_CHANGE        = 368;              /* 场景变更检测  Scene change detection*/
		public static final int	NETDEV_LOG_ALARM_AUTO_TRACK_ON              = 369;              /* 智能跟踪开始  Auto tracking started*/
		public static final int	NETDEV_LOG_ALARM_AUTO_TRACK_OFF             = 370;              /* 智能跟踪结束  Auto tracking ended*/
		public static final int	NETDEV_LOG_ALARM_CONFLAGRATION_ON           = 371;              /* 火灾告警 */
		public static final int	NETDEV_LOG_ALARM_CONFLAGRATION_OFF          = 372;              /* 火灾告警结束 */
		public static final int	NETDEV_LOG_ALARM_HUMAN_SHAPE_DETECT_ON      = 373;              /* 人形检测告警 */
		public static final int	NETDEV_LOG_ALARM_HUMAN_SHAPE_DETECT_OFF     = 374;              /* 人形检测告警结束 */
		public static final int NETDEV_LOG_ALARM_ENTERAREA                  = 375;              /* 进入区域 */
		public static final int NETDEV_LOG_ALARM_LEAVEAREA                  = 376;              /* 离开区域 */

		/* 异常类日志的子类型日志ID  Sub type log ID of exception logs */
		public static final int	NETDEV_LOG_EXCEP_DISK_ONLINE                = 400;              /* 磁盘上线  Disk online */
		public static final int	NETDEV_LOG_EXCEP_DISK_OFFLINE               = 401;              /* 磁盘下线  Disk offline */
		public static final int	NETDEV_LOG_EXCEP_DISK_ERR                   = 402;              /* 磁盘异常  Disk exception */
		public static final int	NETDEV_LOG_EXCEP_STOR_ERR                   = 403;              /* 存储错误  Storage error */
		public static final int	NETDEV_LOG_EXCEP_STOR_ERR_RECOVER           = 404;              /* 存储错误恢复  Storage error recover */
		public static final int	NETDEV_LOG_EXCEP_STOR_DISOBEY_PLAN          = 405;              /* 未按计划存储  Not stored as planned */
		public static final int	NETDEV_LOG_EXCEP_STOR_DISOBEY_PLAN_RECOVER  = 406;              /* 未按计划存储恢复  Not stored as planned recover */
		public static final int	NETDEV_LOG_EXCEP_ILLEGAL_ACCESS             = 407;              /* 非法访问  Illegal access */
		public static final int	NETDEV_LOG_EXCEP_IP_CONFLICT                = 408;              /* IP地址冲突  IP address conflict */
		public static final int	NETDEV_LOG_EXCEP_NET_BROKEN                 = 409;              /* 网络断开  Network disconnection */
		public static final int	NETDEV_LOG_EXCEP_PIC_REC_ERR                = 410;              /* 抓图出错,获取图片文件失败  Failed to get captured image */
		public static final int	NETDEV_LOG_EXCEP_VIDEO_EXCEPTION            = 411;              /* 视频输入异常(只针对模拟通道)  Video input exception (for analog channel only) */
		public static final int	NETDEV_LOG_EXCEP_VIDEO_MISMATCH             = 412;              /* 视频制式不匹配   Video standards do not match */
		public static final int	NETDEV_LOG_EXCEP_RESO_MISMATCH              = 413;              /* 编码分辨率和前端分辨率不匹配  Encoding resolution and front-end resolution do not match */
		public static final int	NETDEV_LOG_EXCEP_TEMP_EXCE                  = 414;              /* 温度异常  Temperature exception */
		public static final int	NETDEV_LOG_EXCEP_RUNOUT_RECORD_SPACE        = 415;              /* 录像存储空间即将满  runOutOfRecordSpace */
		public static final int	NETDEV_LOG_EXCEP_RUNOUT_IMAGE_SPACE         = 416;              /* 图片存储空间即将满  runOutOfImageSpace */
		public static final int	NETDEV_LOG_EXCEP_OUT_RECORD_SPACE           = 417;              /* 录像存储空间满  recordSpaceUsedUp */
		public static final int	NETDEV_LOG_EXCEP_OUT_IMAGE_SPACE            = 418;              /* 图片存储空间满  imageSpaceUsedUp */
		public static final int	NETDEV_LOG_EXCEP_ANRIDISASSEMBLY            = 419;              /* 防拆报警  antiDisassembly Alarm */
		public static final int	NETDEV_LOG_EXCEP_ANRIDISASSEMBLY_RECOVER    = 420;              /* 防拆报警恢复 antiDisassembly AlarmClear*/
		public static final int	NETDEV_LOG_EXCEP_ARRAY_DAMAGE               = 421;              /* 阵列损坏  arrayDamage */
		public static final int	NETDEV_LOG_EXCEP_ARRAY_DEGRADE              = 422;              /* 阵列衰退  arrayDegrade */
		public static final int	NETDEV_LOG_EXCEP_RECORD_SNAPSHOT_ABNOR      = 423;              /* 录像/抓图异常  recordSnapshotAbnormal */
		public static final int	NETDEV_LOG_EXCEP_NET_BROKEN_RECOVER         = 424;              /* 网络断开恢复  networkDisconnectClear */
		public static final int	NETDEV_LOG_EXCEP_IP_CONFLICT_RECOVER        = 425;              /* IP地址冲突恢复  ipConflictClear */
		public static final int	NETDEV_LOG_EXCEP_DEVICE_HIGHTEMP            = 426;              /* 设备高温报警  High Temperature */
		public static final int	NETDEV_LOG_EXCEP_DEVICE_LOWTEMP             = 427;              /* 设备低温报警  Low Temperature */
		public static final int	NETDEV_LOG_EXCEP_DEVICE_HIGHTEMP_RECOVER    = 428;              /* 设备高温报警恢复  High Temperature Cleared */
		public static final int	NETDEV_LOG_EXCEP_DEVICE_LOWTEMP_RECOVER     = 429;              /* 设备低温报警恢复  Low Temperature Cleared */
		public static final int	NETDEV_LOG_EXCEP_FAN_FAULT                  = 430;              /* 设备风扇故障  Fan Failure */
		public static final int	NETDEV_LOG_EXCEP_FAN_FAULT_RECOVER          = 431;              /* 设备风扇故障恢复  Fan Failure Cleared */
		public static final int	NETDEV_LOG_EXCEP_LEDBOX_HIGHTEMP            = 432;              /* 设备电箱高温  LED Distribution Box High Temperature */
		public static final int	NETDEV_LOG_EXCEP_LEDBOX_HIGHTEMP_RECOVER    = 433;              /* 设备电箱高温恢复  LED Distribution Box High Temperature Cleared */
		public static final int	NETDEV_LOG_EXCEP_LEDBOX_SMOKE               = 434;              /* 设备电箱烟雾告警  LED Distribution Box Smoke Alarm */
		public static final int	NETDEV_LOG_EXCEP_LEDBOX_SMOKE_RECOVER       = 435;              /* 设备电箱烟雾告警恢复  LED Distribution Box Smoke Alarm Cleared */

		/* 操作类日志的子类型日志ID  Sub type log ID of operation logs */
		/* 业务类  Services */
		public static final int	NETDEV_LOG_OPSET_LOGIN                      = 450;              /* 用户登录  User login */
		public static final int	NETDEV_LOG_OPSET_LOGOUT                     = 451;              /* 注销登录  Log out */
		public static final int	NETDEV_LOG_OPSET_USER_ADD                   = 452;              /* 用户添加  Add user */
		public static final int	NETDEV_LOG_OPSET_USER_DEL                   = 453;              /* 用户删除  Delete user */
		public static final int	NETDEV_LOG_OPSET_USER_MODIFY                = 454;              /* 用户修改  Modify user */
		public static final int	NETDEV_LOG_OPSET_START_REC                  = 455;              /* 开始录像  Start recording */
		public static final int	NETDEV_LOG_OPSET_STOP_REC                   = 456;              /* 停止录像  Stop recording */
		public static final int	NETDEV_LOG_OPSETR_PLAY_DOWNLOAD             = 457;              /* 回放/下载  Playback and download */
		public static final int	NETDEV_LOG_OPSET_DOWNLOAD                   = 458;              /* 下载  Download */
		public static final int	NETDEV_LOG_OPSET_PTZCTRL                    = 459;              /* 云台控制  PTZ control */
		public static final int	NETDEV_LOG_OPSET_PREVIEW                    = 460;              /* 实况预览  Live preview */
		public static final int	NETDEV_LOG_OPSET_REC_TRACK_START            = 461;              /* 轨迹录制开始  Start recording route */
		public static final int	NETDEV_LOG_OPSET_REC_TRACK_STOP             = 462;              /* 轨迹录制停止  Stop recording route */
		public static final int	NETDEV_LOG_OPSET_START_TALKBACK             = 463;              /* 开始语音对讲  Start two-way audio */
		public static final int	NETDEV_LOG_OPSET_STOP_TALKBACK              = 464;              /* 停止语音对讲  Stop two-way audio */
		public static final int	NETDEV_LOG_OPSET_IPC_ADD                    = 465;              /* 添加IPC  Add IP camera */
		public static final int	NETDEV_LOG_OPSET_IPC_DEL                    = 466;              /* 删除IPC  Delete IP camera */
		public static final int	NETDEV_LOG_OPSET_IPC_SET                    = 467;              /* 设置IPC  Modify IP camera */
		public static final int	NETDEV_LOG_OPSET_IPC_QUICK_ADD              = 468;              /* 快速添加IPC  quickAddIpc*/
		public static final int	NETDEV_LOG_OPSET_IPC_ADD_BY_NETWORK         = 469;              /* 网段添加IPC  addIpcByNetwork */
		public static final int	NETDEV_LOG_OPSET_IPC_MOD_IP                 = 470;              /* 修改IPC网络地址  modifyIpcAddr */

		/* 配置类  Configurations */
		public static final int	NETDEV_LOG_OPSET_DEV_BAS_CFG                = 500;              /* 设备基本信息配置  Basic device information */
		public static final int	NETDEV_LOG_OPSET_TIME_CFG                   = 501;              /* 设备时间配置  Device time */
		public static final int	NETDEV_LOG_OPSET_SERIAL_CFG                 = 502;              /* 设备串口配置  Device serial port */
		public static final int	NETDEV_LOG_OPSET_CHL_BAS_CFG                = 503;              /* 通道基本配置  Basic channel configuration */
		public static final int	NETDEV_LOG_OPSET_CHL_NAME_CFG               = 504;              /* 通道名称配置  Channel name configuration */
		public static final int	NETDEV_LOG_OPSET_CHL_ENC_VIDEO              = 505;              /* 视频编码参数配置  Video encoding configuration */
		public static final int	NETDEV_LOG_OPSET_CHL_DIS_VIDEO              = 506;              /* 通道视频显示参数配置  Video display configuration */
		public static final int	NETDEV_LOG_OPSET_PTZ_CFG                    = 507;              /* 云台配置  PTZ configuration */
		public static final int	NETDEV_LOG_OPSET_CRUISE_CFG                 = 508;              /* 巡航线路设置  Patrol route configuration */
		public static final int	NETDEV_LOG_OPSET_PRESET_CFG                 = 509;              /* 预置位设置  Preset configuration */
		public static final int	NETDEV_LOG_OPSET_VIDPLAN_CFG                = 510;              /* 录像计划配置  Recording schedule configuration */
		public static final int	NETDEV_LOG_OPSET_MOTION_CFG                 = 511;              /* 运动检测配置  Motion detection configuration */
		public static final int	NETDEV_LOG_OPSET_VIDLOSS_CFG                = 512;              /* 视频丢失配置  Video loss configuration */
		public static final int	NETDEV_LOG_OPSET_COVER_CFG                  = 513;              /* 视频遮挡配置  Tampering detection configuration */
		public static final int	NETDEV_LOG_OPSET_MASK_CFG                   = 514;              /* 视频遮盖配置  Privacy mask configuration */
		public static final int	NETDEV_LOG_OPSET_SCREEN_OSD_CFG             = 515;              /* OSD叠加配置  OSD overlay configuration */
		public static final int	NETDEV_LOG_OPSET_ALARMIN_CFG                = 516;              /* 报警输入配置  Alarm input configuration */
		public static final int	NETDEV_LOG_OPSET_ALARMOUT_CFG               = 517;              /* 报警输出配置  Alarm output configuration */
		public static final int	NETDEV_LOG_OPSET_ALARMOUT_OPEN_MAN          = 518;              /* 手动开启报警输出,人机  Manually enable alarm output; GUI */
		public static final int	NETDEV_LOG_OPSET_ALARMOUT_CLOSE_MAN         = 519;              /* 手动关闭报警输出,人机  Manually disable alarm input; GUI */
		public static final int	NETDEV_LOG_OPSET_ABNORMAL_CFG               = 520;              /* 异常配置  Exception configuration */
		public static final int	NETDEV_LOG_OPSET_HDD_CFG                    = 521;              /* 硬盘配置  HDD configuration */
		public static final int	NETDEV_LOG_OPSET_NET_IP_CFG                 = 522 ;             /* TCP/IP配置  TCP/IP configuration */
		public static final int	NETDEV_LOG_OPSET_NET_PPPOE_CFG              = 523;              /* PPPOE配置  PPPOE configuration */
		public static final int	NETDEV_LOG_OPSET_NET_PORT_CFG               = 524;              /* 端口配置  Port configuration */
		public static final int	NETDEV_LOG_OPSET_NET_DDNS_CFG               = 525;              /* DDNS配置  DDNS configuration */
		public static final int	NETDEV_LOG_OPSET_AUDIO_DETECT               = 527;              /* 搜索扩展硬盘  searchExtendDisk */
		public static final int	NETDEV_LOG_OPSET_SEARCH_EX_DISK             = 528;              /* 搜索扩展硬盘  searchExtendDisk */
		public static final int	NETDEV_LOG_OPSET_ADD_EX_DISK                = 529 ;             /* 添加扩展硬盘  addExtendDisk */
		public static final int	NETDEV_LOG_OPSET_DEL_EX_DISK                = 530;              /* 删除扩展硬盘  deleteExtendDisk */
		public static final int	NETDEV_LOG_OPSET_SET_EX_DISK                = 531;              /* 配置扩展硬盘  setExtendDisk */
		public static final int	NETDEV_LOG_OPSET_LIVE_BY_MULTICAST          = 532;              /* 组播实况  liveViewByMulticast */
		public static final int	NETDEV_LOG_OPSET_BISC_DEV_INFO              = 533;              /* 设备基本信息配置  setBasicDeviceInfo */
		public static final int	NETDEV_LOG_OPSET_PREVIEW_CFG                = 534;              /* 本地预览配置  SetPreviewOnNvr */
		public static final int	NETDEV_LOG_OPSET_SET_EMAIL                  = 535;              /* 邮件配置  setEmail */
		public static final int	NETDEV_LOG_OPSET_TEST_EMAIL                 = 536;              /* 邮件测试  testEmail */
		public static final int	NETDEV_LOG_OPSET_SET_IPCONTROL              = 537;              /* IP权限配置  setIPControl */
		public static final int	NETDEV_LOG_OPSET_PORT_MAP                   = 538 ;             /* 端口映射配置  setPortMap */
		public static final int	NETDEV_LOG_OPSET_ADD_TAG                    = 539;              /* 添加录像标签  addTag */
		public static final int	NETDEV_LOG_OPSET_DEL_TAG                    = 540;              /* 删除录像标签  deleteTag */
		public static final int	NETDEV_LOG_OPSET_MOD_TAG                    = 541;              /* 修改录像标签  modifyTag */
		public static final int	NETDEV_LOG_OPSET_LOCK_RECORD                = 542;              /* 录像锁定  lockRecord */
		public static final int	NETDEV_LOG_OPSET_UNLOCK_RECORD              = 543;              /* 录像解锁定  unlockRecord */
		public static final int	NETDEV_LOG_OPSET_DDNS_UPDATE_SUCCESS        = 545;              /* DDNS更新成功  DDNSUpdateSuccess */
		public static final int	NETDEV_LOG_OPSET_DDNS_INCORRECT_ID          = 546;              /* DDNS更新失败，错误的用户名密码  DDNSUpdateFailedIncorrectUsernamePassword */
		public static final int	NETDEV_LOG_OPSET_DDNS_DOMAIN_NAME_NOT_EXIST = 547;              /* DDNS更新失败，域名不存在  DDNSUpdateFailedDomainNameNotExist */
		public static final int	NETDEV_LOG_OPSET_DDNS_UPDATE_FAIL           = 548;              /* DDNS更新失败  DDNSUpdateFailed */
		public static final int	NETDEV_LOG_OPSET_HTTP_CFG                   = 549;              /* HTTPS配置  setHttps */
		public static final int	NETDEV_LOG_OPSET_IP_OFFLINE_ALARM_CFG       = 550;              /* IPC离线报警配置  testDDNSDomain */
		public static final int	NETDEV_LOG_OPSET_TELNET_CFG                 = 551;              /* Telnet配置  setTelnet */
		public static final int	NETDEV_LOG_OPSET_TEST_DDNS_DOMAIN           = 552;              /* DDNS域名检测  testDDNSDomain */
		public static final int	NETDEV_LOG_OPSET_DDNS_DOMAIN_CONFLICT       = 553;              /* DDNS域名冲突  DDNSDomainInvalid */
		public static final int	NETDEV_LOG_OPSET_DDNS_DOMAIN_INVALID        = 554;              /* DDNS域名不合法  setDDNS */
		public static final int	NETDEV_LOG_OPSET_DEL_PRESET                 = 555;              /* 删除预置位  deletePreset */
		public static final int	NETDEV_LOG_OPSET_PTZ_3D_POSITION            = 556;              /* 云台3D定位  ptz3DPosition */
		public static final int	NETDEV_LOG_OPSET_SNAPSHOT_SCHEDULE_CFG      = 557;              /* 抓图计划配置  setSnapshotSchedule */
		public static final int	NETDEV_LOG_OPSET_IMAGE_UPLOAD_SCHEDULE_CFG  = 558;              /* 图片上传计划配置  setImageUploadSchedule */
		public static final int	NETDEV_LOG_OPSET_FTP_CFG                    = 559;              /* FTP服务器配置  setFtpServer */
		public static final int	NETDEV_LOG_OPSET_TEST_FTP_SERVER            = 560;              /* FTP服务器连接测试  testFtpServer */
		public static final int	NETDEV_LOG_OPSET_START_MANUAL_SNAPSHOT      = 561;              /* 手动抓图开启  startManualSnapshot */
		public static final int	NETDEV_LOG_OPSET_CLOSE_MANUAL_SNAPSHOT      = 562;              /* 手动抓图关闭  endManualSnapshot */
		public static final int	NETDEV_LOG_OPSET_SNAPSHOT_CFG               = 563;              /* 抓图参数配置  setSnapshot */
		public static final int	NETDEV_LOG_OPSET_ADD_HOLIDAY                = 564;              /* 添加假日  addHoliday */
		public static final int	NETDEV_LOG_OPSET_DEL_HOLIDAY                = 565;              /* 删除假日  deleteHoliday */
		public static final int	NETDEV_LOG_OPSET_MOD_HOLIDAY                = 566;              /* 修改假日  modifyHoliday */
		public static final int	NETDEV_LOG_OPSET_ONOFF_HOLIDAY              = 567;              /* 开启/关闭假日  enableDisableHoliday */
		public static final int	NETDEV_LOG_OPSET_ALLOCATE_SPACE             = 568;              /* 容量配置  allocateSpace */
		public static final int	NETDEV_LOG_OPSET_HDD_FULL_POLICY_CFG        = 569;              /* 满策略配置  setHddFullPolicy */
		public static final int	NETDEV_LOG_OPSET_AUDIO_STREAM_CFG           = 570;              /* 音频流配置  setAudioStream */
		public static final int	NETDEV_LOG_OPSET_ARRAY_PROPERTY_CFG         = 571;              /* 阵列属性配置  setArrayProperty */
		public static final int	NETDEV_LOG_OPSET_HOT_SPACE_DISK_CFG         = 572;              /* 热备盘配置  setHotSpaceDisk */
		public static final int	NETDEV_LOG_OPSET_CREAT_ARRAY                = 573;              /* 手动创建阵列  createArray */
		public static final int	NETDEV_LOG_OPSET_ONE_CLICK_CREAT_ARRAY      = 574;              /* 一键创建阵列  oneClickCreateArray */
		public static final int	NETDEV_LOG_OPSET_REBUILD_ARRAY              = 575;              /* 重建阵列  rebuildArray */
		public static final int	NETDEV_LOG_OPSET_DEL_ARRAY                  = 576;              /* 删除阵列  deleteArray */
		public static final int	NETDEV_LOG_OPSET_ENABLE_RAID                = 577;              /* 开启RAID模式  enableRaid */
		public static final int	NETDEV_LOG_OPSET_DISABLE_RAID               = 578;              /* 关闭RAID模式  disableRaid */
		public static final int	NETDEV_LOG_OPSET_TEST_SMART                 = 579;              /* S.M.A.R.T检测  testSmart */
		public static final int	NETDEV_LOG_OPSET_SMART_CFG                  = 580;              /* S.M.A.R.T配置  setSmart */
		public static final int	NETDEV_LOG_OPSET_BAD_SECTOR_DETECT          = 581;              /* 坏道检测  badSectorDetect */
		public static final int	NETDEV_LOG_OPSET_AUDIO_ALARM_DURATION       = 582;              /* 配置声音报警时长  setAudioAlarmDuration */
		public static final int	NETDEV_LOG_OPSET_CLR_AUDIO_ALARM            = 583;             /* 清除声音报警  clearAudioAlarm */
		public static final int	NETDEV_LOG_OPSET_IPC_TIME_SYNC_CFG          = 584;              /* 配置同步摄像机时间  setIpcTimeSync */
		public static final int	NETDEV_LOG_OPSET_ENABLE_DISK_GROUP          = 585;              /* 开启盘组  enableDiskGroup */
		public static final int	NETDEV_LOG_OPSET_DISABLE_DISK_GRRUOP        = 586;              /* 关闭盘组  disableDiskGroup */
		public static final int	NETDEV_LOG_OPSET_ONVIF_AUTH_CFG             = 587;              /* ONVIF认证配置  setOnvifAuth */
		public static final int	NETDEV_LOG_OPSET_8021X_CFG                  = 588;              /* 配置802.1X  set8021x */
		public static final int	NETDEV_LOG_OPSET_ARP_PROTECTION_CFG         = 589;              /* 配置ARP防攻击  setArpProtection */
		public static final int	NETDEV_LOG_OPSET_SMART_BASIC_INFO_CFG       = 590 ;             /* 智能报警基本信息配置  setSmartBasicInfo */
		public static final int	NETDEV_LOG_OPSET_CROSS_LINE_DETECT_CFG      = 591;              /* 越界检测配置  setCrossLineDetection */
		public static final int	NETDEV_LOG_OPSET_INSTRUSION_DETECT_CFG      = 592;              /* 区域入侵配置  setIntrusionDetection */
		public static final int	NETDEV_LOG_OPSET_PEOPLE_COUNT_CFG           = 593;              /* 客流量配置  setPeopleCount */
		public static final int	NETDEV_LOG_OPSET_FACE_DETECT_CFG            = 594;              /* 人脸检测配置  setFaceDetection */
		public static final int	NETDEV_LOG_OPSET_FISHEYE_CFG                = 595;              /* 鱼眼配置  setFisheye */
		public static final int	NETDEV_LOG_OPSET_CUSTOM_PROTOCOL_CFG        = 596;              /* 自定义协议配置  setCustomProtocol */
		public static final int	NETDEV_LOG_OPSET_BEHAVIOR_SEARCH            = 597;              /* 行为检索  behaviorSearch */
		public static final int	NETDEV_LOG_OPSET_FACE_SEARCH                = 598;              /* 人脸检索  faceSearch */
		public static final int	NETDEV_LOG_OPSET_PEOPLE_COUNT               = 599;              /* 客流量统计  peopleCount */

		/* 维护类 Maintenance */
		public static final int	NETDEV_LOG_OPSET_START_DVR                  = 600;              /* 开机  Start up*/
		public static final int	NETDEV_LOG_OPSET_STOP_DVR                   = 601;              /* 关机  Shut down */
		public static final int	NETDEV_LOG_OPSET_REBOOT_DVR                 = 602;              /* 重启设备  Restart device */
		public static final int	NETDEV_LOG_OPSET_UPGRADE                    = 603;              /* 版本升级  Version upgrade */
		public static final int	NETDEV_LOG_OPSET_LOGFILE_EXPORT             = 604;              /* 导出日志文件  Export log files */
		public static final int	NETDEV_LOG_OPSET_CFGFILE_EXPORT             = 605;              /* 导出配置文件  Export configuration files */
		public static final int	NETDEV_LOG_OPSET_CFGFILE_IMPORT             = 606;              /* 导入配置文件  Import configuration files */
		public static final int	NETDEV_LOG_OPSET_CONF_SIMPLE_INIT           = 607;              /* 简单恢复配置  Export configuration files */
		public static final int	NETDEV_LOG_OPSET_CONF_ALL_INIT              = 608;               /* 恢复出厂配置  Restore to factory settings */

		public static final int	NETDEV_LOG_OPSET_VCA_BACKUP                 = 700;              /* 智能备份  vcaBackup */
		public static final int	NETDEV_LOG_OPSET_3G4G_CFG                   = 701;              /* 3G/4G配置  set3g4g */
		public static final int	NETDEV_LOG_OPSET_MOUNT_EXTENDED_DISK        = 702;              /* 加载扩展硬盘 Mount extended disk*/
		public static final int	NETDEV_LOG_OPSET_UNMOUNT_EXTENDED_DISK      = 703;              /* 卸载扩展硬盘 Unmount extended disk*/
		public static final int	NETDEV_LOG_OPSET_FORCE_USER_OFFLINE         = 704;              /* 强制用户下线 Force user off line*/

		public static final int	NETDEV_LOG_OPSET_AUTO_FUNCTION              = 709;              /* 自动维护  autoFunction */
		public static final int	NETDEV_LOG_OPSET_IPC_UPRAGDE                = 710;              /* 摄像机升级  ipcUpgrade */
		public static final int	NETDEV_LOG_OPSET_RESTORE_IPC_DEFAULTS       = 711;              /* 摄像机恢复默认配置  restoreIpcDefaults */
		public static final int	NETDEV_LOG_OPSET_ADD_TRANSACTION            = 712;              /* 添加交易配置  addTransaction */
		public static final int	NETDEV_LOG_OPSET_MOD_TRANSACTION            = 713;              /* 修改交易配置  modifyTransaction */
		public static final int	NETDEV_LOG_OPSET_DEL_TRANSACTION            = 714;              /* 删除交易配置  deleteTransaction */
		public static final int	NETDEV_LOG_OPSET_POS_OSD                    = 715;              /* POS显示配置设置  setPosOsd */
		public static final int	NETDEV_LOG_OPSET_ADD_HOT_SPACE_DEV          = 716;              /* 添加备机  addHotSpaceDevice */
		public static final int	NETDEV_LOG_OPSET_DEL_HOT_SPACE_DEV          = 717;              /* 删除备机  deleteHotSpaceDevice */
		public static final int	NETDEV_LOG_OPSET_MOD_HOT_SPACE_DEV          = 718;              /* 修改备机  modifyHotSpaceDevice */
		public static final int	NETDEV_LOG_OPSET_DEL_WORK_DEV               = 719;              /* 删除工作机  deleteWorkDevice */
		public static final int	NETDEV_LOG_OPSET_WORKMODE_TO_NORMAL_CFG     = 720;              /* 设置工作机模式  SetWorkModeToNormal */
		public static final int	NETDEV_LOG_OPSET_WORKMODE_TO_HOTSPACE_CFG   = 721;              /* 设置备机模式  SetWorkModeToHotSpace */
		public static final int	NETDEV_LOG_OPSET_AUTO_GUARD_CFG             = 723;              /* 守望配置  setAutoGuard */
		public static final int	NETDEV_LOG_OPSET_MULTICAST_CFG              = 724;              /* 组播配置  SetMulticast */
		public static final int	NETDEV_LOG_OPSET_DEFOCUS_DETECT_CFG         = 725;              /* 虚焦检测配置 Set defocus detection*/
		public static final int	NETDEV_LOG_OPSET_SCENECHANGE_CFG            = 726;              /* 场景变更配置 Set scene change detection*/
		public static final int	NETDEV_LOG_OPSET_AUTO_TRCAK_CFG             = 727;              /* 智能跟踪配置 Set auto tracking*/
		public static final int	NETDEV_LOG_OPSET_SORT_CAMERA_CFG            = 728;              /* 通道排序 Sort camera*/
		public static final int	NETDEV_LOG_OPSET_WATER_MARK_CFG             = 729;              /* 视频水印配置 Set watermark*/

		/* VMS操作日志子类型 */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_ALL                     = 1000;    /* 全部子类型 All Sub Operate Log */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USER_LOGIN              = 1001;    /* 用户登陆 User Login */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USER_LOGOUT             = 1002;    /* 用户登出 User Logout */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USER_START_OPERATION    = 1003;    /* 用户启动 User Start Operation */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USER_STOP_OPERATION     = 1004;    /* 用户停止 User Stop Operation */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_NEW_CONFIG              = 1005;    /* 新增配置 New Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_EDIT_CONFIG             = 1006;    /* 修改配置 Edit Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_DELETE_CONFIG           = 1007;    /* 删除配置 Delete Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_ENABLE_CONFIG           = 1008;    /* 启用配置 Enable Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_DISABLE_CONFIG          = 1009;    /* 停用配置 Disable Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_TEST_CONFIG             = 1010;    /* 测试配置 Test Config */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_OPEN_DOOR               = 1011;    /* 开门 Open Door */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_CLOSE_DOOR              = 1012;    /* 关门 Close Door */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_SARM                    = 1013;    /* 布防 Arm */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_DISARM                  = 1014;    /* 撤防 Disarm */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_BYPASS                  = 1015;    /* 旁路 Bypass */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_UNBYPASS                = 1016;    /* 非旁路 UnBypass */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_SHARE_DEVICE            = 1017;    /* 云端设备共享 Share Device */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_UN_SHARE_DEVICE         = 1018;    /* 取消共享 Un Share Device */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_START_CAP_PAC_TASK      = 1019;    /* 开始抓包任务 Start Cap Pac Task */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_STOP_CAP_PAC_TASK       = 1020;    /* 停止抓包任务 Stop Cap Pac Task */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_DELETE_CAPPAC_TASK      = 1021;    /* 删除抓包任务 Delete Cap Pac Task */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USB_INSERT              = 1022;    /* USB插入 USB Insert */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USB_PULL_OUT            = 1023;    /* USB拔出 USB Pull Out */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_USB_FORMAT              = 1024;    /* USB格式化 USB Format */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_SYNC_DEV_CHL_INFO       = 1025;    /* 同步设备通道信息操作 Sync Dev Chl Info */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_PLAYBACK_LOCK           = 1026;    /* 锁定录像 Playback Lock */
		public static final int	NETDEV_LOG_VMS_OPRERATE_SUB_PLAYBACK_UNLOCK         = 1027;     /* 解锁录像 Playback Unlock */

	}

	/**
	 * @brief 视频通道详细信息拓展 结构体定义  Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_CHL_DETAIL_EXTEND_INFO_S extends Structure {
		public	int                                      udwIsPoEPort;                                 /* 是否支持PoE口, 0-否, 1-是 */
		public	int                                      udwPoEStatus;                                   /* PoE口状态 参见  NETDEV_POE_STATUS_E */
		public	byte[]                                        szAccessAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];     /* 设备访问地址, 范围[0, 63]NVR需要 */
		public	byte[]                                        szMACAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];        /* 接入设备MAC地址, 长度范围[0, 63], NVR支持 */
		public	byte[]                                        szDDNSAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];       /* DDNS服务器地址，范围[0,64] */
		public	int                                      udwOffReason;                                   /* 接入设备离线原因 参见  NETDEV_CHN_OFF_REASON_E */
		public	int                                      udwRemoteIndex;                                 /* 远程通道号(多通道设备的通道号) */
		public	byte[]                                        szGBID = new byte[NETDEV_LEN_32];                          /* 国标资源编码，范围[0, 31] */
		public	int                                      udwAddType;                                     /* 添加方式, 0-手动, 1-即插即用*/
		public	int                                      udwOrgID;                                       /* 组织ID, 一体机需要*/
		public	int                                      udwDevID;                                       /* 父设备ID, 一体机需要*/
		public	byte[]                                        szDevName = new byte[NETDEV_LEN_64];                       /* 父设备名称，范围[0, 64] 一体机需要*/
		public	int                                      udwChlIndex;                                    /* 通道索引ID, 一体机需要*/
		public	int                                      udwAudioResID;                                  /* 对应的音频通道ID, 一体机需要*/

		public	byte[]                        byRes = new byte[512];                          /* 保留字段  Reserved field*/
	}

	/**
	 * @enum tagNETDEVChnOffReason
	 * @brief 接入设备离线原因类型枚举
	 * @attention 无 None
	 */
	public static class NETDEV_CHN_OFF_REASON_E extends Structure {
		public int	NETDEV_CHN_OFF_REASON_CONNECTING                = 0;                /* 连接中 */
		public int	NETDEV_CHN_OFF_REASON_ONLINE                    = 1;                /* 在线 */
		public int	NETDEV_CHN_OFF_REASON_WRONG_PWD                 = 2;                /* 用户名密码错误 */
		public int	NETDEV_CHN_OFF_REASON_NETWORK_ERROR             = 3;                /* 网络不通 */
		public int	NETDEV_CHN_OFF_REASON_SET_LIVE_STREAM_ERROR     = 4;                /* 设置实况流失败 */
		public int	NETDEV_CHN_OFF_REASON_START_LIVE_STREAM_ERROR   = 5;                /* 启动实况流失败 */
		public int	NETDEV_CHN_OFF_REASON_STREAM_INTERUP            = 6;                /* 媒体流中断 */
		public int	NETDEV_CHN_OFF_REASON_TIMEOUT                   = 7;                /* 超时 */
		public int	NETDEV_CHN_OFF_REASON_WAIT_REGIST               = 8;                /* 国标IPC等待注册报文 */
		public int	NETDEV_CHN_OFF_REASON_MODIFY_LIVE_STREAM_ERROR  = 9;                /* 国标IPC修改流传输协议 */
		public int	NETDEV_CHN_OFF_REASON_POE_POWER_ERROR           = 10;               /* PoE口供电异常 */
		public int	NETDEV_CHN_OFF_REASON_BW_RECV_NOT_ENOUGH        = 11;               /* 带宽不足 */
		public int	NETDEV_CHN_OFF_REASON_WEAK_PWD_ERROR            = 12;               /* 弱密码拒绝访问 */

		public int	NETDEV_CHN_OFF_REASON_INVALID                   = 0xFF;              /* 无效值 */
	}

	/**
	 * @enum tagNETDEVPoEStatus
	 * @brief POE口状态类型枚举
	 * @attention 无 None
	 */
	public static class NETDEV_POE_STATUS_E extends Structure {
		public int	NETDEV_POE_STATUS_NORMAL                = 1;                /* 正常 */
		public int	NETDEV_POE_STATUS_POWER_SHORTAGE        = 2;                /* 功率不足 */
		public int	NETDEV_POE_STATUS_POWER_OVERLOAP        = 4;                /* 端口负载功率超过额定功率 */
		public int	NETDEV_POE_STATUS_NONEED_POWER          = 8;                /* 端口无需供电*/

		public int	NETDEV_POE_STATUS_INVALID               = 0xFF;              /* 无效值 */
	}
	/**
	 * @enum  NETDEV_ALARM_SRC_BELONG_TYPE_E
	 * @brief 告警所属类型
	 * @attention 无
	 */
	public static class NETDEV_ALARM_SRC_BELONG_TYPE_E extends Structure{
		public static final int NETDEV_ALARM_SRC_BELONG_TYPE_OTHER                     = 0;            /* 其他 */
		public static final int NETDEV_ALARM_SRC_BELONG_TYPE_CHL                       = 1;            /* 通道类告警 */
		public static final int NETDEV_ALARM_SRC_BELONG_TYPE_DEV                       = 2;            /* 设备类告警 */
		public static final int NETDEV_ALARM_SRC_BELONG_TYPE_INVALID                   = 0xffff;        /* 无效值 */
	}
	
	/**
	* @brief 能力集命令 Device capability commond
	* @attention 无
	*/
	public class NETDEV_CAPABILITY_COMMOND_E extends Structure {
		public static final int  NETDEV_CAP_VIDEO_ENCODE         = 1;            /* 视频编码能力集 参见# NETDEV_VIDEO_STREAM_CAP_S。 Video encoding capability. See # NETDEV_VIDEO_STREAM_CAP_S for reference*/
	    public static final int	 NETDEV_CAP_OSD                  = 2;            /* OSD参数能力集 参见# NETDEV_OSD_CAP_S。 OSD parameter capability. See # NETDEV_OSD_CAP_S for reference*/
	    public static final int	 NETDEV_CAP_SMART                = 3;            /* 智能能力集 参见# NETDEV_SMART_CAP_S。 Smart capability. See # NETDEV_SMART_CAP_S for reference */
	    public static final int	 NETDEV_CAP_VIDEO_ENCODE_EX      = 4;            /* 视频编码能力集（扩展） 参见# NETDEV_VIDEO_STREAM_CAP_EX_S。 Video encoding capability. See # NETDEV_VIDEO_STREAM_CAP_EX_S for reference */
	    public static final int	 NETDEV_CAP_IMAGE                = 5;            /* 图像参数能力集 参见#NETDEV_IMAGE_CAP_S。 Image capability See # NETDEV_IMAGE_CAP_S for reference*/
	    public static final int	 NETDEV_CAP_AUDIO                = 6;            /* 音频能力集 参见 NETDEV_AUDIO_CAP_S */
	    public static final int	 NETDEV_CAP_VIDEO_SNAPSHOT       = 7;            /* 视频输入通道的抓图参数能力 参见#NETDEV_VIDEO_SNAP_CAP_S Video snapshot capability. See # NETDEV_VIDEO_SNAP_CAP_S for reference   目前仅IPC支持*/
		public static final int  NETDEV_CAP_FACE_RECOGNAZE       = 10;           /* 人脸识别能力 目前仅NVR支持, 参见NETDEV_DEV_FACE_CAP_INFO_S */
		public static final int  NETDEV_CAP_DEV_NIC              = 11;           /* 设备网卡能力集, 参见NETDEV_NIC_CAP_INFO_S */
	    public static final int  NETDEV_CAP_DEV_EXCEPTION_ALARM  = 12;           /* 设备异常告警能力集, 参见# NETDEV_EXCP_ALARM_CAP_INFO_S */
		public static final int  NETDEV_CAP_CHANNELS_ALARM       = 13;           /* 通道告警能力集, 参见 NETDEV_CHN_ALARM_CAP_INFO_S */
		public static final int  NETDEV_CAP_SYS                  = 14;           /* 系统能力集 参见 NETDEV_SYS_CAPABILITY_S  */
	    public static final int  NETDEV_CAP_INVALID              = 0Xff;        
	}
	
	/**
	 * @enum tagNETDEVLangType
	 * @brief 语言类型枚举
	 * @attention
	 */
	public class NETDEV_LANG_TYPE_E extends Structure {
		public static final int         NETDEV_LANG_TYPE_CHINESE             = 0;                           /* 中文 */
		public static final int  	    NETDEV_LANG_TYPE_ENGLISH             = 1;                           /* 英文 */
		public static final int  	    NETDEV_LANG_TYPE_TRADITIONAL_CHINESE = 2;                           /* 繁体中文 */
		public static final int  	    NETDEV_LANG_TYPE_FRENCH              = 3;                           /* 法语 */
		public static final int  	    NETDEV_LANG_TYPE_GERMAN              = 4;                           /* 德语 */
		public static final int  	    NETDEV_LANG_TYPE_SPANISH             = 5;                           /* 西班牙语 */
		public static final int  	    NETDEV_LANG_TYPE_ITALIAN             = 6;                           /* 意大利语 */
		public static final int  	    NETDEV_LANG_TYPE_PORTUGUESE          = 7;                           /* 葡萄牙语 */
		public static final int  	    NETDEV_LANG_TYPE_RUSSIAN             = 8;                           /* 俄文 */
		public static final int  	    NETDEV_LANG_TYPE_UKRAINIAN           = 9;                           /* 乌克兰语 */
		public static final int  	    NETDEV_LANG_TYPE_GRUANIAN            = 10;                          /* 格鲁尼亚语 */
		public static final int  	    NETDEV_LANG_TYPE_DUTCH               = 11;                          /* 荷兰语 */
		public static final int  	    NETDEV_LANG_TYPE_DANISH              = 12;                          /* 丹麦语 */
		public static final int  	    NETDEV_LANG_TYPE_FINNISH             = 13;                          /* 芬兰语 */
		public static final int  	    NETDEV_LANG_TYPE_SWEDISH             = 14;                          /* 瑞典语 */
		public static final int  	    NETDEV_LANG_TYPE_NORWEGIAN           = 15;                          /* 挪威语 */
		public static final int  	    NETDEV_LANG_TYPE_LCELANDIC           = 16;                          /* 冰岛语 */
		public static final int  	    NETDEV_LANG_TYPE_POLISH              = 17;                          /* 波兰语 */
		public static final int  	    NETDEV_LANG_TYPE_LITHUANIAN          = 18;                          /* 立陶宛语 */
		public static final int  	    NETDEV_LANG_TYPE_GREEK               = 19;                          /* 希腊语 */
		public static final int  	    NETDEV_LANG_TYPE_CZECH               = 20;                          /* 捷克语 */
		public static final int  	    NETDEV_LANG_TYPE_SLOVAK              = 21;                          /* 斯洛伐克语 */
		public static final int  	    NETDEV_LANG_TYPE_HUNGARIAN           = 22;                          /* 匈牙利语 */
		public static final int  	    NETDEV_LANG_TYPE_ROMAN               = 23;                          /* 罗马语 */
		public static final int  	    NETDEV_LANG_TYPE_SERBIAN             = 24;                          /* 塞尔维亚语 */
		public static final int  	    NETDEV_LANG_TYPE_CROATIAN            = 25;                          /* 克罗地亚语 */
		public static final int  	    NETDEV_LANG_TYPE_SLOVENIAN           = 26;                          /* 斯洛文尼亚语 */
		public static final int  	    NETDEV_LANG_TYPE_BULGARIAN           = 27;                          /* 保加利亚语 */
		public static final int  	    NETDEV_LANG_TYPE_BELARUSIAN          = 28;                          /* 白俄罗斯语 */
		public static final int  	    NETDEV_LANG_TYPE_TURKISH             = 29;                          /* 土耳其语 */
		public static final int  	    NETDEV_LANG_TYPE_ARABIC              = 30;                          /* 阿拉伯语 */
		public static final int  	    NETDEV_LANG_TYPE_HEBREW              = 31;                          /* 希伯来语 */
		public static final int  	    NETDEV_LANG_TYPE_HINDI               = 32;                          /* 印度语 */
		public static final int  	    NETDEV_LANG_TYPE_BENGALI             = 33;                          /* 孟加拉语 */
		public static final int  	    NETDEV_LANG_TYPE_PERSIAN             = 34;                          /* 波斯语 */
		public static final int  	    NETDEV_LANG_TYPE_JAPANESE            = 35;                          /* 日语 */
		public static final int  	    NETDEV_LANG_TYPE_KOREAN              = 36;                          /* 韩语 */
		public static final int  	    NETDEV_LANG_TYPE_THAI                = 37;                          /* 泰语 */
		public static final int  	    NETDEV_LANG_TYPE_MALAYSIAN           = 38;                          /* 马来西亚语 */
		public static final int  	    NETDEV_LANG_TYPE_INDONESIAN          = 39;                          /* 印度尼西亚语 */
		public static final int  	    NETDEV_LANG_TYPE_FILIPINO            = 40;                          /* 菲律宾语 */
		public static final int  	    NETDEV_LANG_TYPE_LAO                 = 41;                          /* 老挝语 */
		public static final int  	    NETDEV_LANG_TYPE_VIETNAMESE          = 42;                          /* 越南语 */
		public static final int  	    NETDEV_LANG_TYPE_MONGOLIAN           = 43;                          /* 蒙古国语 */
		public static final int  	    NETDEV_LANG_TYPE_ALBANIAN            = 44;                          /* 阿尔巴尼亚语 */
		public static final int  	    NETDEV_LANG_TYPE_AZERBAIJANI         = 45;                          /* 阿塞拜疆语 */
		public static final int  	    NETDEV_LANG_TYPE_GAELIC              = 46;                          /* 盖尔语 */
		public static final int  	    NETDEV_LANG_TYPE_ESTONIAN            = 47;                          /* 爱沙尼亚语 */
		public static final int  	    NETDEV_LANG_TYPE_BOSNIAN             = 48;                          /* 波斯尼亚语 */
		public static final int  	    NETDEV_LANG_TYPE_LOWLAND_SAXON       = 49;                          /* 低地撒克逊语 */
		public static final int  	    NETDEV_LANG_TYPE_PERUVIAN            = 50;                          /* 秘鲁语 */
		public static final int  	    NETDEV_LANG_TYPE_LATVIAN             = 51;                          /* 拉脱维亚语 */
		public static final int  	    NETDEV_LANG_TYPE_INVALID             = 0xFF;                        /* 无效命令 */
	}
	
	/**
	 * @struct NETDEV_VIDEO_CHL_DETAIL_INFO_EX_S
	 * @brief 视频通道详细信息 结构体定义  Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_CHL_DETAIL_INFO_EX_S extends Structure {
		public int                  dwChannelID;                        /* 通道ID  Channel ID */
		public int                  bPtzSupported;                      /* 是否支持云台 Whether ptz is supported */
		public int     				enStatus;       /* 通道状态  Channel status NETDEV_CHANNEL_STATUS_E */
		public int                  dwStreamNum;                        /* 流个数  Number of streams 当enStatus为 NETDEV_CHL_STATUS_UNBIND 时，此值无效*/
		public int       			enChannelType;                      /* 通道类型，(note: 该字段仅对混合NVR有效)，参考 NETDEV_CHANNEL_TYPE_E*/
		public int     				enVideoFormat;                      /* 视频输入制式，参考NETDEV_CHANNEL_TYPE_E，当ChannelType为NETDEV_CHL_TYPE_DIGITAL时，此值无效 (note: 该字段仅对混合NVR有效) */
		public int           		enAddressType;                      /* IP地址类型 ,参考 NETDEV_HOSTTYPE_E*/
		public byte[]               szIPAddr =new byte[NETDEV_IPADDR_STR_MAX_LEN];/* IP地址 IP address*/
		public int                  dwPort;                             /* 端口号 */
		public byte[]				szChnName =new byte[NETDEV_LEN_64];;           /* 通道名称 Channel Name */
		public int                  allowDistribution;                   /* 是否允许流分发*/
		public int                  dwDeviceType;                       /* 通道接入的设备类型，参见 枚举 NETDEV_CHANNEL_CAMERA_TYPE_E. Channel device Type see#NETDEV_CHANNEL_CAMERA_TYPE_E */
		public byte[]				szManufacturer =new byte[NETDEV_LEN_32];      /* 厂商，范围[0,31] */
		public byte[]               szDeviceModel =new byte[NETDEV_LEN_32];       /* 设备型号，范围[0,31]  */
		public int                  udwAccessProtocol;                  /* 接入协议类型 参见 NETDEV_ACCESS_PROTOCOL_E */
		public Pointer	pstExtendedInformation;            /* 附加属性, 需要自行申请内存 参见  NETDEV_VIDEO_CHL_DETAIL_EXTEND_INFO_S*/
		public byte[]   			byRes = new byte[16];                          /* 保留字段  Reserved field*/
	}

	/**
	 * @struct NETDEV_PICTURE_DATA_S
	 * @brief 图像数据 结构体定义 Image data Structure definition
	 *        存放解码后图像数据的指针和长度等信息 Storing pointer and length of decoded picture data
	 * @attention 无 None
	 */
	public class NETDEV_PICTURE_DATA_S extends Structure {
		public Pointer[] pucData =new Pointer[4];                /* pucData[0]:Y 平面指针,pucData[1]:U 平面指针,pucData[2]:V 平面指针  pucData[0]: Y plane pointer, pucData[1]: U plane pointer, pucData[2]: V plane pointer */
		public int[]   dwLineSize = new int[4];              /* ulLineSize[0]:Y平面每行跨距, ulLineSize[1]:U平面每行跨距, ulLineSize[2]:V平面每行跨距  ulLineSize[0]: Y line spacing, ulLineSize[1]: U line spacing, ulLineSize[2]: V line spacing */
		public int   dwPicHeight;                /* 图片高度  Picture height */
		public int   dwPicWidth;                 /* 图片宽度  Picture width */
		public int   dwRenderTimeType;           /* 用于渲染的时间数据类型  Time data type for rendering */
		public long   tRenderTime;                /* 用于渲染的时间数据  Time data for rendering */
	}

	/**
	 * @struct NETDEV_DISCOVERY_DEVINFO_S
	 * @brief 设备发现的设备信息  Info of discovered device
	 * @attention 无 None
	 */
	public class NETDEV_DISCOVERY_DEVINFO_S extends Structure {
		public byte[] szDevAddr =new byte[NETDEV_LEN_64];                /* pucData[0]:Y 平面指针,pucData[1]:U 平面指针,pucData[2]:V 平面指针  pucData[0]: Y plane pointer, pucData[1]: U plane pointer, pucData[2]: V plane pointer */
		public byte[]     szDevModule =new byte[NETDEV_LEN_64];                          /* 设备型号  Device model */
		public byte[]     szDevSerailNum =new byte[NETDEV_LEN_64];                       /* 设备序列号  Device serial number */
		public byte[]     szDevMac =new byte[NETDEV_LEN_64];                             /* 设备MAC地址  Device MAC address */
		public byte[]     szDevName =new byte[NETDEV_LEN_64];                            /* 设备名称  Device name */
		public byte[]     szDevVersion =new byte[NETDEV_LEN_64];                         /* 设备版本  Device version */
		public int  	  enDevType;                              /* 设备类型  Device type 参见 NETDEV_DEVICE_TYPE_E*/
		public int   	  dwDevPort;                                           /* 设备端口号  Device port number */
		public byte[]     szManuFacturer =new byte[NETDEV_LEN_64];                       /* 生产商 Device manufacture */
		public byte[]     szActiveCode =new byte[NETDEV_LEN_64];                         /* 激活码 activeCode */
		public byte[]     szCloudUserName =new byte[NETDEV_LEN_64];                       /* 云用户名称 cloudUserName */
		public byte[]     byRes =new byte[68];                /* 用于渲染的时间数据  Time data for rendering */
	}

	/**
	 * @brief 音频数据 结构体定义 Audio data Structure definition
	 *        存放解码后音频数据的指针和长度等信息 Storing pointer and length of decoded picture data
	 * @attention 无 None
	 */
	public class NETDEV_WAVE_DATA_S extends Structure {
		public Pointer pcData;                      /* 音频数据指针  Audio data pointer */
		public int dwDataLen;                    /* 音频数据长度  Audio data length */
		public int dwWaveFormat;                 /* 解码后音频格式  Format of decoded audio*/
	}

	/**
	 * @brief 实况影像信息 结构体定义 Live image information Structure definition
	 * @attention 伽马参数范围0-10,其它参数取值范围0-255 Gamma parameter range: 0-10, other parameters: 0-255
	 */
	public class NETDEV_VIDEO_EFFECT_S extends Structure {
		public int  dwContrast;                   /* 对比度  Contrast */
		public int  dwBrightness;                 /* 亮度  Brightness */
		public int  dwSaturation;                 /* 饱和度  Saturation */
		public int  dwHue;                        /* 色调  Hue */
		public int  dwGamma;                      /* 伽玛值  Gamma */
		public byte[]  byRes=new byte[16];                    /* 保留字段  Reserved */
	}

	/**
	 * @brief 矩形区域 结构体定义 Rectangle Area  Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_RECT_S extends Structure {
		public int   dwLeft;                               /* x轴左点值[0,10000]  X axis left point value [0,10000] */
		public int   dwTop;                                /* y轴顶点值[0,10000]  Y axis top point value [0,10000] */
		public int   dwRight;                              /* x轴右点值[0,10000]  X axis right point value [0,10000] */
		public int   dwBottom;                             /* y轴底点值[0,10000]  Y axis bottom point value [0,10000] */
	}

	/**
	 * @brief 分页查询条件信息结构体
	 * @attention 无None
	 */
	public class NETDEV_PAGE_FIND_LOGIC_S extends Structure {
		public int   dwQueryCond;        /* 查询条件0：设备状态；1：设备所在组织。 */
		public int   dwSubQueryCond;     /* 当前查询条件的右值,用于补充说明查询条件中设备状态:0表示离线，1表示在线 */
		public int   dwLogicalType;      /* 查询条件逻辑类型:参见 枚举 类型#NETDEV_QUERYCOND_LOGICTYPE_E */
		public byte[]    byRes=new byte[128];         /* 保留字段 */
	}

	/**
	 * @brief 分页查询信息结构体
	 * @attention 无None
	 */
	public class NETDEV_PAGE_FIND_COND_S extends Structure {

		public int   dwLimitNum;                                          /* 单页查询设备数量 结构体中dwSuggestSinglePageQuantily值大小来设置*/
		public int   dwStartID;                                           /* 单页查询设备的起始id,连续查询中可以用上次分页查询获取到的最后一个设备中的id字段+1，作为此次查询的开始id。*/
		public int   dwCondNum;                                           /* 查询条件数量 */
		public NETDEV_PAGE_FIND_LOGIC_S[]  astFindCond = new NETDEV_PAGE_FIND_LOGIC_S[NETDEV_LEN_16];        /* 查询条件信息列表,查询条件数量最多为16个,当查询数量为0时,此节点可选 */
		public byte[] byRes=new byte[128];                                          /* 保留字段*/
	}

	/**
	 * @brief 云端设备基本信息 结构体定义 Cloud Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_CLOUD_DEV_BASIC_INFO_S extends Structure {
		public byte[]    szIPAddr=new byte[NETDEV_IPV4_LEN_MAX];              /* 设备IP Device IP */
		public byte[]    szDevUserName=new byte[NETDEV_LEN_260];              /* 设备用户名 Device username */
		public byte[]    szDevName=new byte[NETDEV_LEN_260];                  /* 设备名称 Device name */
		public byte[]    szDevModel=new byte[NETDEV_LEN_64];                  /* 设备型号 Device model */
		public byte[]    szDevSerialNum=new byte[NETDEV_LEN_64];              /* 设备序列号 Device serial number */
		public int   dwOrgID;                                    /* 所属组织ID Home organization ID */
		public int   dwDevPort;                                  /* 设备端口 Device port */
		public int   dwDevID;                                    /* 设备ID此设备在设备列表中的序号 */
		public byte[]    szDevSubName=new byte[NETDEV_LEN_260];               /* 设备别名：包括共享设备别名 */
		public int   dwDevType;                                  /* 设备类型：参见 枚举 #NETDEV_CLOUD_DEVICE_TYPE  Device type, see enumeration #NETDEV_CLOUD_DEVICE_TYPE */
		public int    bKeepLiveStatus;                            /* 设备保活状态：在线返回true，不在线返回false */
		public int    bIsShareDev;                                /* 共享设备标志位，如果是共享设备，则为true，自己名下的设备为false */
		public int   dwValidityShareTime;                        /* 共享有效期，单位秒。例如返回“3600.0000000”，客户端当前时间2014-2-27 9:22，就允许-2-27 10:22前发起连接。当共享设备标志位为true时有效。*/
		public byte[]    szShareDevUserName=new byte[NETDEV_LEN_260];         /* 共享设备所有者用户名，当bIsShareDev为true时有效 */
		public int   dwConnectMode;                              /* 连接模式 Connect Mode*/
		public int   dwDisTributeCloud;                          /* 分发模式  参见 枚举  NETDEV_DISTRIBUTE_CLOUD_SRV_E*/
		public int   dwCloudStorageType;                         /* 设备云存储类型 参考枚举  NETDEV_CLOUD_STORAGE_TYPE_E*/
		public byte[]    byRes=new byte[120];                                 /* 保留字段 */
	}

	/**
	 *@brief 接入协议枚举
	 *@attention 无
	 */
	public static class NETDEV_LOGIN_PROTO_E extends Structure {
		public static final int   	NETDEV_LOGIN_PROTO_ONVIF = 0;       	  /* 以ONVIF协议接入 */
		public static final int   	NETDEV_LOGIN_PROTO_PRIVATE = 1;       	  /* 以私有协议接入 */
	}

	/**
	 * @brief 云端设备登录信息    Cloud Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_CLOUD_DEV_LOGIN_INFO_S extends Structure {
		public byte[]    szDeviceName=new byte[NETDEV_LEN_260];     /* 设备名称 Device name */
		public byte[]    szDevicePassword=new byte[NETDEV_LEN_64];  /* 设备登录密码 (可选) Device login password (optional) */
		public int   dwT2UTimeout;                       			/* P2P超时时间, 默认为15s P2P timeout (default: 15s) */
		public int   dwConnectMode;                      			/* 连接模式 Connect Mode  参见 枚举  NETDEV_CLOUD_CONNECT_MODE_E  传 NETDEV_CLOUD_CONNECT_MODE_ALL时无法准确获取最终登陆成的模式时打洞还是转发*/
		public int 		dwLoginProto; 			/* 登录协议, 参见 NETDEV_LOGIN_PROTO_E */
		public byte[]  byRes=new byte[252];                       	/* 保留字段 */
	}

	/**
	 * @enum tagNETDEVCloudConnectMode
	 * @brief 云端设备连接模式
	 * @attention 无 None
	 */
	public static class NETDEV_CLOUD_CONNECT_MODE_E extends Structure {
	    public static final int	NETDEV_CLOUD_CONNECT_MODE_ALL       = 0;         /* 本地直连->广域网直连->打洞->转发 */
	    public static final int	NETDEV_CLOUD_CONNECT_MODE_P2P_TURN  = 1;         /* 本地直连->广域网直连->打洞+转发(转发延迟500ms) */
	    public static final int	NETDEV_CLOUD_CONNECT_MODE_P2P       = 2;         /* 直接打洞 */
	    public static final int	NETDEV_CLOUD_CONNECT_MODE_TURN      = 3;          /* 直接转发 */
	}

	/**
	 * @brief 车牌识别报文图片解析信息
	 * @attention
	 */
	public class NETDEV_TMS_CAR_PLATE_PIC_INFO_S extends Structure {
		public int   	udwPicSize;       	/* 图片大小 */
		public Pointer 	pcPicData; 			/* 图片数据 */
	}

	/**
	 * @brief 车牌识别报文XML解析信息
	 * @attention
	 */
	public class NETDEV_TMS_CAR_PLATE_XML_INFO_S extends Structure {
		public byte[] szCamID=new byte[NETDEV_TMS_CAR_PLATE_CAMID_LEN];                               /* 卡口相机编号 */
		public byte[] szRecordID=new byte[NETDEV_TMS_CAR_PLATE_RECORDID_LEN];                         /* 记录ID号 */
		public byte[] szTollgateID=new byte[NETDEV_TMS_CAR_PLATE_TOLLGATE_LEN];                       /* 卡口编号 */
		public byte[] szPassTime=new byte[NETDEV_TMS_CAR_PLATE_PASSTIME_LEN];                         /* 经过时刻 */
		public byte[] szLaneID=new byte[NETDEV_TMS_CAR_PLATE_LANEID_LEN];                             /* 车道编号 */
		public byte[] szCarPlate=new byte[NETDEV_TMS_CAR_PLATE_CARPLATE_LEN];                         /* 车牌号码 */
		public byte[] szIPAddr=new byte[NETDEV_IPV4_LEN_MAX];                                         /* 设备IP地址 */
		public int dwCarPlateColor;                                                      /* 号牌颜色，参见枚举NETDEV_TMS_CAR_PLATE_COLOR_E*/
		public byte[] bRes=new byte[492];                                                             /* 保留字段 Reserved */
	}

	/**
	 * @brief 车牌识别报文数据信息
	 * @attention
	 */
	public class NETDEV_TMS_CAR_PLATE_INFO_S extends Structure {
		public int	udwPicNum;                                   							/* 图片个数 Picture Number */
		public NETDEV_TMS_CAR_PLATE_XML_INFO_S	stTmsXmlInfo;                                /* XML信息 XML Information */
		public NETDEV_TMS_CAR_PLATE_PIC_INFO_S[]	stTmsPicInfo= new NETDEV_TMS_CAR_PLATE_PIC_INFO_S[NETDEV_TMS_PIC_COMMON_NUM];     /* 图片信息 Picture Message */
	}

	/**
	 * @brief 人脸位置信息
	 * @attention
	 */
	public class NETDEV_FACE_POSITION_INFO_S extends Structure {
		public int   dwTopLeftX;           /* 左上角X [0, 10000]  Upper left corner X [0, 10000]  */
		public int   dwTopLeftY;           /* 左上角Y [0, 10000]  Upper left corner Y [0, 10000]  */
		public int   dwBottomRightX;       /* 右下角X [0, 10000]  Lower right corner x [0, 10000] */
		public int   dwBottomRightY;       /* 右下角Y [0, 10000]  Lower right corner y [0, 10000] */
		public byte[] bRes=new byte[32];           /* 保留字段 Reserved */
	}

	/**
	 * @brief 图片类型枚举
	 * @attention 无 None
	 */
	public static class NETDEV_TMS_PERSION_IMAGE_TYPE_E extends Structure {
		public static final int   	NETDEV_TMS_PERSION_IMAGE_TYPE_FULL_VIEW = 1;         /* 全景图 */
		public static final int   	NETDEV_TMS_PERSION_IMAGE_TYPE_FACE = 2;              /* 人脸图 */
		public static final int   	NETDEV_TMS_PERSION_IMAGE_TYPE_INVALID=0xFF;
	}

	/**
	 * @brief 人脸抓拍信息结构体
	 * @attention
	 */
	public class NETDEV_TMS_FACE_SNAPSHOT_PIC_INFO_S extends Structure {
		public int   udwFaceId;                                                          /* 人脸ID */
		public Pointer    pcPicBuff;                                                     /* 图片缓存 */
		public int   udwPicBuffLen;                                                      /* 图片缓存长度 */
		public int    enImgType;                                                         /* 图像类型，1:全景图 2：人脸图 */
		public int  enImgFormat;                                                         /* 图像格式，参考枚举 NETDEV_TMS_PERSION_IMAGE_FORMAT_E */
		public NETDEV_FACE_POSITION_INFO_S        stFacePos;                             /* 人脸坐标---画面坐标归一化：0-10000 ;  矩形左上和右下点："138,315,282,684" */
		public int   udwImageWidth;                                                      /* 图像宽度 */
		public int   udwImageHeight;                                                     /* 图像高度 */
		public byte[]     szCamerID=new byte[NETDEV_TMS_CAMER_ID_LEN];                   /* 相机编号 */
		public byte[]     szRecordID=new byte[NETDEV_TMS_FACE_RECORD_ID_LEN];            /* 记录ID号 */
		public byte[]     szTollgateID=new byte[NETDEV_TMS_FACE_TOLLGATE_ID_LEN];        /* 卡口编号 */
		public byte[]     szPassTime=new byte[NETDEV_TMS_PASSTIME_LEN];                  /* 经过时刻,YYYYMMDDHHMMSSMMM，时间按24小时制。第一组MM表示月，第二组MM表示分，第三组MMM表示毫秒 */
		public int   udwFaceNum;                                                         /* 人脸个数 全景图时有效*/
		public byte[]     szIPAddr=new byte[NETDEV_IPV4_LEN_MAX];                        /* 设备IP地址 */
		public byte[]     bRes=new byte[76];                                             /* 保留字段 Reserved */
	}

	/**
	 * @brief  客流量统计信息 结构体定义 Passenger flow statistic infomation Sturcture definition
	 * @attention 无 None
	 */
	public class NETDEV_PASSENGER_FLOW_STATISTIC_DATA_S extends Structure {
		public int   dwChannelID;            /* 通道号 Channel ID */
		public long   tReportTime;            /* 上报时间（unix时间戳） Report time */
		public int   tInterval;              /* 间隔时间 Interval time */
		public int   dwEnterNum;             /* 进入人数 Enter num */
		public int   dwExitNum;              /* 离开人数 Exit num */
		public int   dwTotalEnterNum;        /* 所有进入人数 Total enter num */
		public int   dwTotalExitNum;         /* 所有离开人数 Total exit nums*/
	}

	/**
	 * @brief 超时时间 结构体定义  Timeout structure definition
	 * @attention
	 */
	public class NETDEV_REV_TIMEOUT_S extends Structure {
		public int   dwRevTimeOut;                 /* 设置接收超时时间 Set timeout for receiving */
		public int   dwFileReportTimeOut;          /* 设置文件操作超时时间 Set timeout for file operation */
		public byte[] byRes=new byte[128];                   /* 保留字段  Reserved */
	}
	
	/**
	 * @struct tagNETDEVAlarmInfoEx
	 * @brief  目标列表 结构体定义   Object List
	 * @attention 无 None
	 */
	public class NETDEV_OBJECT_LIST_S extends Structure {
	    public int                      udwObjectType;                      /* 目标类型 参见枚举 NETDEV_OBJECT_TYPE_E */
	    public int                      udwObjectID;                        /* 目标ID */
	    public byte[] byRes=new byte[256];                                  /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVAlarmInfo
	 * @brief 告警信息 结构体定义 Alarm information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_ALARM_INFO_V30_S extends Structure {
		public int dwAlarmType;                                            /* 告警类型，参见 枚举 #NETDEV_ALARM_TYPE_E  Alarm type, see enumeration #NETDEV_ALARM_TYPE_E */
		public int dwAlarmSubType;                                         /* 告警子类型，参见 NETDEV_ALARM_SUBTYPE_E */
		public int dwAlarmLevel;                                           /* 告警等级，1到5级，1级最严重 */
		public long tAlarmTimeStamp;                                       /* 告警发生时间  Alarm occurrence time */
		public int dwChannelID;                                            /* 通道ID,非一体机设备使用  Channel ID */
		public int dwAlarmID;                                              /* 告警ID，一体机设备使用 */
		public int dwAlarmSrcID;                                           /* 告警源ID 参见 枚举 #NETDEV_ALARM_SRC_TYPE_E
	                                                                       note:
                                                                            1. dwAlarmSrcType为 NETDEV_ALARM_SRC_LOCAL_HARD_DISK 到 NETDEV_ALARM_SRC_SD_STORAGE_DISK 之间，dwAlarmID代表存储盘索引；
                                                                            2. dwAlarmSrcType为8，dwAlarmID代表视频通道号；
                                                                            3. dwAlarmSrcType为9，dwAlarmID代表报警输入通道号，报警源见dwInputSwitchID字段。
                                                                            4. dwAlarmSrcType为10,dwAlarmID默认为0,代表系统本身
                                                                           */
		public byte[]  szAlarmSrc=new byte[NETDEV_ALARM_SOURCE_MAX_LEN];   /* 告警源信息（名称） */
		public int            IsAlarmSnapExisted;                          /* 告警是否有抓图 0没有抓图 1有抓图  vms使用*/
		public short          wIndex;                                      /* 索引号  Index number, index number */
		public int            dwTotalBandWidth;                            /* 当前带宽总量,单位为MBps  Current total bandwidth (in MBps) */
		public int            dwUnusedBandwidth;                           /* 未使用的带宽,单位为MBps  Bandwidth left (in MBps)*/
		public int            dwTotalStreamNum;                            /* 总路数 Total cameras*/
		public int            dwFreeStreamNum;                             /* 未使用路数 Cameras left */
		public int            dwMediaMode;                                 /* 流类型,参见 枚举 #NETDEV_MEDIA_MODE_E Stream type. For enumerations, see#NETDEV_MEDIA_MODE_E*/
		public int            dwEventCode;                                 /* 事件类型，用于上报解码层事件类型，参见 枚举 # NETDEV_PLAYER_RUN_INFO_TYPE_E */
		public int            dwReserved;                                  /* 异常上报保留参数，用于上报解码层保留参数 */
		public byte[]         szFileName = new byte[NETDEV_LEN_256];       /* ND上报字符串参数信息 */
		public byte[]         szDeviceID = new byte[NETDEV_LEN_64];        /* 告警设备ID，国标协议接入时填写国标注册码。长度[1,32]。IPC、VM平台支持 */
		public byte[]         szRelatedID = new byte[NETDEV_LEN_32];       /* 告警事件与告警数据的关联ID,同一个相机内全局唯一。长度为15个字符.当告警存在与之关联数据时，需携带此字段 */
		public int            dwObjectNum;                                 /* 目标个数  Object Num */
		public NETDEV_OBJECT_LIST_S  pstObjectList;                        /* 目标列表 Object List 需根据dwObjectNum动态申请内存 */
		public byte[]         byRes = new byte[144];                       /* 保留字段 */
	}

	/**
	 * @enum tagNETDEVPlayerRunInfoType
	 * @brief 解码层上报运行信息的类型的枚举定义
	 * @attention 无
	 */
	public static class NETDEV_PLAYER_RUN_INFO_TYPE_E extends Structure {
		public static final int	NETDEV_PLAYER_RUN_INFO_RECORD_VIDEO        = 1;        /**< 本地录像过程中上报运行信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_PROCESS       = 2;        /**< 视频媒体处理过程中的上报运行信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_SERIES_SNATCH       = 3;        /**< 连续抓拍过程中上报运行信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_VOICE         = 4;        /**< 语音业务过程中上报运行信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_NOT_IDENTIFY  = 5;        /**< 码流无法识别 */
		public static final int	NETDEV_PLAYER_RUN_INFO_RECV_PACKET_NUM     = 6;        /**< 周期内接收到的包数 */
		public static final int	NETDEV_PLAYER_RUN_INFO_RECV_BYTE_NUM       = 7;        /**< 周期内接收到的字节数 */
		public static final int	NETDEV_PLAYER_RUN_INFO_VIDEO_FRAME_NUM     = 8;        /**< 周期内解析的视频帧数 */
		public static final int	NETDEV_PLAYER_RUN_INFO_AUDIO_FRAME_NUM     = 9;        /**< 周期内解析的音频帧数 */
		public static final int	NETDEV_PLAYER_RUN_INFO_LOST_PACKET_RATIO   = 10;       /**< 周期内丢包率统计信息（单位为0.01%） */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_PLAY_PROGRESS = 11;       /**< 媒体中携带的进度信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_PLAY_END      = 12;       /**< 媒体中携带的播放结束 */
		public static final int	NETDEV_PLAYER_RUN_INFO_MEDIA_ABNORMAL      = 13;       /**< 媒体处理异常 */
		public static final int	NETDEV_PLAYER_RUN_INFO_CODEC               = 14;       /**< 编解码器 */
		public static final int	NETDEV_PLAYER_RUN_INFO_STREAM              = 15;       /**< 网络流或输入流播放 */
		public static final int	NETDEV_PLAYER_RUN_INFO_PLAYBACK_FINISH     = 16;       /**< 回放结束 */
		public static final int	NETDEV_PLAYER_RUN_INFO_SNATCH              = 17;       /**< 截图过程中的上报运行信息 */
		public static final int	NETDEV_PLAYER_RUN_INFO_INVALID             = 0xff;
	}

	public class NETDEV_EVENT_RES_S extends Structure {
		public int   dwResType;                          /* 资源类型，参见 枚举 #NETDEV_EVENT_RES_TYPE_E */
		public int   dwResID;                            /* 资源ID */
		public int   dwFirstSubResID;                    /* 第一子资源ID */
		public int   dwSecondSubResID;                   /* 第二子资源ID 不同资源类型对应意义不同。如：电视墙分屏资源的资源ID是电视墙ID，第一子资源ID是窗口ID，第二子资源ID就是分屏ID*/

		public byte[] byRes=new byte[16];             	 /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVEventInfo
	 * @brief 事件信息 结构体定义 Alarm information Structure definition
	 * @attention  事件个数超过NETDEV_MAX_EVENT_RES_SIZE个时，超过部分使用存放在指针pstEventRes中，该指针的内存进行动态申请
	 */
	public class NETDEV_EVENT_INFO_S extends Structure {
		public int              		dwSize;                                     /* 资源数量 */
		public NETDEV_EVENT_RES_S[]     astEventRes = new NETDEV_EVENT_RES_S[NETDEV_MAX_EVENT_RES_SIZE];     /* 事件资源信息 */
		public int              		dwEventActionType;                          /* 事件类型，参见 枚举 #NETDEV_EVENT_ACTION_TYPE_E */
		public Pointer    				pstEventRes;                                /* 超过 NETDEV_MAX_EVENT_RES_SIZE 的事件资源信息，NETDEV_EVENT_RES_S 数据保存在该指针中*/
		public byte[]           		byRes=new byte[28];                       	/* 保留字段 */
	}

	/**
	 * @struct tagNETDEVReportInfo
	 * @brief 告警/事件上报信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_REPORT_INFO_S extends Structure {
		public int                  dwReportType;       /* 上报类型，参见 枚举 #NETDEV_REPORT_TYPE_E */
		public NETDEV_ALARM_INFO_V30_S     stAlarmInfo;        /* 告警信息，当dwReportType为 NETDEV_REPORT_TYPE_ALARM 时有效 */
		public NETDEV_EVENT_INFO_S         stEventInfo;        /* 事件信息，当dwReportType为 NETDEV_REPORT_TYPE_EVENT 时有效 */

	}

	/**
	 * @struct tagstNETDEVExceptionOutputInfo
	 * @brief 异常输出信息
	 * @attention
	 */
	public class NETDEV_EXCEPTION_OUTPUT_INFO_S extends Structure {
		public int       dwEventCode;       	/* 事件码（ND上报异常使用） */
		public long      tPlayBackTime;        	/* 回放绝对时间(ND上报异常使用 N+M特性使用) */
		public byte[]     szFileName = new byte[NETDEV_LEN_256];                       /* 字符串参数 */
		public byte[]    byRes=new byte[128];	/* 保留字段 */

	}

	/**
	 * @brief 按月查询录像分布信息配置 结构体定义 get video by Month Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_MONTH_INFO_S extends Structure {
		public int  udwYear;        /* 年份  year*/
		public int  udwMonth;       /* 月份  month */
		public int  udwPosition;    /* 录像查询位置 NETDEV_VIDEO_POSITION_E video query location */
	}

	/**
	 * @brief 录像分布状态 结构体定义 video status Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_MONTH_STATUS_S extends Structure {
		public int  udwDayNumInMonth;       /* 某月的实际天数 The number of a month's days */
		public int[]  szVideoStatus = new int[NETDEV_MONTH_DAY_MAX];       	/* 录像状态列表 video status list, see in NETDEV_VIDEO_STATUS_E */
	}

	/**
	 * @struct tagstNETDEVOrgFindCond
	 * @brief 查找组织信息列表条件
	 * @attention
	 */
	public class NETDEV_ORG_FIND_COND_S extends Structure {
		public int udwOrgType;              /* 组织类型 参见 NETDEV_ORG_TYPE_E */
		public int udwRootOrgID;            /* 根节点组织ID */
		public int udwFindType;             /* 查找模式，参见 NETDEV_ORG_FIND_MODE_E */
		public byte[]    byRes=new byte[128];	/* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVOrgDetailInfo
	 * @brief 组织详细信息
	 * @attention
	 */
	public class NETDEV_ORG_INFO_S extends Structure {
		public int dwOrgID;                              /* 组织ID */
		public int dwParentID;                           /* 组织父节点ID */
		public int dwType;                               /* 类型 参见  NETDEV_ORG_TYPE_E */
		public byte[] szNodeName=new byte[NETDEV_NAME_MAX_LEN];       /* 节点名称 */
		public byte[] szDesc=new byte[NETDEV_DESCRIBE_MAX_LEN];       /* 备注 */
		public int udwTime;                              /* 创建时间，UTC时间 */
		public byte[]  szUserName = new byte[NETDEV_LEN_64];             /* 创建人 [1,64] */
		public byte[]  byRes=new byte[60];                           /* 保留字段   */
	}

	/**
	 * @struct tagstNETDEVOrgDetailInfo
	 * @brief 待删除组织详细信息
	 * @attention
	 */
	public class NETDEV_DEL_ORG_INFO_S extends Structure
	{
		public int dwOrgNum;     /* 组织数量 */
		public Pointer pdwOrgIDs;   /* 需要删除的组织ID，根据dwOrgNum 动态申请(int) */
		public int dwOrgType;    /* 组织类型 见 NETDEV_ORG_TYPE_E */
		public byte[]  byRes=new byte[64];    /* 保留字段  Reserved field*/
	}

	/**
	 * @struct tagstNETDEVOperateInfo
	 * @brief 单个操作信息
	 * @attention dwID为入参，dwReturnCode为出参
	 */
	public class NETDEV_OPERATE_INFO_S extends Structure
	{
		public int  dwID;                   /* ID */
		public int  dwReturnCode;           /* 返回码*/
		public byte[]  byRes=new byte[64];              /* 保留字段  Reserved field */
	}

	/**
	 * @struct tagstNETDEVOrgDelDetailInfo
	 * @brief 批量删除组织返回信息
	 * @attention
	 */
	public class NETDEV_ORG_BATCH_DEL_INFO_S extends Structure
	{
		public int dwStatus;                             /* 响应状态，类型 参见  NETDEV_ORG_RESPONSE_STAUTE_E */
		public int dwNum;                                /* 响应数量 */
		public Pointer pstResultInfo;      /*批量删除返回信息，根据删除数量动态申请(NETDEV_OPERATE_INFO_S)*/
		public byte[]  byRes=new byte[68];                            /* 保留字段  Reserved field*/
	}

	/**
	 * @struct tagstNETDEVOrgChnInfo
	 * @brief 组织下通道信息
	 * @attention
	 */
	public class NETDEV_ORG_CHN_INFO_S extends Structure {
		public int dwOrgID;                              /* 组织ID */
		public int dwChannelID;                          /* 通道ID */
		public byte[] szChnName=new byte[NETDEV_NAME_MAX_LEN];        /* 通道名称 */
		public int dwChnIndex;                           /* 通道索引 */
		public int dwChnType;                            /* 通道类型 */
		public int dwChnStatus;                          /* 通道状态 */
		public int dwDevID;                              /* 设备ID */
		public byte[] szDevName=new byte[NETDEV_NAME_MAX_LEN];        /* 设备名称 */
		public byte[]  byRes=new byte[128];                           /* 保留字段   */
	}

	/**
	 * @struct tagstNETDEVIPAddrInfo
	 * @brief IP地址信息
	 * @attention
	 */
	public class NETDEV_IPADDR_INFO_S extends Structure {
		public int   dwType;                            /* 地址类型，参见 枚举 NETDEV_ADDR_TYPE_E */
		public byte[]    szIPAddr=new byte[NETDEV_MAX_URL_LEN];      /* IP地址/域名 */
		public int   dwPort;                            /* 端口号 */
		public byte[]    byRes=new byte[60];                         /* 保留字段 */
	}



	/**
	 * @struct tagstNETDEVUserSimpleInfo
	 * @brief 用户账号信息（用户名＋密码）
	 * @attention
	 */
	public class NETDEV_USER_SIMPLE_INFO_S extends Structure {
		public byte[] szUserName=new byte[NETDEV_USERNAME_LEN];       /* 用户名 */
		public byte[] szPassword=new byte[NETDEV_PASSWORD_LEN];       /* 密码 */
		public byte[] byRes=new byte[64];                             /* 保留字段 */
	}

	/**
	 * @brief Onvif信息
	 * @attention
	 */
	public class NETDEV_ONVIF_INFO_S extends Structure {
		public int   udwTransportMode;                          /* 传输模式，参见 枚举 NETDEV_TRANS_PROTOCOL_E */

		public byte[]  byRes=new byte[128];                                   /* 保留字段  Reserved field*/
	}

	/**
	 * @struct tagNETDEVGBInfo
	 * @brief 国标信息
	 * @attention 无 None
	 */
	public class NETDEV_GBINFO_S extends Structure {
		public byte[]     szUniCode=new byte[NETDEV_LEN_32];      /* 国标资源编码，范围[1, 32]*/
		public int   udwTransport;                  /* 传输模式 0: TCP 1: UDP*/
		public byte[]   byRes=new byte[128];                      /* 保留字节 */
	}

	/**
	 * @struct tagstNETDEVDeviceBasicInfo
	 * @brief 设备基本信息
	 * @attention
	 */
	public class NETDEV_DEV_BASIC_INFO_S extends Structure {
		public NETDEV_IPADDR_INFO_S stDevAddr;                             /* 设备IP地址信息 */
		public NETDEV_USER_SIMPLE_INFO_S stDevUserInfo;                    /* 设备用户名、密码 */
		public byte[] szDevName = new byte[NETDEV_NAME_MAX_LEN];           /* 设备名称 */
		public byte[] szDevDesc = new byte[NETDEV_DESCRIBE_MAX_LEN];       /* 设备描述 */
		public byte[] szDevModel = new byte[NETDEV_CODE_STR_MAX_LEN];      /* 设备型号 */
		public int dwDevID;                                                /* 设备ID */
		public int dwDevStatus;                                            /* 设备状态, 参考# NETDEV_DEVICE_STATUS_E */
		public int dwDevType;                                              /* 设备类型，参考# NETDEV_DEVICE_MAIN_TYPE_E */
		public int dwDevSubType;                                           /* 设备子类型，参考# NETDEV_DEVICE_SUB_TYPE_E */
		public int dwOrgID;                                                /* 组织编号 */
		public int dwAccessProtocol;                                       /* 接入协议 参考# NETDEV_ACCESS_PROTOCOL_E */
		public int dwAccessMode;                                           /* 接入方式 参考# NETDEV_DEVICE_ACCESS_MODE_E*/
		public int dwServerID;                                             /* 所属服务器ID */
		public int dwAudioResID;                                           /* 音频通道ID */
		public int dwIsPTZNeeded ;                                         /* 是否需要云台 0:  不需要 1:  需要 255: 自适应 */
		public byte[]  szVIIDCode = new byte[NETDEV_VIID_CODE_LEN];        /* 视图库编码,仅卡口设备时有效 */
		public int dwVIIDStatus;                                           /* 视图库状态，用来标识当前设备是否已通过视图库协议连接，0：离线 1：在线 */
		public byte[] szSerialNum = new byte[NETDEV_LEN_64];               /* 设备序列号*/
		public byte[] szSoftVersion = new byte[NETDEV_LEN_128];            /* 软件版本号*/
		public byte[] szMacAddr = new byte[NETDEV_LEN_32];                 /* MAC地址*/
		public int dwStoreStatus;                                          /* 设备存储状态。0: 空闲 1: 未格式化 2: 格式化中3: 运行中*/
		public NETDEV_ONVIF_INFO_S stOnvifInfo;                            /* onvif信息 */
		public NETDEV_GBINFO_S stGBInfo;                                   /* 国标信息 当AccessProtocol值为3时该节点必选，其他可选*/
		public Pointer pstSmartLockInfo;                                   /* 锁设备信息 需调用者分配内存 参见#NETDEV_SMART_LOCK_INFO_S# */
		public byte[] szManufacture = new byte[NETDEV_LEN_64];             /* 厂商名称 */
		public byte[] szDeviceCode = new byte[NETDEV_LEN_32];              /* 设备编码 [1,32] 添加播放盒时必选  */
		public Pointer  pstPlayerInfo;                                     /* 播放盒信息 参见#NETDEV_IPM_PLAYER_BASIC_INFO_S# 当Type为11时必选 需要malloc分配内存 */
		public int  udwCustomProtocolID;                                   /* 自定义协议ID，当AccessProtocol值为4时该节点必选 */
		public int  udwChlMaxNum;                                          /* 设备通道号最大数量，当AccessProtocol值为4时该节点必选 */
		public int  udwChlIndexNum;                                        /* 设备通道号数量，当AccessProtocol值为4时该节点必选，上限256 */
		public Pointer pudwChlIndexList;                                   /* 通道号列表，需动态分配内存，建议分配256个 */
	    public int dwImageProtocol;                                        /* 图片协议，设备类型Type为5智能设备时必带 1:私有 2:视图库 */
	}

	/*
	 * @struct tagNETDEVPlayerBasicInfo
	 * @brief 播放盒信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_IPM_PLAYER_BASIC_INFO_S extends Structure {
		public int                          udwPlayerID;                            /* 播放盒ID */
		public int                          udwVendor;                              /* 厂商 添加播放盒时必选 见 NETDEV_DEVICE_IPM_VENDORS_ID_E */
		public int                          udwModel;                               /* 型号 添加播放盒时必选 见 NETDEV_DEVICE_IPM_MODEL_ID_E */
		public byte[]                       szPlayerName = new byte[NETDEV_LEN_128];           /* 播放盒名称 [1,64] */
		public int                          udwOrgID;                               /* 组织ID 播放盒信息查询时必选 */
		public byte[]                       szOrgName = new byte[NETDEV_LEN_128];              /* 组织名称 [1,64] 播放盒信息查询时必选 */
		public byte[]                       szPlayerMngtServerName = new byte[NETDEV_LEN_128]; /* 播放盒管理设备名称 [1, 64] 播放盒信息查询时必选 */
		public byte[]                       szPlayerMngtServerIP = new byte[NETDEV_LEN_32];    /* 播放盒管理设备IP 播放盒信息查询时必选 */
		public int        					stResolution;                           /* 屏幕像素 参见#NETDEV_XW_RESOLUTION_S# */
		public byte[]                       byRes = new byte[256];                             /* 保留字段 */
}
	/**
	 * @brief IPM 设备型号ID
	 * @attention 无 None
	 */
	public static class NETDEV_DEVICE_IPM_MODEL_ID_E extends Structure {
	    public static final int	NETDEV_DEVICE_IPM_MODEL_EDU_B1XX          = 0;            /* EDU-B1XX系列 */
	    public static final int	NETDEV_DEVICE_IPM_MODEL_C                 = 1;            /* C系列 */
	    public static final int	NETDEV_DEVICE_IPM_MODEL_BX_6QX_YD         = 2;            /* BX-6QX-YD */
	    public static final int	NETDEV_DEVICE_IPM_MODEL_BX_5EX            = 3;            /* BX-5EX系列 */

	    public static final int	NETDEV_DEVICE_IPM_MODEL_PSD_100           = 100;          /* PSD-100 */

	    public static final int	NETDEV_DEVICE_IPM_MODEL_UNKNOW            = 0xFF;          /* 未知厂商 */
	}


	/**
	 * @brief 分辨率信息
	 * @attention
	 */
	public class NETDEV_XW_RESOLUTION_S extends Structure {
		public int   udwWidth;       /* 宽 */
		public int   udwHeight;      /* 高 */
	}

	/**
	 * @struct tagNETDEVSmartLockInfo
	 * @brief 智能锁信息
	 * @attention 无 None
	 */
	public class NETDEV_SMART_LOCK_INFO_S extends Structure {
		public int udwType;                         /* 锁类型 0: WIFI锁 1: NBIoT锁 */
		public int udwSignal;                       /* 锁信号 详见 NETDEV_LOCK_SIGNAL_E */
		public int udwStatus;                       /* 锁状态 0：在线  1：离线*/
		public int udwBatteryPercent;               /* 电量，取值范围[0,100] */
		public byte[]   szSN = new byte[NETDEV_LEN_64];             /* 锁设备序列号，字符串范围[0,20] */
		public byte[]   szIMEI = new byte[NETDEV_LEN_64];           /* 国际移动设备识别码 Type为1时携带,字符串长度范围[1,16] */
		public byte[]   szVersion = new byte[NETDEV_LEN_256];       /* 锁版本信息 字符串长度范围[1,64] */
		public byte[]   szRoomName = new byte[NETDEV_LEN_480];      /* 绑定房间名称 字符串长度范围[1, 128]*/
		public byte[]   byRes = new byte[128];                      /* 保留字节 */
	}

	/**
	 * @struct tagstNETDEVDevChnBaseInfo
	 * @brief 设备通道基本信息
	 * @attention
	 */
	public class NETDEV_DEV_CHN_BASE_INFO_S extends Structure {
		public int dwChannelID;                                      /* 通道ID */
		public int dwDevID;                                          /* 设备ID */
		public int dwOrgID;                                          /* 组织ID */
		public int dwChnType;                                        /* 通道类型，参见  NETDEV_CHN_TYPE_E */
		public int dwChnStatus;                                      /* 通道状态, 参见  NETDEV_CHN_STATUS_E */
		public int dwChnIndex;                                       /* 通道索引 */
		public byte[] szChnName=new byte[NETDEV_NAME_MAX_LEN];                    /* 通道名称 */
		public int udwRight;                                        /* 通道权限 */
		public int udwAbnormalReason;                               /* 视频通道异常的原因 参见 NETDEV_CHN_OFFLINE_REASON_E */
		public byte[]   byRes=new byte[124];                                      /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVStreamFormatInfo
	 * @brief 视频编码格式信息
	 * @attention
	 */
	public class NETDEV_STREAM_FORMAT_INFO_S extends Structure {
		public int		udwStreamIndex;             /* 视频流索引 参考 NETDEV_LIVE_STREAM_INDEX_E */
		public int   	udwEncodeFormat;            /* 编码格式 参考 NETDEV_VIDEO_CODE_TYPE_E */
		public byte[] 	byRes=new byte[128]; 		/* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVDevChnEncodeInfo
	 * @brief 设备编码通道信息
	 * @attention
	 */
	public class NETDEV_DEV_CHN_ENCODE_INFO_S extends Structure {
		public NETDEV_DEV_CHN_BASE_INFO_S  	stChnBaseInfo;                                  /* 通道基本信息 */
		public int                       	dwMaxStream;                                    /* 支持的最大流个数 */
		public NETDEV_STREAM_FORMAT_INFO_S[] astStreamFormatList=new NETDEV_STREAM_FORMAT_INFO_S[NETDEV_STREAM_MAX_NUM];     /* 媒体流编码格式列表 */
		public int		bSupportPTZ;                              	/* 是否支持云台 */
		public int   	bScrambleEnable;                         	/* 码流是否加扰使能 */
		public int   	dwAudioResID;                           	/* 音频资源ID */
		public byte[]  	szGBResID=new byte[NETDEV_LEN_32];       	/* 国标资源ID */
		public byte[] 	byRes=new byte[224];                  		/* 保留字段 */
	}

	/**
	 * @brief 云台预置位信息 结构体定义 PTZ preset information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PTZ_PRESET_S extends Structure {
		public int   dwPresetID;                                 /* 预置位ID  Preset ID */
		public byte[]    szPresetName=new byte[NETDEV_LEN_32];                /* 预置位名称  Preset name */
	}

	/**
	 * @brief 所有云台预置位 结构体定义 All PTZ presets Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PTZ_ALLPRESETS_S extends Structure {
		public int               dwSize;                             /* 预置位总数  Total number of presets */
		public NETDEV_PTZ_PRESET_S[] astPreset=new NETDEV_PTZ_PRESET_S[NETDEV_MAX_PRESET_NUM];   /* 预置位信息结构体  Structure of preset information */
	}

	/**
	 * @brief 云台预置位巡航轨迹点信息 结构体定义 PTZ preset patrol point information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_CRUISE_POINT_S extends Structure {
		public int   dwPresetID;     /* 预置位ID  Preset ID */
		public int   dwStayTime;     /* 停留时间  Stay time */
		public int   dwSpeed;        /* 转动速度,范围[1-10]  Speed [1-10] */
		public int   dwID;           /* 巡航动作ID */
	}


	/**
	 * @brief 云台预置位巡航路径详细信息 结构体定义 PTZ preset patrol route information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_CRUISE_INFO_S extends Structure {
		public int  	dwCuriseID;                                     /* 轨迹ID  Route ID */
		public byte[]	szCuriseName=new byte[NETDEV_LEN_32];                    /* 轨迹名称  Route name */
		public int    	dwSize;                                         /* 路径包含的轨迹点数量  Number of presets included in the route */
		public NETDEV_CRUISE_POINT_S[] astCruisePoint=new NETDEV_CRUISE_POINT_S[NETDEV_MAX_CRUISEPOINT_NUM];     /* 路径包含的轨迹点信息   Information of presets included in the route */

	}

	/**
	 * @brief 云台预置位巡航路径列表 结构体定义 PTZ preset patrol route list Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_CRUISE_LIST_S extends Structure {
		public int                   dwSize;                                         /* 巡航路径数量  Number of patrol routes */
		public NETDEV_CRUISE_INFO_S[]    astCruiseInfo=new NETDEV_CRUISE_INFO_S[NETDEV_MAX_CRUISEROUTE_NUM];      /* 巡航路径信息  Information of patrol routes */
	}

	/**
	 * @brief 通道权限信息 结构体定义
	 * @attention 无
	 */
	public class NETDEV_CHN_PERMISSION_INFO_S extends Structure {
		public int     dwChannelID;             /* 通道号 */
		public int     dwPermission;            /* 通道权限, 请参考#NETDEV_CHN_PERMISSION_TYPE_E */
		public byte[]  byRes = new byte[256];   /* 保留字段  Reserved */
	}

	/**
	 * @brief用户详细信息
	 * @attention
	 */
	public class NETDEV_USER_DETAIL_INFO_S extends Structure {
		public int      udwLevel;                                          /* 用户等级  参见 枚举  NETDEV_USER_LEVEL_E*/
		public byte[]   szUserName=new byte[NETDEV_LEN_64];                /* 用户名 不支持修改，获取单个信息时作为入参 范围1~18*/
		public byte[]	szPassword=new byte[NETDEV_LEN_256];               /* 密码 添加使用 范围0~256 获取时不返回该字段*/
		public int      udwBasePermission;                                 /* 基本权限，参见 枚举 NETDEV_USER_BASE_PERMISSION_E 按BIT位进行权限描述，相应BIT为1，表示该权限生效，为0表示该权限不生效*/
		public int      udwNum;                                            /* 视频输入通道数量 */
		public NETDEV_CHN_PERMISSION_INFO_S[]   astChnPermission = new NETDEV_CHN_PERMISSION_INFO_S[NETDEV_CHANNEL_MAX];              /* 通道权限列表 */
		public byte[]	byRes= new byte[256];                                        /* 保留字段 */
	}

	/**
	 * @brief修改用户详细信息
	 * @attention
	 */
	public class NETDEV_USER_MODIFY_DETAIL_INFO_S extends Structure {
		public NETDEV_USER_DETAIL_INFO_S      stUserInfo;
		public int   	bIsModifyPassword;                       	/* 是否修改密码, 修改时赋值 */
		public int    	bIsModifyOther;                          	/* 是否管理员修改其他用户, 修改时赋值 */
		public byte[]	szNewPassword=new byte[NETDEV_LEN_256];   	/* 新密码(修改密码时使用)，范围0~256 不涉及密码的修改 那么该字段可不下发，如果配置时，密码为空，则下发空字段*/
		public byte[]	szCurrentPassword=new byte[NETDEV_LEN_256];	/* 当前使用的密码 修改密码时携带 范围0~256 管理员修改其他用户密码只需要新密码则可，如果配置时，密码为空，则下发空字段*/
		public byte[] 	byRes=new byte[256];                        /* 保留字段 */
	}

	/**
	 * @brief用户信息列表
	 * @attention
	 */
	public class NETDEV_USER_DETAIL_LIST_S extends Structure {
		public int                      udwNum;                          /* 用户数量 */
		public NETDEV_USER_DETAIL_INFO_S[]   astUserInfo = new NETDEV_USER_DETAIL_INFO_S[NETDEV_LEN_64];     /* 用户列表 */
		public byte[] byRes = new byte[128];                      /* 保留字段 */
	}

	/**
	 * @brief 录像查找 结构体定义 Recording query Structure definition
	 *        根据文件类型.时间查找设备录像文件 Query recording files according to file type and time
	 * @attention 无 None
	 */
	public class NETDEV_FILECOND_S extends Structure {
		public byte[]    szFileName=new byte[NETDEV_LEN_64];      /* 录像文件名  Recording file name */
		public int   dwChannelID;                    /* 通道号  Channel ID */
		public int   dwStreamType;                   /* 码流类型,参见 枚举 #NETDEV_LIVE_STREAM_INDEX_E  Stream type, see enumeration #NETDEV_LIVE_STREAM_INDEX_E */
		public int   dwFileType;                     /* 录像存储类型,参见 枚举 #NETDEV_STORE_TYPE_E  Recording storage type, see enumeration #NETDEV_STORE_TYPE_E */
		public long  tBeginTime;                     /* 起始时间  Start time */
		public long  tEndTime;                       /* 结束时间  End time */
		public int   dwRecordLocation;               /* 录像存储位置 Record Position, 参见 枚举 #NETDEV_RECORD_LOCATION_E */
		public int   udwServerID;                    /* 录像所属服务器ID Video server ID */
		public byte[]    byRes=new byte[28];                      /* 保留字段  Reserved */
	}

	/**
	 * @brief 录像查找数据 结构体定义 Recording query data Structure definition
	 *        逐个获取查找到的文件信息 Get the information of found files one by one
	 * @attention 无 None
	 */
	public class NETDEV_FINDDATA_S extends Structure {
		public byte[]    szFileName=new byte[NETDEV_FILE_NAME_LEN];		/* 录像文件名  Recording file name */
		public long   tBeginTime;                                     	/* 起始时间  Start time */
		public long   tEndTime;                                       	/* 结束时间  End time */
		public char    byFileType;                                     	/* 录像存储类型  参见 枚举 #NETDEV_STORE_TYPE_E Recording storage type #NETDEV_STORE_TYPE_E */
		public int  udwServerID;                                    	/* 录像所属服务器ID */
		public int  udwFileSize;                                    	/* 录像文件大小 Recording file size */
		public int  dwFileType;                                         /* 文件类型，参考# NETDEV_RECORD_SEARCH_TYPE_E ，暂内部使用 */
		public byte[]    byRes=new byte[159];                      		/* 保留字段  Reserved */
	}

	/**
	 * @brief 按时间回放录像参数 结构体定义 Parameters of play back by time Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PLAYBACKCOND_S extends Structure {
		public int   dwChannelID;                /* 回放的通道  Playback channel */
		public long   tBeginTime;                 /* 回放开始时间  Playback start time */
		public long   tEndTime;                   /* 回放结束时间  Playback end time */
		public int   dwLinkMode;                 /* 传输协议，参见 枚举 #NETDEV_TRANS_PROTOCAL_E */
		public Pointer  hPlayWnd;                   /* 播放窗口句柄  Play window handle */
		public int   dwFileType;                 /* 录像存储类型，参见 枚举 #NETDEV_STORE_TYPE_E  */
		public int   dwDownloadSpeed;            /* 下载速度 参见 枚举 #NETDEV_E_DOWNLOAD_SPEED_E  Download speed, see enumeration #NETDEV_E_DOWNLOAD_SPEED_E */
		public int   dwStreamMode;               /* 启流模式，参见 枚举 #NETDEV_STREAM_MODE_E  stream mode see #NETDEV_STREAM_MODE_E */
		public int   dwStreamIndex;              /* 存储码流类型, 参见 枚举 #NETDEV_LIVE_STREAM_INDEX_E */
		public int   dwRecordLocation;           /* 录像存储位置 Record Position, 参见 枚举 #NETDEV_RECORD_LOCATION_E */
		public int   dwTransType;                /* 传输类型，参见 枚举 #NETDEV_TRANS_TYPE_E */
		public int    bCloudStorage;              /* 是否开启云存储回放模式 */
		public int    bOneFrameEnable;            /* 是否开启单帧解码模式，开启后对解码效率有影响 */
		public int   dwPlaySpeed;                /* 回放播放速度，参考枚举 #NETDEV_VOD_PLAY_STATUS_E  Playback speed, see enumeration #NETDEV_VOD_PLAY_STATUS_E*/
		public NETDEV_DECODE_VIDEO_DATA_CALLBACK_PF cbPlayDecodeVideoCALLBACK;       /* 解码后数据回调函数 NETDEV_DECODE_VIDEO_DATA_CALLBACK_PF Decode data callback function */
		public long   tPlayTime;                  /* 播放时间  Playback time */
		public int  udwServerID;                /* 录像所属服务器ID Video server ID */
		public byte[]    byRes=new byte[212];                 /* 保留字段   */
	}

	/**
	 * @brief 设备基本信息 结构体定义 Basic device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_DEVICE_BASICINFO_S extends Structure {
		public byte[] szDevModel=new byte[NETDEV_LEN_64];                     /* 设备型号  Device model */
		public byte[] szSerialNum=new byte[NETDEV_LEN_64];                    /* 硬件序列号  Hardware serial number */
		public byte[] szFirmwareVersion=new byte[NETDEV_LEN_64];              /* 软件版本号  Software version */
		public byte[] szMacAddress=new byte[NETDEV_LEN_64];                   /* IPv4的Mac地址  MAC address of IPv4 */
		public byte[] szDeviceName=new byte[NETDEV_LEN_64];                   /* 设备名称  Device name */
		public byte[] szManufacturer=new byte[NETDEV_LEN_64];                 /* 厂商信息  Manufacturer */

		public byte[] byRes=new byte[384];                                    /* 保留字段  Reserved */
	}

	/**
	 * @brief 地址 结构体定义 Address Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_SYSTEM_IPADDR_S extends Structure {
		public int   eIPType;                            /* 协议类型参见 枚举 #NETDEV_HOSTTYPE_E  Protocol type, see enumeration #NETDEV_HOSTTYPE_E */
		public byte[]    szIPAddr=new byte[NETDEV_LEN_132];           /* IP地址  IP address */
	}

	/**
	 * @brief  NTP参数 NTP parameter
	 * @attention 无 None
	 */
	public class NETDEV_SYSTEM_NTP_INFO_S extends Structure {
		public int bSupportDHCP;                      /* 是否支持DHCP  Support DHCP or not */
		public NETDEV_SYSTEM_IPADDR_S stAddr;          /* NTP 信息  NTP information */
	}

	public class NETDEV_SYSTEM_IPADDR_INFO_S extends Structure {
		public int         bEnabled;                      /*NTP服务器使能 0：不开启  1：开启  NTP Server enable 0:unable  1:enable */
		public long        ulAddressType;                    /*地址类型 0：IPv4  1：IPv6(暂不支持)  2: 域名（NVR和一体机支持） Address type  0:IPv4  1:IPv6(Temporary does not support)  2:domain name(NVR and AIO support)*/
		public byte[] szIPAddress=new byte[NETDEV_LEN_64];     /* NTP服务器IP地址，字符长度范围[0, 64] AddressType 为0时，该节点必选
	                                                 The IP address of the NTP server ,character length range [0,64]. When address type is 0,the node must be selected. */
		public byte[]szDomainName=new byte[NETDEV_LEN_64];    /*NTP服务器域名，字符长度范围[ [0， 64] AddressType 为2时，该节点必选
	                                                 The domain name of the NTP server ,character length range [0,64]. When address type is 2,the node must be selected.*/
		public long         ulPort;                        /*NTP端口，范围[1-65535]  IPC不支持配置。 NTP Port ,the range of [1-65535]. IPC does not support this configuration. */
		public long         ulSynchronizeInterval;         /*更新间隔 NVR、VMS支持范围： 5/10/15/30分钟，1/2/3/6/12h，1天，1周。IPC支持范围：30-3600s，以上时间周期，都需要转换为秒为单位的时间值。
	                                                 Synchronize Interval: The support range of NVR and VMS is 5/10/15/30 minutes ,1/2/3/6/12 hours ,1 day ,and 1 week.The support range of IPC is 30-3600 seconds.
	                                                 All of the above time periods need to be converted to a time value in seconds.*/
		public byte[] byRes=new byte[128];                    /*保留字段  Reserved*/
	}

	public class NETDEV_SYSTEM_NTP_INFO_LIST_S extends Structure {
		public long   ulNum;                                             /*NTP服务器个数  NTP Server Number*/
		public NETDEV_SYSTEM_IPADDR_INFO_S[] astNTPServerInfoList=new NETDEV_SYSTEM_IPADDR_INFO_S[NETDEV_NTP_SERVER_LIST_NUM];  /*NTP服务器列表当前只支持一个NTP服务器 The NTP server list currently supports only one NTP server.*/
		public byte[] byRes=new byte[128];
	}

	/**
	 * @brief 通道视频流信息 结构体定义 Channel video stream information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_STREAM_INFO_S extends Structure {
		public int enStreamType;       /* 码流索引 NETDEV_LIVE_STREAM_INDEX_E, Stream index */
		public int bEnableFlag;        /* 是否启用  Enable or not */
		public int dwHeight;           /* 视频编码分辨率-Height  Video encoding resolution - Height */
		public int dwWidth;            /* 视频编码分辨率-Width  Video encoding resolution - Width */
		public int dwFrameRate;        /* 视频编码配置帧率  Video encoding configuration frame rate */
		public int dwBitRate;          /* 码率  Bit rate */
		public int enCodeType;         /* 视频编码格式  NETDEV_VIDEO_CODE_TYPE_E, Video encoding format */
		public int enQuality;          /* 图像质量 NETDEV_VIDEO_QUALITY_E, Image quality */
		public int dwGop;              /* I帧间隔  I-frame interval */
		public int bConstantBitRate;   /* 是否为定码率 0:变码率 1:定码率 Constant Bit Rate or Variable bit rate;0:Variable 1:Constant*/
		public byte[] byRes=new byte[28];          /* 保留字段  Reserved */
	}

	/**
	 * @brief 视频编码参数信息 Video encoding parameter
	 * @attention
	 */
	public class NETDEV_VIDEO_ENCODE_INFO_S extends Structure {
		public int bEnableSVCMode;                        /* SVC配置,0：关闭,1：开启 SVC configuration. 0-Off, 1-On*/
		public int udwEncodeFormat;                     /* 视频编码格式信息，参见 枚举 NETDEV_VIDEO_CODE_TYPE_E。  Video Compression. For enumeration, seeNETDEV_VIDEO_CODE_TYPE_E*/
		public int udwWidth;                            /* 图像宽度 Image width*/
		public int udwHeight;                           /* 图像高度 Image height*/
		public int udwBitrate;                          /* 码率 Bit rate*/
		public int udwBitrateType;                      /* 码率类型，参见 NETDEV_BIT_RATE_TYPE_E。 Bitrate type. See NETDEV_BIT_RATE_TYPE_E for reference */
		public int udwFrameRate;                        /* 帧率 Frame rate*/
		public int udwGopType;                          /* Gop模式,参见 NETDEV_GOP_TYPE_E。 GOP mode. See NETDEV_GOP_TYPE_E for reference */
		public int udwIFrameInterval;                   /* I帧间隔，范围根据能力来定 I Frame Interval. The range depends on capability*/
		public int udwImageQuality;                     /* 图像质量，范围[1, 9]，9代表图像质量最高 Image quality, ranges from 1 to 9. 9 means the highest quality*/
		public int udwSmoothLevel;                      /* 码流平滑等级，范围[1,9]，1代表平滑级别最低 Smoothing level, ranges from 1 to 9. 1 means the lowest level*/
		public int udwSmartEncodeMode;                  /* 智能编码模式，参见 NETDEV_SMART_ENCODE_MODE_E。 Smart encoding mode. See NETDEV_SMART_ENCODE_MODE_E for reference*/
	}

	/**
	 * @brief 视频流信息(LAPI) Video stream info(LAPI)
	 * @attention
	 */
	public class NETDEV_VIDEO_STREAM_INFO_EX_S extends Structure {
		public int bEnabled;                                                                  /* 视频流是否启用编码 Enable encoding for video stream or not*/
		public int udwStreamID;                                                             /* 码流索引，参见 枚举 NETDEV_LIVE_STREAM_INDEX_E。 Stream index. For enumeration, seeNETDEV_LIVE_STREAM_INDEX_E*/
		public int udwMainStreamType;                                                       /* 主码流类型，参见 NETDEV_MAIN_STREAM_TYPE_E。 Main stream. See NETDEV_MAIN_STREAM_TYPE_E for reference */
		public NETDEV_VIDEO_ENCODE_INFO_S stVideoEncodeInfo;                                   /* 视频编码参数信息 Video encoding parameter*/
	}

	/**
	 * @brief 视频流信息列表 Video stream list
	 * @attention
	 */
	public class NETDEV_VIDEO_STREAM_INFO_LIST_S extends Structure {
		public int udwNum;                                                              /* 视频流个数 Number of video stream*/
		public NETDEV_VIDEO_STREAM_INFO_EX_S[] astVideoStreamInfoList = new NETDEV_VIDEO_STREAM_INFO_EX_S[NETDEV_LEN_16];        /* 视频流信息列表 Video stream list*/
	}

	/**
	 * @brief 视频制式能力 Video mode capability
	 * @attention
	 */
	public class NETDEV_VIDEO_MODE_INFO_S extends Structure {
		public int udwWidth;                                      /* 图像宽度 Image width*/
		public int udwHeight;                                     /* 图像高度 Image height*/
		public int udwFrameRate;                                  /* 图像帧率 Image frame rate*/
	}

	/**
	 * @brief  区域 Area
	 * @attention 无 None
	 */
	public class NETDEV_AREA_SCOPE_S extends Structure {
		public int  dwLocateX;             /** 顶点x坐标值[0,10000] * Coordinates of top point x [0,10000] */
		public int  dwLocateY;             /** 顶点y坐标值[0,10000] * Coordinates of top point y [0,10000] */
	}

	/**
	 * @brief OSD时间配置信息 OSD time configuration information
	 * @attention 无 None
	 */
	public class NETDEV_OSD_TIME_S extends Structure {
		public int                    bEnableFlag;        /** 时间OSD使能, BOOL_TRUE为使能,BOOL_FALSE为非使能 * Enable time OSD, BOOL_TRUE means enable and BOOL_FALSE means disable */
		public int                    bWeekEnableFlag;    /** 是否显示星期(预留) * Display week or not (reserved) */
		public NETDEV_AREA_SCOPE_S     stAreaScope;        /** 区域坐标 * Area coordinates */
		public int                  udwTimeFormat;      /** 时间OSD时间格式,详见 NETDEV_OSD_TIME_FORMAT_CAP_E * Time OSD format, see NETDEV_OSD_TIME_FORMAT_E */
		public int                  udwDateFormat;      /** 日期OSD时间格式,详见 NETDEV_OSD_DATE_FORMAT_CAP_E * Date OSD format, see NETDEV_OSD_TIME_FORMAT_E */
	}

	/**
	 * @brief OSD字符叠加信息 OSD text overlay information
	 * @attention
	 */
	public class NETDEV_OSD_TEXT_OVERLAY_S extends Structure {
		public int  				bEnableFlag;                /** OSD字符叠加使能, BOOL_TRUE为使能,BOOL_FALSE为非使能 * Enable OSD text overlay, BOOL_TRUE means enable and BOOL_FALSE means disable */
		public NETDEV_AREA_SCOPE_S	stAreaScope;                /** OSD字符叠加区域坐标 * OSD text overlay area coordinates */
		public byte[]            	szOSDText=new byte[NETDEV_OSD_TEXT_MAX_LEN];    /** OSD字符叠加名称字符串 * OSD text overlay name strings */
		public byte[]            	byRes=new byte[4];                               /* 保留字段  Reserved */
	}

	/**
	 * @brief 通道OSD的基本属性信息 Basic channel OSD information
	 * @attention
	 */
	public class NETDEV_VIDEO_OSD_CFG_S extends Structure {
		public NETDEV_OSD_TIME_S         stTimeOSD;        /* 通道的时间OSD信息  Information of channel time OSD */
		public NETDEV_OSD_TEXT_OVERLAY_S stNameOSD;        /* 通道的名称OSD信息  Information of channel name OSD */
		public short                     wTextNum;         /* 字符OSD个数  Text OSD number */
		public NETDEV_OSD_TEXT_OVERLAY_S[] astTextOverlay=new NETDEV_OSD_TEXT_OVERLAY_S[NETDEV_OSD_TEXTOVERLAY_NUM];   /* 通道OSD字符叠加信息  Information of channel OSD text overlay */
	}

	/**
	 * @struct tagNETDEVChlOsdCfg
	 * @brief 通道OSD配置
	 * @attention
	 */
	public class NETDEV_CHL_OSD_CFG_S extends Structure {
		public int dwOsdID;                                      /* OSD ID */
		public int enOsdTextType;               /* OSD类型,NETDEV_OSD_TEXT_TYPE_E */
		public NETDEV_AREA_SCOPE_S stAreaScope;                    /* OSD坐标 */
		public byte[] szTextInfo=new byte[NETDEV_OSD_TEXT_MAX_LEN];           /* OSD内容 */
	}

	/**
	 * @struct tagNETDEVChlOsdCfgList
	 * @brief 通道OSD配置列表
	 * @attention
	 */
	public class NETDEV_CHL_OSD_CFG_LIST_S extends Structure {
		public int dwSize;                                               /* OSD个数 */
		public NETDEV_CHL_OSD_CFG_S[] stChlOsdCfg=new NETDEV_CHL_OSD_CFG_S[NETDEV_OSD_MAX_NUM_EX];    /* OSD配置 */
	}

	/**
	 * @brief 内容信息 Content
	 * @attention
	 */
	public class NETDEV_CONTENT_INFO_S extends Structure {
		public int udwContentType;                        /* OSD内容类型,参见 枚举 NETDEV_OSD_CONTENT_TYPE_E OSD content type. For enumeration, see NETDEV_OSD_CONTENT_TYPE_E*/
		public byte[]   szOSDText=new byte[NETDEV_OSD_TEXT_MAX_LEN];    /* OSD文本信息 OSD text*/
	}

	/**
	 * @brief 通道OSD内容信息 Channel OSD content
	 * @attention
	 */
	public class NETDEV_OSD_CONTENT_INFO_S extends Structure {
		public int   bEnabled;                                        /* OSD区域使能 Enable OSD area*/
		public int udwOSDID;                                        /* OSD区域序号，范围[0,7] Area No., ranges from 0 to 7.*/
		public int udwAreaOSDNum;                                   /* 当前区域内OSD数目 Number of OSD in current area*/
		public int udwTopLeftX;                                     /* OSD区域横坐标,范围[0,9999] X-axis of OSD area, ranges from 0 to 999*/
		public int udwTopLeftY;                                     /* OSD区域纵坐标,范围[0,9999] Y-axisof OSD area, ranges from 0 to 999*/
		public NETDEV_CONTENT_INFO_S[] astContentInfo=new NETDEV_CONTENT_INFO_S[NETDEV_LEN_8];     /* 当前区域内OSD内容信息 OSD content in current area*/
	}

	/**
	 * @brief 通道OSD所有内容 All contents of channel OSD
	 * @attention
	 */
	public class NETDEV_OSD_CONTENT_S extends Structure {
		public int                    udwNum;                          /* OSD区域数量 Number of OSD area*/
		public NETDEV_OSD_CONTENT_INFO_S[] astContentList=new NETDEV_OSD_CONTENT_INFO_S[NETDEV_LEN_32];   /* OSD区域内容信息列表 Content list of OSD area*/
	}

	/**
	 * @brief 通道OSD内容样式 Display Style of channel OSD
	 * @attention
	 */
	public class NETDEV_OSD_CONTENT_STYLE_S extends Structure {
		public int udwFontStyle;                         /* 字体形式，参见 枚举 NETDEV_OSD_FONT_STYLE_E。  Font style. For enumeration, seeNETDEV_OSD_FONT_STYLE_E*/
		public int udwFontSize;                          /* 字体大小，参见 枚举 NETDEV_OSD_FONT_SIZE_E。  Font Size. For enumeration, seeNETDEV_OSD_FONT_SIZE_E*/
		public int udwColor;                             /* 颜色 Color*/
		public int udwDateFormat;                        /* 日期格式，参见 枚举 NETDEV_OSD_DATE_FORMAT_E。  Date Format. For enumeration, seeNETDEV_OSD_DATE_FORMAT_E */
		public int udwTimeFormat;                        /* 时间格式，参见 枚举 NETDEV_OSD_TIME_FORMAT_E。  Date Format. For enumeration, seeNETDEV_OSD_DATE_FORMAT_E */
		public int[] audwFontAlignList=new int[NETDEV_LEN_8];      /* 区域内字体对齐，固定8个区域，IPC支持,参见 枚举 NETDEV_OSD_ALIGN_E。  Font align in area, 8 areasfixed, IPcamera supported. For enumeration, seeNETDEV_OSD_ALIGN_E */
		public int udwMargin;                            /* 边缘空的字符数，IPC支持，参见 枚举 NETDEV_OSD_MIN_MARGIN_E。  Number of character with margin, IP camera supported. For enumeration, seeNETDEV_OSD_MIN_MARGIN_E */
	}

	/**
	 * @brief  告警开关量输出信息 结构体定义 Alarm boolean outputs info Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_ALARM_OUTPUT_INFO_S extends Structure {
		public byte[]	szName=new byte[NETDEV_LEN_64];                  /* 开关量名称  Boolean name */
		public int   dwChancelId;                            /* 通道号 Channel ID */
		public int   enDefaultStatus;                        /* 输出开关量默认状态 参见 #NETDEV_BOOLEAN_MODE_E  Default status of boolean output, see enumeration #NETDEV_BOOLEAN_MODE_E */
		public int   dwDurationSec;                          /* 告警持续时间 单位 S  Alarm duration (s) */
		public int   dwOutputNum;                            /* 告警输出序号 Alarm output serial number */
	}

	/**
	 * @brief  所有告警开关量输入信息 结构体定义 All Alarm boolean outputs info Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_ALARM_OUTPUT_LIST_S extends Structure {
		public int                        dwSize;                                                 /* 开关量数量   Number of booleans  */
		public NETDEV_ALARM_OUTPUT_INFO_S[]  astAlarmOutputInfo=new NETDEV_ALARM_OUTPUT_INFO_S[NETDEV_MAX_ALARM_OUT_NUM];           /* 开关量配置信息  Boolean configuration information */
	}

	/**
	 * @brief  触发开关量输入告警 结构体定义 Trigger boolean output alarm Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_TRIGGER_ALARM_OUTPUT_S extends Structure {
		public byte[]	szName=new byte[NETDEV_LEN_64];        /* 开关量名称  Boolean name */
		public int  enOutputState;      /* 触发状态,参考枚举 #NETDEV_RELAYOUTPUT_STATE_E  Trigger status, see enumeration #NETDEV_RELAYOUTPUT_STATE_E */
	}

	/**
	 * @struct tagNETDEVStructAlarmInfo
	 * @brief 结构化告警上报信息
	 * @attention 无 None
	 */
	class NETDEV_STRUCT_ALARM_INFO_S extends Structure
	{
		public byte[]   szReference = new byte[NETDEV_LEN_260];                   /* 描述信息 */
		public int udwTimeStamp;                                  /* 告警时间 从1970年1月1日0点开始的秒数 */
		public int udwSeq;                                        /* 告警序号 */
		public int udwSrcID;                                      /* 告警源ID */
		public byte[]   szSrcName = new byte[NETDEV_LEN_260];                     /* 告警源名称 */
		public int udwNotificationType;                           /* 通知类型 0：实时通知 1：历史通知 */
		public byte[]   szDeviceID = new byte[NETDEV_LEN_32];                     /* 告警设备ID，国标协议接入时填写国标注册码。长度[1,32] */
		public byte[]   szRelatedID = new byte[NETDEV_LEN_64];                    /* 关联ID，告警和数据关联；或多通道目标数据的关联，同一个相机内全局唯一。长度为15个字符 */
		public byte[]   byRes = new byte[32];                                    /* 保留字段 */
	}
	
	/**
     * @struct tagNETDEVPointInfo
     * @brief 检测区域图形顶点坐标信息
     * @attention 无 None
     */
    class NETDEV_POINT_INFO_S extends Structure
    {
        
        public int udwX;                                /* X轴坐标，范围[0,10000]  */ 
        public int udwY;                                /* Y轴坐标，范围[0,10000] */                                                          
        public byte[]   byRes = new byte[32];           /* 保留字段 */
    }
    
    /**
     * @struct tagNETDEVRuleInfo
     * @brief 规则信息
     * @attention 无 None
     */
    class NETDEV_RULE_INFO_S extends Structure
    {
        
        public int udwRuleType;                                /* 规则类型 参见 NETDEV_RULE_TYPE_E */ 
        public int udwTrigerType;                              /* 规则触发类型 参见 NETDEV_RULE_TRIGGER_TYPE_E */                                    
        public int udwPointNum;                                /* 规则坐标点数量 */                                 
        public Pointer  pstPointInfo;                          /* 检测区域图形各顶点坐标,在顶点个数为0时，这个节点可以没有  NETDEV_POINT_INFO_S  */                         
        public byte[]   byRes = new byte[64];                  /* 保留字段 */
    }

	/**
	 * @struct tagNETDEVFaceAttr
	 * @brief 人脸属性信息
	 * @attention 无 None
	 */
	public class NETDEV_FACE_ATTR_S extends Structure
	{
		public int udwGender;                                     /* 性别 详见 NETDEV_GENDER_TYPE_E */
		public int udwAgeRange;                                   /* 年龄段 详见 NETDEV_AGE_RANGE_E */
		public int udwGlassFlag;                                  /* 是否戴眼镜标志 详见 NETDEV_GLASS_FLAG_E */
		public int udwGlassesStyle;                               /* 眼镜款式 详见 NETDEV_GLASSES_STYLE_E */
		public int udwMask;                                       /* 口罩 详见 NETDEV_MASK_FLAG_E */
		public float fTemperature;                                /* 体温 单位：摄氏度 精度：小数点后2位 */
		public int udwEmotion;                                    /* 情绪情况，未检测时可选 参见 NETDEV_EMOTION_FLAG_E */
		public int udwSmile;                                      /* 是否微笑，未检测时可选 详见 NETDEV_SMILE_FLAG_E */
		public int udwAttractive;                                 /* 颜值，未检测时可选 数值范围[0~100] */
		public int udwSkinColor;                                  /* 肤色，未检测时可选 详见 NETDEV_SKINCOLOR_TYPE_E */
		public int udwBeard;                                      /* 胡子，未检测时可选 详见 NETDEV_BEARD_FLAG_E */
		public byte[]   byRes = new byte[112];                    /* 保留字段 */
	}

	/**
     * @struct tagNETDEVFaceStructInfo
     * @brief 人脸信息
     * @attention 无 None
     */
	public class NETDEV_FACE_STRUCT_INFO_S extends Structure
	{
		public int udwFaceID;                                     /* 人脸ID */
		public int udwFaceDoforPersonID;                          /* 人脸所属人员ID */
		public byte[]   szPosition = new byte[64];                     /* 人脸位置信息 */
		public int udwSmallPicAttachIndex;                        /* 人脸对应的小图在图像列表中的索引 */
		public int udwLargePicAttachIndex;                        /* 人脸对应的大图在图像列表中的索引 */
		public byte[]   szFeaturVersion = new byte[64];                /* 半结构化特征厂商类型版本号 */
		public byte[]   szFeature = new byte[1024];                    /* 基于人脸提取出来的特征信息 采用base64编码 前加密前512 Bytes */
		public NETDEV_FACE_ATTR_S stFaceAttr;                        /* 人脸属性信息 */
		public Pointer  pstRuleInfo;                              /* 规则信息 需动态申请内存    NETDEV_RULE_INFO_S */ 
        public byte[]   byRes = new byte[124];                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPersonAttr
	 * @brief 人员属性
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_ATTR_S extends Structure
	{
		public int udwGender;                                     /* 性别 详见 NETDEV_GENDER_TYPE_E */
		public int udwAgeRange;                                   /* 年龄段 详见 NETDEV_AGE_RANGE_E */
		public int udwSleevesLength;                              /* 上衣长短款式 详见 NETDEV_SLEEVES_LENGTH_E */
		public int udwCoatColor;                                  /* 上衣颜色 详见 NETDEV_CLOTHES_COLOR_E */
		public int udwTrousersLength;                             /* 下衣长短款式 详见 NETDEV_TROUSERS_LENGTH_E */
		public int udwTrousersColor;                              /* 下衣颜色 详见 NETDEV_CLOTHES_COLOR_E */
		public int udwBodyToward;                                 /* 身体抓怕朝向 详见 NETDEV_BODY_TOWARD_E */
		public int udwShoesTubeLength;                            /* 鞋子长短款式 详见 NETDEV_SHOES_TUBE_LENGTH_E */
		public int udwHairLength;                                 /* 发型长短 详见 NETDEV_HAIR_LENGTH_E */
		public int udwBagFlag;                                    /* 是否携包标志 详见 NETDEV_BAG_FLAG_E */
		public float  fTemperature;                               /* 体温 单位：摄氏度 精度：小数点后2位 */
		public int udwMask;                                       /* 口罩 详见 NETDEV_PERSON_MASK_FLAG_E */
		public int udwCoatTexture;                                /* 上衣纹理 详见 NETDEV_CLOTHES_TEXTURE_E */
		public int udwMovingDirection;                            /* 人员运动方向 详见 NETDEV_MOVE_DIRECTION_E */
		public byte[]   byRes = new byte[116];                    /* 保留字段 详见 */
	}

     /**
	 * @enum tagNETDEVTrousersLength
	 * @brief 下衣长短款式
	 * @attention
	 */
	public static class NETDEV_TROUSERS_LENGTH_E extends Structure
	{
	    public static final int	NETDEV_TROUSERS_LENGTH_UNKNOW                           = 0;                 /* 未知 */
	    public static final int	NETDEV_TROUSERS_LENGTH_SHORT                            = 1;                 /* 短裤 */
	    public static final int	NETDEV_TROUSERS_LENGTH_LONG                             = 2;                 /* 长裤 */
	    public static final int	NETDEV_TROUSERS_LENGTH_INVALID                          = 0xFF;               /* 无效值 */
	}

	/**
	 * @struct tagNETDEVPersonStructInfo
	 * @brief 人员信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_STRUCT_INFO_S extends Structure
	{
		public int udwPersonID;                                   /* 人员ID */
		public int udwPersonDoforFaceID;                          /* 人员所属人脸ID */
		public byte[]   szPosition = new byte[64];                     /* 人员位置信息 */
		public int udwSmallPicAttachIndex;                        /* 人员对应的小图在图像列表中的索引 */
		public int udwLargePicAttachIndex;                        /* 人员对应的大图在图像列表中的索引 */
		public byte[]   szFeaturVersion = new byte[64];                /* 半结构化特征厂商类型版本号 */
		public byte[]   szFeature = new byte[1024];                    /* 半结构化特征厂商类型版本号 采用base64编码 加密前512 Bytes */
		public NETDEV_PERSON_ATTR_S stPersonAttr;                    /* 人员信息 */
		public Pointer  pstRuleInfo;                              /* 规则信息 需动态申请内存   NETDEV_RULE_INFO_S */
		public byte[]   byRes = new byte[124];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVNonMotorVehicleAttr
	 * @brief 非机动车属性信息
	 * @attention 无 None
	 */
	public class NETDEV_NO_MOTOR_VEH_ATTR_S extends Structure
	{
		public int udwSpeedType;                                  /* 结构化场景中非机动车速度类型 详见 NETDEV_SPEED_TYPE_E */
		public int udwImageDirection;                             /* 结构化场景中非机动车相对画面运动方向 详见 NETDEV_IMAGE_DIRECTION_E */
		public int udwNonVehicleType ;                            /* 非机动车类型 详见 NETDEV_NON_VEH_TYPE_E */
	    public byte[]   byRes = new byte[128];                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVNonMotorVehInfo
	 * @brief 非机动车信息
	 * @attention 无 None
	 */
	public class NETDEV_NON_MOTOR_VEH_INFO_S extends Structure
	{
		public int udwID;                                         /* 非机动车ID */
		public byte[]   szPosition = new byte[64];                     /* 非机动车位置信息 */
		public int udwSmallPicAttachIndex;                        /* 非机动车对应的小图在图像列表中的索引 */
		public int udwLargePicAttachIndex;                        /* 非机动对应的大图在图像列表中的索引 */
		public NETDEV_NO_MOTOR_VEH_ATTR_S stNoMotorVehAttr;          /* 非机动车属性信息 */
		public int udwPersonOnNoVehiNum;                          /* 驾乘人员数目 */
		public Pointer pstPersonAttr;                 /* 参见  NETDEV_PERSON_ATTR_S 人员属性 需动态申请内存 */
		public Pointer  pstRuleInfo;                              /* 规则信息 需动态申请内存   NETDEV_RULE_INFO_S */
		public byte[]   byRes = new byte[124];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVVehAttr
	 * @brief 车辆属性信息
	 * @attention 无 None
	 */
	public class NETDEV_VEH_ATTR_S extends Structure
	{
		public int udwType;                                       /* 车辆类型 详见 NETDEV_VEHICLE_TYPE_E */
		public int udwColor;                                      /* 车身颜色 详见 NETDEV_PLATE_COLOR_E */
		public int udwSpeedUnit;                                  /* 车辆速度单位 0：公里/每小时 1：英里/每小时 */
		public float  fSpeedValue;                                   /* 车辆速度 */
		public int udwSpeedType;                                  /* 结构化场景中的机动车车辆速度类型 详见 NETDEV_SPEED_TYPE_E */
		public byte[]   szVehicleBrand = new byte[64];                 /* 车辆车标编码（自行编码) */
		public int udwImageDirection;                             /* 结构化场景中的机动车在画面坐标系中的行驶方向 详见 NETDEV_IMAGE_DIRECTION_E */
		public byte[]   byRes = new byte[128];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPlateAttr
	 * @brief 车牌属性信息
	 * @attention 无 None
	 */
	public class NETDEV_PLATE_ATTR_S extends Structure
	{
		public byte[]   szPlateNo = new byte[64];                      /* 车牌号码 */
		public int udwColor;                                      /* 车牌颜色 详见 NETDEV_PLATE_COLOR_E */
		public int udwType;                                       /* 车牌类型 详见 NETDEV_PLATE_TYPE_E */
		public byte[]   byRes = new byte[128];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVVehicleInfo
	 * @brief 车辆信息
	 * @attention 无 None
	 */
	public class NETDEV_VEH_INFO_S extends Structure
	{
		public int udwID;                                         /* 车辆ID */
		public byte[]   szPosition = new byte[64];                     /* 车辆位置信息 */
		public int udwSmallPicAttachIndex ;                       /* 车辆对应的小图在图像列表中的索引 */
		public int udwLargePicAttachIndex;                        /* 车辆对应的大图在图像列表中的索引 */
		public int udwPlatePicAttachIndex;                        /* 车牌对应的小图在图像列表中的索引 */
		public byte[]   szFeatureVersion = new byte[64];               /* 半结构化特征厂商类型版本号 */
		public byte[]   szFeature = new byte[1024];                    /* 基于人脸提取出来的特征信息 采用base64编码 加密前512 Bytes */
		public NETDEV_VEH_ATTR_S stVehAttr;                          /* 车辆属性信息 */
		public NETDEV_PLATE_ATTR_S stPlateAttr;                      /* 车牌属性信息 */
		public Pointer  pstRuleInfo;                              /* 规则信息 需动态申请内存   NETDEV_RULE_INFO_S */
		public byte[]   byRes = new byte[124];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVObjectInfo
	 * @brief 目标信息
	 * @attention 无 None
	 */
	public class NETDEV_OBJECT_INFO_S extends Structure
	{
		public int udwFaceNum;                                    /* 人脸数量 */
		public Pointer pstFaceInfo;              /* 参见  NETDEV_FACE_STRUCT_INFO_S 人脸信息 需动态申请内存 */
		public int udwPersonNum;                                  /* 人员数量 */
		public Pointer pstPersonInfo;          /*  参见  NETDEV_PERSON_STRUCT_INFO_S 人员信息 需动态申请内存 */
		public int udwNonMotorVehNum;                             /* 非机动车数量 */
		public Pointer pstNonMotorVehInfo;     /* 参见  NETDEV_NON_MOTOR_VEH_INFO_S 非机动车信息 需动态申请内存 */
		public int udwVehicleNum;                                 /* 车辆数量 */
		public Pointer pstVehInfo;                       /* 参见  NETDEV_VEH_INFO_S 车辆信息 需动态申请内存 */
		public byte[]   byRes = new byte[128];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVStructImageInfo
	 * @brief 图像相关信息
	 * @attention 无 None
	 */
	public class NETDEV_STRUCT_IMAGE_INFO_S extends Structure
	{
		public int udwIndex;                                      /* 图像索引 */
		public int udwType;                                       /* 图像类型 */
		public int udwFormat;                                     /* 图像格式 详见 NETDEV_IMAGE_FORMAT_E*/
		public int udwWidth;                                      /* 图像的宽度 */
		public int udwHeight;                                     /* 图像的高度 */
		public int udwCaptureTime;                                /* 图片采集时刻 */
		public byte[]   szUrl = new byte[260];                         /* 图片URL */
		public int udwSize;                                       /* 图像经过base64编码之后的长度 最大3M */
		public Pointer  pszData;                                          /* CHAR*图像的base64编码数据 */
		public byte[]   byRes = new byte[128];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVStructDataInfo
	 * @brief 结构化数据信息
	 * @attention 无 None
	 */
	public class NETDEV_STRUCT_DATA_INFO_S extends Structure
	{
		public NETDEV_OBJECT_INFO_S stObjectInfo;                    /* 目标信息 */
		public int udwImageNum;                                   /* 图像个数 */
		public Pointer pstImageInfo;            /* 参见  NETDEV_STRUCT_IMAGE_INFO_S 图像相关信息 需动态申请内存 */
		public byte[]   byRes = new byte[128];                                    /* 保留字段 */
	}
	
	/**
     * @struct tagNETDEVAlarmRelatedData
     * @brief 告警关联数据 Alarm Related Data
     * @attention 无 None
     */
    class NETDEV_ALARM_RELATED_DATA_S extends Structure
    {
        public NETDEV_STRUCT_DATA_INFO_S stStructDataInfo;                           /* 告警关联结构化数据信息 */
        public byte[]                    byRes = new byte[1024];                     /* 保留字段 */
    }

	/**
	 * @brief  告警开关量输入信息 结构体定义  Alarm boolean inputs info Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_ALARM_INPUT_INFO_S extends Structure {
		public byte[]  szName=new byte[NETDEV_LEN_64];                /* 输入开关量名称   Name of input alarm */
	}

	/**
	 * @brief  所有告警开关量输入信息 结构体定义  All Alarm boolean inputs info Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_ALARM_INPUT_LIST_S extends Structure {
		public int dwSize;                                           /* 输入开关量数量  Number of input alarms */
		public NETDEV_ALARM_INPUT_INFO_S[] astAlarmInputInfo = new NETDEV_ALARM_INPUT_INFO_S[NETDEV_MAX_ALARM_IN_NUM];       /* 输入开关量配置信息  Configuration information of input alarms */
	}

	/**
	 * @brief  输出开关量的逻辑报警状态(手动告警)
	 * @attention 无 None
	 */
	public class NETDEV_OUTPUT_SWITCH_ALARM_STATUS_S extends Structure {
		public int   dwBooleanId;                            /* 开关量编号  Boolean ID */
		public int   dwChannelId;                            /* 通道ID,设备本身为0 */
		public int   enAlarmStatus;                          /* 输出开关量报警状态 参见 #NETDEV_RELAYOUTPUT_STATE_E */
	}

	/**
	 * @brief  输出开关量的逻辑报警状态列表(手动告警)
	 * @attention 无 None
	 */
	public class NETDEV_OUTPUT_SWITCH_ALARM_STATUS_LIST_S extends Structure {
		public int		dwSize;                                                       /* 设备报警输出开关量通道数   Number of booleans  */
		public NETDEV_OUTPUT_SWITCH_ALARM_STATUS_S[]  astOutputAlarmStatusInfo=new NETDEV_OUTPUT_SWITCH_ALARM_STATUS_S[NETDEV_MAX_ALARM_OUT_NUM];           /* 输出开关量报警状态列表 Output switches alarm status list*/
		public byte[]	bRes=new byte[128];                                                    /* 保留字段 Reserved */
	}

	/**
	 * @brief  触发或清除输出开关量的逻辑报警状态结构体(手动告警)
	 * @attention 无 None
	 */
	public class NETDEV_OUTPUT_SWITCH_MANUAL_ALARM_INFO_S extends Structure {
		public int  	dwSize;                                             /* 需要设置的报警输出开关量数量   Number of booleans  */
		public int[]	dwIDList=new int[NETDEV_MAX_ALARM_OUT_NUM];         /* 需要设置的输出开关量编号列表 booleans ID list */
		public int  	dwAlarmAction;                  /* 执行的命令，参见 NETDEV_MANUAL_ALARM_CMD_E*/
		public byte[]	bRes=new byte[128];                                 /* 保留字段 Reserved */
	}

	/**
	 * @brief 按文件名回放录像参数 结构体定义 Parameters of play back recordings by file name Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PLAYBACKINFO_S extends Structure {
		public byte[]	szName=new byte[NETDEV_LEN_260];/* 回放的控制块名称  Playback control block name*/
		public long   	tBeginTime;                     /* 回放开始时间  Playback start time */
		public long   	tEndTime;                       /* 回放结束时间  Playback end time */
		public int   	dwLinkMode;                     /* 传输协议,参见 枚举 #NETDEV_PROTOCAL_E  Transport protocol, see enumeration #NETDEV_PROTOCAL_E */
		public Pointer  hPlayWnd;                       /* 播放窗口句柄  Play window handle */
		public int   	dwFileType;                     /* 录像存储类型,参见 枚举 #NETDEV_PLAN_STORE_TYPE_E  Recording storage type, see enumeration #NETDEV_PLAN_STORE_TYPE_E */
		public int   	dwDownloadSpeed;                /* 下载速度 参见 枚举 #NETDEV_E_DOWNLOAD_SPEED_E  Download speed, see enumeration #NETDEV_E_DOWNLOAD_SPEED_E */
		public int   	dwStreamMode;                   /*  启流模式，参见 枚举 #NETDEV_STREAM_MODE_E  stream mode see #NETDEV_STREAM_MODE_E */
		public byte[]  	byRes=new byte[252];                     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVPointS
	 * @brief 点坐标
	 * @attention
	 */
	public class NETDEV_POINT_S extends Structure {
		public int dwPointX;     /* 横坐标,万分比 */
		public int dwPointY;     /* 纵坐标,万分比 */
	}

	/**
	 * @brief 音频参数
	 * @attention 无
	 */
	public class NETDEV_AUDIO_SAMPLE_PARAM_S extends Structure {
		public int dwChannels;       	/* 声道数,单声道为1,立体声为2 */
		public int dwSampleRate;   		/* 采样率 */
		public int enSampleFormat;    	/* 位宽 参见  NETDEV_AUDIO_SAMPLE_FORMAT_E*/
	}

	/**
	 * @brief  输入开关量告警信息 结构体定义  input switch quantity alert information
	 * @attention 无 None
	 */
	public class NETDEV_INPUT_SWITCH_INFO_S extends Structure {
		public int 		dwChancelId;                   	/* 通道号 Channel ID */
		public int   	dwInputSwitchIndex;            	/* 开关量索引  Input Switch Index*/
		public byte[]	szName=new byte[NETDEV_LEN_64];	/* 输入开关量名称   Name of input alarm */
		public byte[] 	szGBID=new byte[NETDEV_LEN_32];	/* 国标资源编码,仅IPC支持   International Standard Resource Coding, supported by IPC only */
		public int     	dwRunMode;                     	/* 报警类型 1:常开 2：常闭  Alarm Type 1: Open 2: Closed*/
		public int    	dwEnabled;                     	/* 报警使能 0:不使能 1：使能  Alarm Enabling 0: No Enabling 1: Enabling*/
		public int    	dwVideoResID;                    /* 对应的视频通道ID,仅VMS支持 */
		public byte[]  	bRes=new byte[124];       		/* 保留字段 Reserved */
	}

	/**
	 * @brief  输入开关量告警配置信息列表 结构体定义  enter switch quantity alert configuration information list
	 * @attention 无 None
	 */
	public class NETDEV_INPUT_SWITCH_INFO_LIST_S extends Structure {
		public int                        udwNum;                                /* 输入开关量告警数量   Number of input switches  */
		public NETDEV_INPUT_SWITCH_INFO_S[] astInputSwitchesInfo=new NETDEV_INPUT_SWITCH_INFO_S[NETDEV_LEN_1024]; /* 输入开关量告警配置信息  input switches configuration information */
	}

	/**
	 * @brief 设备图像设置 结构体定义    Device image settings Structure definition
	 * @attention 参数取值范围：0-255     parameter range: 0-255
	 */
	public class NETDEV_IMAGE_SETTING_S extends Structure {
		public int dwContrast;                   /* 对比度  Contrast */
		public int dwBrightness;                 /* 亮度  Brightness */
		public int dwSaturation;                 /* 饱和度  Saturation */
		public int dwSharpness;                  /* 亮度  Sharpness */
		public byte[]  	bRes = new byte[252];      /* 保留字段  Reserved */
	};

	/**
	 * @struct tagNETDEVIrisInfo
	 * @brief  光圈信息  结构体定义    IrisInfo
	 * @attention
	 */
	public class NETDEV_IRIS_INFO_S extends Structure{
		public int udwIris;         /* 光圈,在光圈优先、手动曝光模式下可选。光圈支持的取值:160， 200， 240， 280， 340， 400， 480， 560， 680， 800， 960， 1100，1400,  1600,  2200*/
		public int udwMinIris;      /* 最小光圈值 自定义曝光模式下可用，枚举 同 Iris能力集所描述，不得大于光圈最大值。图像能力集支持该功能，此字段必选。*/
		public int udwMaxIris;      /* 最大光圈值 自定义曝光模式下可用，枚举 同 Iris能力集所描述，不得小于光圈最小值。图像能力集支持该功能，此字段必选。*/
		public byte[]  	bRes = new byte[128];       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVShutterInfo
	 * @brief  快门信息  结构体定义    ShutterInfo
	 * @attention
	 */
	public class NETDEV_SHUTTER_INFO_S extends Structure{
		public int udwShutterTime;                  /* 快门时间 枚举 见#NETDEV_SHUTTER_TIME_RANGE_E,快门时间单位  0：微秒 1：秒*/
		public int udwMinShutterTime;               /* 快门时间最小值 MinShutter 枚举 见#NETDEV_SHUTTER_TIME_RANGE_E*/
		public int udwMaxShutterTime;               /* 快门时间最大值 MaxShutter 枚举 见#NETDEV_SHUTTER_TIME_RANGE_E*/
		public int udwIsEnableSlowShutter;          /* 慢快门使能。非光圈优先模式下可用：0：不使能  1：使能*/
		public int udwSlowestShutter;               /* 最慢慢快门,慢快门使能后可用。*/
		public byte[]  	bRes = new byte[128];                      /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVGainInfo
	 * @brief  增益信息  结构体定义    GainInfo
	 * @attention
	 */
	public class NETDEV_GAIN_INFO_S extends Structure{
		public int udwGain;         /* 增益值（单位:db）手动曝光模式下可用。范围[1,100]*/
		public int udwMinGain;      /* 增益最小值 ,自定义曝光模式下可用，不得大于增益最大值。最小值为1*/
		public int udwMaxGain;      /* 增益最大值 , 自定义曝光模式下可用，不得小于增益最小值。最大值为100*/
		public byte[]  	bRes = new byte[128];       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVWideDynamicInfo
	 * @brief  宽动态信息  结构体定义    WideDynamicInfo
	 * @attention
	 */
	public class NETDEV_WIDE_DYNAMIC_INFO_S extends Structure{
		public int udwWideDynamicMode;              /* 宽动态模式 WideDynamicMode 枚举 详见#NETDEV_WIDE_DYNAMIC_MODE_E*/
		public int udwWideDynamicLevel;             /* 宽动态级别配置，宽动态开启且在曝光模式为自动模式、自定义、快门优先、室内50HZ、室内60HZ、低拖影下可用。范围[1, 9]。*/
		public int udwOpenSensitivity;              /* 宽动态开启的灵敏度。宽动态模式为自动下可用。范围[1, 9]。*/
		public int udwCloseSensitivity;             /* 宽动态关闭的灵敏度。宽动态模式为自动下可用。范围[1, 9]。*/
		public int udwAntiFlicker;                    /* 宽动态条纹抑制：0：关闭 1：开启该功能开启后，可消除图像中的条纹效应。*/
		public byte[]  	bRes = new byte[128];                      /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVAreaTopLeft
	 * @brief  左上角区域  结构体定义    Upper left Area
	 * @attention
	 */
	public class NETDEV_AREA_TOP_LEFT_S extends Structure{
		public int  dwTopLeftX;     /* 左上角横坐标(比例)：区域测光模式范围: [0, 100]。Upper left corner X [0, 100]  */
		public int  dwTopLeftY;     /* 左上角纵坐标(比例)：区域测光模式范围: [0, 100]。Upper left corner Y [0, 100]  */
		public byte[]  	bRes = new byte[128];     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVAreaBotRight
	 * @brief  右下角区域  结构体定义    Lower right Area
	 * @attention
	 */
	public class NETDEV_AREA_BOT_RIGHT_S extends Structure{
		public int  dwBottomRightX;     /* 左上角横坐标(比例)：区域测光模式范围: [0, 100]  Lower right corner x [0, 100] */
		public int  dwBottomRightY;     /* 左上角纵坐标(比例)：区域测光模式范围: [0, 100]  Lower right corner y [0, 100] */
		public byte[]  	bRes = new byte[128];        /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMeteringArea
	 * @brief  测光区域  结构体定义   MeteringArea
	 * @attention
	 */
	public class NETDEV_METERING_AREA_S extends Structure{
		public NETDEV_AREA_TOP_LEFT_S    stAreaTopLeft;           /* 左上角区域  结构体见#NETDEV_AREA_TOP_LEFT_S*/
		public NETDEV_AREA_BOT_RIGHT_S   stAreaBotRight;          /* 右下角区域  结构体见#NETDEV_AREA_BOT_RIGHT_S*/
		public byte[]  	bRes = new byte[128];                               /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMeteringInfo
	 * @brief  测光信息  结构体定义    MeteringInfo
	 * @attention
	 */
	public class NETDEV_METERING_INFO_S extends Structure{
		public int udwMeteringMode;                 /* 测光控制模式,此字段在非手动曝光模式下可用。枚举 详见#NETDEV_DAY_NIGHT_MODE_E*/
		public int udwRefBrightness;                /* 人脸亮度。人脸测光模式下可用。范围：[0, 100]。*/
		public int udwHoldTime;                     /* 最短持续时间。人脸测光模式下可用。单位：分钟。范围：[0, 60]。*/
		public NETDEV_METERING_AREA_S stMeteringArea;  /* 测光区域 ,在测光模式为区域测光及点测光时，此字段可用*/
		public byte[]  	bRes = new byte[128];                       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVDayNightInfo
	 * @brief  昼夜模式信息  结构体定义    MeteringInfo
	 * @attention
	 */
	public class NETDEV_DAY_NIGHT_INFO_S extends Structure{
		public int udwDayNightMode;                 /* 昼夜模式类型 DayNightMode 枚举 参见 #NETDEV_DAY_NIGHT_MODE_E*/
		public int udwDayNightSensitivity;          /* 昼夜模式灵敏度 DayNightSensitivity 在昼夜模式为自动模式下可用，范围[0, 9]。若图像能力支持该功能，此字段必选。*/
		public int udwDayNightTime;                 /* 昼夜模式切换时间，在昼夜模式为自动模式下可用。范围[3, 120]。单位秒。若图像能力支持该功能，此字段必选。*/
		public byte[]  	bRes = new byte[128];                       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVImagingExposure
	 * @brief 图像曝光参数 结构体定义    Device image Exposure Structure definition
	 * @attention
	 */
	public class NETDEV_IMAGE_EXPOSURE_S extends Structure{
		public int                      udwMode;                /* 曝光模式  Exposure Mode 枚举 详见#NETDEV_EXPOSURE_MODE_E*/
		public int                       dwCompensationLevel;    /* 曝光补偿级别,曝光模式为非手动曝光模式时可用。范围[-100,100].图像能力集支持该功能，此字段必选 */
		public int                      udwHLCSensitivity;      /* 强光抑制灵敏度，当前场景为道路强光抑制及园区强光抑制时可用,范围[1,9]。 图像能力集支持该功能，此字段必选 */
		public NETDEV_IRIS_INFO_S          stIrisInfo;             /* 光圈信息。图像能力集支持该功能，此字段必选。*/
		public NETDEV_SHUTTER_INFO_S       stShutterInfo;          /* 快门信息。图像能力集支持该功能，此字段必选。*/
		public NETDEV_GAIN_INFO_S          stGainInfo;             /* 增益信息。*/
		public NETDEV_WIDE_DYNAMIC_INFO_S  stWideDynamicInfo;      /* 宽动态信息。图像能力集支持该功能，此字段必选。*/
		public NETDEV_METERING_INFO_S      stMeteringInfo;         /* 测光信息。当前场景不是道路强光抑制及园区强光抑制时可用。图像能力集支持该功能，此字段必选。*/
		public NETDEV_DAY_NIGHT_INFO_S     stDayNightInfo;         /* 昼夜模式信息。图像能力集支持该功能，此字段必选。*/
		public byte[]  	bRes = new byte[256];             /* 保留字段  Reserved */
	}

	/**
	 * @enum tagNETDEVExposureMode
	 * @brief 曝光模式 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_EXPOSURE_MODE_E extends Structure{
		public static final int	NETDEV_EXPOSURE_MODE_AUTOMATIC          = 0;               /* 自动曝光 */
		public static final int	NETDEV_EXPOSURE_MODE_CUSTOM             = 1;               /* 自定义曝光 */
		public static final int	NETDEV_EXPOSURE_MODE_SHUTTER_PRIORITY   = 2;               /* 快门优先 */
		public static final int	NETDEV_EXPOSURE_MODE_APERTURE_PRIORITY  = 3;               /* 光圈优先 */
		public static final int	NETDEV_EXPOSURE_MODE_GAIN_PRIORITY      = 4;               /* 增益优先 */
		public static final int	NETDEV_EXPOSURE_MODE_INDOOR_50_HZ       = 5;               /* 室内50Hz */
		public static final int	NETDEV_EXPOSURE_MODE_INDOOR_60_HZ       = 6;               /* 室内60Hz */
		public static final int	NETDEV_EXPOSURE_MODE_MANUAL_OPERATION   = 7;               /* 手动曝光 */
		public static final int	NETDEV_EXPOSURE_MODE_LOWER_GHOSTING     = 8;               /* 低拖影 */

		public static final int	NETDEV_EXPOSURE_MODE_INVALID            = 0xFF;              /* 无效值 */
	}

	/**
	 * @struct tagNETDEVLampCtrlInfo
	 * @brief  补光灯信息
	 * @attention
	 */
	public class NETDEV_LAMP_CTRL_INFO_S extends Structure{
		public int udwEnabled;          /* 补光灯使能开关：0：关闭 1：开启 */
		public int udwType;             /* 补光灯类型 详见枚举 类型 #NETDEV_LAMP_TYPE_E*/
		public int udwMode;             /* 补光灯控制模式 详见枚举 类型 #NETDEV_LAMP_CTRL_MODE_E*/
		public int udwNearLevel;        /* 近光灯级别,在红外控制模式为手动控制及手动-强制开启模式下,此字段可用。补光灯能力集支持该功能，此字段必选。范围[0-1000]。级别越高，补光灯强度越大。*/
		public int udwMiddleLevel;      /* 中光灯级别,在红外控制模式为手动控制及手动-强制开启模式下可用。补光灯能力集支持该功能，此字段必选。范围[0-1000]。级别越高，补光灯强度越大。*/
		public int udwFarLevel;         /* 远光灯级别,在红外控制模式为手动控制及手动-强制开启模式下可用。补光灯能力集支持该功能，此字段必选。范围[0-1000]。级别越高，补光灯强度越大。*/
		public int udwSuperFarLevel;    /* 超远光灯级别,在红外控制模式为手动控制及手动-强制开启模式下可用。补光灯能力集支持该功能，此字段必选。范围[0-1000]。级别越高，补光灯强度越大。*/
		public int udwLaserAngle;       /* 激光角度，当补光灯类型为激光器且，在红外控制模式为手动控制及手动-强制开启模式下可用。补光灯能力集支持该功能，此字段必选。范围见补光灯能力集。激光角度越小能量越集中，角度越大能量越分散。*/
		public byte[]  	bRes = new byte[256];           /* 保留字段  Reserved */
	}

	/**
	 * @enum tagNETDEVLampCtrlMode
	 * @brief 补光灯支持的控制模式 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_LAMP_CTRL_MODE_E extends Structure{
		public static final int	NETDEV_LCM_GLOBAL_ATTENTION_AC      = 0;        /* 全局兼顾自动控制*/
		public static final int	NETDEV_LCM_OVEREXPOSE_INHIBIT_AC    = 1;        /* 过曝抑制自动控制 */
		public static final int	NETDEV_LCM_PRESET_ROAD               = 2;        /* 预置控制-道路模式 */
		public static final int	NETDEV_LCM_MANUAL_CM                = 3;        /* 手动控制模式*/
		public static final int	NETDEV_LCM_PRESET_PARK               = 4;        /* 预置控制-园区模式*/
		public static final int	NETDEV_LCM_PHOTOSENS_AM             = 5;        /* 光敏自动模式*/
		public static final int	NETDEV_LCM_INDOOR_AM                = 6;        /* 室内自动模式*/
		public static final int	NETDEV_LCM_MANUAL_FOM               = 7;        /* 手动-强制开启模式*/
		public static final int	NETDEV_LCM_NIGHT_VIDEO_DET_MODE     = 8;        /* 夜间视频检测模式*/

		public static final int	NETDEV_LCM_INVALID                  = 0xFF;      /* 无效值 */
	}

	/**
	 * @enum tagNETDEVLampType
	 * @brief 补光灯类型 枚举定义
	 * @attention 无 None
	 */
	public static class NETDEV_LAMP_TYPE_E extends Structure{
		public static final int	NETDEV_LAMP_TYPE_WITHOUT            = 0;        /* 无补光灯*/
		public static final int	NETDEV_LAMP_TYPE_WHITE              = 1;        /* 白光灯 */
		public static final int	NETDEV_LAMP_TYPE_INFRARED           = 2;        /* 红外灯 */
		public static final int	NETDEV_LAMP_TYPE_LASER_DEVICE       = 3;        /* 激光器*/
		public static final int	NETDEV_LAMP_TYPE_INFRARED_SHIELD    = 4;        /* 红外护罩灯*/

		public static final int	NETDEV_LAMP_TYPE_INVALID            = 0xFF;      /* 无效值 */
	}

	/**
	 * @struct tagNETDEVWhiteBalanceInfo
	 * @brief  白平衡信息
	 * @attention
	 */
	public class NETDEV_WHITE_BALANCE_INFO_S extends Structure{
		public int udwMode;             /* 白平衡模式 详见枚举 类型 #NETDEV_WHITE_BALANCE_MODE_E*/
		public int dwRedOffset;          /* Red偏移值，只有在Mode为[1,5,8]微调模式下可配置*/
		public int dwBlueOffset;         /* Blue偏移值，只有在Mode为[1,5,8]微调模式下可配置*/
		public byte[]       byRes = new byte[256];           /* 保留字段  Reserved */
	}

	/**
	 * @brief 网络配置信息 结构体定义 Network configuration information
	 * @attention 无 None
	 */
	public class NETDEV_NETWORKCFG_S extends Structure{
		public int   dwMTU;                              /* MTU值  MTU value */
		public int    bIPv4DHCP;                          /* IPv4的DHCP  DHCP of IPv4 */
		public byte[]	szIpv4Address = new byte[NETDEV_LEN_32]; /* IPv4的IP地址  IP address of IPv4 */
		public byte[]    szIPv4GateWay = new byte[NETDEV_LEN_32];       /* IPv4的网关地址  Gateway of IPv4 */
		public byte[]    szIPv4SubnetMask = new byte[NETDEV_LEN_32];    /* IPv4的子网掩码  Subnet mask of IPv4 */
		public byte[]       byRes = new byte[480];                         /* 保留字段  Reserved */
	}

	/**
	 * @brief VPN客户端指定模式信息
	 * @attention 无 None
	 */
	public class NETDEV_VPN_CLIENT_INFO_S extends Structure{
		public int   udwEnabled;                                     /* 是否开启 对应兼容格式的一个开关0: 关闭 1: 开启 Support UNP or not，a switch that corresponds to a compatible format, enable 0:unable  1:enable*/
		public int   udwCompatibilityMode;                         /* 对应所设置的兼容模式 0: Unp1.0（unp） 1: Unp2.0 (softvpn). Corresponds to the set compatibility mode.0: Unp1.0（unp） 1: Unp2.0 (softvpn) */
		public int   udwAuthEnabled;                                 /* 鉴权是否开启。若为Unp2.0一定鉴权，为开启状态。0：关闭 1：开启 Authentication open or close, if is Unp2.0, must authentication and open. 0:close 1:open  */
		public int   udwEncryptEnabled;                              /* 加密是否开启兼容模式, 若当前开启兼容模式为Unp1.0 此字段需为使能关闭。0：关闭 1：开启 */
		public int   udwInterface;                                 /* 可选IPC 需要；NVR和VMS不需要。有线网口：0 ,4G 网口：1。范围：[0,1]*/
		public byte[]     szLoginName = new byte[NETDEV_DOMAIN_LEN];               /* 可选：AuthEnable开启时，带此字段。服务器的用户名，不支持中文名。范围[0-63]*/
		public byte[]     szPIN = new byte[NETDEV_LEN_256];                        /* 可选：AuthEnable开启时，带此字段服务器的用户密码范围[0,256],不修改接入登录密码时不必携带，修改接入登录密码时必携带*/
		public int   udwAddressType;
		public byte[]     szAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];         /* AddressType：IP地址类型。 0: IPv4 1: IPv6 2:域名 3: IPv4和IPv6都需要.当前仅支持IPv4*/
		public int   udwPort;                                      /* 可选;NVR 和VMS需要此字段，对应兼容格式的服务器端口，范围[1-65535]，兼容Unp1.0默认值1701；兼容Unp2.0 默认是5555*/
		public int   udwUNPSuccessd;                               /* UNP成功连接 标识符 (查询返回表示当前对应UNP有无分配对应ip,掩码,路由)。1 成功，0 失败，获取时携带。*/
		public byte[]     szUNPShareIPAddr = new byte[NETDEV_IPADDR_STR_MAX_LEN];  /* UNP成功连接 服务器所分配的对应地址 (查询并连接成功才返回,非输入参数) */
		public byte[]     szUNPShareMask = new byte[NETDEV_IPADDR_STR_MAX_LEN];    /* UNP成功连接 服务器所分配的对应掩码(查并连接成功才返回,非输入参数) */
		public byte[]     szUNPShareWayAddr = new byte[NETDEV_IPADDR_STR_MAX_LEN]; /* UNP成功连接 服务器所分配的对应的路由(查询并连接成功才返回,非输入参数) */
		public byte[]       byRes = new byte[256];                                   /* 保留字节  Reserved*/
	}

	/*
	 * @struct tagDNSAddress
	 * @brief DNS地址
	 * @attention 无 None
	 */
	public class NETDEV_DNS_ADDRESS_S extends Structure{
		public int  udwAddressType;                 /*IP地址类型 0: IPv4  1: IPv6 3: IPv4和IPv6都需要 当前仅支持IPv4 */
		public byte[]   szIPAddress = new byte[NETDEV_LEN_64];      /*IPv4地址*/
		public byte[]   szIPv6Address = new byte[NETDEV_LEN_64];    /*IPv6地址*/
		public byte[]       byRes = new byte[128];                      /* 保留字  Reserved */
	}

	/*
	 * @struct tagNETDEVDNSInfo
	 * @brief 设备DNS信息 device DNS Info
	 * @attention 无 None
	 */
	public class NETDEV_DNS_INFO_S extends Structure{
		public int                  udwNum;                             /*DNS地址数量*/
		public NETDEV_DNS_ADDRESS_S[]    astDNSList = new NETDEV_DNS_ADDRESS_S[NETDEV_DNS_LIST_NUM];    /*DNS地址列表，第1个为首要地址，第2个为次选地址。当前只支持2个*/
		public byte[]       byRes = new byte[128];                         /* 保留字  Reserved */
	}

	/*
	 * @struct tagIpv6Addressinfo
	 * @brief IPV6详细地址信息
	 * @attention 无 None
	 */
	public class NETDEV_IPV6_ADDRESS_INFO_S extends Structure{
		public int  udwPrefixLenth;             /*子网前缀长度，范围为[3,127]*/
		public byte[]    szAddress = new byte[NETDEV_LEN_64];   /*IP地址*/
		public byte[]    szGateway = new byte[NETDEV_LEN_64];   /*默认网关*/

	}
	/*
	 * @struct tagNetWorkIpv6info
	 * @brief 网卡信息中IPV6信息
	 * @attention 无 None
	 */
	public class NETDEV_NETWORK_IPV6_INFO_S extends Structure{
		public int                      udwIPGetType;                           /*IP获取方式*/
		public int                      udwAddressNum;                          /*IP地址个数*/
		public NETDEV_IPV6_ADDRESS_INFO_S[]  astIPv6AddressInfo = new NETDEV_IPV6_ADDRESS_INFO_S[NETDEV_LEN_8];       /*IPv6信息，如果不支持IPv6，则该节点可选*/

	}

	/*
	 * @struct tagIpv4Addressinfo
	 * @brief IPV4详细地址信息
	 * @attention 无 None
	 */
	public class NETDEV_IPV4_ADDRESS_INFO_S extends Structure{
		public byte[]   szAddress = new byte[NETDEV_LEN_64];                /*IP地址*/
		public byte[]   szNetmask = new byte[NETDEV_LEN_64];                /*子网掩码*/
		public byte[]   szGateway = new byte[NETDEV_LEN_64];                /*默认网关*/

	}
	/*
	 * @struct tagIpv4info
	 * @brief 网卡信息中IPV4信息
	 * @attention 无 None
	 */
	public class NETDEV_NETWORK_IPV4_INFO_S extends Structure{
		public int                      udwIPGetType;                       /*IP获取方式 0：for static 1：for PPPOE2：for DHCP*/
		public byte[]                        szLoginName = new byte[NETDEV_LEN_64];         /*PPPoE账号*/
		public byte[]                        szPIN = new byte[NETDEV_LEN_128];              /*PPPOE密码（MD5加密）*/
		public int                      udwAddressNum;                      /*IP地址个数*/
		public NETDEV_IPV4_ADDRESS_INFO_S[]  astIPv4AddressInfo = new NETDEV_IPV4_ADDRESS_INFO_S[NETDEV_LEN_8];   /*IPv4信息，如果不支持IPv4，则该节点可选*/

	}

	/*
	 * @struct tagNETDEVNetworkInterfaceInfo
	 * @brief 网卡的详细信息
	 * @attention 无 None
	 */
	public class NETDEV_NETWORK_INTERFACE_INFO_S extends Structure{
		public int              udwID;                                             /*网卡编号对VMS、IPC从1开始 对NVR该字段是资源编码*/
		public byte[]                szName = new byte[NETDEV_NAME_MAX_LEN];                       /*网卡名称，NVR、IPC支持*/
		public int              udwWorkMode;                                       /*网卡工作模式 0：多址设定 1：负载均衡  2：网络容错*/
		public int                bIsInnerNIC;                                       /*是否为内部网卡*/
		public byte[]                szInnerNICIPAddress = new byte[NETDEV_IPADDR_STR_MAX_LEN];    /*内部网卡IP地址*/
		public byte[]                szInnerNICNetmask = new byte[NETDEV_IPADDR_STR_MAX_LEN];      /*内部网卡网络掩码；该字段不可配置，仅供查询*/
		public byte[]                szInnerNICName = new byte[NETDEV_NAME_MAX_LEN];               /*内部网卡名称；该字段不可配置，仅供查询*/
		public int              udwMTU;                                            /*MTU长度，范围[576,1500]*/
		public byte[]                szMAC = new byte[NETDEV_NETWORK_MACNAME_LEN];                 /*MAC地址，只读属性，字符串长度范围[0, 48]*/
		public int              udwNegotiationMode;                                /*网口工作模式*/
		public NETDEV_NETWORK_IPV4_INFO_S stIPV4Infos;                                /*IPv4信息，如果不支持IPv4，则该节点可选*/
		public NETDEV_NETWORK_IPV6_INFO_S stIPV6Infos;                                /*IPv6信息，如果不支持IPv6，则该节点可选*/
		public byte[]       byRes = new byte[128];                                        /* 保留字  Reserved */
	}

	/*
	 * @struct tagNETDEVNetworkCardsInfo
	 * @brief 查询设备所有网卡的配置信息。
	 * @attention 无 None
	 */
	public class NETDEV_NETWORK_CARD_INFO_S extends Structure{
		public int                              udwNum;                                     /*网卡个数*/
		public int                              udwDefaultRouteNIC;                         /*作默认路由的网卡ID，当存在多张网卡（不含内部网卡）时必选*/
		public int                              udwWorkMode;                                /*网卡工作模式 0：多址设定 1：负载均衡  2：网络容错*/
		public NETDEV_NETWORK_INTERFACE_INFO_S[]     astNetworkInterfaceList = new NETDEV_NETWORK_INTERFACE_INFO_S[NETDEV_LEN_8];      /*网卡信息列表，当Num值为0时该节点可选*/
		public byte[]       byRes = new byte[128];                                 /* 保留字  Reserved */
	}

	/**
	 * @struct tagNETDEVNetworkPortsInfo
	 * @brief 端口信息
	 * @attention 无 None
	 */
	public class NETDEV_NETWORK_PORTS_INFO_S extends Structure{
		public int   udwHttpPort;                         /* Http端口 */
		public int   udwHttpsPort;                        /* Https端口 */
		public int   udwRtspPort;                         /* Rtsp端口 */

		public byte[]       byRes = new byte[64];              /* 保留字段  Reserved field */
	}

	/**
	 * @brief 区域配置结构体定义 Definition of area configuration structure
	 * @attention
	 */
	public class NETDEV_PRIVACY_MASK_AREA_INFO_S extends Structure{
		public int   bIsEanbled;           /* 是否启用  Enable or not. */
		public int   dwTopLeftX;           /* 左上角X [0, 10000]  Upper left corner X [0, 10000]  */
		public int   dwTopLeftY;           /* 左上角Y [0, 10000]  Upper left corner Y [0, 10000]  */
		public int   dwBottomRightX;       /* 右下角X [0, 10000]  Lower right corner x [0, 10000] */
		public int   dwBottomRightY;       /* 右下角Y [0, 10000]  Lower right corner y [0, 10000] */
		public int   dwIndex;              /* 索引  Index. */
	}

	/**
	 * @brief 隐私遮盖配置信息 Privacy mask configuration information
	 * @attention
	 */
	public class NETDEV_PRIVACY_MASK_CFG_S extends Structure{
		public int                                  dwSize;                                     /* 区域个数  Mask area number */
		public NETDEV_PRIVACY_MASK_AREA_INFO_S[]        astArea = new NETDEV_PRIVACY_MASK_AREA_INFO_S[NETDEV_MAX_PRIVACY_MASK_AREA_NUM];  /* 遮盖区域参数  Mask area parameters */
	}

	/**
	 * @brief 遮挡检测分析信息 Tampering detection analysis info
	 * @attention 无 None
	 */
	public class NETDEV_TAMPER_ALARM_INFO_S extends Structure{
		public int  dwSensitivity;                               /* 灵敏度  Sensitivity */
		public byte[]       byRes = new byte[256];                                  /* 保留字段  Reserved */
	}

	/**
	 * @brief 运动检测分析信息 Motion detection analysis info
	 * @attention 无 None
	 */
	public class NETDEV_MOTION_ALARM_INFO_S extends Structure{
		public int  dwSensitivity;                                                     /* 灵敏度  Sensitivity */
		public int  dwObjectSize;                                                      /* 物体大小  Objection Size */
		public int  dwHistory;                                                         /* 持续时间  History */
		public short[]  awScreenInfo = new short[NETDEV_SCREEN_INFO_ROW * NETDEV_SCREEN_INFO_COLUMN];                                                  /* 屏幕宏块信息  Screen Info  INT16  awScreenInfo[NETDEV_SCREEN_INFO_ROW][NETDEV_SCREEN_INFO_COLUMN];*/
		public byte[]       byRes = new byte[64];                                                         /* 保留字段  Reserved */
	}

	public class NETDEV_CROSS_LINE_POINT_INFO_S extends Structure{
		public int    bEnable;                /* 是否启用  Supported or not */
		public int   dwSensitivity;        /* 灵敏度  Sensitivity */
		public int   dwDirection;          /* 触发方向 trigger Direction */
		public int   dwTopLeftX;           /* 左上角X [0, 10000]  Upper left corner X [0, 10000]  */
		public int   dwTopLeftY;           /* 左上角Y [0, 10000]  Upper left corner Y [0, 10000]  */
		public int   dwBottomRightX;       /* 右下角X [0, 10000]  Lower right corner x [0, 10000] */
		public int   dwBottomRightY;       /* 右下角Y [0, 10000]  Lower right corner y [0, 10000] */
	}

	/**
	 * @brief 越界检测分析信息
	 * @attention 无 None
	 */
	public class NETDEV_CROSS_LINE_ALARM_INFO_S extends Structure{
		public int    bEnable;                                                  /* 是否启用  Supported or not */
		public NETDEV_CROSS_LINE_POINT_INFO_S[] stAreaInfo = new NETDEV_CROSS_LINE_POINT_INFO_S[4];                       /* 区域信息 area info */
		public byte[]       byRes = new byte[64];                                                   /* 保留字段  Reserved */
	}

	/**
	 * @brief 入侵检测区域点坐标
	 * @attention 无 None
	 */
	public class NETDEV_INTRUSION_POINT_INFO_S extends Structure{

		public int   dwPointX;           /* X [0, 10000]*/
		public int   dwPointY;           /* Y [0, 10000]*/
	}


	/**
	 * @brief 入侵检测区域信息
	 * @attention 无 None
	 */
	public class NETDEV_INTRUSION_AREA_INFO_S extends Structure{
		public int    bEnable;                                            /* 是否启用  Supported or not */
		public int   dwSensitivity;                                      /* 灵敏度，范围1-100  Sensitivity */
		public int   dwTimeThreshold;                                    /* 时间阈值 范围1-10*/
		public int   percentage;                                         /* 比率 范围1-100 */
		public int   dwPointCount;                                       /* 区域点个数，范围3-6，如果不设置该区域，点个数将忽略，*/
		public NETDEV_INTRUSION_POINT_INFO_S[]   stPointInfo = new NETDEV_INTRUSION_POINT_INFO_S[NETDEV_LEN_6];  /* 区域点坐标信息 */
		public byte[]       byRes = new byte[64];                                           /* 保留字段  Reserved */
	}
	/**
	 * @enum tagNETDEVFindAlarmTypeEn
	 * @brief 告警配置操作 枚举定义  Alarm configuration operation Enumeration definition
	 * @attention 无 None
	 */
	public static class NETDEV_FIND_ALARM_TYPE_E {

		public static final int NETDEV_FIND_ALARM_DISK_STORAGE_IS_FULL               = 1;            /* 存储满 */
		public static final int NETDEV_FIND_ALARM_DISK_STORAGE_WILL_FULL             = 2;            /* 存储即将满 */
		public static final int NETDEV_FIND_ALARM_STOR_ERR                           = 3;            /* 存储错误 */
		public static final int NETDEV_FIND_ALARM_STOR_ERR_RECOVER                   = 4;            /* 存储错误恢复 */
		public static final int NETDEV_FIND_ALARM_MOVE_DETECT                        = 5;            /* 运动检测告警 */
		public static final int NETDEV_FIND_ALARM_MOVE_DETECT_RECOVER                = 6;            /* 运动检测告警恢复 */
		public static final int NETDEV_FIND_ALARM_VIDEO_TAMPER_DETECT                = 7;            /* 遮挡侦测告警 */
		public static final int NETDEV_FIND_ALARM_VIDEO_TAMPER_RECOVER               = 8;            /* 遮挡侦测告警恢复 */
		public static final int NETDEV_FIND_ALARM_INPUT_SWITCH                       = 9;            /* 输入开关量告警 */
		public static final int NETDEV_FIND_ALARM_INPUT_SWITCH_RECOVER               = 10;           /* 输入开关量告警恢复*/
		public static final int NETDEV_FIND_ALARM_BAND_CHANGE                        = 11;           /* 设备出口带宽变更 */
		public static final int NETDEV_FIND_ALARM_IMAGE_BLURRY                       = 12;           /* 图像虚焦 */
		public static final int NETDEV_FIND_ALARM_IMAGE_BLURRY_RECOVER               = 13;           /* 阵列损坏 */
		public static final int NETDEV_FIND_ALARM_SCENE_CHANGE                       = 14;           /* 阵列衰退 */
		public static final int NETDEV_FIND_ALARM_ILLEGAL_ACCESS                     = 15;           /* 阵列恢复正常 */
		public static final int NETDEV_FIND_ALARM_REPORT_DEV_ONLINE                  = 16;           /* 设备上线 */
		public static final int NETDEV_FIND_ALARM_REPORT_DEV_OFFLINE                 = 17;           /* 设备下线 */
		public static final int NETDEV_FIND_ALARM_REPORT_DEV_VIDEO_LOSS              = 18;           /* 视频丢失 */
		public static final int NETDEV_FIND_ALARM_REPORT_DEV_VIDEO_LOSS_RECOVER      = 19;           /* 视频丢失恢复 */
		public static final int NETDEV_FIND_ALARM_COUNT_PEOPLE                       = 20;           /* 人数统计 */
		public static final int NETDEV_FIND_ALARM_HEAT_MAP                           = 21;           /* 热度图 */
		public static final int NETDEV_FIND_ALARM_LINE_DETECTOR                      = 22;           /* 伴线告警 */
		public static final int NETDEV_FIND_ALARM_CELL_MOTION                        = 23;           /* 智能运动检测 */
		public static final int NETDEV_FIND_ALARM_LINE_CROSS                         = 24;           /* 越界告警 */
		public static final int NETDEV_FIND_ALARM_OBJECTS_INSIDE                     = 25;           /* 区域入侵 */
		public static final int NETDEV_FIND_ALARM_ACCESSZONE                         = 26;           /* 进入区域告警 */
		public static final int NETDEV_FIND_ALARM_LEAVE_ZONE                         = 27;           /* 离开区域告警 */
		public static final int NETDEV_FIND_ALARM_HOVER_ZONE                         = 28;           /* 区域徘徊告警 */
		public static final int NETDEV_FIND_ALARM_OVER_ZONE                          = 29;           /* 翻越围栏告警 */
		public static final int NETDEV_FIND_ALARM_CARE_ARTICLE                       = 30;           /* 物品看护告警 */
		public static final int NETDEV_FIND_ALARM_REMAIN_ARTICLE                     = 31;           /* 物品遗留告警 */
		public static final int NETDEV_FIND_ALARM_FACE_DETECTOR                      = 32;           /* 人脸检测 */
		public static final int NETDEV_FIND_ALARM_GATHER                             = 33;           /* 人员聚集告警 */
		public static final int NETDEV_FIND_ALARM_GATHER_RECOVER                     = 34;           /* 人员聚集告警恢复 */
		public static final int NETDEV_FIND_ALARM_FAST_MOVE                          = 35;           /* 快速移动 */
		public static final int NETDEV_FIND_ALARM_ILLEGAL_PARKED                     = 36;           /* 违法停车告警 */
		public static final int NETDEV_FIND_ALARM_HUMAN_SHAPE_ON                     = 37;           /* 人形检测告警 */
		public static final int NETDEV_FIND_ALARM_HUMAN_SHAPE_OFF                    = 38;           /* 人形检测告警恢复 */
		public static final int NETDEV_FIND_ALARM_BODY_TEMPERATURE                   = 39;           /* 体温异常告警 */
		public static final int NETDEV_FIND_ALARM_NO_MASK                            = 40;           /* 未戴口罩告警 */
		public static final int NETDEV_FIND_ALARM_METAL_DETECT_ON                    = 41;           /* 金属检测告警开始 */
		public static final int NETDEV_FIND_ALARM_METAL_DETECT_OFF                   = 42;           /* 金属检测告警结束 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_MINOR_ON             = 43;           /* 人员密度普通告警 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_MINOR_OFF            = 44;           /* 人员密度普通告警恢复 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_MAJOR_ON             = 45;           /* 人员密度中度告警 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_MAJOR_OFF            = 46;           /* 人员密度中度告警恢复 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_CRITICAL_ON          = 47;           /* 人员密度严重告警 */
		public static final int NETDEV_FIND_ALARM_CROWD_DENSITY_CRITICAL_OFF         = 48;           /* 人员密度严重告警恢复 */

		public static final int NETDEV_FIND_ALARM_INVALID                            = 0xFFFF;        /* 无效值  Invalid value */
	}

	/**
	 * @brief 入侵检测分析信息
	 * @attention 无 None
	 */
	public class NETDEV_INTRUSION_ALARM_INFO_S extends Structure{
		public int    bEnable;                                                  /* 是否启用  Supported or not */
		public NETDEV_INTRUSION_AREA_INFO_S[] stAreaInfo = new NETDEV_INTRUSION_AREA_INFO_S[NETDEV_LEN_4];            /* 区域信息 ，最多支持设置4个区域，每个区域由三到六边形构成 area info */
		public byte[]       byRes = new byte[64];                                                   /* 保留字段  Reserved */
	}

	/**
	 * @brief 硬盘详细信息 Disk info
	 * @attention 无 None
	 */
	public class NETDEV_DISK_INFO_S extends Structure{
		public int dwDiskCabinetIndex;                   /* 磁盘索引 */
		public int dwSlotIndex;                          /* 硬盘所在槽位索引 Slot Index */
		public int dwTotalCapacity;                      /* 硬盘总容量 Total Capacity */
		public int dwUsedCapacity;                       /* 已经使用量 Used Capacity */
		public int enStatus;         /* 运行状态 Status  NETDEV_DISK_WORK_STATUS_E */
		public byte[] szManufacturer = new byte[NETDEV_LEN_32];         /* 厂商 Manufacturer */
	}

	/**
	 * @brief 硬盘信息列表 Disk info list
	 * @attention 无 None
	 */
	public class NETDEV_DISK_INFO_LIST_S extends Structure{
		public int dwSize;                                       /* 硬盘个数 Disk number */
		public NETDEV_DISK_INFO_S[] astDisksInfo = new NETDEV_DISK_INFO_S[NETDEV_DISK_MAX_NUM];     /* 硬盘信息 Disk info */
	}

	/**
	 * @brief 聚焦信息 Focus Info
	 * @attention
	 */
	public class NETDEV_FOCUS_INFO_S extends Structure{
		public int     enFocusMode;                /* 聚焦模式 Defogging mode  参见NETDEV_FOCUS_MODE_E */
		public byte[]       byRes = new byte[16];                   /* 保留字段 Reserved */
	}

	/**
	 * @brief 昼夜模式信息 IrCut filter info
	 * @attention
	 */
	public class NETDEV_IRCUT_FILTER_INFO_S extends Structure{
		public int enIrCutFilterMode;      /* 昼夜模式 IrCut Filter mode NETDEV_IR_CUT_FILTER_MODE_E */
		public byte[]       byRes = new byte[16];               /* 保留字段 Reserved */
	}

	/**
	 * @brief 透雾信息 Defogging info
	 * @attention
	 */
	public class NETDEV_DEFOGGING_INFO_S extends Structure{
		public int  enDefoggingMode;           /* 除雾模式 Defogging mode NETDEV_DEFOGGING_MODE_E*/
		public float                    fDefoggingLevel;           /* 除雾等级 Defogging level (0.0, 1.0) */
		public byte[]       byRes = new byte[64];                  /* 保留字段 Reserved */
	}

	/**
	 * @struct tagNETDEVImagingEnhance
	 * @brief 指定通道的图像增强参数 结构体定义    Device image settings Structure definition
	 * @attention udwBrightness,udwContrast,udwSaturation,udwSharpness,udw2DNoiseReduce 参数取值范围：0-255
	udwBrightness,udwContrast,udwSaturation,udwSharpness,udw2DNoiseReduce parameter range: 0-255
	 */
	public class NETDEV_IMAGE_ENHANCE_S extends Structure{
		public int udwBrightness;                 /* 亮度  Brightness */
		public int udwContrast;                   /* 对比度  Contrast */
		public int udwSaturation;                 /* 饱和度  Saturation */
		public int udwSharpness;                  /* 锐度  Sharpness */
		public int udwImageRotation;              /* 图像镜像模式 */
		public int udw2DNoiseReduce;              /* 2D降噪 */
		public int udw3DNoiseReduce;              /* 3D降噪 */
		public byte[]       byRes = new byte[252];                     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVAudioInputInfo
	 * @brief 音频输入通道信息
	 * attention None
	 */
	public class NETDEV_AUDIO_INPUT_INFO_S extends Structure{
		public int  dwChannelID;     /* 音频通道号 */
		public int udwEnabled;      /* 音频输入通道是否启动 */
		public int udwMode;         /* 音频输入通道模式 参见枚举#NETDEV_AUDIO_CHL_MODE_E */
		public byte[]       byRes = new byte[128];      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVAudioInputCfgInfo
	 * @brief 音频输入参数配置信息
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_INPUT_CFG_INFO_S extends Structure{
		public int bIsMute;                                                                   /* 是否静音 0：不静音，1 静音 */
		public int udwType;                                                                 /* 采集口类型 参见枚举#NETDEV_AUDIO_COLLECTION_PORT_TYPE_E */
		public int udwEncodeFormat;                                                         /* 音频编码格式 参见枚举#NETDEV_AUDIO_ENCODE_FORMAT_TYPE_E */
		public int udwSampleRate;                                                           /* 音频采样率 参见枚举#NETDEV_AUDIO_SAMPLING_RATE_E */
		public int udwInputGain;                                                            /* 音频增益，范围[0,255] */
		public int bNoiseReductionEnabled;                                                    /* 是否启用降噪 0不启用，1启用 */
		public int dwAudioInNum;                                                             /* 音频输入数量 */
		public NETDEV_AUDIO_INPUT_INFO_S[] astAudioInputInfoList = new NETDEV_AUDIO_INPUT_INFO_S[NETDEV_AUDIO_IN_MAX_NUM];       /* 音频输入采集信息列表，当采集口类型为NETDEV_AUDIO_COLLECTION_PORT_TYPE_AUDIO_IN时有效 */
		public int dwSerialInNum;                                                            /* 串口输入数量 */
		public NETDEV_AUDIO_INPUT_INFO_S[] astSerialInputInfoList = new NETDEV_AUDIO_INPUT_INFO_S[NETDEV_SERIAL_IN_MAX_NUM];     /* 串口音频采集信息列表 */
		public byte[]       byRes = new byte[256];                                                               /* 保留字段 */
	}

	/**
	 * @brief 时间配置 结构体定义 Time configuration structure definition
	 * @attention
	 */
	public class NETDEV_TIME_DST_S extends Structure{
		public int dwMonth;              /* 月(1~12)  Month(1~12)*/
		public int dwWeekInMonth;        /* 每月的第N周（1~5）  1 for the first week and 5 for the last week in the month */
		public int dwDayInWeek;          /* 每周的星期几 参见#NETDEV_DAY_IN_WEEK_ENETDEV_DAY_IN_WEEK_E  0 for Sunday and 6 for Saturday see enumeration NETDEV_DAY_IN_WEEK_E */
		public int dwHour;               /* 时  Hour */
	}

	/**
	 * @brief 时间配置 结构体定义 Time configuration structure definition
	 * @attention
	 */
	public class NETDEV_TIME_DST_CFG_S extends Structure{
		public NETDEV_TIME_DST_S   stBeginTime;        /* 夏令时开始时间 参见枚举#NETDEV_TIME_DST_S  DST begin time see enumeration NETDEV_TIME_DST_S */
		public NETDEV_TIME_DST_S   stEndTime;          /* 夏令时结束时间 参见枚举#NETDEV_TIME_DST_S  DST end time see enumeration NETDEV_TIME_DST_S */
		public int               dwOffsetTime;       /* 夏令时节约时间 参见枚举# NETDEV_DST_OFFSET_TIME  DST saving time see enumeration NETDEV_DST_OFFSET_TIME */
	}

	/**
	 * @brief 时间参数 结构体定义 Time parameter Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_TIME_S extends Structure{
		public int   dwYear;                       /* 年  Year */
		public int   dwMonth;                      /* 月  Month */
		public int   dwDay;                        /* 日  Day */
		public int   dwHour;                       /* 时  Hour */
		public int   dwMinute;                     /* 分  Minute */
		public int   dwSecond;                     /* 秒  Second */
	}

	/**
	 * @brief 时间配置 结构体定义 Time configuration structure definition
	 * @attention
	 */
	public class NETDEV_TIME_CFG_S extends Structure{
		public int     dwTimeZone;             /* 时区 参见枚举# NETDEV_TIME_ZONE_E  Time zone, see enumeration #NETDEV_TIME_ZONE_E */
		public NETDEV_TIME_S           stTime;                 /* 时间  Time */
		public int                    bEnableDST;             /* 夏令时使能 DST enable */
		public NETDEV_TIME_DST_CFG_S   stTimeDSTCfg;           /* 夏令时配置 DST time config*/
		public int                  udwDateFormat;          /* 日期格式 0：YYYY-MM-DD 年月日 1：MM-DD-YYYY 月日年 2：DD-MM-YYYY 日月年*/
		public int                  udwHourFormat;          /* 时间格式 0 ：12小时制  1:24 小时制*/
		public byte[]       byRes = new byte[212];             /* 保留字段  Reserved */
	}

	/**
	 * @brief 夏令时配置信息 结构体定义 DST configuration structure definition
	 * @attention
	 */
	public class NETDEV_DST_CFG_S extends Structure{
		public int                    bEnableDST;             /* 夏令时使能 DST enable */
		public NETDEV_TIME_DST_CFG_S   stTimeDSTCfg;           /* 夏令时配置 DST time config*/
		public byte[]       byRes = new byte[128];             /* 保留字段  Reserved */
	}

	/**
	 * @brief 视频源分辨率信息 Video resolution
	 * @attention 无
	 */
	public class NETDEV_VIDEO_RESOLUTION_S extends Structure{
		public int dwWidth;
		public int dwHeight;
	}

	/**
	 * @struct tagNETDEVVideoSnapshotInfo
	 * @brief 视频输入通道的抓图信息 Snap parameter info
	 * @attention
	 */
	public class NETDEV_VIDEO_SNAPSHOT_S extends Structure{
		public int bIsEnabled;                                                             /* 抓图使能,0: 关闭, 1: 开启 Support configuration or not. 0-close, 1-open*/
		public int udwPictureMaxSize;                                                    /* 最大图片大小 */
		public int udwSnapshotInterval;                                                  /* 抓图间隔，范围[1, 60],单位:秒。仅在抓图数量SnapshotNum设置为2或3时有效 */
		public int udwSnapshotNum;                                                       /* 抓图数量，范围[1,3] */
		public NETDEV_VIDEO_RESOLUTION_S stResolution;                                      /* 抓图分辨率 */

		public byte[]       byRes = new byte[255];                                                           /* 保留字段 */
	}

	/**
	 * @brief 开关量计划（周）配置 结构体定义 Plan (Week) Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_SWITCH_WEEK_PLAN_INFO_S extends Structure{
		public int                      udwSwitchIndex;                 /* 开关量索引 */
		public NETDEV_WEEK_PLAN_INFO_S     astWeekPlanInfo;                /* 周计划配置信息 */
		public byte[]       byRes = new byte[128];                     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVRecordStatus
	 * @brief 录像状态信息
	 * @attention
	 */
	public class NETDEV_RECORD_STATUS extends Structure{
		public int   dwChannelID;                    /* 通道号  Channel ID */
		public int   dwRecordType;                   /* 录像类型 0:手动录像1:事件录像2:交易录像3:定时录像4:其他*/
		public int   dwRecordStatus;                 /* 录像状态 0:正在录像1:未启动存储2:没有硬盘或硬盘坏3:通道不在线*/
		public byte[]       byRes = new byte[128];                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVRecordStatusList
	 * @brief 录像状态信息列表
	 * @attention
	 */
	public class NETDEV_RECORD_STATUS_LIST_S extends Structure{
		public int                  udwSize;                                 /* 录像状态数量 */
		public NETDEV_RECORD_STATUS[]    astRecordStatus = new NETDEV_RECORD_STATUS[NETDEV_CHANNEL_MAX];      /* 录像状态信息 */
	}

	/**
	 * @struct tagNETDEVSeriaParam
	 * @brief 串口参数
	 * @attention
	 */
	public class NETDEV_SERIAL_PARAM_S extends Structure{
		public int                                       dwBaudRate;                /* 串口波特率。范围中的特殊值，范围：[1200,115200]，单位: bps。 */
		public int                                       dwDataBit;                 /* 数据位，范围[5-8] */
		public int                                       dwFlowCtrl;                /* 流控制0：无 1：软流控 2：硬流控 */
		public int                                       dwParity;                  /* 校验位0：无校验 1：奇校验 2：偶校验 */
		public int                                       dwStopBit;                 /* 停止位 */

		public byte[]       byRes = new byte[512];         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVSerialPort
	 * @brief 串口配置信息
	 * @attention
	 */
	public class NETDEV_SERIAL_PORT_S extends Structure{
		public int                                       dwChannelID;                /* 串口号 */
		public int                                       dwMode;                     /* 串口工作模式：1：云台控制 2：透明通道 */
		public NETDEV_SERIAL_PARAM_S                       stSerialParam;              /* 串口参数 */

		public byte[]       byRes = new byte[512];         /* 保留字段 */
	}


	/**
	 * @struct tagNETDEVSerialPorts
	 * @brief 串口信息
	 * @attention
	 */
	public class NETDEV_SERIAL_PORTS_S extends Structure{
		public int                         dwSerialPortNum;          /* 串口数 */
		public Pointer        pstSerialPortList;        /* 各串口配置列表 当dwSerialPortNum为0时该字段可选; dwSerialPortNum非0动态分配内存 NETDEV_SERIAL_PORT_S */

		public byte[]       byRes = new byte[512];               /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVAudioDecodeStatus
	 * @brief 随路音频状态信息
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_DECODE_STATUS_S extends Structure{
		public int dwStreamID;       /* 视频流索引号 */
		public int  bDecodeAudio;     /* 是否开启随路音频解码 */
	}

	/**
	 * @struct tagNETDEVAudioDecodeStatusList
	 * @brief 随路音频状态信息列表
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_DECODE_STATUS_LIST_S extends Structure{
		public int dwSize;   /* 数量 */
		public NETDEV_AUDIO_DECODE_STATUS_S[] astAudioDecStatus = new NETDEV_AUDIO_DECODE_STATUS_S[NETDEV_STREAM_MAX_NUM];  /* 随路音频状态信息 */
	}

	/**
	 * @struct tagNETDEVVideoLossRuleInfo
	 * @brief视频丢失告警的配置信息
	 * @attention
	 */
	public class NETDEV_VIDEO_LOSS_RULE_INFO_S extends Structure{
		public int         bEnabled;            /* 使能, 0:不使能 1:使能*/
		public byte[]       byRes = new byte[256];          /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVSwitchLinkageAction
	 * @brief 开关量布控任务联动动作 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_SWITCH_LINKAGE_ACTION_S extends Structure{
		public int                          udwSwitchIndex; /* 开关量索引 */
		public NETDEV_LINKAGE_ACTION_LIST_S    stLinkageActionList;
		public byte[]       byRes = new byte[256];
	}

	/**
	 * @struct tagNETDEVTamperDetectionRuleInfo
	 * @brief遮挡检测告警的配置信息
	 * @attention
	 */
	public class NETDEV_TAMPER_DETECTION_RULE_INFO_S extends Structure{
		public int         bEnabled;              /* 使能, 0:不使能 1:使能*/
		public int       udwSensitivity;        /* 灵敏度，范围[1,100] */
		public int       udwDuration;           /* 持续时间，单位秒。长度范围[0, 10]，IPC需要 */
		public byte[]       byRes = new byte[256];            /* 保留字段 */
	}

	/**
	 * @enum tagNETDEVMotionDetectionAreaType
	 * @brief 运动检测区域类型信息 motion detection area type
	 * @attention
	 */
	public class NETDEV_MOTION_DETECTION_AREA_TYPE_S extends Structure{
		public int  udwAreaType;                    /* 区域类型 参见枚举#NETDEV_MOTION_DETECTION_AREA_TYPE_E */
		public byte[]       byRes = new byte[128];                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVMotionDetectionAreaGridInfo
	 * @brief 运动检测宏块区域信息 Motion detection area grid info
	 * @attention 无 None
	 */
	public class NETDEV_MOTION_DETECTION_AREA_GRID_INFO_S extends Structure{
		public int    bEnabled;                                                        /* 区域使能标识 */
		public int  udwSensitivity;                                                  /* 运动检测灵敏度，值越大越灵敏，范围[1,100]  Sensitivity */
		public short[]   awGridInfo = new short[NETDEV_SCREEN_INFO_ROW*NETDEV_SCREEN_INFO_COLUMN];  /* 检测区域屏幕宏块信息  Grid Info */
		public byte[]       byRes = new byte[256];                                                         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVRectAreaInfo
	 * @brief 矩形区域坐标信息 结构体定义 Rectangle Area info  Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_RECT_AREA_INFO_S extends Structure{
		public int   udwTopLeftX;                       /* x轴左点值 X axis left point value */
		public int   udwTopLeftY;                       /* y轴顶点值 Y axis top point value */
		public int   udwBottomRightX;                   /* x轴右点值 X axis right point value */
		public int   udwBottomRightY;                   /* y轴底点值 Y axis bottom point value */
	}

	/**
	 * @struct tagNETDEVMotionDetectionAreaRectangleInfo
	 * @brief 运动检测矩形区域信息 Motion detection area rectangle info
	 * @attention 无 None
	 */
	public class NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_S extends Structure{
		public int  udwID;                              /* 矩形区域编号 */
		public int    bEnabled;                           /* 区域使能标识 */
		public int  udwSensitivity;                     /* 运动检测灵敏度，值越大越灵敏，范围[1,100]  Sensitivity */
		public int  udwDuration;                        /* 持续时间，范围[1,100] */
		public int  udwTargetSize;                      /* 物体大小，范围[1,100] */
		public NETDEV_RECT_AREA_INFO_S   stRectAreaInfo;   /* 矩形区域信息,坐标值范围[0,9999]  rectangle area Info [0,9999] */
		public byte[]       byRes = new byte[128];                                                         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMotionDetectionAreaRectangleInfoList
	 * @brief 运动检测矩形区域信息列表 Motion detection area rectangle info
	 * @attention 无 None
	 */
	public class NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_LIST_S extends Structure{
		public int                                          udwNum;                                 /* 矩形区域个数 */
		public NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_S[]   astRectangleAreaInfoList = new NETDEV_MOTION_DETECTION_AREA_RECTANGLE_INFO_S[NETDEV_LEN_8]; /* 矩形区域信息列表 */
		public byte[]       byRes = new byte[128];                                                                     /* 保留字段  Reserved */
	}

	/**
	 * @enum tagNETDEVRAIDStatus
	 * @brief 阵列状态信息
	 * @attention
	 */
	public class NETDEV_RAID_STATUS_S extends Structure{
		public int    bEnabled;                   /* 阵列状态使能 */
		public byte[]       byRes = new byte[128];                 /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVHDDInfo
	 * @brief 硬盘信息 HDD info
	 * @attention 无 None
	 */
	public class NETDEV_HDD_INFO_S extends Structure{
		public int  udwID;                          /* 磁盘编号 */
		public int  udwType;                        /* 磁盘类型 参见枚举#NETDEV_HDD_TYPE_E */
		public int  udwWorkMode;                    /* 磁盘工作模式 参见枚举#NETDEV_HDD_WORK_MODE_E */
		public int  udwTotalCapacity;               /* 硬盘总容量(MB) Total Capacity */
		public byte[]    szRAIDName = new byte[NETDEV_LEN_64];      /* 阵列名称 */
		public int  udwStatus;                      /* 磁盘状态 参见枚举#NETDEV_HDD_STATUS_E */
		public byte[]    szManufacturer = new byte[NETDEV_LEN_64];  /* 厂商名称 */
		public byte[]       byRes = new byte[128];                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVHDDInfoList
	 * @brief 磁盘信息列表 Disk info list
	 * @attention 无 None
	 */
	public class NETDEV_HDD_INFO_LIST_S extends Structure{
		public int               dwSize;                             /* 硬盘个数 Disk number */
		public NETDEV_HDD_INFO_S[]   astHDDInfo = new NETDEV_HDD_INFO_S[NETDEV_LEN_32];          /* 硬盘信息 Disk info */
		public byte[]       byRes = new byte[128];                         /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVStorageContainerInfo
	 * @brief 存储容器信息 Storage Container info
	 * @attention 无 None
	 */
	public class NETDEV_STORAGE_CONTAINER_INFO_S extends Structure{
		public int  udwID;                              /* 磁盘编号 */
		public int  udwRemainCapacity;                  /* 存储容器剩余容量(MB) */
		public int  udwTotalCapacity;                   /* 存储容器总容量(MB) */
		public byte[]    szManufacturer = new byte[NETDEV_LEN_64];      /* 厂商名称 */
		public int  udwStatus;                          /* 存储容器状态 参见枚举#NETDEV_STORAGE_CONTAINER_STATUS_E */
		public int  udwProperty;                        /* 存储盘属性,当udwStatus为0时无效 参见枚举#NETDEV_STORAGE_CONTAINER_PROPERTY_E */
		public int  udwFormatProgress;                  /* 格式化进度，百分比 */
		public int  udwGroupID;                         /* 盘组序号 */
		public int  udwTemperature;                     /* 硬盘温度(摄氏度) */
		public byte[]       byRes = new byte[124];                         /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVExtendStorageContainerInfo
	 * @brief 扩展存储容器信息 extend Storage Container info
	 * @attention 无 None
	 */
	public class NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S extends Structure{
		public int  udwID;                              /* 磁盘编号 */
		public int  udwRemainCapacity;                  /* 存储容器剩余容量(MB) */
		public int  udwTotalCapacity;                   /* 存储容器总容量(MB) */
		public int  udwAddressType;                     /* IP地址类型,参见枚举#NETDEV_ADDR_TYPE_E */
		public byte[]    szIPAddress = new byte[NETDEV_LEN_64];         /* 服务器IP地址 */
		public byte[]    szPath = new byte[NETDEV_LEN_256];             /* NAS服务器存储路径 */
		public int  udwUsageType;                       /* 用途,参见枚举#NETDEV_STORAGE_CONTAINER_USAGE_TYPE_E */
		public int  udwStatus;                          /* 存储容器状态 参见枚举#NETDEV_STORAGE_CONTAINER_STATUS_E */
		public int  udwProperty;                        /* 存储盘属性,当udwStatus为0时无效 参见枚举#NETDEV_STORAGE_CONTAINER_PROPERTY_E */
		public int  udwFormatProgress;                  /* 格式化进度，百分比 */
		public int  udwGroupID;                         /* 盘组序号 */
		public byte[]       byRes = new byte[128];                         /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVStorageContainerInfoList
	 * @brief 存储容器信息列表 Storage Container info List
	 * @attention 无 None
	 */
	public class NETDEV_STORAGE_CONTAINER_INFO_LIST_S extends Structure{
		public int                                  udwLocalHDDNum;                                                 /* 本地硬盘数量 */
		public NETDEV_STORAGE_CONTAINER_INFO_S[]         astLocalHDDList = new NETDEV_STORAGE_CONTAINER_INFO_S[NETDEV_LOCAL_DISK_MAX_NUM];                     /* 本地存储盘信息列表 */
		public int                                  udwSDNum;                                                       /* SD卡数量 */
		public NETDEV_STORAGE_CONTAINER_INFO_S[]         astSDList = new NETDEV_STORAGE_CONTAINER_INFO_S[NETDEV_SD_CARD_DISK_MAX_NUM];                         /* SD卡信息列表 */
		public int                                  udwArrayNum;                                                    /* 阵列数量 */
		public NETDEV_STORAGE_CONTAINER_INFO_S[]         astArrayList = new NETDEV_STORAGE_CONTAINER_INFO_S[NETDEV_ARRAY_MAX_NUM];                             /* 阵列信息列表 */
		public int                                  udwExtendCabinet1HDDNum;                                        /* 拓展柜-1存储盘数量 */
		public NETDEV_STORAGE_CONTAINER_INFO_S[]         astExtendCabinet1HDDList = new NETDEV_STORAGE_CONTAINER_INFO_S[NETDEV_EXTEND_CABINET_DISK_MAX_NUM];   /* 拓展柜-1 信息列表 */
		public int                                  udwExtendCabinet2HDDNum;                                        /* 拓展柜-2存储盘数量 */
		public NETDEV_STORAGE_CONTAINER_INFO_S[]         astExtendCabinet2HDDList = new NETDEV_STORAGE_CONTAINER_INFO_S[NETDEV_EXTEND_CABINET_DISK_MAX_NUM];   /* 拓展柜-2 信息列表 */
		public int                                  udwNASNum;                                                      /* NAS数量 */
		public NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[]  astNASList = new NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[NETDEV_NAS_MAX_NUM];                                 /* NAS信息列表 */
		public int                                  udweSATANum;                                                    /* eSATA硬盘数量 */
		public NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[]  asteSATAList = new NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[NETDEV_ESATA_MAX_NUM];                             /* eSATA信息列表 */
		public int                                  udwIPSANNum;                                                    /* IPSAN数量 */
		public NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[]  astIPSANList=new NETDEV_EXTEND_STORAGE_CONTAINER_INFO_S[NETDEV_IPSAN_MAX_NUM];                             /* IPSAN信息列表 */
		public byte[]       byRes = new byte[256];                                                     /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPhotoServerCfgInfo
	 * @brief 照片接收服务器配置信息
	 * @attention 无 None
	 */
	public class NETDEV_PHOTO_SERVER_CFG_INFO_S extends Structure{
		public int                          udwProtocol;                                          /* 通信协议类型 参见：NETDEV_PHOTO_SERVER_PRO_TYPE_E*/
		public int                          udwSubProtocol;                                       /* 通信协议子类型 参见：NETDEV_PHOTO_SERVER_SUBPRO_TYPE_E，仅在udwProtocol为1、31时有效*/
		public int                          udwPort;                                              /* TMS服务器端口号 [0,65535] */
		public byte[]                            szIPV4Address = new byte[NETDEV_IPADDR_STR_MAX_LEN];             /* TMS服务器IPv4地址*/
		public byte[]                            szTollgateID = new byte[NETDEV_LEN_64];                          /* 卡口编号(0, 36]; 可选字段，接口不携带该字段时表示不更新该字段 */
		public byte[]                            szCameraID = new byte[NETDEV_LEN_64];                            /* 相机编号(0, 36];可选字段，接口不携带该字段时表示不更新该字段*/

		public byte[]       byRes = new byte[128];                                           /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPhotoServerCfgInfoList
	 * @brief 照片接收服务器配置信息列表
	 * @attention 无 None
	 */
	public class NETDEV_PHOTO_SERVER_CFG_INFO_LIST_S extends Structure{
		public int                          udwNum;                                               /* 照片服务器数量 */
		public NETDEV_PHOTO_SERVER_CFG_INFO_S[]    astPhotoServerList = new NETDEV_PHOTO_SERVER_CFG_INFO_S[NETDEV_PHOTO_SERVER_MAX_NUM];      /* 照片服务器配置列表 */

		public byte[]       byRes = new byte[512];                                           /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVHDDSmartDetailsInfo
	 * @brief 硬盘Smart详细信息
	 * @attention 无 None
	 */
	public class NETDEV_HDD_SMART_DETAILS_INFO_S extends Structure{
		public int  udwAttributeID;                     /* 属性ID */
		public byte[]    szAttributeName = new byte[NETDEV_LEN_64];     /* 属性名称 */
		public int  udwStatus;                          /* 状态 参见枚举#NETDEV_HDD_SMART_ASSESSMENT_STATUS_E */
		public int  udwHex;                             /* 显示为十六进制 */
		public int  udwThresh;                          /* 阈值 */
		public int  udwCurrentValue;                    /* 当前值 */
		public int  udwWorstValue;                      /* 最差值 */
		public int  udwActualValue;                     /* 实际值 */
		public byte[]       byRes = new byte[128];                         /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVHDDSmartInfo
	 * @brief 硬盘Smart信息
	 * @attention 无 None
	 */
	public class NETDEV_HDD_SMART_INFO_S extends Structure{
		public int                          udwID;                                  /* IN 存储容器编号 */
		public byte[]                            szManufacturer = new byte[NETDEV_LEN_64];          /* 厂商名称 */
		public int                          udwTemperature;                         /* 温度(℃) */
		public byte[]                            szDeviceModel = new byte[NETDEV_LEN_64];           /* 硬盘型号 */
		public int                          udwUsedDays;                            /* 使用天数 */
		public int                          udwHealthAssessment;                    /* 整体评估结果 参见枚举#NETDEV_HDD_HEALTH_ASSESSMENT_STATUS_E */
		public byte[]                            szFirmware = new byte[NETDEV_LEN_64];              /* 硬盘固件版本 */
		public int                          udwSmartNum;                            /* Smart详情项数量 */
		public NETDEV_HDD_SMART_DETAILS_INFO_S[] SmartDetailsInfoList = new NETDEV_HDD_SMART_DETAILS_INFO_S[NETDEV_DISK_SMART_MAX_NUM];    /* Smart详情项列表 */
		public int                            bCheckResult;                           /* 自我评估结果, TRUE 通过，FALSE 未通过 */
		public int                          udwCheckPrograss;                       /* 检测进度 [0,100] */
		public int                          udwCheckStatus;                         /* 检测状态 参见枚举#NETDEV_HDD_SMART_CHECK_STATUS_E */
		public int                          udwCheckType;                           /* 检测类型 参见枚举#NETDEV_HDD_SMART_CHECK_TYPE_E */
		public byte[]       byRes = new byte[128];                             /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVHDDSmartCheckInfo
	 * @brief 硬盘Smart检测信息
	 * @attention 无 None
	 */
	public class NETDEV_HDD_SMART_CHECK_INFO_S extends Structure{
		public int                          udwID;                                  /* 存储容器编号 */
		public int                          udwType;                                /* 检测类型 参见枚举# NETDEV_HDD_SMART_CHECK_TYPE_E */
		public byte[]       byRes = new byte[128];                             /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonLibCapInfo
	 * @brief 人脸库容量信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_LIB_CAP_INFO_S extends Structure
	{
		public int          udwLibID;                /* 库ID */
		public int          udwCapacity;             /* 库容量信息，单位：人 */
		public byte[]       byRes = new byte[128];   /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPersonLibCapList
	 * @brief 所有人员库的容量信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_LIB_CAP_LIST_S extends Structure
	{
		public int                      udwMaxPerpleMun;                         /* 总库容量，单位：K人 */
		public int                      udwFreePerpleNum;                        /* 剩余容量，单位：人 */
		public int                      udwMaxLibNum;                            /* 最大可建库容量 */
		public int                      udwFreeLibNum;                           /* 剩余可建库容量 */
		public int                      udwNum;                                  /* 已建库个数 库个数范围:[0, 16] */
		public  NETDEV_PERSON_LIB_CAP_INFO_S[]  stLibCapInfoList = new NETDEV_PERSON_LIB_CAP_INFO_S[NETDEV_LEN_16];         /* 单库容量信息 */
		public byte[]                   byRes = new byte[256];                   /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVLibInfo
	 * @brief 库信息
	 * @attention 人员库和车辆库
	 */
	public class NETDEV_LIB_INFO_S extends Structure
	{
		public int udwID;                           /* 库ID */
		public byte[]   szName = new byte[NETDEV_LEN_256];          /* 库名称 范围[1,63] */
		public int udwType;                         /* 人员库类型 详情参见枚举NETDEV_PEOPLE_LIB_TYPE_E*/
		public int udwPersonNum;                    /* 库中人员信息的总数 */
		public int udwFaceNum;                      /* 库中人脸照片总数 */
		public int udwMemberNum;                    /* 库中成员的总数 */
		public int udwLastChange;                   /* 库的信息的最后修改时间 */
		public byte[]   szBelongIndex = new byte[NETDEV_LEN_256];   /* 库的唯一归属索引 */
		public int   bIsMonitored;                  /* 是否已布控，获取库信息时必带 */
		public byte[]   byRes = new byte[128];                      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonLibList
	 * @brief 人员库信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_LIB_LIST_S extends Structure
	{
		public int               udwNum;                       /* 设备中已创建的库数量 */
		public Pointer pstLibInfo;                 /* 库列表信息,需动态分配内存 NETDEV_LIB_INFO_S */
		public byte[]                byRes = new byte[128];    /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVDeleteDBFlagInfo
	 * @brief 删除库信息标志位
	 * @attention 无 None
	 */
	public class NETDEV_DELETE_DB_FLAG_INFO_S extends Structure
	{
		public int        bIsDeleteMember;                  /* 是否删除库下里面的成员信息：0:不删除 1:删除 */
		public int        udwDevID;              /* 设备ID(仅VMS删除人脸库支持) */
		public byte[]     byRes = new byte[124];            /* 保留字段  Reserved */

	}

	/**
	 * @struct tagstNETDEVAlarmLogCond
	 * @brief 告警日志查询条件
	 * @attention  查询“告警类型”时，携带的告警主类型或子类型数量均不能超过16个。
	 */
	public class NETDEV_QUERY_INFO_S extends Structure
	{
		public int   dwQueryType;                                /* 查询条件类型，参见#NETDEV_QUERYCOND_TYPE_E */
		public int   dwLogicFlag;                                /* 查询条件逻辑类型，参见#NETDEV_QUERYCOND_LOGICTYPE_E */
		public byte[]    szConditionData = new byte[NETDEV_CODE_STR_MAX_LEN];   /* 查询条件右值 */
	}

	/**
	 * @struct tagNETDEVPersonQueryInfo
	 * @brief 人员信息查询条件
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_QUERY_INFO_S extends Structure
	{
		public int                      udwNum;             /* 查询条件数量 */
		public Pointer    pstQueryInfos;      /* 查询条件列表，Num为0时，不带此字段 NETDEV_QUERY_INFO_S */
		public int                      udwLimit;           /* 每次查询的数量，最大20 */
		public int                      udwOffset;          /* 从当前序号开始查询，序号从0开始 */
		public byte[]                   byRes = new byte[256];         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVBatchOperateBasicInfo
	 * @brief 批量查询返回的基本信息 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_BATCH_OPERATE_BASIC_S extends Structure
	{
		public int   udwTotal;       /* 数量 */
		public int   udwOffset;      /* 查询起始序号 */
		public int   udwNum;         /*查询结果总数 */
		public byte[]     byRes = new byte[128];     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVRegionInfo
	 * @brief 成员地区信息
	 * @attention 无 None
	 */
	public class NETDEV_REGION_INFO_S extends Structure
	{
		public byte[] szNation = new byte[NETDEV_LEN_128];          /* 国籍，范围[1-63] */
		public byte[] szProvince = new byte[NETDEV_LEN_128];        /* 省份，范围[1-63] */
		public byte[] szCity = new byte[NETDEV_LEN_128];            /* 城市，范围[1-63] */
		public byte[] byRes = new byte[256];

	}

	/**
	 * @enum tagNETDEVPersonTimeTemplateInfo
	 * @brief 时间模板相关信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_TIME_TEMPLATE_INFO_S extends Structure
	{
		public int udwBeginTime;    /* 时间模板生效起始时间 若未配置，填写0 */
		public int udwEndTime;      /* 时间模板生效结束时间 若未配置，填写4294967295(0xFFFFFFFF)*/
		public int udwIndex;        /* 时间模板索引 */
		public byte[]   byRes = new byte[128];      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVIdentificationInfo
	 * @brief 成员证件信息
	 * @attention 无 None
	 */
	public class NETDEV_IDENTIFICATION_INFO_S extends Structure
	{
		public int udwType;                     /* 证件类型 详情参见枚举 NETDEV_ID_TYPE_E*/
		public byte[]   szNumber = new byte[NETDEV_LEN_128];     /* 证件号，范围:[1, 127] */
		public byte[]   byRes = new byte[32];                  /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVFileInfo
	 * @brief 文件信息
	 * @attention 若udwSize不为0且pcData为空,则通过szUrl获取图片
	 */
	public class NETDEV_FILE_INFO_S extends Structure
	{
		public byte[]   szName = new byte[NETDEV_LEN_64];   /* 文件名称 范围[1, 16]*/
		public int udwSize;                 /* 文件大小[pcdata或通过szurl获取到的图片大小] 单位:字节 范围:[0, 1M(1048576)] */
		public int dwFileType;              /* 文件类型，详见枚举值：NETDEV_FILE_TYPE_E */
		public int udwLastChange;           /* 最后修改时间，UTC时间，单位为s */
		public Pointer   pcData;                 /* 文件数据 Base64 需根据udwSize 动态申请内存 byte[] */
		public byte[]   szUrl = new byte[NETDEV_LEN_512];   /* 图片URL，长度范围[0,256] */
		public byte[]   byRes = new byte[128];              /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVImageInfo
	 * @brief 人脸图片信息列表
	 * @attention 无 None
	 */
	public class NETDEV_IMAGE_INFO_S extends Structure
	{
		public int udwFaceID;                   /* 人脸照片ID */
		public NETDEV_FILE_INFO_S stFileInfo;      /* 照片信息 */
		public byte[]   byRes = new byte[128];                  /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVCustomValue
	 * @brief 自定义属性信息
	 * @attention 无 None
	 */
	public class NETDEV_CUSTOM_VALUE_S extends Structure
	{
		public int  udwID;                                         /* 自定义属性名称序号 从0开始*/
		public byte[]    szValue = new byte[NETDEV_FACE_MEMBER_CUSTOM_LEN];        /* 自定义属性值 范围[1,63]*/
		public int  udwModelStatus;                                /* 建模状态，即将人脸图片转为半结构化数据的状态。0：未建模 1：已建模 2：建模失败 */
		public byte[]    byRes = new byte[124];                                    /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVStaffInfo
	 * @brief 员工信息
	 * @attention 无 None
	 */
	public class NETDEV_STAFF_INFO_S extends Structure
	{
		public byte[]   szNumber = new byte[NETDEV_LEN_32];                       /* 人员编号 字符串长度范围[1, 16] */
		public byte[]   szBirthday = new byte[NETDEV_LEN_32];                     /* 出生日期 字符串长度范围[1,31] */
		public int      udwDeptID;                                                /* 部门ID */
		public byte[]   szDeptName = new byte[NETDEV_LEN_256];                    /* 部门名称 添加时可不携带 字符串长度范围[1, 64] */
		public byte[]   byRes = new byte[256];                                    /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVVisitorInfo
	 * @brief 访客信息
	 * @attention 无 None
	 */
	public class NETDEV_VISITOR_INFO_S extends Structure
	{
		public int udwVisitorCount;                               /* 访客人数 */
		public byte[]   szCompany = new byte[NETDEV_LEN_256];                     /* 访客单位 字符串长度范围[1, 64] */
		public int udwIntervieweeID;                              /* 被访者ID */
		public byte[]   byRes = new byte[256];                                    /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVPersonInfo
	 * @brief 人员信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_INFO_S extends Structure
	{
		public int                                  udwPersonID;                         /* 人员ID */
		public int                                  udwLastChange;                       /* 人员信息最后修改时间 */
		public byte[]                               szPersonName = new byte[NETDEV_LEN_256];        /* 人员名字 范围:[1, 63] */
		public int                                  udwGender;                           /* 成员性别 详情参见枚举NETDEV_GENDER_TYPE_E*/
		public byte[]                               szBirthday = new byte[NETDEV_LEN_64];           /* 成员出生日期，格式YYYYMMDD，范围[1,31] */
		public NETDEV_REGION_INFO_S                    stRegionInfo;                        /* 成员地区信息 */
		public int                                  udwTimeTemplateNum;                  /* 时间模板数量 */
		public Pointer                              pstTimeTemplateList;                 /* 时间模板相关信息 需动态分配  NETDEV_PERSON_TIME_TEMPLATE_INFO_S*/
		public int                                  udwIdentificationNum;                /* 证件信息个数 范围:[0, 6]*/
		public NETDEV_IDENTIFICATION_INFO_S[]            stIdentificationInfo = new NETDEV_IDENTIFICATION_INFO_S[NETDEV_LEN_8];  /* 成员证件信息 */
		public int                                  udwImageNum;                         /* 人脸图片个数 范围:[0, 6] */
		public NETDEV_IMAGE_INFO_S[]                     stImageInfo = new NETDEV_IMAGE_INFO_S[NETDEV_LEN_8];           /* 人脸图片信息列表 */
		public int                                  udwReqSeq;                           /* 请求数据序列号，此字段会在返回结果中待会，仅在批量添加中携带该字段 */
		public int                                    bIsMonitored;                        /* 是否已布控，获取时必带，仅VMS支持 */
		public int                                  udwBelongLibNum;                     /* 所属人员库数量，仅VMS支持 */
		public Pointer                                 pudwBelongLibList;                   /* 所属人员库ID列表，需动态分配内存，仅VMS支持 int[] */
		public int                                  udwCustomNum;                        /* 自定义属性值数量，最多5个，仅VMS支持 */
		public Pointer                 pstCustomValueList;                  /* 自定义属性值列表，需动态分配内存，当Num为0时可以不填 NETDEV_CUSTOM_VALUE_S */
		public byte[]                                    szTelephone = new byte[NETDEV_LEN_64];          /* 联系电话 字符串长度[1,64] */
		public byte[]                                    szAddress = new byte[NETDEV_LEN_256];           /* 地址 字符串长度范围[1, 64] */
		public int                                  udwCardNum;                          /* 门禁卡个数 取值范围[0,6],Get时携带 */
		public int                                  udwFingerprintNum;                   /* 指纹个数，取值范围[0,10] */
		public int                                  udwType;                             /* 人员类型 0：员工 1：访客 2：陌生人 */
		public NETDEV_STAFF_INFO_S                     stStaff;                             /* 员工信息 Type为员工时必填 */
		public NETDEV_VISITOR_INFO_S                   stVisitor;                           /* 访客信息 Type为访客时必填 */
		public byte[]                                    szDesc = new byte[NETDEV_LEN_480];              /* 备注信息 字符串长度范围[1, 128] */
		public byte[]                                    szPersonCode=new byte[NETDEV_LEN_16];         /* 人员编码，可填写学号或工号，范围:[1, 15] PTS支持 */
		public byte[]                                    szRemarks=new byte[NETDEV_LEN_64];            /* 备注信息 范围:[1-63] PTS支持 */
		public byte[]                                    byRes = new byte[176];                          /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonInfoList
	 * @brief 人员信息列表
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_INFO_LIST_S extends Structure
	{
		public int udwNum;                                          /* 人员库人员个数 */
		public Pointer              pstPersonInfo;   /* 人员信息列表,需动态分配内存 NETDEV_PERSON_INFO_S */
		public byte[]   byRes = new byte[128];                                      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVFaceInfo
	 * @brief 人脸信息结果
	 * @attention 无 None
	 */
	public class NETDEV_FACE_INFO_S extends Structure
	{
		public int udwFaceID;           /* 人员ID */
		public int udwResultCode;       /* 处理结果状态码，详见#NETDEV_PERSON_RESULT_CODE_E */
		public byte[]   byRes = new byte[128];          /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonList
	 * @brief 人员信息列表
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_LIST_S extends Structure
	{
		public int udwPersonID;                                 /* 人员ID */
		public int udwFaceNum;                                  /* 人脸个数 批量单次最多6个 */
		public NETDEV_FACE_INFO_S[] stFaceInfo = new NETDEV_FACE_INFO_S[NETDEV_LEN_8];        /* 人脸信息结果列表 */
		public int udwReqseq;                                   /* 请求数据序号,仅VMS支持 */
		public byte[]   byRes = new byte[128];                                  /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonResultList
	 * @brief 人员信息结果列表
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_RESULT_LIST_S extends Structure
	{
		public int udwNum;                                          /* 人员个数 */
		public Pointer pstPersonList;                   /* 人员信息执行结果列表,需动态分配内存 malloc by caller NETDEV_PERSON_LIST_S */
		public byte[]   byRes = new byte[128];                                      /* 保留字节 */
	}

	/**
	 * @struct tagstNETDEVAlarmLogCondList
	 * @brief 告警日志所有查询条件
	 * @attention
	 */
	public class NETDEV_ALARM_LOG_COND_LIST_S extends Structure
	{
		public int   dwPageRow;                                                      /* 每页最大条数 */
		public int   dwFirstRow;                                                     /* 分页查询中第一条数据的序号 */
		public int   dwCondSize;                                                     /* 查询条件数量 */
		public NETDEV_QUERY_INFO_S[] astCondition = new NETDEV_QUERY_INFO_S[NETDEV_LOG_QUERY_COND_NUM];            /* 查询条件右值 */
	}

	/**
	 * @struct tagstNETDEVAlarmLogInfo
	 * @brief 告警日志信息
	 * @attention
	 */
	public class NETDEV_ALARM_LOG_INFO_S extends Structure
	{
		public int dwAlarmID;                                                  	  /* 告警ID */
		public int dwAlarmType;                                           		  /* 告警类型 参见# NETDEV_ALARM_TYPE_E*/
		public int dwAlarmSubType;                                      		  /* 告警子类型,参见#NETDEV_ALARM_SUBTYPE_E */
		public int dwAlarmLevel;                                        		  /* 告警等级 0：紧急 1：重要 2：次要 3：警告 4：提示 */
		public int dwServerID;                                         		      /* 所属服务器 */
		public int dwDevID;                                                       /* 设备ID */
		public int dwChannelID;                                                   /* 通道ID */
		public byte[] szAlarmSrc = new byte[NETDEV_NAME_MAX_LEN];                 /* 告警源信息 */
		public long tAlarmTime;                                                   /* 告警发生时间 UTC时间格式，单位为秒  */
		public int bAlarmChecked;                                                 /* 告警是否被确认 ，0：未确认 1：确认*/
		public byte[] szAlarmCheckUser = new byte[NETDEV_USERNAME_LEN];           /* 告警确认用户 */
		public long tAlarmCheckTime;                                              /* 告警确认时间 */
		public byte[] szAlarmCheckDesc = new byte[NETDEV_DESCRIBE_MAX_LEN];       /* 告警确认描述 */
		public int dwAlarmLinkType;                                               /* 告警联动类型 */
		public int IsAlarmSnapExisted;                                            /* 告警是否有抓图 0没有抓图 1有抓图*/
		public int dwAlarmSrcBelong;                                     /* 告警所属，参见#NETDEV_ALARM_SRC_BELONG_TYPE_E */
		public byte[] szAlarmDetail= new byte[NETDEV_DESCRIBE_MAX_LEN];               /* 告警详情，补充业务层需要展示的信息 */
		public int dwHasRelatedData;                                     /* 告警是否存在关联数据 0：不存在 1：存在 */
		public byte[] byRes = new byte[244];                                      /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVFaceAlarmLogResultInfo
	 * @brief 告警记录返回信息（人脸识别和车牌识别）
	 * @attention
	 */
	public class NETDEV_SMART_ALARM_LOG_RESULT_INFO_S extends Structure
	{
		public int   udwTotal;                     /* 告警记录总数 */
		public int   udwOffset;                    /* 记录偏移量 */
		public int   udwNum;                       /* 此次返回告警记录个数 */
		public byte[]     byRes = new byte[128];                   /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVFaceMemberRegionInfo
	 * @brief 人脸库成员地区信息
	 * @attention 无 None
	 */
	public class NETDEV_FACE_MEMBER_REGION_INFO_S extends Structure
	{
		public byte[]   szNation = new byte[NETDEV_FACE_MEMBER_REGION_LEN];                       /* 国籍 */
		public byte[]   szProvince = new byte[NETDEV_FACE_MEMBER_REGION_LEN];                     /* 省份 */
		public byte[]   szCity = new byte[NETDEV_FACE_MEMBER_REGION_LEN];                         /* 城市 */
		public byte[]   byRes = new byte[256];                                                    /* 保留字段  Reserved */

	}

	/**
	 * @struct tagNETDEVFaceMemberIDInfo
	 * @brief 成员证件信息
	 * @attention 无 None
	 */
	public class NETDEV_FACE_MEMBER_ID_INFO_S extends Structure
	{
		public int   udwType;                                       /*证件类型 参见枚举 NETDEV_FACE_MEMBER_ID_TYPE_E */
		public byte[]     szNumber = new byte[NETDEV_FACE_IDNUMBER_LEN];            /* 证件号 */

		public byte[]    byRes = new byte[128];                                     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVFaceMemberInfo
	 * @brief 人脸库成员信息 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_FACE_MEMBER_INFO_S extends Structure
	{
		public int   udwReqSeq;                                                   /* 请求数据序号 */
		public int   udwMemberID;                                                 /*人脸库成员ID   只读 post消息时不带*/
		public byte[]     szMemberName = new byte[NETDEV_FACE_MEMBER_NAME_LEN];                   /* 成员名称 */
		public int   udwMemberGender;                                             /* 成员性别 参见枚举 NETDEV_GENDER_TYPE_E */
		public byte[]     szMemberBirthday = new byte[NETDEV_FACE_MEMBER_BIRTHDAY_LEN];           /* 成员出生日期 */
		public NETDEV_FACE_MEMBER_REGION_INFO_S   stMemberRegionInfo;                /* 成员地区信息 */
		public NETDEV_FACE_MEMBER_ID_INFO_S       stMemberIDInfo;                    /* 成员证件信息 */
		public NETDEV_FILE_INFO_S                 stMemberImageInfo;                 /* 人脸图片信息 */
		public NETDEV_FILE_INFO_S                 stMemberSemiInfo;                  /* 人脸半结构化信息 */
		public int   udwCustomNum;                                                /* 自定义属性值数量 */
		public NETDEV_CUSTOM_VALUE_S[]   stCustomValue = new NETDEV_CUSTOM_VALUE_S[NETDEV_FACE_MEMBER_CUSTOM_NUM];        /* 自定义属性值列表 */
		public int      bIsMonitored;                                               /* 是否已布控  0未布控，1已布控 */
		public int    udwDBNum;                                                   /* 所属人脸库数量 */
		public int[]    audwDBIDList = new int[NETDEV_LEN_16];                                /* 人脸库ID列表 */
		public byte[]      byRes = new byte[128];                                                 /* 保留字段  Reserved */

	}

	/**
	 * @struct tagstNETDEVFaceAlarmImageArea
	 * @brief 区域坐标
	 * @attention
	 */
	public class NETDEV_FACE_ALARM_IMAGE_AREA_S extends Structure
	{
		public int   udwLeft;          /* 左坐标 */
		public int   udwTop;           /* 上坐标 */
		public int   udwRight;         /* 右坐标 */
		public int   udwButtom;        /* 下坐标 */

		public byte[]     byRes = new byte[128];       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVFaceAlarmLogSnapImage
	 * @brief 抓拍图片信息
	 * @attention
	 */
	public class NETDEV_FACE_ALARM_SNAP_IMAGE_S extends Structure
	{
		public NETDEV_FILE_INFO_S   stBigImage;                /* 大图 */
		public NETDEV_FILE_INFO_S   stSmallImage;              /* 小图 */
		public NETDEV_FACE_ALARM_IMAGE_AREA_S   stArea;        /* 区域坐标 */
		public byte[]    byRes = new byte[128];                             /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVFaceAlarmCmpInfo
	 * @brief 人脸抓拍告警记录比对信息
	 * @attention
	 */
	public class NETDEV_FACE_ALARM_CMP_INFO_S extends Structure
	{
		public int                           udwSimilarity;               /* 相似度 */
		public NETDEV_FACE_MEMBER_INFO_S        stMemberInfo;                /* 人脸库成员信息 */
		public NETDEV_FACE_ALARM_SNAP_IMAGE_S   stSnapshotImage;             /* 抓拍图片 */
		public Pointer                          pstPersonInfo;               /*人脸库成员信息(NVR支持) 查询匹配成功/失败记录携带 需动态申请内存(NETDEV_PERSON_INFO_S) */
		public byte[]    byRes = new byte[124];                                           /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVFaceRecordSnapshotInfo
	 * @brief 人脸识别记录
	 * @attention
	 */
	public class NETDEV_FACE_RECORD_SNAPSHOT_INFO_S extends Structure
	{
		public int   udwRecordID;                                       /* 人脸识别记录ID */
		public int   udwRecordType;                                     /* 人脸识别记录类型 参见# NETDEV_FACE_PASS_RECORD_TYPE_E */
		public int   udwPassTime;                                       /* 过人时间 UTC格式 */
		public int   udwEventType;                                      /* 事件类型 按BIT位进行类型描述，相应BIT为1，表示属于该类型，为0表示不属于该类型。BIT0:人脸抓拍BIT1:人脸匹配告警BIT2:人脸不匹配告警*/
		public int   udwChannelID;                                      /* 通道ID */
		public int   udwMonitorRuleID;                                  /* 告警对应的布控ID */
		public byte[]     szChannelName = new byte[NETDEV_LEN_260];                     /* 抓拍通道名称 */
		public NETDEV_FACE_ALARM_CMP_INFO_S  stCompareInfo;                /* 比对信息 */
		public byte[]     byRes = new byte[124];                                        /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMonitorQueryInfo
	 * @brief 布控信息查询条件
	 * @attention 无 None
	 */
	public class NETDEV_MONITOR_QUERY_INFO_S extends Structure
	{
		public int                      udwLimit;           /* 每次查询的数量，最大20 */
		public int                      udwOffset;          /* 从当前序号开始查询，序号从0开始 */
		public int                        bIsQueryAll;        /* 是否查询所有，是:TRUE,否:FALSE */
		public byte[]                        byRes = new byte[128];         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVMemberInfo
	 * @brief 人脸/车辆成员信息列表 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_MEMBER_INFO_S extends Structure
	{
		public int udwMemberID;                                         /* 人脸/车辆成员ID */
		public byte[] szMemberName = new byte[NETDEV_LEN_260];          /* 人脸/车辆成员名称，范围[1,63] */
        public int udwStatus;                                           /* 成员同步状态 人脸参考:NETDEV_PERSON_RESULT_CODE_E */
		public byte[]     byRes = new byte[124];                         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMonitorRuleInfo
	 * @brief 布控任务配置信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_MONITION_RULE_INFO_S extends Structure
	{
		public int                    bEnabled;                                              /* 布控任务使能 */
		public byte[]                    szName = new byte[NETDEV_FACE_MONITOR_RULE_NAME_LEN];             /* 布控任务的布控名称 */
		public byte[]                    szReason = new byte[NETDEV_FACE_MONITOR_RULE_REASON_LEN];         /* 布控的布控原因 */
		public int                  udwLibNum;                                             /* 任务对应的库数量,最大16个 */
		public int[]                  audwLibList = new int[NETDEV_LEN_32];                            /* 库ID列表 */
		public int                  udwMonitorType;                                        /* 布控告警类型，0：匹配告警,1：不匹配告警 */
		public int                  udwMultipleValue;                                      /* 人脸1：N比较置信度阀值 */
		public int                  udwMonitorReason;                                      /*  车辆布控原因：0：被抢车 1：被盗车 2：嫌疑车 3：交通违法车 4：紧急查控车*/
		public byte[]                    szMatchSucceedMsg = new byte[NETDEV_LEN_512];                     /* 比对成功提示语 */
		public byte[]                    szMatchFailedMsg = new byte[NETDEV_LEN_512];                      /* 比对失败提示语 */
		public int                  udwMemberNum;                                          /* 成员数量 [0-32] */
		public NETDEV_MEMBER_INFO_S[]    stMemberInfo = new NETDEV_MEMBER_INFO_S[NETDEV_LEN_64];                           /* 成员信息列表 */
		public int                  udwChannelNum;                                         /* 人脸布控任务的布控通道个数 获取单个布控任务详情时必带 */
		public Pointer                  pudwMonitorChlIDList;                                 /* 人脸布控任务的布控通道列表 根据udwChannelNum动态确定 上层申请内存  int[]*/
		public int                  udwDevNum;                                             /* 布控任务的布控设备个数 最多四个,仅VMS支持 */
		public int[]                  audwMonitorDevIDList = new int[NETDEV_LEN_16];                   /* 布控任务的布控设备列表 根据DevNum动态确定,仅VMS支持*/
		public int                  udwMonitorRuleType;                                    /* 布控任务智能类型，0：本地智能布控,1：前端智能布控 */
		public byte[]                    byRes = new byte[240];                                            /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVEnabledActParamInfo
	 * @brief 使能联动参数
	 * @attention
	 */
	public class NETDEV_ENABLED_ACT_PARAM_INFO_S extends Structure
	{
		public int    bEnabled;       /* 使能标记 */
		public byte[]    byRes = new byte[64];      /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVOutputSwitchActParamInfo
	 * @brief 联动开关量输出
	 * @attention
	 */
	public class NETDEV_OUTPUT_SWITCH_ACT_PARAM_INFO_S extends Structure
	{
		public int udwNum;                                                                                 /* 联动的开关量输出个数*/
		public NETDEV_OUTPUT_SWITCH_ALARM_STATUS_S[] astOutputAlarmStatusInfo = new NETDEV_OUTPUT_SWITCH_ALARM_STATUS_S[NETDEV_MAX_ALARM_OUT_NUM];        /* 联动的开关量输出列表*/
	}

	/**
	 * @struct tagNETDEVChannelActParamInfo
	 * @brief 通道联动
	 * @attention
	 */
	public class NETDEV_CHANNEL_ACT_PARAM_INFO_S extends Structure
	{
		public int udwNum;                                 /* 通道个数*/
		public int[] adwChannelID = new int[NETDEV_CHANNEL_MAX];        /* 通道ID列表*/
	}

	/**
	 * @struct tagNETDEVChannelPreset
	 * @brief 联动云台预置位
	 * @attention
	 */
	public class NETDEV_CHANNEL_PRESET_S extends Structure
	{
		public int dwChannelID;                              /* 通道号*/
		public int dwPresetID;                               /* 预置位编号*/
		public byte[]  byRes = new byte[128];                               /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPresetActParamInfo
	 * @brief 联动云台预置位
	 * @attention
	 */
	public class NETDEV_PRESET_ACT_PARAM_INFO_S extends Structure
	{
		public int udwNum;                                                      /* 联动动作数量*/
		public NETDEV_CHANNEL_PRESET_S[] stChannelPreset = new NETDEV_CHANNEL_PRESET_S[NETDEV_CHANNEL_MAX];        /* 联动到预置位信息列表*/
	}

	/**
	 * @struct tagNETDEVLinkageActionList
	 * @brief 联动动作列表
	 * @attention
	 */
	public class NETDEV_LINKAGE_ACTION_INFO_S extends Structure
	{
		public int  udwActID;                                                   /* 联动动作ID，参见枚举值NETDEV_ALARM_ACT_ID_E */
		public NETDEV_ENABLED_ACT_PARAM_INFO_S  stEnabledInfo;                     /* 联动参数使能标记，适用于联动蜂鸣器、联动EMail、联动告警弹窗、 */
		public NETDEV_OUTPUT_SWITCH_ACT_PARAM_INFO_S stOutputSwitchActParamInfo;   /* 联动开关量输出*/
		public NETDEV_CHANNEL_ACT_PARAM_INFO_S stChannelActParamInfo;              /* 联动NVR预览、联动存储、联动抓拍 */
		public NETDEV_PRESET_ACT_PARAM_INFO_S  stPresetActParamInfo;               /* 联动云台预置位 */
		public byte[]  byRes = new byte[512];                                                   /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVLinkageActionList
	 * @brief 布控任务联动动作列表 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_LINKAGE_ACTION_LIST_S extends Structure
	{
		public int          udwNum;
		public NETDEV_LINKAGE_ACTION_INFO_S[] stActionInfo = new NETDEV_LINKAGE_ACTION_INFO_S[NETDEV_MAX_LINK_ACTION_NUM];
		public byte[]            byRes = new byte[256];
	}

	/**
	 * @struct tagLinkageStrategy
	 * @brief 告警联动配置信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_LINKAGE_STRATEGY_S extends Structure
	{
		public int                          udwType;                /* 告警类型,NETDEV_PERSON_COMPARE_RESULT_TYPE_E */
		public NETDEV_LINKAGE_ACTION_LIST_S    stLintageActions;       /* 人脸布控任务联动动作 */
		public byte[]                            byRes = new byte[512];             /* 保留字段 */
	}

	/**
	 * @brief 时间段配置 结构体定义 Time Sections Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_TIME_SECTION_S extends Structure
	{
		public byte[]    szBeginTime = new byte[NETDEV_LEN_64];              /* 开始时间  Begin time */
		public byte[]    szEndTime = new byte[NETDEV_LEN_64];                /* 结束时间  End time */
		public int  udArmingType;                            /* 布防类型   ArmingType 参考NETDEV_ARMING_TYPE_E */
	}

	/**
	 * @brief 计划（天）配置 结构体定义 Play (Day) Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_DAY_PLAN_S extends Structure
	{
		public int                         udwIndex;                                                  /* 星期索引,参见：NETDEV_LAPI_WEEK_INFO_E  day index */
		public int                         udwSectionNum;                                             /* 每天时间段个数  Section Num NVR最大为8段,IPC最大为4段 */
		public NETDEV_VIDEO_TIME_SECTION_S[]    astTimeSection = new NETDEV_VIDEO_TIME_SECTION_S[NETDEV_MAX_TIME_SECTION_NUM];   /* 布防时间段配置  Time Sections */
	}

	/**
	 * @brief  计划（周）配置 结构体定义  Plan (Week) Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_WEEK_PLAN_S extends Structure
	{
		public int                        bEnabled;                                            /* 布防计划是否使能,仅IPC支持该字段，默认使能;参考NETDEV_DEFENCE_PLAN_ENABLE_E */
		public int                      udwDayNum;                                           /* 计划天数,NVR最大为8(一周七天和假日);IPC最大为7(一周七天) */
		public NETDEV_VIDEO_DAY_PLAN_S[]     astDayPlan = new NETDEV_VIDEO_DAY_PLAN_S[NETDEV_MAX_DAY_NUM];                      /* 一周内每天的布防计划列表 */
		public byte[]                        byRes = new byte[32];                                           /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVMonitorDefenceInfo
	 * @brief 布防信息 结构体定义
	 * @attention 仅PTS VMS使用
	 */
	public class NETDEV_MONITOR_DEFENCE_INFO_S extends Structure
	{
		public long      tBegin;                  /* 时间模板生效起始时间(unix时间戳) */
		public long      tEnd;                    /* 时间模板生效结束时间(unix时间戳) */
		public int     udwTimeTemplateID;       /* 时间模板索引，若未配置，则填写0 */
		public byte[]       byRes = new byte[128];              /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVFaceMonitorInfo
	 * @brief 布控任务信息 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_MONITION_INFO_S extends Structure
	{
		public int                              udwID;                        /* 人脸布控任务序号 添加布控不再返回该字段 */
		public NETDEV_MONITION_RULE_INFO_S         stMonitorRuleInfo;            /* 人脸布控任务配置信息 */
		public int                              udwLinkStrategyNum;           /* 告警联动策略数量 */
		public Pointer                          pstLinkStrategyList;          /* 告警联动策略配置信息，需动态分配内存 NETDEV_LINKAGE_STRATEGY_S*/
		public NETDEV_VIDEO_WEEK_PLAN_S            stWeekPlan;                   /* 人脸布控任务布防计划,仅NVR IPC使用 */
		public NETDEV_MONITOR_DEFENCE_INFO_S       stMonitorDefenceInfo;         /* 布防信息，仅PTS VMS使用 */
		public byte[]                                byRes = new byte[250];                   /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMonitorChlInfo
	 * @brief 添加布控返回的布控信息
	 * @attention 无 None
	 */
	public class NETDEV_MONITION_CHL_INFO_S extends Structure
	{
		public int                          udwChannelID;                       /* 布控对应通道ID IPC、VMS该字段不返回 */
		public int                          udwResultCode;                      /* 人脸处理结果码 NETDEV_PERSON_RESULT_CODE_E */
		public int                          udwMonitorID;                       /* 相应通道对应的布控ID */
	}

	/**
	 * @struct tagNETDEVMonitorResultInfo
	 * @brief 添加布控返回的布控信息 Device information Structure definition
	 * @attention  None
	 */
	public class NETDEV_MONITOR_RESULT_INFO_S extends Structure
	{
		public int                              udwChannelNum;                  /* 布控添加成功的实际通道数 需赋值标明内存申请大小*/
		public Pointer                          pstMonitorChlInfos;             /* 布控返回信息列表 内存由上层申请 不应小于下发的通道数量 malloc by caller NETDEV_MONITION_CHL_INFO_S*/
		public byte[]                                byRes = new byte[250];                     /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVBatchOperatorInfo
	 * @brief 批量操作信息 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_BATCH_OPERATOR_INFO_S extends Structure
	{
		public int   udwReqSeq;                          /* 请求数据序号 */
		public int   udwResultCode;                      /* 返回错误码,人脸布控操作结果详见#NETDEV_PERSON_MONITOR_OPT_RES_CODE_E、NETDEV_MONITOR_ERR_CODE_E */
		public int   udwID;                              /* 编号 */
		public byte[]     szName = new byte[NETDEV_LEN_260];             /* 成员名称，长度范围[1,63] */
		public byte[]     byRes = new byte[128];                         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVBatchOperateList
	 * @brief 批量操作列表 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_BATCH_OPERATOR_LIST_S extends Structure
	{
		public int                          udwNum;         /* 批量操作数量 */
		public int                          udwStatus;      /* 结果状态 */
		public Pointer                      pstBatchList;   /* 批量操作信息 最大是2000个,需动态申请 NETDEV_BATCH_OPERATOR_INFO_S */
		public byte[]                            byRes = new byte[128];     /* 保留字段  Reserved */

	}

	/**
	 * @struct tagNETDEVMonitorDevResultInfo
	 * @brief 设备布控结果信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_MONITOR_DEV_RESULT_INFO_S extends Structure
	{
		public int                          udwDevID;           /* 布控设备ID */
		public NETDEV_BATCH_OPERATOR_LIST_S    stMonitorResult;    /* 设备布控结果信息 */
		public byte[]                            byRes = new byte[128];         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVDevMonitorInfo
	 * @brief 成员布控设备信息结构体定义
	 * @attention 无None
	 */
	public class NETDEV_DEV_MONITOR_INFO_S extends Structure
	{
		public int  udwDevID;               /* 设备ID */
		public int  udwMonitorStatus;       /* 设备布控状态 */
		public byte[]    byRes = new byte[64];              /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVMonitorMemberInfo
	 * @brief 成员布控状态信息结构体定义
	 * @attention 无None
	 */
	public class NETDEV_MONITOR_MEMBER_INFO_S extends Structure
	{
		public int                      udwMemberID;                        /* 成员ID */
		public byte[]                     szName = new byte[NETDEV_LEN_260];             /* 成员名称 */
		public int                      udwDevNum;                          /* 布控设备数量 */
		public int                      udwMonitorStatus;                   /* 布控状态 0:布控失败   1:布控成功*/
		public NETDEV_DEV_MONITOR_INFO_S[]   stDevMonitorInfo = new NETDEV_DEV_MONITOR_INFO_S[NETDEV_LEN_16];    /* 成员布控设备信息列表 目前设备数量最大为5*/
		public byte[]                        byRes = new byte[64];                          /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMonitorCapacityInfo
	 * @brief 容量布控信息结构体定义
	 * @attention 无None
	 */
	public class NETDEV_MONITOR_CAPACITY_INFO_S extends Structure
	{
		public int  udwMonitorType;         /* 布控类型 0：人脸布控   1：车辆布控 */
		public int  udwNum;                 /* 设备数量 */
		public Pointer pudwDevIDList;         /* 设备ID列表 根据udwNum动态申请 int[] */
		public byte[]    byRes = new byte[128];             /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVDevCapacityInfo
	 * @brief 设备容量信息结构体定义
	 * @attention 无None
	 */
	public class NETDEV_DEV_CAPACITY_INFO_S extends Structure
	{
		public int  udwDevID;               /* 设备ID */
		public int  udwCapacity;            /* 设备布控人脸总数量 */
		public int  udwMonitoredNum;        /* 已布控人脸数量 */
		public byte[]    byRes = new byte[128];             /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVMonitorCapacityList
	 * @brief 容量布控操作列表结构体定义
	 * @attention 无None
	 */
	public class NETDEV_MONITOR_CAPACITY_LIST_S extends Structure
	{
		public int                          udwDevNum;              /* 设备数量 */
		public Pointer                      pstDevCapacityList;     /* 容量列表 根据DevNum动态申请 NETDEV_DEV_CAPACITY_INFO_S */
		public byte[]                            byRes = new byte[64];              /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVFeatureInfo
	 * @brief 半结构化特征信息
	 * @attention 无 None
	 */
	public class NETDEV_FEATURE_INFO_S extends Structure
	{
		public byte[]    szFeatureVersion = new byte[NETDEV_LEN_32];        /* 人脸半结构化特征提取算法版本号 [0, 20] */
		public byte[]    szFeature = new byte[NETDEV_FACE_FEATURE_SIZE];    /* 基于人脸提取出来的特征信息 目前加密前512B */
		public byte[]    byRes = new byte[128];                             /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonCompareInfo
	 * @brief 人脸 比对信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_COMPARE_INFO_S extends Structure
	{
		public int                      udwSimilarity;                                  /* 相似度 */
		public NETDEV_PERSON_INFO_S        stPersonInfo;                                   /* 人脸库成员信息 */
		public NETDEV_FILE_INFO_S          stPanoImage;                                    /* 人脸大图  */
		public NETDEV_FILE_INFO_S          stFaceImage;                                    /* 人脸小图 */
		public NETDEV_FACE_POSITION_INFO_S stFaceArea;                                     /* 人脸区域坐标 */
		public int                      udwCapSrc;                                      /* 采集来源 */
		public int                      udwFeatureNum;                                  /* 半结构化特征数目 如果没有半结构化特征，可不带相关字段 PTS必带 */
		public Pointer                  pstFeatureInfo;                                 /* 半结构化特征列表 如果没有半结构化特征，可不带相关字段  PTS必带  NETDEV_FEATURE_INFO_S*/
		public NETDEV_FACE_ATTR_S          stFaceAttr;                                     /* 人脸属性信息 */
		public NETDEV_PERSON_ATTR_S        stPersonAttr;                                   /* 关联人员属性信息 */
		public byte[]                        byRes = new byte[248];                                     /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVFacePassRecordInfo
	 * @brief 人脸 通过记录信息
	 * @attention 无 None
	 */
	public class NETDEV_FACE_PASS_RECORD_INFO_S extends Structure
	{
		public int                              udwRecordID;                        /* 人脸通行记录ID */
		public int                              udwType;                            /* 人脸通行类型，参见枚举NETDEV_FACE_PASS_RECORD_TYPE_E */
		public long                               tPassingTime;                       /* 过人时间，UTC格式，单位秒 */
		public int                              udwChannelID;                       /* 通道ID */
		public byte[]                                szChlName = new byte[NETDEV_LEN_128];          /* 抓拍通道名称，范围[1,63] */
		public NETDEV_PERSON_COMPARE_INFO_S        stCompareInfo;                      /* 比对信息 */
		public byte[]                                byRes = new byte[256];                         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPersonEventInfo
	 * @brief 人员报警信息
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_EVENT_INFO_S extends Structure
	{
		public int                          udwID;                                   /* 通知记录ID */
		public int                          udwTimestamp;                            /* 通知上报时间 UTC格式，单位秒*/
		public int                          udwNotificationType;                     /* 通知类型 0：实时通知1：历史通知 */
		public int                          udwFaceInfoNum;                          /* 人脸信息数目 范围：[0, 1] */
		public NETDEV_FACE_PASS_RECORD_INFO_S[]  stCtrlFaceInfo = new NETDEV_FACE_PASS_RECORD_INFO_S[NETDEV_LEN_2];            /* 人脸信息列表，当采集信息没有人脸时，可不带FaceInfo相关字段 */
		public int                          udwFinishFaceNum;                        /* 人脸结束数量 范围：[0, 40] */
		public int[]                          audwFinishFaceList = new int[NETDEV_LEN_40];       /* 人脸结束列表 */
		public byte[]                            byRes = new byte[92];                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVSubscribeSmartInfo
	 * @brief 订阅智能事件信息
	 * @attention
	 */
	public class NETDEV_SUBSCRIBE_SMART_INFO_S extends Structure
	{
		public int   udwNum;                /* 订阅智能告警数 */
		public Pointer   pudwSmartType;        /* 订阅的智能告警类型 参见枚举NETDEV_SMART_ALARM_TYPE_E，根据udwNum动态申请 int[] */
		public byte[]     byRes = new byte[128];            /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVSmartInfo
	 * @brief 智能事件信息
	 * @attention
	 */
	public class NETDEV_SMART_INFO_S extends Structure
	{
		public int      dwChannelID;         /* 通道ID */
		public int     udwSubscribeID;      /* 订阅ID */
		public int     udwCurrrntTime;      /* 当前时间，UTC格式，单位秒 */
		public int     udwEndTime;          /* 结束时间，UTC格式，单位秒 */
		public int     udwSubscribeType;      /* 订阅类型 */
		public byte[]       byRes = new byte[124];          /* 保留字段  Reserved */
	}

	/**
	 * @enum tagNETDEVLapiSubInfo
	 * @brief Lapi告警订阅信息
	 * @attention 无 None
	 */
	public class NETDEV_LAPI_SUB_INFO_S extends Structure
	{
		public int udwType;                          /* 订阅类型 按位表示
	                                                Bit0：设备状态类型告警
	                                                Bit1：监控业务类告警
	                                                Bit2：泛智能告警
	                                                Bit3：智能类告警
	                                                Bit4：人脸识别
	                                                Bit5：结构化数据 下发0则全部订阅
	                                                Bit6：车牌识别
	                                                Bit7：交通数据
	                                                Bit8：超感数据
	                                                Bit9：资源变更数据
	                                                Bit10：人员核验 */
		public int udwLibIDNum;                      /* 订阅的库ID数目 LibIDNum为0xffff时 表示订阅所有库 */
		public int[] audwLibIDList = new int[NETDEV_LEN_32];     /* 订阅的库ID列表 */
		public byte[]   byRes = new byte[132];                       /* 保留字节 */
	}

	/**
	 * @enum tagNETDEVSubscribeSuccInfo
	 * @brief 订阅信息成功返回信息
	 * @attention 无 None
	 */
	public class NETDEV_SUBSCRIBE_SUCC_INFO_S extends Structure
	{
		public int udwID;                      /* 订阅ID */
		public int udwCurrrntTime;             /* 当前时间，UTC格式，从1970年1月1日0点开始的秒数 */
		public int udwTerminationTime;         /* 结束时间，UTC格式，从1970年1月1日0点开始的秒数 */
		public int udwSupportAlarmType;        /* 请求消息携带订阅告警类型时返回值需携带此参数，返回0说明响应未携带该数据 */
		public byte[]   szReference = new byte[NETDEV_LEN_260];/* 订阅者描述信息 以URL格式体现 */
		public byte[]   byRes = new byte[124];                 /* 保留字节 */
	}

	/**
	 * @struct tagstNETDEVPlateAttrInfo
	 * @brief 车牌信息
	 * @attention
	 */
	public class NETDEV_PLATE_ATTR_INFO_S extends Structure
	{
		public byte[]   szPlateNo = new byte[NETDEV_LEN_16];                        /* 车牌号 */
		public int   udwColor;                                        /* 车牌颜色 参见NETDEV_PLATE_COLOR_E */
		public int   udwType;                                         /* 车牌类型，参见NETDEV_PLATE_TYPE_E */
		public byte[]    byRes = new byte[64];                                       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVVehicleMemberAttr
	 * @brief 车辆信息(不能增加预留，会导致NETDEV_VEHICLE_DETAIL_INFO_S预留不够)
	 * @attention 无 None
	 */
	public class NETDEV_VEHICLE_MEMBER_ATTR_S extends Structure
	{
		public int udwColor;                                      /* 车身颜色 详见枚举NETDEV_PLATE_COLOR_E*/
		public NETDEV_FILE_INFO_S stVehicleImage;                    /* 车辆图片 图片加密后大小不超过4M */
	}

	/**
	 * @struct tagstNETDEVVehicleDetailInfo
	 * @brief 车辆成员信息
	 * @attention
	 */
	public class NETDEV_VEHICLE_DETAIL_INFO_S extends Structure
	{
		public int                       udwReqSeq;                         /* 请求数据序列号 */
		public int                       udwMemberID;                       /* 人脸成员ID */
		public NETDEV_PLATE_ATTR_INFO_S     stPlateAttr;                       /* 车牌信息 */
		public NETDEV_VEHICLE_MEMBER_ATTR_S stVehicleAttr;                     /* 车辆信息 */
		public int                         bIsMonitored;                      /* 是否已布控 0未布控 1已布控 */
		public int                       udwDBNum;                          /* 所属车辆库数量 */
		public int[]   audwDBIDList = new int[NETDEV_LEN_16];       /* 所属车辆库ID数组 */
		public byte[]    byRes = new byte[124];                        /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVVehicleInfoList
	 * @brief 车辆信息列表 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VEHICLE_INFO_LIST_S extends Structure
	{
		public int       udwVehicleNum;          /* 车辆成员数量 */
		public Pointer   pstMemberInfoList;      /* 车辆成员列表 根据udwNum进行动态申请 NETDEV_VEHICLE_DETAIL_INFO_S */
		public byte[]    byRes = new byte[132];             /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVMonitorAlarmInfo
	 * @brief 车牌告警布控信息(无法增加预留，会导致NETDEV_VEHICLE_RECORD_INFO_S预留不够)
	 * @attention
	 */
	public class NETDEV_MONITOR_ALARM_INFO_S extends Structure
	{
		public int udwMonitorReason;                          /* 布控原因类型 */
		public int udwMonitorAlarmType;                       /* 布控告警类型 0：匹配告警 1：不匹配告警 */
		public int udwMemberID;                               /* 车辆成员ID */
	}

	/**
	 * @struct tagstNETDEVVehicleRcordInfo
	 * @brief 车辆识别记录信息
	 * @attention
	 */
	public class NETDEV_VEHICLE_RECORD_INFO_S extends Structure
	{
		public int   udwRecordID;                                       /* 车辆识别记录ID */
		public int   udwChannelID;                                      /* 通道ID，抓拍推送时有效 */
		public int   udwPassingTime;                                    /* 过车时间，UTC格式，单位秒*/
		public byte[]     szChannelName = new byte[NETDEV_LEN_260];                     /* 卡口相机名称 */
		public NETDEV_PLATE_ATTR_INFO_S    stPlateAttr;                    /* 车牌抓拍信息 */
		public NETDEV_VEH_ATTR_S           stVehAttr;                      /* 车辆抓拍信息 */
		public NETDEV_FILE_INFO_S          stPlateImage;                   /* 车牌抓拍图片 图片加密后大小不超过1M*/
		public NETDEV_FILE_INFO_S          stVehicleImage;                 /* 车辆抓拍图片 结构化查询时携带 图片加密后大小不超过1M*/
		public NETDEV_FILE_INFO_S          stPanoImage;                    /* 全景图 结构化查询时携带 仅携带图片URL和size，图片数据需要通过/LAPI/V1.0/System/Picture接口获取*/
		public NETDEV_MONITOR_ALARM_INFO_S stMonitorAlarmInfo;             /* 车牌告警布控信息 */
		public byte[]    byRes = new byte[132];                                        /* 保留字段  Reserved */
	}

    /**
 	* @struct tagNETDEVNonMotorVehRecord
 	* @brief 非机动车通行记录
 	* @attention 无 None
 	*/
	public class NETDEV_NON_MOTOR_VEH_RECORD_S extends Structure
	{
		public int udwRecordID;                                   /* 结构化非机动车记录ID */
		public int udwPassingTime;                                /* 过车时间 UTC格式 单位秒 */
		public byte[]   szChannelName = new byte[NETDEV_LEN_260];                 /* 相机名称 范围[1,63] */
		public NETDEV_NON_MOTOR_VEH_INFO_S stNonMotorVehInfo;        /* 非机动车信息 */
		public NETDEV_FILE_INFO_S stNoMotorVehImage;                 /* 非机动车抓拍图片 图片加密后的大小不超过500K */
		public NETDEV_FILE_INFO_S stPanoImage;                       /* 全景图 仅携带图片URL和size 图片数据需要通过/LAPI/V1.0/System/Picture接口获取*/
		public byte[]    byRes = new byte[256];                                    /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVBatchOperateMemberList
	 * @brief 批量操作成员列表 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_BATCH_OPERATE_MEMBER_LIST_S extends Structure
	{
		public int  udwTaskNo;             /* 操作任务号，仅NVR支持 */
		public int  udwMemberNum;          /* 成员数量 */
		public Pointer pstMemberIDList;       /* 成员列表 根据udwNum进行动态申请 int[] */
		public byte[]    byRes = new byte[128];             /* 保留字段  Reserved */

	}

	/**
	 * @struct tagstVehicleEventInfo
	 * @brief 车辆比对报警信息
	 * @attention
	 */
	public class NETDEV_VEHICLE_EVENT_INFO_S extends Structure
	{
		public int udwID;                                              /* 通知记录ID */
		public int udwTimestamp;                                       /* 通知上报时间，UTC格式，单位秒 */
		public int udwNotificationType;                                /* 通知类型 详见 NETDEV_NOTIFICATION_TYPE_E*/
		public int udwVehicleInfoNum;                                  /* 车辆信息数目 [0, 1] */
		public Pointer pstVehicleRecordInfo;                           /* 车辆信息列表, NETDEV_VEHICLE_RECORD_INFO_S列表 NETDEV_VEHICLE_RECORD_INFO_S */
		public byte[]    byRes = new byte[256];                                       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagstNETDEVVehRecognitionEvent
	 * @brief 车辆识别事件
	 * @attention
	 */
	public class NETDEV_VEH_RECOGNITION_EVENT_S extends Structure
	{
		public byte[]   szReference = new byte[NETDEV_LEN_480];                        /* 订阅者描述信息 */
		public int udwSrcID;                                           /* 告警源ID */
		public NETDEV_VEHICLE_EVENT_INFO_S stVehicleEventInfo;            /* 车辆比对报警信息 需动态申请内存 */
		public byte[]    byRes = new byte[256];                                       /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVEntrInfo
	 * @brief 入场车辆抓拍信息
	 * @attention
	 */
	public class NETDEV_ENTR_INFO_S extends Structure
	{
		public int udwEnterTime;                                                             /* 入场时间，UTC时间，单位秒 */
		public NETDEV_FILE_INFO_S stPlateImage;                                                 /* 车牌图片 */
		public NETDEV_FILE_INFO_S stVehImage;                                                   /* 车辆图片 */
		public byte[]   byRes = new byte[256];                                                               /* 保留字段 */
	}

	/**
	 * @brief 时间段配置 结构体定义 Time Sections Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_TIME_SECTION_INFO_S extends Structure
	{
		public byte[]    szBeginTime = new byte[NETDEV_LEN_32];              /* 开始时间  Begin time */
		public byte[]    szEndTime = new byte[NETDEV_LEN_32];                /* 结束时间  End time */
		public int  udwArmingType;                           /* 布防类型0: 定时 1: 动检 2: 报警 3: 动检和报警 4: 动检或报警5: 无计划10: 事件  Distribution Type 0: Timing 1: Motive Inspection 2: Alarm 3: Motive Inspection and Alarm 4: Motive Inspection or Alarm 5: Unplanned 10: Event*/
	}

	/**
	 * @struct tagstNETDEVExitInfo
	 * @brief 出场车辆抓拍信息
	 * @attention
	 */
	public class NETDEV_EXIT_INFO_S extends Structure
	{
		public int udwExitTime;                                                              /* 出场时间(UTC时间，单位秒) */
		public int udwTotalAmount;                                                           /* 停车费(单位分) */
		public int udwIsAlreadyPaid;                                                         /* 是否已缴费 0:否 1:是*/
		public int udwChargeRecordID;                                                        /* 缴费记录ID */
		public NETDEV_FILE_INFO_S stPlateImage;                                                 /* 车牌图片 */
		public NETDEV_FILE_INFO_S stVehImage;                                                   /* 车辆图片 */
		public byte[]   szOperatorName = new byte[NETDEV_LEN_128];                                           /* 操作员 */
		public byte   byRes[] = new byte[256];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVParkEventInfo
	 * @brief 停车场事件信息
	 * @attention
	 */
	public class NETDEV_PARK_EVENT_INFO_S extends Structure
	{
		public int udwID;                                                                    /* 记录ID */
		public int udwParkID;                                                                /* 停车场ID */
		public byte[]   szPlateNo = new byte[NETDEV_LEN_32];                                                 /* 车牌号码 */
		public NETDEV_VEH_ATTR_S stVehAttr;                                                     /* 车辆属性信息 */
		public int udwVehRemainNum;                                                          /* 场内车辆数 */
		public int udwIsWhiteList;                                                           /* 是否是白名单车辆 0：否 1：是 */
		public int udwIsBlackList;                                                           /* 是否是黑名单车辆 0：否 1：是 */
		public byte[]   szEntranceName = new byte[NETDEV_LEN_128];                                           /* 岗亭出入口名称 */
		public byte[]   szLaneName = new byte[NETDEV_LEN_128];                                               /* 车道名称 */
		public int udwCrossDirection;                                                        /* 过车方向 0：入场 1：出场 */
		public Pointer pstEnterInfo;                                               /* 入场信息  NETDEV_ENTR_INFO_S*/
		public Pointer pstExitInfo;                                                /* 出场信息 NETDEV_EXIT_INFO_S */
		public byte[]   byRes = new byte[256];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVTmSectInfo
	 * @brief 自定义时间段
	 * @attention
	 */
	public class NETDEV_TM_SECT_INFO_S extends Structure
	{
		public byte[]   szBegin = new byte[NETDEV_LEN_64];                                                  /* 开始时间, 格式hh:mm:ss 长度范围[0,31] */
		public byte[]   szEnd = new byte[NETDEV_LEN_64];                                                    /* 结束时间，格式hh:mm:ss 长度范围[0,31] */
		public byte[]   byRes = new byte[128];                                                              /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVVehThroughInfo
	 * @brief 车辆放行信息
	 * @attention
	 */
	public class NETDEV_VEH_THROUGH_INFO_S extends Structure
	{
		public int udwType;                                                                 /* 放行方式 详见NETDEV_VEH_RELEASE_TYPE_E */
		public int udwNum;                                                                  /* 自定义放行时间段列表 最多4个*/
		public NETDEV_TM_SECT_INFO_S[] astTmSectInfo = new NETDEV_TM_SECT_INFO_S[NETDEV_LEN_4];                              /* 自定义放行时间段信息 */
		public byte[]   byRes = new byte[128];                                                              /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVVehLaneInfo
	 * @brief 车道信息
	 * @attention
	 */
	public class NETDEV_VEH_LANE_INFO_S extends Structure
	{
		public int udwVehLaneID;                                                            /* 车道ID */
		public byte[]   szName = new byte[NETDEV_LEN_128];                                                  /* 车道名称 */
		public int udwType;                                                                 /* 车道类型 详见NETDEV_VEH_LANE_TYPE_E */
		public int udwNum;                                                                  /* 自定义启用时间段个数，最大4段 */
		public NETDEV_TM_SECT_INFO_S[] astEnTmSectInfo = new NETDEV_TM_SECT_INFO_S[NETDEV_LEN_4];                            /* 自定义启用时间段列表 */
		public NETDEV_VEH_THROUGH_INFO_S stTmpVehThrough;                                      /* 临时车放行 */
		public NETDEV_VEH_THROUGH_INFO_S stRegVehThrough;                                      /* 固定车放行 */
		public int udwDevNum;                                                               /* 设备数量 最多4个*/
		public int[] audwDevID = new int[NETDEV_LEN_4];                                                 /* 车道关联的出入口设备ID列表 */
		public byte[]   byRes = new byte[128];                                                              /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVVehLaneInfoList
	 * @brief 车道信息列表
	 * @attention
	 */
	public class NETDEV_VEH_LANE_INFO_LIST_S extends Structure
	{
		public int udwNum;                                                                   /* 车道数，最多2车道 */
		public NETDEV_VEH_LANE_INFO_S[] astVehLaneInfo = new NETDEV_VEH_LANE_INFO_S[NETDEV_LEN_4];                             /* 车道信息 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVParkEntrLaneInfo
	 * @brief 停车场、出入口、车道列表信息
	 * @attention
	 */
	public class NETDEV_PARK_ENTR_LANE_INFO_S extends Structure
	{
		public int udwParkingLotID;                                                          /* 停车场ID */
		public int udwEntranceID;                                                            /* 出入口ID */
		public NETDEV_VEH_LANE_INFO_LIST_S stVehLaneInfoList;                                   /* 车道信息列表 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}


	/**
	 * @struct tagstNETDEVAbnChgRuleInfo
	 * @brief 异常收费规则
	 * @attention
	 */
	public class NETDEV_ABN_CHG_RULE_INFO_S extends Structure
	{
		public int udwID;                                                                    /* 规则ID */
		public byte[]   szName = new byte[NETDEV_LEN_128];                                                   /* 规则名称 */
		public int udwChgAmount;                                                             /* 收费金额(元) */
		public byte[]   szDescription = new byte[NETDEV_LEN_512];                                            /* 描述，范围[1,128] */
		public int udwIsDefaultRule;                                                         /* 是否为默认规则 0:否 1:是*/
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVTmpVehChgAmount
	 * @brief 临时车缴费金额
	 * @attention
	 */
	public class NETDEV_TMP_VEH_CHG_AMOUNT_S extends Structure
	{
		public int udwAmount;                                                                /* 收费金额合计，单位元 */
		public int udwManualPayment;                                                         /* 人工缴费，单位元 */
		public int udwSelfhelpPayment;                                                       /* 自助缴费，单位元 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVTmpVehChgRecord
	 * @brief 临时车缴费记录详细信息
	 * @attention
	 */
	public class NETDEV_TMP_VEH_CHG_RECORD_S extends Structure
	{
		public int udwRecordID;                                                              /* 记录ID */
		public byte[]   szPlateNo = new byte[NETDEV_LEN_16];                                                 /* 车牌号码，范围[1,16] */
		public int udwVehicleType;                                                           /* 车辆类型 详见NETDEV_VEHICLE_TYPE_E */
		public int udwChargeTime;                                                            /* 缴费时间，UTC时间，单位秒 */
		public long    tParkTime;                                                              /* 停车时长，单位秒 */
		public int udwAmount;                                                                /* 收费金额，单位元 */
		public byte[]   szAbnRuleName = new byte[NETDEV_LEN_128];                                            /* 异常收费规则名称，范围[1,32] */
		public int udwChgType;                                                               /* 收费类型 详见NETDEV_CHG_TYPE_E */
		public byte[]   szParkName = new byte[NETDEV_LEN_260];                                               /* 停车场名称，范围[1,64] */
		public byte[]   szOperatorName = new byte[NETDEV_LEN_260];                                           /* 操作员名称，范围[1,64] */
		public int udwFree;                                                                  /* 是否免费 0：否 1：是 */
		public byte[]   byRes = new byte[124];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVParkPayOrderInfo
	 * @brief 停车场支付订单信息
	 * @attention
	 */
	public class NETDEV_PARK_PAY_ORDER_INFO_S extends Structure
	{
		public byte[]   szOrderNo = new byte[NETDEV_LEN_128];                                               /* 订单号，由第三方生成 */
		public int udwOrderStatus;                                                          /* 订单支付状态 详见枚举 NETDEV_ORDER_STATUS_E*/
		public byte[]   szPlateNo = new byte[NETDEV_LEN_128];                                               /* 车牌号 */
		public int udwPayType;                                                              /* 支付类型  详见枚举 NETDEV_PAY_TYPE_E*/
		public byte[]   szPayTradeNo = new byte[NETDEV_LEN_128];                                            /* 支付订单号 */
		public int udwTotalAmount;                                                          /* 停车费总金额，单位分 */
		public int udwDiscountAmount;                                                       /* 优惠减免的金额，单位分 */
		public byte[]   byRes = new byte[256];                                                              /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVParkCost
	 * @brief 停车花费
	 * @attention
	 */
	public class NETDEV_PARK_COST_S extends Structure
	{
		public int udwTotalAmount;                                                          /* 优惠减免的金额，单位分 */
		public int udwEnterTime;                                                            /* 进场时间，UTC时间，单位秒 */
		public int udwExitLimitTime;                                                        /* 规定离场时间，单位分钟 */
		public byte[]   byRes = new byte[256];                                                              /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVChgInfo
	 * @brief 收费信息
	 * @attention
	 */
	public class NETDEV_CHG_INFO_S extends Structure
	{
		public byte[]   szPlateNo = new byte[NETDEV_LEN_16];                                                 /* 车牌号码 范围[1,16] */
		public int udwAmount;                                                                /* 收费金额，单位元 */
		public int udwAbnRuleID;                                                             /* 异常收费规则ID */
		public int udwIsFree;                                                                /* 是否免费 0:否，1:是*/
		public long  tParkingTime;                                                             /* 停车时长，单位秒 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}


	/**
	 * @struct tagNETDEVEntrVehSnapInfo
	 * @brief 入场车辆抓拍信息
	 * @attention
	 */
	public class NETDEV_ENTR_VEH_SNAP_INFO_S extends Structure
	{
		public int udwID;                                                                    /* 入场记录ID */
		public int udwChannelID;                                                             /* 通道ID */
		public byte[]   szPlateNo = new byte[NETDEV_LEN_16];                                                 /* 车牌号码，范围[1,16] */
		public int udwVehType;                                                               /* 车辆类型 详见 NETDEV_VEHICLE_TYPE_E */
		public int udwVehColor;                                                              /* 车辆颜色 详见 NETDEV_VEHICLE_COLOR_E*/
		public int udwVehAttr;                                                               /* 车辆属性 详见 NETDEV_VEH_ATTR_TYPE_E */
		public int udwIsBlackList;                                                           /* 是否是黑名单车辆 0:否 1:是 */
		public int udwEnterTime;                                                             /* 入场时间，UTC时间，单位秒 */
		public int udwIsAutoOpenGate;                                                        /* 是否自动开闸 0:否 1:是 */
		public NETDEV_FILE_INFO_S stPlateImage;                                                 /* 车牌图片 */
		public NETDEV_FILE_INFO_S stVehImage;                                                   /* 车辆图片 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}



	/**
	 * @struct tagstNETDEVShiftInfo
	 * @brief 交班信息
	 * @attention
	 */
	public class NETDEV_SHIFT_INFO_S extends Structure
	{
		public byte[]   szName = new byte[NETDEV_LEN_260];                                                   /* 交班用户名 */
		public int udwAmount;                                                                /* 收费金额，单位元 */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVPassRecordInfo
	 * @brief 过车记录信息
	 * @attention
	 */
	public class NETDEV_PASS_RECORD_INFO_S extends Structure
	{
		public int udwRecordID;                                                              /* 记录ID */
		public NETDEV_FILE_INFO_S stPlateImage;                                                 /* 车牌图片 */
		public byte[]   szPlateNo = new byte[NETDEV_LEN_16];                                                 /* 车牌号码，范围[1,16] */
		public byte[]   szName = new byte[NETDEV_LEN_128];                                                   /* 车主姓名，范围[1,32] */
		public int udwVehType;                                                               /* 车辆类型 详见NETDEV_VEHICLE_TYPE_E */
		public int udwVehColor;                                                              /* 车辆颜色 详见 NETDEV_VEHICLE_COLOR_E */
		public int udwIsBlackList;                                                           /* 是否是黑名单车辆 0:否 1:是 */
		public int udwIsWhiteList;                                                           /* 是否是白名单 0：否 1：是 */
		public byte[]   szParkName = new byte[NETDEV_LEN_260];                                               /* 停车场名称，范围[1,64] */
		public int udwCrossDirection;                                                        /* 过车方向 0:进场 1:出场 */
		public int udwPassTime;                                                              /* 过车时间，UTC时间，单位秒 */
		public byte[]   szEntrName = new byte[NETDEV_LEN_260];                                               /* 出入口名称，范围[1,64] */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @struct tagstNETDEVEntrExitSnapRecordID
	 * @brief 出入场抓拍记录ID
	 * @attention
	 */
	public class NETDEV_ENTR_EXIT_SNAP_RECORDID_S extends Structure
	{
		public int udwEnterID;                                                               /* 车辆入场抓拍记录ID */
		public int udwExitID;                                                               /* 车辆出场抓拍记录ID */
		public byte[]   byRes = new byte[128];                                                               /* 保留字段 */
	}

	/**
	 * @brief 计划（天）配置 结构体定义 Play (Day) Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_DAY_PLAN_INFO_S extends Structure
	{
		public int                      udwID;                                           /*星期索引1：周一;2：周二；3：周三；4：周四；5：周五；6：周六；7：周日；8：假日；  Weekly Index 1: Monday; 2: Tuesday; 3: Wednesday; 4: Thursday; 5: Friday; 6: Saturday; 7: Sunday; 8: Holidays;*/
		public int                      udwNum;                                          /*每天时间段个数 NVR最大为8段；IPC最大为4段  The maximum number of NVRs per day is 8; IPC maximum 4 paragraphs*/
		public NETDEV_TIME_SECTION_INFO_S[]  astTimeSection = new NETDEV_TIME_SECTION_INFO_S[NETDEV_MAX_TIME_SECTION_NUM];     /* 时间段配置 同一天各段时间不允许有重合 Time Sections */
	}

	/**
	 * @brief 计划（周）配置 结构体定义 Play (Week) Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_WEEK_PLAN_INFO_S extends Structure
	{
		public int                        bEnabled;                                           /* 使能,仅IPC支持  Enabling,IPC only*/
		public int                      udwNum;                                             /* 计划天数，NVR最大为8(一周七天和假日)IPC最大为7(一周七天)  Planned days, NVR up to 8(7 days a week and holidays) IPC up to 7(7 days a week)*/
		public NETDEV_DAY_PLAN_INFO_S[]      astDayPlanInfo = new NETDEV_DAY_PLAN_INFO_S[NETDEV_MAX_DAY_NUM];                 /* 一周内每天的布防计划列表  List of deployment plans for each day of the week*/
		public byte[]    byRes = new byte[512];                                         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVExceptionDayInfo
	 * @brief 每天的布防计划具体信息
	 * @attention 无 None
	 */
	public class NETDEV_EXCEPTION_DAY_INFO_S extends Structure
	{
		public int udwID;                                                            /* 例外日期索引 */
		public int   bEnabled;                                                         /* 例外日期是否使能 */
		public byte[]   szDate = new byte[NETDEV_LEN_16];                                            /* 例外日期 year-month-day */
		public int udwNum;                                                           /* 例外时间段个数 NVR最大为8段 IPC/PTS最大为4段*/
		public NETDEV_TIME_SECTION_INFO_S[] stTimeSectionInfo = new NETDEV_TIME_SECTION_INFO_S[NETDEV_LEN_16];             /* 布防配置具体信息 */
		public byte[]    byRes = new byte[128];                                                       /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVExceptionInfo
	 * @brief 布控任务例外计划
	 * @attention 无 None
	 */
	public class NETDEV_EXCEPTION_INFO_S extends Structure
	{
		public int   bEnabled;                                                         /* 例外日期是否使能 0:不使能 1：使能 */
		public int udwNum;                                                           /* 例外日期个数 [0, 16] */
		public NETDEV_EXCEPTION_DAY_INFO_S[] stExceptionDayInfo = new NETDEV_EXCEPTION_DAY_INFO_S[NETDEV_LEN_32];           /* 每天的布防计划具体信息 */
		public byte[]    byRes = new byte[128];                                                       /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVTimeTemplateInfo
	 * @brief 时间模板配置
	 * @attention 无 None
	 */
	public class NETDEV_TIME_TEMPLATE_INFO_S extends Structure
	{
		public int udwID;                                   /* 人员库时间模板布控任务序号 */
		public byte[]   szName = new byte[NETDEV_LEN_256]; 	/* 时间模板名称 [1, 63] */
		public int udwLastChange;                           /* 时间模板最后修改时间 */
		NETDEV_WEEK_PLAN_INFO_S stWeekPlanInfo;         /* 布控任务布防计划 */
		NETDEV_EXCEPTION_INFO_S stExceptionInfo;        /* 布控任务例外计划 */
		public byte[]    byRes = new byte[128];                              /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVUpdateInfo
	 * @brief 更新信息
	 * @attention 无 None
	 */
	public class NETDEV_UPDATE_INFO_S extends Structure
	{
		public int udwID;               /* 时间模板ID */
		public int udwLastChange;       /* 时间模板最后修改时间 */
		public byte[]    byRes = new byte[128];          /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVTimeTemplateUdateInfo
	 * @brief 时间模板的更新信息
	 * @attention 无 None
	 */
	public class NETDEV_TIME_TEMPLATE_UPDATE_INFO_S extends Structure
	{
		public int udwNum;                                          /* 有效时间模板个数 [0, 32] */
		public NETDEV_UPDATE_INFO_S[] stUpdateInfo = new NETDEV_UPDATE_INFO_S[NETDEV_LEN_64];       /* 更新信息 */
		public byte[]    byRes = new byte[128];                                      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVCtrlFaceInfo
	 * @brief 人脸信息
	 * @attention 无 None
	 */
	public class NETDEV_CTRL_FACE_INFO_S extends Structure
	{
		public int udwID;                                           /* 记录ID */
		public int udwTimestamp;                                    /* 采集时间 UTC格式，单位秒 */
		public int udwCapSrc;                                       /* 采集来源 详见 NETDEV_CAP_SRC_E FaceInfo选择1 */
		public int udwFeatureNum;                                   /* 半结构化特征数目 范围：[0, 2] */
		public Pointer pstFeatureInfo;                          /* 半结构化特征列表 需动态分配内存(NETDEV_FEATURE_INFO_S) */
		public NETDEV_FILE_INFO_S stPanoImage;                         /* 人脸全景图 */
		public NETDEV_FILE_INFO_S stFaceImage;                         /* 人脸小图 */
		public NETDEV_FACE_POSITION_INFO_S stFaceArea;                 /* 人脸全景图人脸区域坐标 */
		public float  fTemperature;                                    /* 人员体温 单位：摄氏度，注：小数点后1位 */
		public int udwMaskFlag;                                     /* 是否戴口罩，0：未知或未启用检测；1：未戴口罩；2：戴口罩 */
		public byte[]    byRes = new byte[120];                                      /* 保留字节 */
	}

	/**
	 * @struct tafNETDEVCtrlCardInfo
	 * @brief 卡信息
	 * @attention 无 None
	 */
	public class NETDEV_CTRL_CARD_INFO_S extends Structure
	{
		public int 		udwID;                                       /* 记录ID */
		public int 		udwTimestamp;                                /* 采集时间 UTC格式，单位秒 */
		public int 		udwCapSrc;                                   /* 采集来源 详见 NETDEV_CAP_SRC_E CardInfo选择2或3*/
		public int 		udwCardType;                                 /* 0：身份证，1：门禁卡*/
		public byte[]   szCardID = new byte[NETDEV_LEN_32];                     /* 门禁卡字段：物理卡号 最长18位*/
		public int 		udwCardStatus;                               /* 门禁卡字段：卡状态 */
		public byte[]   szName = new byte[NETDEV_LEN_256];                      /* 身份证字段：姓名 范围[1,63] */
		public int 		udwGender;                                   /* 身份证字段：性别 详情参见枚举NETDEV_GENDER_TYPE_E*/
		public byte[]   szBirthday = new byte[NETDEV_LEN_16];                   /* 身份证字段：出生日期 YYYYMMDD */
		public byte[]   szResidentialAddress = new byte[NETDEV_LEN_128];        /* 身份证字段：住址 */
		public byte[]   szIdentityNo = new byte[NETDEV_LEN_32];                 /* 身份证字段：身份证号码 */
		public byte[]   szIssuingAuthority = new byte[NETDEV_LEN_128];          /* 身份证字段：发证机关 */
		public byte[]   szIssuingDate = new byte[NETDEV_LEN_16];                /* 身份证字段：发证日期 YYYYMMDD */
		public byte[]   szValidDateStart = new byte[NETDEV_LEN_16];             /* 身份证字段：证件有效期开始时间 */
		public byte[]   szValidDateEnd = new byte[NETDEV_LEN_16];               /* 身份证字段：证件有效期结束时间 */
		public NETDEV_FILE_INFO_S stIDImage;                       /* 身份证照片 */
		public byte[]    byRes = new byte[132];                                  /* 保留字节 */
	}

	/**
	 * @enum tagNETDEVCtrlGateInfo
	 * @brief 闸机信息
	 * @attention 无 None
	 */
	public class NETDEV_CTRL_GATE_INFO_S extends Structure
	{
		public int udwID;               /* 记录ID */
		public int udwTimestamp;        /* 采集时间 */
		public int udwCapSrc;           /* 采集来源 详见 NETDEV_CAP_SRC_E GateInfo选择4 */
		public int udwInPersonCnt;      /* 进入人员计数 */
		public int udwOutPersonCnt;     /* 离开人员计数 */
		public byte[]    byRes = new byte[128];          /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVMatchPersonInfo
	 * @brief 匹配人员信息
	 * @attention 无 None
	 */
	public class NETDEV_MATCH_PERSON_INFO_S extends Structure
	{
		public byte[]   szPersonName = new byte[NETDEV_LEN_256];        /* 成员名字 范围[1,63] */
		public int udwGender;                           /* 成员性别 详情参见枚举NETDEV_GENDER_TYPE_E */
		public byte[]   szCardID = new byte[NETDEV_LEN_32];             /* 门禁卡号 */
		public byte[]   szIdentityNo = new byte[NETDEV_LEN_32];         /* 身份证卡号 */
		public byte[]   szPersonCode=new byte[NETDEV_LEN_64];         /* 人员编码 可填写学号或工号 范围:[1, 15] */
		public byte[]    byRes = new byte[64];                          /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVCtrlLibMatchInfo
	 * @brief 库比对信息
	 * @attention 无 None
	 */
	public class NETDEV_CTRL_LIB_MATCH_INFO_S extends Structure
	{
		public int udwID;                                   /* 记录ID */
		public int udwLibID;                                /* 库ID */
		public int udwLibType;                              /* 库类型 */
		public int udwMatchStatus;                          /* 匹配状态 详见NETDEV_MATCH_STATUS_E */
		public int udwMatchPersonID;                        /* 匹配人员ID */
		public int udwMatchFaceID;                          /* 匹配人脸ID */
		public NETDEV_MATCH_PERSON_INFO_S stMatchPersonInfo;   /* 匹配人员信息 */
		public byte[]    byRes = new byte[128];                              /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVPersonVerification
	 * @brief 人员核验
	 * @attention 无 None
	 */
	public class NETDEV_PERSON_VERIFICATION_S extends Structure
	{
		public byte[]   szReference = new byte[NETDEV_LEN_128];                                      /* 用于客户端确认推送消息的url */
		public int udwSeq;                                                           /* 通知记录序号 */
		public int udwChannelID;                                                     /* 通道ID VMS支持*/
		public byte[]   szChannelName = new byte[NETDEV_LEN_256];                    /* 通道名称，长度 [1,64]，VMS支持 */
		public int udwTimestamp;                                                     /* 通知上报时间 UTC格式，单位秒*/
		public int udwNotificationType;                                              /* 通知类型 0：实时通知1：历史通知 */
		public int udwFaceInfoNum;                                                   /* 人脸信息数目 范围：[0, 1] */
		public Pointer pstCtrlFaceInfo;                               /* 人脸信息 需动态申请内存(NETDEV_CTRL_FACE_INFO_S)*/
		public int udwCardInfoNum;                                                   /* 卡信息数目 范围：[0, 1] */
		public Pointer pstCtrlCardInfo;                               /* 卡信息 需动态申请内存(NETDEV_CTRL_CARD_INFO_S)*/
		public int udwGateInfoNum;                                                   /* 闸机信息数目 范围：[0, 1] */
		public Pointer pstCtrlGateInfo;                               /* 闸机信息 需动态申请内存(NETDEV_CTRL_GATE_INFO_S)*/
		public int udwLibMatInfoNum;                                                 /* 库比对信息数目 范围：[0, 16] */
		public Pointer pstLibMatchInfo;                          /* 库比对信息 需动态申请内存(NETDEV_CTRL_LIB_MATCH_INFO_S)*/
		public byte[]    byRes = new byte[128];                                                       /* 保留字节 */
	}

	/**
	 * @struct tagACSTimeSection
	 * @brief 时间信息
	 * @attention
	 */
	public class NETDEV_ACS_TIME_SECTION_S extends Structure
	{
		public long   tStartTime;                                      /* 起始时间 UTC时间 单位秒s */
		public long   tEndTime;                                        /* 结束时间 UTC时间 单位秒s */

		public byte[]    byRes = new byte[32];                                       /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSPermissionInfo
	 * @brief 授权信息
	 * @attention
	 */
	public class NETDEV_ACS_PERMISSION_INFO_S extends Structure
	{
		public int                       udwPermissionID;                   /* 权限ID 	*/
		public byte[]                         szPermissionName = new byte[NETDEV_LEN_260];  /* 权限名称 */
		public int                       udwPermissionType;                 /* 权限类型：0表示员工权限组，1表示访客权限组 */
		public NETDEV_OPERATE_LIST_S        stPersonList;                      /* 人员ID列表，其中dwSize为人员个数*/
		public int                       udwTemplateID;                     /* 时间模板ID */
		public NETDEV_ACS_TIME_SECTION_S    stValidTime;                       /* 有效时间 */
		public NETDEV_OPERATE_LIST_S        stDoorList;                        /* 门通道列表, 其中dwSize为门通道个数*/

		public byte[]    byRes = new byte[256];                      /* 保留字段 */
	}


	/**
	 * @struct tagstNETDEVOperateList
	 * @brief 批量处理列表
	 * @attention
	 */
	public class NETDEV_OPERATE_LIST_S extends Structure
	{
		public int   dwSize;                                 /* 批量处理数量 */
		public Pointer   pstOperateInfo;       /* 批量处理信息，根据批处理的数量动态申请NETDEV_OPERATE_INFO_S */
	}

	/**
	 * @struct tagstNETDEVTimeTemplate
	 * @brief 时间模板信息
	 * @attention
	 */
	public class NETDEV_TIME_TEMPLATE_S extends Structure
	{
		public byte[]    szTamplateName = new byte[NETDEV_NAME_MAX_LEN];        /* 模板名称 */
		public byte[]    szTamplateDesc = new byte[NETDEV_DESCRIBE_MAX_LEN];    /* 模板描述 */
		public int   dwTamplateID;                               /* 模板ID */
	}

	/**
	 * @struct tagstNETDEVTimeTemplateList
	 * @brief 时间模板列表
	 * @attention
	 */
	public class NETDEV_TIME_TEMPLATE_LIST_S extends Structure
	{
		public int   dwSize;                                                         /* 模板大小 */
		public NETDEV_TIME_TEMPLATE_S[] astTimeTemplate = new NETDEV_TIME_TEMPLATE_S[NETDEV_TIME_TEMPLATE_NUM];       /* 时间模板信息 */
	}

	/**
	 * @struct tagNETDEVACSFaceImage
	 * @brief 图片信息
	 * @attention
	 */
	public class NETDEV_ACS_FACE_IMAGE_S extends Structure
	{
		public int               udwNum;                            /* 照片数 */
		public NETDEV_FILE_INFO_S[] stImageList = new NETDEV_FILE_INFO_S[NETDEV_LEN_16];        /* 人脸照片列表 */
		public int               udwMajorImageIndex;                /* 主照片索引 */

		public byte[]    byRes = new byte[128];                        /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSStaffInfo
	 * @brief 员工信息
	 * @attention
	 */
	public class NETDEV_ACS_STAFF_INFO_S extends Structure
	{
		public byte[]     szNumber = new byte[NETDEV_LEN_16];                               /* 人员编号 */
		public byte[]     szBirthday = new byte[NETDEV_FACE_MEMBER_BIRTHDAY_LEN];           /* 出生日期 */
		public byte[]     szDeptName = new byte[NETDEV_LEN_260];                            /* 部门名称*/
		public int   udwDeptID;                                             /* 部门ID */

		public byte[]    byRes = new byte[128];                                            /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSVisitorInfo
	 * @brief 访客信息
	 * @attention
	 */
	public class NETDEV_ACS_VISITOR_INFO_S extends Structure
	{
		public byte[]   szVisitorCompany = new byte[NETDEV_LEN_260];       /* 访客公司 [1,64]字符 */
		public int udwVisitorCount;                        /* 访客人数 */
		public int udwIntervieweeID;                       /* 被访者ID */
		public byte[]   szIntervieweeName = new byte[NETDEV_LEN_260];      /* 被访者姓名 [1,64]字符 */
		public byte[]   szIntervieweeDept = new byte[NETDEV_LEN_260];      /* 被访者部门 [1,64]字符 */
		public NETDEV_ACS_TIME_SECTION_S   tScheduleTime;     /* 预约访问时间 */
		public NETDEV_ACS_TIME_SECTION_S   tRealTime;         /* 实际到访时间 */
		public int udwStatus;                              /* 状态 参见枚举NETDEV_ACS_VISIT_STATUS_E */

		public byte[]    byRes = new byte[128];                             /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSPersonInfo
	 * @brief 门禁人员信息
	 * @attention
	 */
	public class NETDEV_ACS_PERSON_INFO_S extends Structure
	{
		public int                          udwReqSeq;                          /* 请求序号 */
		public int                          udwPersonID;                        /* 人员编号 */
		public byte[]                            szName = new byte[NETDEV_LEN_260];             /* 姓名 */
		public int                          udwGender;                          /* 性别 参见枚举 NETDEV_GENDER_TYPE_E*/
		public NETDEV_FACE_MEMBER_ID_INFO_S    stMemberIDInfo;                     /* 证件信息 */
		public byte[]                            szTelephone = new byte[NETDEV_LEN_64];         /* 联系电话 */
		public byte[]                            szAddress = new byte[NETDEV_LEN_260];          /* 地址 */
		public byte[]                            szDesc = new byte[NETDEV_LEN_480];             /* 备注 */

		public int                          udwCardNum;                         /* 门禁卡个数，取值范围[1,6] */
		public NETDEV_ACS_PERSON_CARD_INFO_S[]  stACSPersonCardList = new NETDEV_ACS_PERSON_CARD_INFO_S[NETDEV_LEN_6];    /* 门禁卡信息 */
		public NETDEV_ACS_FACE_IMAGE_S         stFaceImage;                        /* 人脸图片 */
		public int                          udwType;                            /* 人员类型  参见NETDEV_ACS_PERSON_TYPE_E*/
		public NETDEV_ACS_STAFF_INFO_S         stStaffInfo;                        /* 员工信息 */
		public NETDEV_ACS_VISITOR_INFO_S       stVisitor;                          /* 访客信息 */
		public byte[]    byRes = new byte[256];                         /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSPersonList
	 * @brief 人员列表
	 * @attention
	 */
	public class NETDEV_ACS_PERSON_LIST_S extends Structure
	{
		public int                      udwNum;                 /* 人员数量 */
		public Pointer  pstPersonInfoList;      /* 员工信息列表 根据udwNum动态申请NETDEV_ACS_PERSON_INFO_S*/
		public byte[]    byRes = new byte[128];             /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVFaceBatchInfo
	 * @brief 人脸识别模块批量操作信息 结构体定义 Device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_FACE_BATCH_INFO_S extends Structure
	{
		public int   udwReqSeq;         /* 请求数据序号 */
		public int   udwResultCode;     /* 返回错误码 */
		public int   udwID;             /* 编号 */
		public byte[]    byRes = new byte[128];         /* 保留字段  Reserved */
	}

	/**
	 * @struct tagNETDEVFaceBatchList
	 * @brief 人脸识别模块批量操作列表 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_FACE_BATCH_LIST_S extends Structure
	{
		public int                      udwNum;         /* 批量操作数量 */
		public Pointer  pstBatchList;   /* 批量操作信息 根据udwNum进行动态申请NETDEV_FACE_BATCH_INFO_S*/
		public byte[]    byRes = new byte[128];     /* 保留字段  Reserved */
	}

	/**
	 * @brief 批量开窗场景窗口返回信息
	 * @attention
	 */
	public class NETDEV_XW_BATCH_RESULT_WND_S extends Structure
	{
		public int  udwReqSeq;      /* 请求数据序号 */
		public int  udwResuleCode;  /* 返回错误码 */
		public int  udwWinID;       /* 窗口ID */
	}

	/**
	 * @brief 批量开窗场景窗口返回信息列表
	 * @attention
	 */
	public class NETDEV_XW_BATCH_RESULT_LIST_S extends Structure
	{
		public int                              udwSize;            /* 窗口数量 */
		public int                              udwLastChange;      /* 摘要字 */
		public Pointer      pstResultInfo;      /* 窗口信息,根据窗口数量动态申请内存 NETDEV_XW_BATCH_RESULT_WND_S*/
		public byte[]    byRes = new byte[32];          /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVCompareInfo
	 * @brief 人脸对比信息
	 * @attention
	 */
	public class NETDEV_COMPARE_INFO_S extends Structure
	{
		public NETDEV_FILE_INFO_S  stPersonImage;                    /* 人员图片 */
		public NETDEV_FILE_INFO_S  stSnapshotImage;                  /* 抓拍图片 */
		public byte[]    byRes = new byte[128];                       /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSAttendanceLogInfo
	 * @brief 出入记录信息
	 * @attention
	 */
	public class NETDEV_ACS_ATTENDANCE_LOG_INFO_S extends Structure
	{
		public int udwAlarmType;                    /* 告警类型 */
		public long  tTimeStamp;                      /* 告警时间 */
		public byte[]   szDoorName = new byte[NETDEV_LEN_260];      /* 门名称 */
		public byte[]   szDoorNo = new byte[NETDEV_LEN_64];         /* 门编号 */
		public int udwDoorDirect;                   /* 进出方向 0:进,1:出 */
		public byte[]   szCardNo = new byte[NETDEV_LEN_64];         /* 刷卡卡号*/
		public byte[]   szPersonName = new byte[NETDEV_LEN_260];    /* 刷卡人姓名 */
		public int udwPersonType;                   /* 人员类型  参见NETDEV_ACS_PERSON_TYPE_E*/
		public byte[]   szPersonPhone = new byte[NETDEV_LEN_64];    /* 刷卡人电话 */
		public byte[]   szPersonDept = new byte[NETDEV_LEN_260];    /* 刷卡人部门 */
		public NETDEV_COMPARE_INFO_S stCompareInfo;    /* 脸对比信息，速通门会携带此信息 */
		public NETDEV_FACE_ATTR_S    stFaceAttr;       /* 人脸属性信息 */
		public int udwCardStatus;                           /* 卡状态 0：未注册 1：已注册 */
		public NETDEV_CTRL_LIB_MATCH_INFO_S stLibMatchInfo;    /* 库对比信息 */
		public byte[]    byRes = new byte[256];                      /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSPersonBaseInfo
	 * @brief 门禁人员基本信息
	 * @attention
	 */
	public class NETDEV_ACS_PERSON_BASE_INFO_S extends Structure
	{
		public int                          udwPersonID;                    /* 人员编号 */
		public byte[]                            szName = new byte[NETDEV_LEN_260];         /* 姓名 */
		public int                          udwGender;                      /* 性别 参见枚举 NETDEV_GENDER_TYPE_E*/
		public NETDEV_FACE_MEMBER_ID_INFO_S    stMemberIDInfo;                 /* 证件信息 */
		public byte[]                            szTelephone = new byte[NETDEV_LEN_64];     /* 联系电话 */
		public int                          udwCardID;                      /* 卡片编号 */
		public byte[]                            szCardNo = new byte[NETDEV_LEN_16];        /* 卡片号码*/
		public int                          udwType;                        /* 人员类型  0员工  1访客*/
		public NETDEV_ACS_STAFF_INFO_S         stStaffInfo;                    /* 员工信息 */
		public NETDEV_ACS_VISITOR_INFO_S       stVisitor;                      /* 访客信息 */
		public byte[]    byRes = new byte[256];                     /* 保留字段 */
	}

	/**
	 * @struct tagACSPersonCard
	 * @brief 人员所持门禁卡信息
	 * @attention
	 */
	public class NETDEV_ACS_PERSON_CARD_INFO_S extends Structure
	{
		public int                      udwCardID;                      /* 绑定ID */
		public int                      udwCardType;                    /* 卡片类型 */
		public int                      udwCardStatus;                  /* 卡片状态  参见# NETDEV_ACS_CARD_STATUS_E   */
		public byte[]                        szCardNo = new byte[NETDEV_LEN_64];        /* 卡号 */
		public int                      udwReqSeq;                      /* 序号 */
		public NETDEV_ACS_TIME_SECTION_S   stValidTime;                    /* 有效时间 */


		public byte[]    byRes = new byte[256];                     /* 保留字段 */
	}

	/**
	 * @struct tagACSVisitLogInfo
	 * @brief 访客记录信息
	 * @attention
	 */
	public class NETDEV_ACS_VISIT_LOG_INFO_S extends Structure
	{
		public int udwLogID;                                /* 日子ID */
		public int udwVisitorID;                            /* 访客ID */
		public byte[]   szVisitorName = new byte[NETDEV_LEN_260];           /* 访客姓名 [1,64]字符 */
		public byte[]   szVisitorCompany = new byte[NETDEV_LEN_260];        /* 访客公司 [1,64]字符 */
		public byte[]   szVisitorPhone = new byte[NETDEV_LEN_64];           /* 访客电话 */
		public byte[]   szCardNo = new byte[NETDEV_LEN_16];                 /* 访客卡号 */
		public int udwIntervieweeID;                        /* 被访者ID */
		public byte[]   szIntervieweeName = new byte[NETDEV_LEN_260];       /* 被访者姓名 [1,64]字符 */
		public byte[]   szIntervieweeDept = new byte[NETDEV_LEN_260];       /* 被访者部门 [1,64]字符 */
		public long  tScheduleStartTime;                      /* 预约来访时间 UTC时间 单位秒s */
		public long  tRealStartTime;                          /* 实际来访时间 UTC时间 单位秒s */
		public int udwStatus;                               /* 状态 参见枚举NETDEV_ACS_VISIT_STATUS_E */
		public byte[]    byRes = new byte[256];                              /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSPersonBlacklistInfo
	 * @brief 黑名单信息
	 * @attention
	 */
	public class NETDEV_ACS_PERSON_BLACKLIST_INFO_S extends Structure
	{
		public int                               udwBlackListID;                    /* 黑名单ID */
		public NETDEV_FACE_MEMBER_ID_INFO_S         stIdentificationInfo;               /* 身份信息 */

		public byte[]    byRes = new byte[256];                        /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVPagedQueryInfo
	 * @brief 查询条件
	 * @attention 无 None
	 */
	public class NETDEV_PAGED_QUERY_INFO_S extends Structure
	{
		public int udwLimit;        /* 每次查询的数量 */
		public int udwOffset;       /* 从当前序号开始查询 */
		public byte[]    byRes = new byte[128];      /* 保留字节 */
	}

	/**
	 * @struct tagNETDEVACSPermissionGroupInfo
	 * @brief 权限组信息
	 * @attention
	 */
	public class NETDEV_ACS_PERMISSION_GROUP_INFO_S extends Structure
	{
		public int                       udwPermissionGroupID ;                  /* 权限组ID */
		public byte[]                         szPermissionGroupName = new byte[NETDEV_LEN_260];  /* 权限组名称 */

		public byte[]    byRes = new byte[256];                             /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVACSDoorPermissionInfo
	 * @brief 门授权信息
	 * @attention
	 */
	public class NETDEV_ACS_DOOR_PERMISSION_INFO_S extends Structure
	{
		public int                                  udwPermissionNum;                  /* 权限组个数 */
		public NETDEV_ACS_TIME_SECTION_S               stValidTime;                       /* 有效时间 */
		public Pointer    pstPermissionGroupList;            /* 权限组信息列表.Num数为0时可选,根据权限组个数动态申请NETDEV_ACS_PERMISSION_GROUP_INFO_S */
		public byte[]    byRes = new byte[256];                         /* 保留字段 */
	}

	/**
	 * @brief 协议信息  Protocol info
	 * @attention 无 None
	 */
	public class NETDEV_UPNP_PORT_STATE_S extends Structure
	{
		public int                    eType;                            /* 协议类型参见枚举# NETDEV_PROTOCOL_TYPE_E  Protocol type, see enumeration #NETDEV_PROTOCOL_TYPE_E */
		public int                    bEnbale;                          /* 是否支持  Supported or not */
		public int                    dwPort;                           /* 端口号  Port number */
		public byte[]                 byRes = new byte[128];                       /* 保留字段  Reserved */
	}

	/**
	 * @brief 协议信息列表  Protocol info list
	 * @attention 无 None
	 */
	public class NETDEV_UPNP_NAT_STATE_S extends Structure
	{
		public int   dwSize;                                            /* 协议个数  Number of protocols */
		public NETDEV_UPNP_PORT_STATE_S[]  astUpnpPort = new NETDEV_UPNP_PORT_STATE_S[NETDEV_LEN_16];      /* 协议信息  Protocol info */
	}

	/**
	 * @struct tagstNETDEVDevChnAlarmOutInfo
	 * @brief 告警输出通道信息
	 * @attention
	 */
	public class NETDEV_DEV_CHN_ALARMOUT_INFO_S extends Structure
	{
		public NETDEV_DEV_CHN_BASE_INFO_S  stChnBaseInfo;    /* 通道基本信息 */
		public int                       dwRunMode;        /* 运行模式（常开/常闭）参见#NETDEV_BOOLEAN_MODE_E */
		public int                       dwDuration;       /* 持续时间：(ms) */
		public int                      udwRelayMode;       /* 中继模式 1：单稳态 2：双稳态 */
		public int                      udwAlarmOutputNum;/* 报警输出序号 */
		public byte[]                   byRes = new byte[252];       /* 保留字段 */
	}

	/**
	 * @struct tagNETDEVTrafficStatisticsCondEx
	 * @brief 多通道客流量统计命令 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_MULTI_TRAFFIC_STATISTICS_COND_S extends Structure
	{
		public NETDEV_OPERATE_LIST_S   stChannelIDs;               /* 通道ID列表 */
		public int                  udwStatisticsType;             /* 参见 NETDEV_TRAFFIC_STATISTICS_TYPE_E */
		public int                  udwFormType;                   /* 参见 NETDEV_TRAFFIC_STATIC_FORM_TYPE_E */
		public long                   tBeginTime;                  /* 起始时间 */
		public long                   tEndTime;                    /* 结束时间 */
		public byte[]                    byRes = new byte[256];
	}

	/**
	 * @struct tagNETDEVTrafficStatisticsInfo
	 * @brief 客流量统计 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_TRAFFIC_STATISTICS_INFO_S extends Structure
	{
		public int  bIsSuccess;                                    /* 查询是否成功 */
		public int  dwChannelID;                                   /* 通道号 */
		public int  udwSize;                                       /* 时间段个数 */
		public int  audwEnterCount[] = new int[NETDEV_PEOPLE_CNT_MAX_NUM];     /* 进入人数统计 */
		public int  audwExitCount[] = new int[NETDEV_PEOPLE_CNT_MAX_NUM];      /* 离开人数统计 */
		public byte[]    byRes = new byte[6];                                      /* 保留字段   */
	}

	/**
	 * @brief 手动录像 结构体定义 Manual Record structure definition
	 * @attention
	 */
	public class NETDEV_MANUAL_RECORD_CFG_S extends Structure
	{
		public int                   dwChannelID;        /* 通道号  ChannelID */
		public int                   enRecordType;       /* 录像类型 Record type 参考#NETDEV_RECORD_TYPE_E */
		public byte[]                byRes = new byte[64];          /* 保留字段  Reserved */
	}

	/**
	 * @brief 云台轨迹巡航路径信息 结构体定义 Route information of PTZ route patrol Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_PTZ_TRACK_INFO_S extends Structure
	{
		public int dwTrackNum;                                               /* 已存在的巡航轨迹的数量  Number of existing patrol routes */
		public byte[]  aszTrackName = new byte[NETDEV_TRACK_CRUISE_MAXNUM*NETDEV_LEN_64];  /* 轨迹名称  Route name */
	}

	/**
	 * @brief 设备地址信息 结构体定义
	 * @attention 无 None
	 */
	public class NETDEV_DEV_ADDR_INFO_S extends Structure
	{
		public byte[]    szUserName = new byte[NETDEV_LEN_64];          /* 用户名 User Name */
		public byte[]    szPassword = new byte[NETDEV_LEN_64];          /* 密码 Password */
		public byte[]    szIPv4Address = new byte[NETDEV_LEN_32];       /* IPv4的IP地址  IP address of IPv4 */
		public byte[]    szIPv4GateWay = new byte[NETDEV_LEN_32];       /* IPv4的网关地址  Gateway of IPv4 */
		public byte[]    szIPv4SubnetMask = new byte[NETDEV_LEN_32];    /* IPv4的子网掩码  Subnet mask of IPv4 */
		public byte[]    szDevSerailNum = new byte[NETDEV_LEN_64];      /* 设备序列号  Device serial number */
		public byte[]    szDevMac = new byte[NETDEV_LEN_64];            /* 设备MAC地址  Device MAC address */
		public byte[]    byRes = new byte[512];                         /* 保留字段  Reserved */
	}

	/**
	 * @brief 视频通道详细信息 结构体定义  Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_VIDEO_CHL_DETAIL_INFO_S extends Structure
	{
		public int                        dwChannelID;                        /* 通道ID  Channel ID */
		public int                        bPtzSupported;                      /* 是否支持云台 Whether ptz is supported */
		public int                        enStatus;                           /* 通道状态  Channel status NETDEV_CHANNEL_STATUS_E*/
		public int                        dwStreamNum;                        /* 流个数  Number of streams 当enStatus为NETDEV_CHL_STATUS_UNBIND时，此值无效*/
		public byte[]                     szChnName = new byte[NETDEV_LEN_64];           /* 通道名称 Channel Name */
		public byte[]                     byRes = new byte[4];                           /* 保留字段  Reserved field*/
	};

	/**
	 * @struct tagNETDEVChlDeviceInfo
	 * @brief 设备通道基本信息 结构体定义 Basic device information Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_DEVICE_CHL_INFO_S extends Structure
	{
		public int dwChannelID;                                  /* 通道号 */
		public byte[] szDevModel = new byte[NETDEV_LEN_64];                     /* 设备型号  Device model */
		public byte[] szSerialNum = new byte[NETDEV_LEN_64];                    /* 硬件序列号  Hardware serial number */
		public byte[] szFirmwareVersion = new byte[NETDEV_LEN_64];              /* 软件版本号  Software version */
		public byte[] szHardewareID = new byte[NETDEV_LEN_64];                  /* 硬件标识 */
		public byte[] szUbootVersion = new byte[NETDEV_LEN_64];                 /* UBOOT引导版本 */
		public byte[] byRes = new byte[512];                                    /* 保留字  Reserved */
	}

	/**
	 * @struct tagstNETDEV_VoiceBroadcastChlInfo
	 * @brief 语音广播通道信息
	 * @attention
	 */
	public class NETDEV_VOICE_BROADCAST_CHL_INFO_S extends Structure
	{
		public int  dwChannelID;               /* 音频通道ID */
		public int  dwResultCode;              /* 广播通道状态码 */
		public int  dwStatus;                  /* 广播通道声音开启状态 */
	}

	/**
	 * @struct tagstNETDEV_VoiceBroadcastGroupInfo
	 * @brief 语音广播组信息
	 * @attention
	 */
	public class NETDEV_VOICE_BROADCAST_GROUP_INFO_S extends Structure
	{
		public int                                  dwSize;                                                        /* 广播组通道个数 */
		public NETDEV_VOICE_BROADCAST_CHL_INFO_S[]      astChlInfoList = new NETDEV_VOICE_BROADCAST_CHL_INFO_S[NETDEV_VOICE_BROADCAST_CHANNEL_NUM_MAX];        /* 所有通道信息 */
	}

	/**
	 * @struct tagstNETDEV_ModifyVoiceBroadcastInfo
	 * @brief 修改语音广播组信息
	 * @attention
	 */
	public class NETDEV_MODIFY_VOICE_BROADCAST_INFO_S extends Structure
	{
		public Pointer     pstAddChannelList;      /* 新增通道列表  NETDEV_OPERATE_LIST_S*/
		public Pointer     pstDelChannelList;      /* 删除通道列表  NETDEV_OPERATE_LIST_S*/
	}

	/**
	 * @struct tagstNETDEV_VoiceBroadcastCtrlInfo
	 * @brief 语音广播组控制信息
	 * @attention
	 */
	public class NETDEV_VOICE_BROADCAST_CTRL_INFO_S extends Structure
	{
		public int   dwChannelID;             /* 通道ID */
		public int   udwStatus;               /* 声音状态,开(1),关(0) */
	}

	/**
	 * @brief 日志查询条件 结构体定义 Log query condition Structure definition
	 * @attention 无 None
	 */
	public class NETDEV_FIND_LOG_COND_S extends Structure
	{
		public int      dwMainType;         /* 日志类型, 请参考#NETDEV_LOG_MAIN_TYPE_E。 Log type. See #NETDEV_LOG_MAIN_TYPE_E for reference */
		public int      dwSubType;          /* 日志子类型, 请参考#NETDEV_LOG_SUB_TYPE_E。 Sub type. See #NETDEV_LOG_SUB_TYPE_E for reference */
		public long      tBeginTime;         /* 起始时间  Start time */
		public long      tEndTime;           /* 结束时间  End time */
		public int      dwLimitNum;         /* 每次查询的数量 Number of each query*/
		public int      dwOffset;           /* 从序号几开始查询，序号从0开始 Start search from No. X. X starts from 0*/
	}

	/**
	 * @brief 日志信息 结构体定义 Definition of log info structure
	 * @attention 无
	 */
	public class NETDEV_LOG_INFO_S extends Structure
	{
		public long       tTime;                                  /* 日志时间 Log time*/
		public int       dwMainType;                             /* 日志主类型, 请参考 #NETDEV_LOG_MAIN_TYPE_E。 Main Type.See #NETDEV_LOG_MAIN_TYPE_E for reference*/
		public int       dwSubType;                              /* 日志子类型, 请参考 #NETDEV_LOG_SUB_TYPE_E。 Sub Type.See #NETDEV_LOG_SUB_TYPE_E for reference*/
		public int       dwChannelID;                            /* 日志来源 Log source*/
		public byte[]        szUserName = new byte[NETDEV_NAME_MAX_LEN];        /* 用户名 Username*/
		public byte[]        szUserAddr = new byte[NETDEV_IPADDR_STR_MAX_LEN];  /* 用户IP地址 User IP address*/
		public byte[]        szDetailInfo = new byte[NETDEV_LEN_256];           /* 详细信息[1,64] 仅NVR支持 Detail info[1,64] NVR Only */
		public byte[]        szOperObject = new byte[NETDEV_LEN_256];           /* 操作对象[1,64] 仅VMS支持 Opera object[1,64] VMS Only */
		public int      udwOperResult;                          /* 操作结果 仅VMS支持 Opera result VMS Only */
		public byte[]        szDevName = new byte[NETDEV_LEN_256];              /* 设备名称[1,64] Device name of operation[1,64] VMS Only*/
		public byte[]        szOrgName = new byte[NETDEV_LEN_256];              /* 组织名称[1,64] Org Name of operation[1,64] VMS Only */
		public byte[]        bRes = new byte[256];                              /* 保留字段 Reserved */
	}

	/**
	 * @struct tagNETDEVAlarmFindConds
	 * @brief 告警信息查找条件 结构体定义
	 * @attention 无
	 */
	public class NETDEV_FIND_ALARM_COND_S extends Structure
	{
		public int   dwChannelID;      /* 通道ID */
		public long   tBeginTime;       /* 开始时间 */
		public long   tEndTime;         /* 结束时间 */
		public byte[]   byRes = new byte[128];       /* 保留字段  Reserved */
	}
	/**
	 * @struct tagNETDEVFindAlarmInfo
	 * @brief 告警信息 结构体定义
	 * @attention 无
	 */
	public class NETDEV_FIND_ALARM_INFO_S extends Structure
	{
		public long    tAlarmTime;        /* 告警时间 */
		public int    dwAlarmType;       /* 告警类型, 请参考#NETDEV_FIND_ALARM_TYPE_E */
		public byte[]     byRes = new byte[256];        /* 保留字段  Reserved */
	}

	public class NETDEV_ALARM_SNAPSHOT_COND_S extends Structure
	{
		public int                           dwChannelID;                                /* 通道号  Channel number 或者 开关量告警编号，参数为通道号*100+报警输出号，设备本身通道号为0*/
		public long                          tAlarmTime;                                 /* 告警产生时间 */
		public int                          enAlarmType;                                /* 告警类型 NETDEV_ALARM_SNAPSHOT_TYPE_E */
		public byte[]                       byRes = new byte[244];                                 /* 保留字段  Reserved */
	}

	public class NETDEV_ALARM_SNAPSHOT_PIC_S extends Structure
	{
		public byte[]    szURL = new byte[NETDEV_MAX_URL_LEN];  /* 图片URL */
		public byte[]    szName = new byte[NETDEV_LEN_64];      /* 图片名称 */
		public int   dwSize;                     /* 图片大小 */
		public byte[]    byRes = new byte[256];                 /* 保留字段  Reserved */
	}

	public class NETDEV_PIC_FILE_INFO_S extends Structure
	{
		public byte[]    szURL = new byte[NETDEV_MAX_URL_LEN];         /* 图片URL */
		public int    bSaveLocal;                        /* 是否保存在本地，TURE表示保存本地，FALSE表示写入缓存 */
		public byte[]    szFileName = new byte[NETDEV_LEN_260];        /* 保存图片的本地路径及名称 */
		public Pointer   pcBuffer;                          /* 保存图片缓存,需客户申请内存，大小为dwSize缓存大小 CHAR* */
		public int   dwSize;                            /* 缓存大小 */
		public int   dwCaptureMode;                     /* 保存图像格式,参见#NETDEV_PICTURE_FORMAT_E*/
		public byte[]    byRes = new byte[252];                        /* 保留字段  Reserved */
	}

	/**
	 * @struct tagQueryCondition
	 * @brief 条件查询通道信息结构体
	 * @attention
	 */
	public class NETDEV_QUERY_CHN_CONDITION_S extends Structure
	{
		public int         dwLimit;                   /* 每次查询的数量，最大200条  */
		public int         dwOffset;                  /* 从当前序号开始查询，序号从0开始 */
		public int         dwQryInfoNum;              /* 查询条件个数 */
		public Pointer     pstQueryInfo;              /* 查询条件  NETDEV_QUERY_INFO_S*/
		public int         dwRecursion;               /* 递归查询类型     0：不递归 1：向上递归 2：向下递归 */
		public byte[]      byRes = new byte[260];     /* 保留字段  Reserved */
	}
	
	/*
	* @struct tagNETDEVPicQueryCond
	* @brief 图片查询条件
	* @attention 无 None
	*/
	public class NETDEV_PIC_QUERY_COND_S extends Structure
	{
		public int         udwSearchID;                   /* 业务号  */
		public int         udwLimit;                      /* 每次查询的数量  */
		public int         udwOffset;                     /* 从当前序号开始查询，序号从0开始 */
		public byte[]      byRes = new byte[128];         /* 保留字段  Reserved */
	}
	
	/*
	* @struct tagNETDEVPicQueryResult
	* @brief 图片查询结果
	* @attention 无 None
	*/
	public class NETDEV_PIC_QUERY_RESULT_S extends Structure
	{
		public int         udwTotal;                      /* 查询结果总个数  */
		public int         udwNum;                        /* 当前返回数量  */
		public byte[]      byRes = new byte[128];         /* 保留字段  Reserved */
	}
	
	/**
	 * @struct tagNETDEVSingleObjectInfo
	 * @brief 单个目标信息
	 * @attention 无 None
	 */
	public class NETDEV_SINGLE_OBJECT_INFO_S extends Structure
	{
		public int                               udwObjectType;                 /* 目标类型 # 参见 NETDEV_OBJECT_TYPE_E */                    
		public NETDEV_FACE_STRUCT_INFO_S         stFaceInfo;                    /* 人脸信息 */
		public NETDEV_PERSON_STRUCT_INFO_S       stPersonInfo;                  /* 人员信息 */
		public NETDEV_NON_MOTOR_VEH_INFO_S       stNonMotorVehInfo;             /* 非机动车信息 */
		public NETDEV_VEH_INFO_S                 stVehInfo;                     /* 车辆信息  */
		public byte[]                            byRes = new byte[256];         /* 保留字段  Reserved */
	}
	
	/*
	* @struct tagNETDEVObjectInfoList
	* @brief 目标信息列表
	* @attention 无 None
	*/
	public class NETDEV_OBJECT_INFO_LIST_S extends Structure
	{
		public int                                 udwObjectID;                    /* 目标ID */                  
		public NETDEV_FILE_INFO_S                  stSmallImageInfo;               /* 目标对应小图信息  图片最大1 需申请内存*/
		public NETDEV_SINGLE_OBJECT_INFO_S         stObjectInfo;                   /* 目标信息 */
		public byte[]                              byRes = new byte[1024];         /* 保留字段  Reserved */
	}
	
	/*
	* @struct tagNETDEVObjectResultInfo
	* @brief 目标结果信息
	* @attention 无 None
	*/
	public class NETDEV_OBJECT_RESULT_INFO_S extends Structure
	{
		public int                    udwRecordID;                                  /* 记录ID */
		public int                    udwType;                                      /* 记录类型 详见 NETDEV_OBJECT_RECORD_TYPE_E  */
		public int                    udwTime;                                      /* 记录事件，UTC格式，单位秒  */
		public byte[]                 szChannelName = new byte[NETDEV_LEN_256];     /* 抓拍通道名称，范围[1,63] */
		public int                    udwChannelID;                                 /* 抓拍通道ID */
		public NETDEV_FILE_INFO_S     stBigImageInfo;                               /* 大图信息 图片最大大小1M  图片内存需申请*/
		public int                    udwObjectInfoNum;                             /* 目标信息列表数量 */
		public Pointer                pstObjectInfoList;                            /*  NETDEV_OBJECT_INFO_LIST_S 目标信息列表 需动态申请 */
		public byte[]                 byRes = new byte[512];                        /* 保留字段  Reserved */
	}
	
	/**
	 * @struct tagNETDEVAudioFileCapability
	 * @brief 导入音频文件能力
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_FILE_CAPABILITY_S extends Structure
	{
		public int udwMaxNum;                                                     /* 支持导入音频文件个数的最大值 */
		public int udwMaxSize;                                                    /* 支持导入单个音频文件大小的最大值，单位KB */
		public int udwFormatNum;                                                  /* 支持导入音频文件格式个数 */
		public byte[]    szFormatList = new byte[NETDEV_LEN_256];                 /* 文件支持导入音频格式列表 格式xx;xx;xx;…，当FormatNum为0时该字段可选,目前仅支持pcm，g711a格式，不区分大小写 */
		public byte[]    byRes = new byte[256];                                   /* 保留字段 */
	}
	
	/**
	 * @struct tagNETDEVLanguageCapability
	 * @brief 支持的语种类型能力
	 * @attention 无 None
	 */
	public class NETDEV_LANGUAGE_CAPABILITY_S extends Structure
	{
		public int       udwNum;                                                /* 设备支持的语种类型个数 */
		public int       audwLanguage[] = new int[NETDEV_LEN_256];              /* 语种类型字符串，范围[1-16] 详见 NETDEV_LANG_TYPE_E */
		public byte[]    byRes = new byte[256];                                 /* 保留字段 */
	}
	
	/**
	 * @struct tagNETDEVSysCapability
	 * @brief 系统能力
	 * @attention 无 None
	 */
	public class NETDEV_SYS_CAPABILITY_S extends Structure
	{
		public  NETDEV_AUDIO_FILE_CAPABILITY_S   stAudioFileCapability;        /* 导入音频文件能力 */
		public  NETDEV_LANGUAGE_CAPABILITY_S     stLanguageCapability;         /* 支持的语种类型能力 (部分设备支持)*/
		public  byte[]                           byRes = new byte[256];        /* 保留字段 */
	}
	
	/**
	 * @struct tagNETDEVAudioOutputCfg
	 * @brief 音频输出参数
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_OUTPUT_CFG_S extends Structure
	{
		public int       udwType;                                              /* 音频输出设备类型 详见 NETDEV_AUDIO_CHL_MODE_E */
		public int       udwGain;                                              /* 音频输出增益 范围[0,255] 不支持音频输出设备类型，即AudioOutTypeNum为0时，此字段可选 */
		public byte[]    byRes = new byte[256];                                /* 保留字段 */
	}
	
	/**
	* @struct tagNETDEVAudioInputModeInfo
	* @brief 音频输入模式信息
	* attention None
	*/
	public class NETDEV_AUDIO_IN_MODE_INFO_S extends Structure
	{
		public int       dwChannelID;                                                   /* 音频通道号 */
		public int       udwModeNum;                                                    /* 音频模式数量 */
		public int       audwModeList[] = new int[NETDEV_AUDIO_IN_CHL_MODE_MAX_NUM];    /* 支持的音频输入通道模式列表 参见枚举#NETDEV_AUDIO_CHL_MODE_E */
		public byte[]    byRes = new byte[128];                                         /* 保留字节 */
		
	}
	
	/**
	* @struct tagNETDEVAudioInputEncodeFormatInfo
	* @brief 音频编码格式信息
	* attention None
	*/
	public class NETDEV_AUDIO_IN_ENCODE_FORMAT_INFO_S extends Structure
	{
		public int       udwType;                                                               /* 音频编码格式类型，参见枚举# NETDEV_AUDIO_ENCODE_FORMAT_TYPE_E */
		public int       udwSamplingRateNum;                                                    /* 支持的采样率数目 */
		public int       audwSamplingRateList[] = new int[NETDEV_AUDIO_IN_CHL_MODE_MAX_NUM];    /* 支持的采样率列表 参见枚举# NETDEV_AUDIO_SAMPLING_RATE_E */
		public byte[]    byRes = new byte[128];                                                 /* 保留字节 */
	}
	
	/**
	 * @struct tagNETDEVAudioCapInfo
	 * @brief 视频输入通道音频能力集信息
	 * @attention 无 None
	 */
	public class NETDEV_AUDIO_CAP_S extends Structure
	{
		public int       dwAudioInNum;                                                                                                                               /* 支持的音频口输入的数目 */
		public NETDEV_AUDIO_IN_MODE_INFO_S[]               astChlInfoList = new NETDEV_AUDIO_IN_MODE_INFO_S[NETDEV_AUDIO_IN_MAX_NUM];                                /* 音频口输入模式列表 */
		public int       dwAudioInEncFmtNum;                                                                                                                         /* 支持的音频输入编码格式数量 */
		public NETDEV_AUDIO_IN_ENCODE_FORMAT_INFO_S[]      astAudioInEncFmtList = new NETDEV_AUDIO_IN_ENCODE_FORMAT_INFO_S[NETDEV_AUDIO_IN_ENCODE_FORMAT_MAX_NUM];   /* 支持的音频输入编码格式列表 */
		public int       dwSerialInNum;                                                                                                                              /* 支持的串口输入的数目，用于外接数字拾音器 */
		public NETDEV_AUDIO_IN_MODE_INFO_S[]               astSerialInModeList = new NETDEV_AUDIO_IN_MODE_INFO_S[NETDEV_AUDIO_IN_MAX_NUM];                           /* 串口输入模式列表 */
		public int       dwSerialInEncFmtNum;                                                                                                                        /* 串口输入支持的编码格式数量 */
		public NETDEV_AUDIO_IN_ENCODE_FORMAT_INFO_S[]      astSerialInEncFmtList = new NETDEV_AUDIO_IN_ENCODE_FORMAT_INFO_S[NETDEV_AUDIO_IN_ENCODE_FORMAT_MAX_NUM];  /* 串口输入支持的编码格式列表 */
		public int       dwAudioOutTypeNum;	                                                                                                                         /* 支持的音频输出设备类型的数目 */
		public int                                         audwAudioOutTypeList[] = new int[NETDEV_LEN_4];                                                           /* 音频输出设备类型 详见 NETDEV_AUDIO_CHL_MODE_E */
		public int       dwBoolSupportAudioOutGain;                                                                                                                  /* 设备是否支持音频增益可配置 0：不支持 1：支持 */
		public byte[]    byRes = new byte[232];                                                                                                                      /* 保留字段 */                     	
	}
	
	/***********************************************************************
	 ** 回调
	 ***********************************************************************/
	//JNA StdCallCallback方法定义,断线回调

	/**
	 * 拼帧前媒体流数据回调函数的指针类型  Type of pointer to media stream data callback function before being framed
	 * @param lpPlayHandle       当前的实况播放句柄 Current live playing handle
	 * @param  pucBuffer         存放拼帧前媒体流数据缓冲区指针 Pointer to buffer that stores stream data that is not framed
	 * @param  dwBufSize         缓冲区大小 Buffer size
	 * @param  dwMediaDataType   媒体数据类型,参见媒体类型枚举定义#NETDEV_MEDIA_DATA_FORMAT_E Media data type, see definitions of enumeration #NETDEV_MEDIA_DATA_TYPE_E
	 * @param  lpUserParam       用户设置参数,即用户在调用#NDPlayer_SetSourceMediaDataCB函数时指定的用户参数 User-set parameters, specified by users when they call the #NDPlayer_SetSourceMediaDataCB function
	 * @return 无. None.
	 * @note  用户应及时处理输出的媒体流数据,确保函数尽快返回,否则会影响播放器内的媒体流处理. Users should handle output stream data in a timely manner so that functions can be returned quickly. Otherwise, stream processing in the player will be affected.
	 */
	public interface NETDEV_SOURCE_DATA_CALLBACK_PF extends StdCallCallback {
		public void invoke(Pointer lpPlayHandle, Pointer pucBuffer, int dwBufSize, int dwMediaDataType, Pointer lpUserParam);
	}

	/**
	 * 解码后视频流数据回调函数的指针类型  Type of pointer to callback function for decoded video stream data
	 * @param  lpPlayHandle      当前的实况播放句柄 Current live playing handle
	 * @param  pstPictureData    存放解码后视频流数据信息缓冲区指针 Pointer to buffer that stores decoded video stream data
	 * @param  lpUserParam       用户设置参数,即用户在调用#NDPlayer_SetDecodeVideoDataCB函数时指定的用户参数 User-set parameters, specified by users when they call the #NDPlayer_SetDecodeVideoDataCB function
	 * @return 无. None.
	 * @note
	 * -     1.用户应及时处理输出的视频流数据,确保函数尽快返回,否则会影响播放器内的媒体流处理.
	 * -     1. Users should handle output stream data in a timely manner so that functions can be returned quickly. Otherwise, stream processing in the player will be affected.
	 * -     2.视频数据是yv12格式.排列顺序“Y0-Y1-......”,“U0-U1-......”,“V0-V1-......”
	 * -     2. Video data is in yv12 format in sequence of Y0-Y1-......, U0-U1-......, V0-V1-......
	 */
	public interface NETDEV_DECODE_VIDEO_DATA_CALLBACK_PF extends StdCallCallback {
		public void invoke(Pointer lpPlayHandle, NETDEV_PICTURE_DATA_S pstPictureData, Pointer lpUserParam);
	}

	/**
	 * 设备发现回调函数 Device discovery callback function
	 * @param  pstDevInfo                设备信息 Device info
	 * @param  lpUserData                用户数据 User data
	 * @note
	 */
	public interface NETDEV_DISCOVERY_CALLBACK_PF extends StdCallCallback {
		public void invoke(NETDEV_DISCOVERY_DEVINFO_S pstDevInfo, Pointer lpUserData);
	}

	/**
	 * 解码后音频流数据回调函数的指针类型  Type of pointer to callback function for decoded audio stream data
	 * @param  lpPlayHandle   当前的实况播放句柄 Current live playing handle
	 * @param  pstWaveData    存放解码后音频流数据信息缓冲区指针 Pointer to buffer that stores decoded audio stream data
	 * @param  lpUserParam    用户设置参数,即用户在调用#NDPlayer_SetDecodeAudioDataCB函数时指定的用户参数 User-set parameters, specified by users when they call the #NDPlayer_SetDecodeAudioDataCB function
	 * @return 无. None.
	 * @note
	 * -     用户应及时处理输出的音频流数据,确保函数尽快返回,否则会影响播放器内的媒体流处理.
	 * -     Users should handle output stream data in a timely manner so that functions can be returned quickly. Otherwise, stream processing in the player will be affected.
	 */
	public interface NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF extends StdCallCallback {
		public void invoke(Pointer lpPlayHandle, NETDEV_WAVE_DATA_S pstWaveData, Pointer lpUserParam);
	}

	/**
	 * 人脸抓拍消息回调函数
	 * @param  lpUserID                用户登录句柄 User login ID
	 * @param  pstFaceSnapShotData     人脸抓拍数据
	 * @param  lpUserData              用户数据   User data
	 * @note 无 None
	 */
	public interface NETDEV_FaceSnapshotCallBack_PF extends StdCallCallback {
		public void invoke(Pointer lpUserID, NETDEV_TMS_FACE_SNAPSHOT_PIC_INFO_S pstFaceSnapShotData, Pointer lpUserData);
	}

	/**
	 * 车牌识别消息回调函数
	 * @param  lpUserID                用户登录句柄 User login ID
	 * @param  pstHeatMapData          车牌识别数据
	 * @param  lpUserData              用户数据   User data
	 * @note 无 None
	 */
	public interface NETDEV_CarPlateCallBack_PF extends StdCallCallback {
		public void invoke(Pointer lpUserID, NETDEV_TMS_CAR_PLATE_INFO_S pstCarPlateData, Pointer lpUserParam);
	}

	/**
	 * 客流量统计消息回调函数  Callback function for passenger flow statistic message
	 * @param  lpUserID                用户登录句柄 User login ID
	 * @param  pstPassengerFlowData    客流量数据 Passenger flow data
	 * @param  lpUserData              用户数据   User data
	 * @note 无 None
	 */
	public interface NETDEV_PassengerFlowStatisticCallBack_PF extends StdCallCallback {
		public void invoke(Pointer lpUserID, NETDEV_PASSENGER_FLOW_STATISTIC_DATA_S pstPassengerFlowData, Pointer lpUserData);
	}

	/**
	 * 接收告警消息的回调函数 Callback function to receive alarm information
	 * @param  lpUserID              用户登录ID
	 * @param  pstReportInfo         上报信息 Alarm information
	 * @param  lpBuf                 缓冲区指针 Pointer to buffer
	 * @param  dwBufLen              告警信息对应结构体的长度 Length of structure for alarm information
	 * @param  dwBufLen              用户数据 User data
	 * @note
	 */
	public interface NETDEV_AlarmMessCallBack_PF_V30 extends StdCallCallback {
		public void invoke(Pointer lpUserID, NETDEV_REPORT_INFO_S  pstReportInfo, Pointer lpBuf, int dwBufLen, Pointer lpUserData);
	}

	/**
	 * 接收异常.重连等消息的回调函数  Callback function to receive exception and reconnection messages
	 * @param  lpUserID     用户登录句柄 User login ID
	 * @param  dwType       异常或重连等消息的类型:NETDEV_EXCEPTION_TYPE_E Type of exception or reconnection message: NETDEV_EXCEPTION_TYPE_E
	 * @param  lpExpHandle  出现异常的相应类型的句柄 Exception type handle
	 * @param  lpUserData   用户数据 User data
	 * @param [OUT] pstExceptionOutputInfo   异常输出信息 Exception output information
	 * @note
	 */
	public interface NETDEV_ExceptionCallBack_PF extends StdCallCallback {
		public void invoke(Pointer lpUserID, int dwType, Pointer lpExpHandle, Pointer lpUserData, NETDEV_EXCEPTION_OUTPUT_INFO_S pstExceptionOutputInfo);
	}

	/**
	 * 接收结构化告警消息的回调函数        Callback function to receive alarm information
	 * @param  lpUserID                用户登录句柄 User login ID
	 * @param  pstAlarmInfo            告警信息 Alarm information
	 * @param  pstAlarmData            告警数据 Alarm data
	 * @param  lpUserData              用户数据 User data
	 * @note
	 */
	public interface NETDEV_StructAlarmMessCallBack_PF extends StdCallCallback {
		public void invoke(Pointer lpUserID,NETDEV_STRUCT_ALARM_INFO_S pstAlarmInfo,NETDEV_STRUCT_DATA_INFO_S pstAlarmData,Pointer    lpUserData);
	}

	/**
	 * 接收告警消息的回调函数  Callback function to receive alarm information
	 * @param  lpUserID              用户登录句柄 User login ID
	 * @param  pstAlarmPersonData    人脸告警的数据 Data of Person Alarm
	 * @param  lpUserData            用户数据 User data
	 * @note
	 */
	public interface NETDEV_PersonAlarmMessCallBack_PF extends StdCallCallback{
		public void invoke(Pointer lpUserID, NETDEV_PERSON_EVENT_INFO_S pstAlarmData, Pointer lpUserData);
	}

	/**
	 * 接收车牌识别告警消息的回调函数 Callback function to receive alarm information
	 * @param  lpUserID                用户登录ID
	 * @param  pstVehicleAlarmInfo     上报信息 Alarm information
	 * @param  lpBuf                   缓冲区指针 Pointer to buffer
	 * @param  dwBufLen                告警信息对应结构体的长度 Length of structure for alarm information
	 * @param  dwBufLen                用户数据 User data
	 * @note   在回调函数中只能做拷贝数据动作，否则若耗时过长，容易造成告警上报阻塞、内存消耗过大等问题
	 */
	public interface NETDEV_VehicleAlarmMessCallBack_PF extends StdCallCallback{
		public void invoke (Pointer lpUserID, NETDEV_VEH_RECOGNITION_EVENT_S pstVehicleAlarmInfo, Pointer lpBuf, int dwBufLen, Pointer lpUserData);
	}

	/**
	 * 接收停车场告警函数
	 * @param  lpUserID                用户登录ID
	 * @param  stParkAlarmInfo         上报信息
	 * @param  lpUserData              用户数据
	 * @note
	 */
	public interface  NETDEV_ParkEventMessCallBack_PF extends StdCallCallback{
		public void invoke(Pointer lpUserID, NETDEV_PARK_EVENT_INFO_S stParkAlarmInfo, Pointer lpUserData);
	}

	/**
	 * 接收告警消息的回调函数              Callback function to receive alarm information
	 * @param  lpUserID                用户登录句柄 User login ID
	 * @param  pstAlarmData            告警信息 Alarm information
	 * @param  lpUserData              用户数据 User data
	 * @note
	 */
	public interface NETDEV_AlarmMessFGCallBack_PF extends StdCallCallback{
		public void invoke (Pointer lpUserID, NETDEV_PERSON_VERIFICATION_S pstAlarmData, Pointer lpUserData);
	}

	/**
	 * SDK 初始化  SDK initialization
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 线程不安全 Thread not safe
	 */
	public boolean NETDEV_Init();

	/**
	 * 注册设备发现回调函数 Registered device discovery callback function
	 * @param  cbDiscoveryCallBack   回调函数 NETDEV_DISCOVERY_CALLBACK_PF
	 * @param  lpUserData            用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_SetDiscoveryCallBack(NETDEV_DISCOVERY_CALLBACK_PF cbDiscoveryCallBack, Pointer lpUserData);

	/**
	 * 设备发现 先注册设备发现相关的回调,再调用此接口发现设备,发现的设备信息在回调中反映
	 * This interface is used for device discovery. Please first register callback functions related to device discovery and use this interface for device discovery. Discovered device info will be included in the callback function.
	 * @param    pszBeginIP                 起始IP地址
	 * @param    pszEndIP                   结束IP地址
	 * @return TRUE表示成功,其他表示失败
	 * @note 若pszBeginIP和pszEndIP都是"0.0.0.0",则搜索本网段设备
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_Discovery(String pszBeginIP,String pszEndIP);

	/**
	 * 设备登录
	 * @param   pstDevLoginInfo  设备登录信息
	 * @param [OUT] pstSELogInfo     安全登录信息，包含登录失败次数及下次登录时间
	 * @return 返回值为用户ID。
	 * @note 安全登录信息此字段仅适用于使用LAPI协议登录的设备
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public Pointer NETDEV_Login_V30(NETDEV_DEVICE_LOGIN_INFO_S pstDevLoginInfo, NETDEV_SELOG_INFO_S pstSELogInfo);

	/**
	 * 查询视频通道信息列表  Query channel info list
	 * @param     lpUserID           用户登录句柄 User login ID
	 * @param [INOUT] pdwChlCount        通道数 Number of channels
	 * @param [OUT]   pstVideoChlList    通道能力集列表 List of channel info list
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_QueryVideoChlDetailListEx(Pointer lpUserID, IntByReference pdwChlCount, NETDEV_VIDEO_CHL_DETAIL_INFO_EX_S[] pstVideoChlList);

	/**
	 * 启动实时预览  Start live preview
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   pstPreviewInfo       预览参数,参考枚举：NETDEV_PROTOCAL_E,NETDEV_LIVE_STREAM_INDEX_E. Preview parameter, see enumeration: NETDEV_PROTOCAL_E, NETDEV_LIVE_STREAM_INDEX_E.
	 * @param   cbPlayDataCallBack   码流数据回调函数指针NETDEV_SOURCE_DATA_CALLBACK_PF
	 * @param   lpUserData           用户数据 User data
	 * @return 返回的用户登录句柄,返回 0 表示失败,其他值表示返回的用户登录句柄值. Returned user login ID. 0 indicates failure, and other values indicate the user ID.
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public Pointer NETDEV_RealPlay(Pointer lpUserID, NETDEV_PREVIEWINFO_S stPreviewInfo, NETDEV_SOURCE_DATA_CALLBACK_PF cbPlayDataCallBack, Pointer lpUserData);

	/**
	 * 注册码流回调函数:原始码流  Callback function to register streams (original stream)
	 * @param   lpPlayHandle               实时预览句柄 Live preview handle
	 * @param   cbSourceDataCallBack       码流数据回调函数NETDEV_SOURCE_DATA_CALLBACK_PF
	 * @param   bContinue                  是否继续进行后面的拼帧.解码和显示操作 Whether to continue to following framing, decoding and displaying operations.
	 * @param   lpUser                     用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_SetPlayDataCallBack(Pointer lpPlayHandle, NETDEV_SOURCE_DATA_CALLBACK_PF cbPlayDataCallBack, int bContinue, Pointer lpUser);

	/**
	 * 注册实时码流回调函数：解码后视频媒体流数据  Callback function to register live stream (decoded media stream data)
	 * @param   lpPlayHandle                 预览\回放句柄 Preview\playback handle
	 * @param   cbPlayDecodeVideoCALLBACK    数据回调函数 NETDEV_DECODE_VIDEO_DATA_CALLBACK_PF
	 * @param   bContinue                    是否继续进行后面的显示操作 Whether to continue to following displaying operations.
	 * @param   lpUserData                   用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * - 若关闭回调函数,将第二个参数置为NULL.
	 * - To shut the callback function, set the second parameter as NULL.
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_SetPlayDecodeVideoCB(Pointer lpPlayHandle, NETDEV_DECODE_VIDEO_DATA_CALLBACK_PF cbPlayDecodeVideoCALLBACK, int bContinue, Pointer lpUserData);

	/**
	 * 本地录像  Local recording
	 * @param   lpPlayHandle         预览句柄 Preview handle
	 * @param   pszSaveFileName      保存的文件名 Name of saved file
	 * @param   dwFormat             Format of saved file, see #NETDEV_MEDIA_FILE_FORMAT_E
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_SaveRealData(Pointer lpPlayHandle, String pszSaveFileName, int dwFormat);

	/**
	 * 停止本地录像 Stop local recording
	 * @param   lpPlayHandle     预览句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_StopSaveRealData(Pointer lpPlayHandle);

	/**
	 * 停止实时预览  Stop live preview
	 * @param   lpPlayHandle     预览句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 对应关闭NETDEV_RealPlay开启的实况 Stop the live view started by NETDEV_RealPlay
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_StopRealPlay(Pointer lpPlayHandle);

	/**
	 * 用户注销  User logout
	 * @param  lpUserID    用户登录句柄 User login ID
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_Logout(Pointer lpUserID);

	/**
	 * SDK 清理  SDK cleaning
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_Cleanup();

	/**
	 * 设置日志路径业务 Set log path
	 * @param    pszLogPath  日志路径(不包含文件名)  Log path (file name not included)
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 * @note 支持win32 支持VMS
	 */
	public boolean NETDEV_SetLogPath(String pszLogPath);

	/**
	 * 设置日志文件大小和数量 Set log file size and number
	 * @param  dwLogFileSize     单个日志文件大小(单位字节) The size of single log file //最大30M
	 * @param  dwLogFileNum      日志文件个数  Log file number
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.
	 * @note
	 */
	public boolean NETDEV_ConfigLogFile(int dwLogFileSize, int dwLogFileNum);

	/**
	 * 设置写入日志的标记 Set write log flag
	 * @param    bWriteLogFlag  写入日志的标记  1:写入日志,0：不写入日志
	 * @return VOID
	 * @note
	 */
	public boolean NETDEV_SetWriteLogFlag(int bWriteLogFlag);

	/**
	 * 设置超时时间 Set timeout
	 * @param   pstRevTimeout         超时时间指针 Pointer to timeout
	 * @return TRUE表示成功,其他表示失败    TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetRevTimeOut(NETDEV_REV_TIMEOUT_S pstRevTimeout);

	/**
	 * 设置保活参数 Set keep-alive parameters
	 * @param   dwWaitTime            间隔等待时间  Waiting time
	 * @param   dwTrytimes            尝试连接次数  Connecting attempts
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetConnectTime(int dwWaitTime, int dwTrytimes);

	/**
	 * 开启语音对讲 Start two-way audio
	 * @param   lpUserID                 用户登录句柄  User ID
	 * @param   dwChannelID              通道号  Channel ID
	 * @param   cbRealDataCallBack       码流数据回调函数指针 NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF
	 * @param   lpUserData               用户数据   User data
	 * @return 返回的用户登录句柄,返回 0 表示失败,其他值表示返回的用户登录句柄值 Returned user ID. 0 means failure, and any other value is a user ID.
	 * @note 支持win64 支持NVR 支持IPC
	 * @note 支持Win32 支持VMS
	 */
	public Pointer NETDEV_StartVoiceCom(Pointer lpUserID, int dwChannelID, NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF cbPlayDataCallBack,  Pointer lpUserData);

	/**
	 * 关闭语音对讲 Stop two-way audio
	 * @param   lpPlayHandle   对讲句柄 Two-way audio handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.
	 * @note 支持win64 支持NVR 支持IPC
	 * @note 支持Win32 支持VMS
	 */
	public boolean NETDEV_StopVoiceCom(Pointer lpPlayHandle);

	/**
	 * 开启语音广播 Start voice broadcast
	 * @param   lpUserID         用户登录句柄 User login ID
	 * @param   dwChannelID      通道号  Channel ID
	 * @return 返回的用户登录句柄,返回 0 表示失败,其他值表示返回的用户登录句柄值 Returned user ID. 0 means failure, and any other value is a user ID.
	 * @note 不仅实现启动语音广播功能,并且启用一路语音对讲功能 Voice broadcast and two-way audio for one channel are available.
	 */
	public Pointer NETDEV_StartVoiceBroadcast(Pointer lpUserID, int dwChannelID);

	/**
	 * 关闭语音广播 Stop voice broadcast
	 * @param   lpPlayHandle   语音广播 voice broadcast handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.
	 * @note
	 */
	public boolean NETDEV_StopVoiceBroadcast(Pointer lpPlayHandle);

	/**
	 * 开启输入语音数据服务
	 * @param   lpUserID                 用户ID
	 * @param   dwChannelID              通道号
	 * @return 返回的语音对讲句柄,返回 0 表示失败
	 * @note
	 */
	public Pointer NETDEV_StartInputVoiceSrv(Pointer lpUserID, int dwChannelID);

	/**
	 * 关闭输入语音数据服务
	 * @param   lpVoiceComHandle   对讲句柄
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_StopInputVoiceSrv(Pointer lpVoiceComHandle);

	/**
	 * 输入语音数据
	 * @param   lpVoiceComHandle         对讲句柄
	 * @param  lpDataBuf                 语音数据地址
	 * @param  dwDataLen                 语音数据长度
	 * @param  pstVoiceParam             语音参数
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_InputVoiceData(Pointer lpVoiceComHandle, byte[] lpDataBuf, int dwDataLen,NETDEV_AUDIO_SAMPLE_PARAM_S pstVoiceParam);

	/**
	 * 开启麦克风 Turn on microphone
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_OpenMic(Pointer lpPlayHandle);

	/**
	 * 关闭麦克风 Turn off microphone
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_CloseMic(Pointer lpPlayHandle);

	/**
	 * 调节麦克风音量  Adjust sound volume of microphone
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param   dwVolume             音量 Sound volume
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_MicVolumeControl(Pointer lpPlayHandle, int dwVolume);

	/**
	 * 获取麦克风音量 Get mic volume
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param [OUT]  dwVolume             音量 Sound volume
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetMicVolume(Pointer lpPlayHandle, IntByReference pdwVolume);

	/**
	 * 获取静音状态 Get mute status
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param [OUT]  pbMute           静音状态 Mute status
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetMuteStatus(Pointer lpPlayHandle, IntByReference pbMute);

	/**
	 * 设置静音状态 Set mute status
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param   pbMute           静音状态 Mute status
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetMuteStatus(Pointer lpPlayHandle, int pbMute);

	/**
	 * 开启声音  Enable sound
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_OpenSound(Pointer lpPlayHandle);

	/**
	 * 调节扬声器音量 Control sound volume
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param   dwVolume       音量 Volume
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SoundVolumeControl(Pointer lpPlayHandle, int dwVolume);

	/**
	 * 获取扬声器音量 Get sound volume
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @param [OUT]  pdwVolume        音量 Volume
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetSoundVolume(Pointer lpPlayHandle, IntByReference pdwVolume);

	/**
	 * 关闭声音 Mute
	 * @param   lpPlayHandle   预览/对讲句柄 Preview handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_CloseSound(Pointer lpPlayHandle);

	/**
	 * 获取窗口码率  Get window bit rate
	 * @param   lpPlayHandle     预览\回放句柄 Preview\playback handle
	 * @param [OUT] pdwBitRate       获取的码率指针 Pointer to obtained bit rate
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetBitRate(Pointer lpPlayHandle, IntByReference pdwBitRate);

	/**
	 * 获取窗口帧率  Get window frame rate
	 * @param   lpPlayHandle     预览\回放句柄 Preview\playback handle
	 * @param [OUT] pdwFrameRate     获取的帧率指针 Pointer to obtained frame rate
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetFrameRate(Pointer lpPlayHandle, IntByReference pdwFrameRate);

	/**
	 * 获取窗口编码格式  Get window encoding format
	 * @param   lpPlayHandle         预览\回放句柄 Preview\playback handle
	 * @param [OUT] pdwVideoEncFmt       获取的视频编码格式指针,参见NETDEV_VIDEO_CODE_TYPE_E  Pointer to obtained encoding format, see NETDEV_VIDEO_CODE_TYPE_E
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetVideoEncodeFmt(Pointer lpPlayHandle, IntByReference pdwVideoEncFmt);

	/**
	 * 获取视频分辨率  Get video resolution
	 * @param   lpPlayHandle     预览\回放句柄 Preview\playback handle
	 * @param [OUT] pdwWidth         获取的分辨率-宽度指针 Pointer to obtained resolution – width
	 * @param [OUT] pdwHeight        获取的分辨率-高度指针 Pointer to obtained resolution – height
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetResolution(Pointer lpPlayHandle, IntByReference pdwWidth, IntByReference pdwHeight);

	/**
	 * 获取窗口丢包率  Get window packet loss rate
	 * @param   lpPlayHandle     预览\回放句柄 Preview\playback handle
	 * @param [OUT] pulRecvPktNum    接收的数据包数量指针 Pointer to number of received packets
	 * @param [OUT] pulLostPktNum    丢失的数据包数量指针 Pointer to number of lost packets
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetLostPacketRate(Pointer lpPlayHandle, IntByReference pulRecvPktNum, IntByReference pulLostPktNum);

	/**
	 * 重置窗口丢包率  Reset window packet loss rate
	 * @param   lpPlayHandle   预览\回放句柄 Preview\playback handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_ResetLostPacketRate(Pointer lpPlayHandle);

	/**
	 * 实况抓拍  Live view snapshot
	 * @param   lpPlayHandle     预览\回放句柄 Preview\playback handle
	 * @param   pszFileName      保存图像的文件路径（包括文件名） File path to save images (including file name)
	 * @param   dwCaptureMode    保存图像格式,参见#NETDEV_PICTURE_FORMAT_E   Image saving format, see #NETDEV_PICTURE_FORMAT_E
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 文件名中可以不携带抓拍格式的后缀名 File format suffix is not required in the file name
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_CapturePicture(Pointer lpPlayHandle, String pszFileName, int dwCaptureMode);

	/**
	 * 设置视频图像显示比例  Modify image display ratio
	 * @param   lpPlayHandle   预览\回放句柄 Preview\playback handle
	 * @param   enRenderScale  视频图像的显示比例 Image display ratio
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetRenderScale(Pointer lpPlayHandle, int enRenderScale);

	/**
	 * 影像参数获取,只获取当前画面参数  Get the current image info
	 * @param   lpPlayHandle   预览\回放句柄 Preview\playback handle
	 * @param   pstImageInfo   图像信息列表 Image information list
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetVideoEffect(Pointer lpPlayHandle, NETDEV_VIDEO_EFFECT_S pstImageInfo);

	/**
	 * 影像调节,只改变当前画面  Adjust the current image
	 * @param   lpPlayHandle   预览\回放句柄 Preview\playback handle
	 * @param   pstImageInfo   图像信息列表 Image information list
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetVideoEffect(Pointer lpPlayHandle, NETDEV_VIDEO_EFFECT_S pstImageInfo);

	/**
	 * 设置数字放大  Set Digital zoom
	 * @param  lpPlayHandle   预览\回放句柄 Preview\playback handle
	 * @param  hWnd           窗口句柄  window handle
	 * @param  pstRect        矩形区域 Rectangle Area
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note pstRect为空时,显示全部画面,即退出数字放大 All images will be displayed with digital zoom disabled when pstRect is null
	 */
//	public boolean NETDEV_SetDigitalZoom(Pointer lpPlayHandle, Pointer hWnd, NETDEV_RECT_S pstRect);

	/**
	 * 动态产生一个关键帧 Dynamically create an I frame
	 * @param  lpUserID       用户登录句柄  User login ID
	 * @param  dwChannelID    通道号  Channel ID
	 * @param  dwStreamType   参考枚举NETDEV_LIVE_STREAM_INDEX_E  See enumeration NETDEV_LIVE_STREAM_INDEX_E
	 * @return NETDEV_E_SUCCEED   表示成功,其他表示失败  NETDEV_E_SUCCEED means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_MakeKeyFrame(Pointer lpUserID, int dwChannelID, int dwStreamType);

	/**
	 * 元数据处理
	 * @param  lpPlayHandle              播放句柄
	 * @param  bEnableIVA                是否添加元数据
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_SetIVAEnable(Pointer lpPlayHandle, int bEnableIVA);

	/**
	 * 设置元数据绘图显示类型参数
	 * @param  dwShowParam              元数据显示类型参数   参照结构体NETDEV_IVA_SHOW_RULE
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 * -    1.该接口函数仅支持Windows.
	 * -    2.请将规则进行组合,比如显示规则线框和触发规则目标框,下发的ulShowParam = NETDEV_IVA_SHOW_RULE|NETDEV_IVA_SHOW_RESULT_TOUTH_RULE；以此类推
	 * -    3.已最后一次设置的显示类型为准,之前设置的显示操作取消
	 */
	public boolean NETDEV_SetIVAShowParam(int dwShowParam);

	/**
	 * 判断是否为鱼眼码流
	 * @param  lpPlayHandle              播放句柄
	 * @param [OUT] pbFishEyeStream          是否为鱼眼码流
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_IsFishEyeStream(Pointer lpPlayHandle, IntByReference pbFishEyeStream);

	/**
	 * 获取鱼眼矫正参数
	 * @param  lpPlayHandle                  播放句柄
	 * @param [INOUT] pstCenterPoint             鱼眼图像圆的圆心
	 * @param [INOUT] pudwRadius                 鱼眼图像圆的半径
	 * @param [INOUT] lpParm                     预留鱼眼镜头参数
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_GetFishEyeParam(Pointer lpPlayHandle, NETDEV_POINT_S pstCenterPoint, IntByReference pudwRadius, Pointer lpParm);

	/**
	 * 设置5ePTZ显示模式
	 * @param  lpPlayHandle                  播放句柄
	 * @param  udwPtzMode                    5ePTZ显示模式  参考# NETDEV_PTZ_DISPLAY_MODE_E
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_SetPtzDisplayMode(Pointer lpPlayHandle, int udwPtzMode);

	/**
	 * 设置模式和安装位置
	 * @param  lpPlayHandle                  播放句柄
	 * @param  dwPtzMode                     鱼眼PTZ模式,参考# NETDEV_FISHEYE_PTZ_MODE_E
	 * @param  dwInstallMode                 安装位置,参考# NETDEV_INSTALL_MODE_E
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_SetPtzAndFixMode(Pointer lpPlayHandle, int udwPtzMode, int dwInstallMode);

	/**
	 * 获取模式和安装位置
	 * @param  lpPlayHandle                   播放句柄
	 * @param [OUT] pdwPtzMode                    鱼眼PTZ模式,参考# NETDEV_FISHEYE_PTZ_MODE_E
	 * @param [OUT] pdwInstallMode                安装位置,参考# NETDEV_INSTALL_MODE_E
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_GetPtzAndFixMode(Pointer lpPlayHandle, IntByReference pdwPtzMode, IntByReference pdwInstallMode);

	/**
	 * 鼠标操作
	 * @param  lpPlayHandle          播放句柄
	 * @param  dwOperateMode         鼠标操作方式,参见#NETDEV_MOUSE_MOVE_MODE_E
	 * @param  udwFlag               与实际标志位,暂时无意义
	 * @param  wDelta                鼠标滚轮偏移度(可选)
	 * @param  pstPoint              位移坐标
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_SetMouseMoveMode(Pointer lpPlayHandle, int dwOperateMode, int udwFlag, short wDelta, NETDEV_POINT_S pstPoint);

	/**
	 * 非预览下抓拍  Snapshot without preview
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   dwChannelID          通道号 Channel ID
	 * @param   dwStreamType;        码流类型,参见枚举#NETDEV_LIVE_STREAM_INDEX_E  Stream type, see enumeration #NETDEV_LIVE_STREAM_INDEX_E
	 * @param   pszFileName          保存图像的文件路径（包括文件名） File path to save images (including file name)
	 * @param   dwCaptureMode        保存图像格式,参见#NETDEV_PICTURE_FORMAT_E   Image saving format, see #NETDEV_PICTURE_FORMAT_E
	 * @return  TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	仅支持JPG格式.
	Only JPG format is supported.
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_CaptureNoPreview(Pointer lpUserID, int dwChannelID, int dwStreamType, String pszFileName, int dwCaptureMode);

	/**
	 * 订阅推送消息
	 * @param  lpUserID          用户登录ID
	 * @param  dwAlarmType   订阅告警的类型 参见NETDEV_SUBSCRIBE_ALARM_TYPE_E，多个类型使用或运算
	 * @return TRUE表示成功，其他表示失败
	 * @note   订阅前需要先调用NETDEV_SetAlarmCallBack_V30接口注册回调函数
	 * -
	 */
	public boolean NETDEV_Subscribe(Pointer lpUserID, int dwAlarmType);

	/**
	 * 取消订阅推送消息
	 * @param  lpUserID          用户登录ID
	 * @return TRUE表示成功，其他表示失败
	 * @note
	 * -
	 */
	public boolean NETDEV_Unsubscribe(Pointer lpUserID);

	/**
	 * 云台控制操作(不启动实况预览)  PTZ control operation (preview not required)
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   dwChannelID          通道号 Channel ID
	 * @param   dwPTZCommand         云台控制命令,参见#NETDEV_PTZ_E
	PTZ control commands, see #NETDEV_PTZ_E
	 * @param   dwSpeed              云台控制的速度,用户按不同解码器的速度控制值设置.取值范围[1,9] Speed of PTZ control, which is configured according to the speed control value of different decoders. Value ranges from 1 to 9.
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_PTZControl_Other(Pointer lpUserID, int dwChannelID, int dwPTZCommand, int dwSpeed);

	/**
	 * 云台控制操作(需先启动实况预览)  PTZ control operation (preview required)
	 * @param   lpPlayHandle         实时预览句柄 Live preview handle
	 * @param   dwPTZCommand         云台控制命令,参见#NETDEV_PTZ_E PTZ control commands, see #NETDEV_PTZ_E
	 * @param   dwSpeed              云台控制的速度,用户按不同解码器的速度控制值设置.取值范围[1,9] Speed of PTZ control, which is configured according to the speed control value of different decoders. Value ranges from 1 to 9.
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_PTZControl(Pointer lpPlayHandle, int dwPTZCommand, int dwSpeed);

	/**
	 * 获取云台预置位列表
	 * @param   lpUserID             用户登录ID User login ID
	 * @param   dwChannelID          通道号 Channel number
	 * @param   pstPresetList        预置位列表
	 * @return TRUE表示成功，其他表示失败
     * @note 支持Win32 支持VMS  
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_GetPTZPresetList(Pointer lpUserID, int  dwChannelID, NETDEV_PTZ_ALLPRESETS_S pstPresetList);

	/**
	 * 云台预置位操作(不需要启动预览)  PTZ preset operation (preview not required)
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   dwChannelID          通道号 Channel ID
	 * @param   dwPTZPresetCmd       操作云台预置位命令,参考枚举NETDEV_PTZ_PRESETCMD_E PTZ preset operation commands, see NETDEV_PTZ_PRESETCMD_E
	 * @param   pszPresetName        预置位的名称 Preset name
	 * @param   dwPresetID           预置位的序号（从1开始）,最多支持255个预置位. Preset number (starting from 1). Up to 255 presets are supported.
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_PTZPreset_Other(Pointer lpUserID, int dwChannelID, int dwPTZPresetCmd, String pszPresetName, int dwPresetID);

	/**
	 * 获取云台预置位巡航路径  Get PTZ preset patrol route
	 * @param    lpUserID            用户登录句柄 User login ID
	 * @param    dwChannelID         通道号 Channel ID
	 * @param [OUT]  pstCruiseList        巡航路径列表 Patrol route list
	 * @return  TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_PTZGetCruise(Pointer lpUserID, int dwChannelID, NETDEV_CRUISE_LIST_S pstCruiseList);

	/**
	 * 云台预置位巡航操作(不需要启动预览)  PTZ preset patrol operation (preview not required)
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   dwChannelID          通道号 Channel ID
	 * @param   dwPTZCruiseCmd       操作云台巡航命令,参考#NETDEV_PTZ_CRUISECMD_E  PTZ patrol operation commands, see #NETDEV_PTZ_CRUISECMD_E
	 * @param   pstCruiseInfo         云台巡航路径信息,参考#LPNETDEV_CRUISE_INFO_S  PTZ patrol route information, see #LPNETDEV_CRUISE_INFO_S
	 * @return  TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 * - 1.巡航路径,最多支持16条路径（序号从1开始） Patrol route. Up to 16 routes are supported (starting from 1).
	 * - 2.巡航点,最多支持32个点（序号从1开始） Patrol point. Up to 32 points are supported (starting from 1).
	 * - 3.预置位(最大255).时间(最大255).速度(最大40)  Preset (max 255), time (max 255) and speed (max 40).
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_PTZCruise_Other(Pointer lpUserID, int dwChannelID,int dwPTZCruiseCmd, NETDEV_CRUISE_INFO_S pstCruiseInfo);

	/**
	 * 获取云台轨迹巡航路径  Get PTZ patrol route
	 * @param    lpUserID            用户登录句柄 User login ID
	 * @param    dwChannelID         通道号 Channel ID
	 * @param [OUT]  pstTrackCruiseInfo        巡航路径列表,参考#LPNETDEV_PTZ_TRACK_INFO_S  Patrol route list, see #LPNETDEV_PTZ_TRACK_INFO_S
	 * @return  TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 支持win64 支持IPC
	 */
	public boolean NETDEV_PTZGetTrackCruise(Pointer lpUserID, int dwChannelID, NETDEV_PTZ_TRACK_INFO_S pstTrackCruiseInfo);

	/**
	 * 云台轨迹巡航操作(不需要启动预览)   PTZ route patrol operation (preview not required)
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   dwChannelID          通道号 Channel ID
	 * @param   dwPTZCruiseCmd       操作云台轨迹巡航命令,参考#NETDEV_PTZ_TRACKCMD_E  PTZ route patrol operation commands, see #NETDEV_PTZ_TRACKCMD_E
	 * @param [INOUT]  pszTrackCruiseName         轨迹巡航名称,建议长度#NETDEV_LEN_64  Route patrol name, suggested length #NETDEV_LEN_64
	 * @return  TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_PTZTrackCruise(Pointer lpUserID, int dwChannelID, int dwPTZTrackCruiseCmd, String pszTrackCruiseName);

	/**
	 * 查询指定月份的录像分布信息 Query video distribution information by month
	 * @param    lpUserID            用户登录句柄 User login ID
	 * @param    dwChannelID         通道号  Channel ID
	 * @param    pstMonthInfo        月份信息  Month information
	 * @param [OUT]   pstMonthStatus     月录像分布状态  Video status in the month
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.
	 * @note无
	 */
	public boolean NETDEV_QuickSearch(Pointer lpUserID, int dwChannelID, NETDEV_MONTH_INFO_S pstMonthInfo, NETDEV_MONTH_STATUS_S pstMonthStatus);

	/**
	 * 设置流畅性优先 Set pictuer fluency
	 * @param  lpPlayHandle         预览\回放句柄 Preview\playback handle
	 * @param  dwFluency           图像播放流畅性优先类型,参见枚举#NETDEV_PICTURE_FLUENCY_E
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetPictureFluency(Pointer lpPlayHandle, int dwFluency);

	/**
	 * 根据文件类型.时间查找设备录像文件  Query recording files according to file type and time
	 * @param   lpUserID     用户登录句柄 User login ID
	 * @param   pstFindCond    录像查询条件 Search condition
	 * @return 录像查询业务号,返回0表示失败,其他值作为NETDEV_FindClose等函数的参数.
	Recording search service number. 0 means failure. Other values are used as the handle parameters of functions like NETDEV_FindClose.
	 * @note 此函数返回值为录像查询业务号,若返回值为非0,则查询录像文件成功：
	 *         一.将上述业务号作为NETDEV_FindNextFile函数的入参lpFindHandle,多次调用NETDEV_FindNextFile函数,以逐个获取详细录像文件信息.
	 *         二.查询结束后,必须以上述业务号作为NETDEV_FindClose函数的入参lpFindHandle,调用NETDEV_FindClose函数,以释放资源,关闭查找.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public Pointer NETDEV_FindFile(Pointer lpUserID, NETDEV_FILECOND_S pstFindCond);

	/**
	 * 逐个获取查找到的文件信息  Obtain the information of found files one by one.
	 * @param   lpFindHandle     文件查找句柄 File search handle
	 * @param [OUT] pstFindData       保存文件信息的指针 Pointer to save file information
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_FindNextFile(Pointer lpFindHandle, NETDEV_FINDDATA_S pstFindData);

	/**
	 * 关闭文件查找,释放资源  Close file search and release resources
	 * @param  lpFindHandle  文件查找句柄 File search handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_FindClose(Pointer lpFindHandle);

	/**
	 * 按名称回放录像文件  Play back recording files by name
	 * @param  lpUserID          用户登录句柄 User login ID
	 * @param  pstPlayBackInfo   录像回放结构体指针,参考 LPNETDEV_PLAYBACKINFO_S Pointer to recording playback structure, see LPNETDEV_PLAYBACKINFO_S
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public Pointer NETDEV_PlayBackByName(Pointer lpUserID, NETDEV_PLAYBACKINFO_S pstPlayBackInfo);

	/**
	 * 按时间回放录像文件  Play back recording by time.
	 * @param  lpUserID          用户登录句柄 User login ID
	 * @param  pstPlayBackCond   按时间录像回放结构体指针  参考 LPNETDEV_PLAYBACKCOND_S Pointer to playback-by-time structure, see LPNETDEV_PLAYBACKCOND_S
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 支持Win32 支持VMS
	 * @note 要在NetDemo btnRecordPlay按钮事件指定传输协议类型	pstPlayBackInfo.dwLinkMode = NETDEV_TRANS_PROTOCAL_E.NETDEV_TRANS_PROTOCAL_TCP;
	 * @note 支持win64 支持NVR
	 */
	public Pointer NETDEV_PlayBackByTime(Pointer lpUserID, NETDEV_PLAYBACKCOND_S pstPlayBackInfo);

	/**
	 * 使用URL启动回放
	 * @param   lpUserID             用户登录句柄
	 * @param   pszUrl               码流URL
	 * @param   pstPlayBackCond      录像回放结构体指针,参考 LPNETDEV_PLAYBACKCOND_S
	 * @return 返回0表示失败,其他值作为NETDEV_StopPlayBack等函数的句柄参数
	 * @note
	 */
	public Pointer NETDEV_PlayBackByUrl(Pointer lpUserID, String pszUrl, NETDEV_PLAYBACKCOND_S pstPlayBackCond);

	/**
	 * 控制录像回放的状态  Control recording playback status.
	 * @param   lpPlayHandle     回放或下载句柄 Playback or download handle
	 * @param   dwControlCode    控制录像回放状态命令 参考枚举：NETDEV_VOD_PLAY_CTRL_E Command for controlling recording playback status, see NETDEV_VOD_PLAY_CTRL_E
	 * @param [INOUT]  lpBuffer     指向输入/输出参数的指针, 播放速度参考枚举：NETDEV_VOD_PLAY_STATUS_E,播放时间参数类型为：INT64 Pointer to input/output parameters. For playing speed, see NETDEV_VOD_PLAY_STATUS_E. The type of playing time: INT64.
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 开始.暂停.恢复播放时,lpBuffer置为NULL When playing, pause or resume videos, set IpBuffer as NULL.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_PlayBackControl(Pointer lpPlayHandle, int dwControlCode, LongByReference lpBuffer);

	/**
	 * 停止回放业务  Stop playback service
	 * @param  lpPlayHandle  回放句柄 Playback handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_StopPlayBack(Pointer lpPlayHandle);

	/**
	 * 按文件名下载录像文件 Download recordings by file name
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   pstPlayBackInfo      录像回放结构体指针,参考 LPNETDEV_PLAYBACKINFO_S Pointer to recording playback structure, see LPNETDEV_PLAYBACKINFO_S
	 * @param   *pszSaveFileName     下载后保存到PC机的文件路径,需为绝对路径（包括文件名） Downloaded file save path on PC, must be an absolute path (including file name)
	 * @param   dwFormat             录像文件保存格式 Recording file saving format
	 * @return 下载句柄, 返回0表示失败,其他值作为NETDEV_StopGetFile等函数的参数. Download handle. 0 means failure. Other values are used as the handle parameters of functions like NETDEV_StopGetFile.
	 * @note
	 */
	public Pointer NETDEV_GetFileByName(Pointer lpUserID, NETDEV_PLAYBACKINFO_S pstPlayBackInfo, String pszSaveFileName, int dwFormat);

	/**
	 * 按时间下载录像文件 Download recordings by time
	 * @param   lpUserID                用户登录句柄 User login ID
	 * @param   pstPlayBackCond   按时间录像回放结构体指针,参考 LPNETDEV_PLAYBACKCOND_S Pointer to playback-by-time structure, see LPNETDEV_PLAYBACKCOND_S
	 * @param   *pszSaveFileName        下载后保存到PC机的文件路径,需为绝对路径（包括文件名） Downloaded file save path on PC, must be an absolute path (including file name)
	 * @param   dwFormat                录像文件保存格式,NETDEV_MEDIA_FILE_FORMAT_E, Recording file saving format
	 * @return 下载句柄, 返回0表示失败,其他值作为NETDEV_StopGetFile等函数的参数. Download handle. 0 means failure. Other values are used as the handle parameters of functions like NETDEV_StopGetFile.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public Pointer NETDEV_GetFileByTime(Pointer lpUserID, NETDEV_PLAYBACKCOND_S pstPlayBackCond, String pszSaveFileName, int dwFormat);

	/**
	 * 停止下载录像文件 Stop downloading recording files
	 * @param   lpPlayHandle  回放句柄 Playback handle
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_StopGetFile(Pointer lpPlayHandle);

	/**
	 * 打开本地文件
	 * @param  pszFilename           播放文件名
	 * @return 返回0表示失败,其他值作为NETDEV_PlayMediaFile.NETDEV_StopPlayMediaFile等函数的句柄参数
	 * @note
	 */
	public Pointer NETDEV_OpenMediaFile(String pszFilename);

	/**
	 * 播放本地文件
	 * @param  lpPlayHandle       文件句柄,调用NETDEV_OpenMediaFile的返回值
	 * @param  dwPlayWnd          播放窗口句柄
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_StartPlayMediaFile(Pointer lpPlayHandle, Pointer lpPlayWnd);

	/**
	 * 停止播放本地文件业务
	 * @param  lpPlayHandle  回放句柄
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_StopPlayMediaFile(Pointer lpPlayHandle);

	/**
	 * 获取媒体文件时间总长度
	 * @param  lpPlayHandle  回放句柄
	 * @param  pdwTotalTime  媒体文件时间总长度（s）
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_GetMediaFileTime(Pointer lpPlayHandle, IntByReference pdwTotalTime);

	/**
	 * 查询组织信息列表
	 * @param  lpUserID          用户登录ID
	 * @param  pstFindCond       查找组织信息列表条件
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextOrgInfo、NETDEV_FindCloseOrgInfo等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindOrgInfoList(Pointer lpUserID, NETDEV_ORG_FIND_COND_S pstFindCond);

	/**
	 * 逐个获取查找到的组织信息
	 * @param   lpFindHandle                 查找句柄
	 * @param [OUT] pstOrgInfo                   保存组织信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextOrgInfo(Pointer lpFindHandle, NETDEV_ORG_INFO_S pstOrgInfo);

	/**
	 * 关闭查找 组织信息，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseOrgInfo(Pointer lpFindHandle);

	/**
	 * 添加组织
	 * @param  lpUserID              用户登录ID
	 * @param  pstOrgInfo            组织信息指针
	 * @param [OUT] dwOrgID             组织ID
	 * @return TRUE           表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_AddOrgInfo(Pointer lpUserID, NETDEV_ORG_INFO_S pstOrgInfo, IntByReference dwOrgID);
	/**
	 * 修改组织
	 * @param  lpUserID              用户登录ID
	 * @param  dwOrgID              组织ID
	 * @param  pstOrgInfo            组织信息指针
	 * @return TRUE           表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_ModifyOrgInfo(Pointer lpUserID, NETDEV_ORG_INFO_S pstOrgInfo);

	/**
	 * 批量删除组织
	 * @param  lpUserID             用户登录ID
	 * @param  pstOrgDelInfo       待删除组织信息指针
	 * @param [OUT] pstOrgDelResultInfo  删除组织响应信息指针
	 * @return TRUE           表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_BatchDeleteOrgInfo(Pointer lpUserID, NETDEV_DEL_ORG_INFO_S pstOrgDelInfo, NETDEV_ORG_BATCH_DEL_INFO_S pstOrgDelResultInfo);

	/**
	 * 通过组织ID查询通道信息列表
	 * @param  lpUserID          用户登录ID
	 * @param  dwOrgID           组织ID
	 * @param  dwChnType         通道类型，参见#NETDEV_CHN_TYPE_E
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextOrgChn、NETDEV_FindCloseOrgChn等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindOrgChnList(Pointer lpUserID, int dwOrgID,int dwChnType);

	/**
	 * 逐个获取查找到的 组织通道 信息
	 * @param   lpFindHandle                 查找句柄
	 * @param [OUT] pstOrgChnInfo                保存 组织通道 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextOrgChn(Pointer lpFindHandle, NETDEV_ORG_CHN_INFO_S pstOrgChnInfo);

	/**
	 * 关闭查找 组织通道信息，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseOrgChn(Pointer lpFindHandle);

	/**
	 * 通过设备ID或通道类型 查询通道信息列表
	 * @param  lpUserID          用户登录ID
	 * @param  dwDevID           设备ID
	 * @param  dwChnType         通道类型，参见# NETDEV_CHN_TYPE_E
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextDevChn、NETDEV_FindCloseDevChn等函数的参数。
	 * @note     1、只根据通道类型查询时，将设备ID设置为0.
	 */
	public Pointer NETDEV_FindDevChnList(Pointer lpUserID, int dwDevID,int dwChnType);

	/**
	 * 逐个获取查找到的 设备通道 信息
	 * @param   lpFindHandle         查找句柄
	 * @param [OUT] lpOutBuffer          接收数据的缓冲指针,NETDEV_CHN_TYPE_ENCODE对应NETDEV_DEV_CHN_ENCODE_INFO_S
	 * @param  dwOutBufferSize       接收数据的缓冲长度(以字节为单位)，不能为0
	 * @param [OUT] pdwBytesReturned     实际收到的数据长度指针，不能为NUL
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextDevChn(Pointer lpFindHandle, Pointer lpOutBuffer, int  dwOutBufferSize, IntByReference pdwBytesReturned);

	/**
	 * 关闭查找 设备通道信息，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_FindCloseDevChn(Pointer lpFindHandle);

	/**
	 * 通过 设备类型 查询 设备列表
	 * @param  lpUserID              用户登录ID
	 * @param  dwDevType             设备类型 参见#NETDEV_DEVICE_MAIN_TYPE_E
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextOrgInfo、NETDEV_FindCloseOrgInfo等函数的参数。
	 */
	public Pointer NETDEV_FindDevList(Pointer lpUserID, int dwDevType);

	/**
	 * 逐个获取查找到的 设备信息
	 * @param   lpFindHandle                 查找句柄
	 * @param [OUT] pstDevBasicInfo              保存 设备详细信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextDevInfo(Pointer lpFindHandle,NETDEV_DEV_BASIC_INFO_S pstDevBasicInfo);

	/**
	 * 关闭查找 设备信息，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_FindCloseDevInfo(Pointer lpFindHandle);

	/**
	 * 获取所有用户全部信息
	 * @param    lpUserID                    用户登录ID User login ID
	 * @param [OUT]   pstUserDetailList             用户信息 请参见结构体#LPNETDEV_USER_DETAIL_LIST_S
	 * @return TRUE表示成功,其他表示失败
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_GetUserDetailList(Pointer lpUserID, NETDEV_USER_DETAIL_LIST_S pstUserDetailList);

	/**
	 * 获取指定用户全部信息
	 * @param    lpUserID                    用户登录ID User login ID
	 * @param [INOUT]   pstUserDetailInfo             用户信息 请参见结构体#NETDEV_USER_DETAIL_INFO_S
	 * @return TRUE表示成功,其他表示失败
	 * @note   pstUserDetailInfo中的szUsername为入参
	 */
	public boolean NETDEV_GetUserDetailInfo(Pointer lpUserID,NETDEV_USER_DETAIL_INFO_S pstUserDetailInfo);

	/**
	 * 创建用户信息
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    pstUserDetailInfo             用户信息请参见结构体#NETDEV_USER_DETAIL_INFO_S
	 * @return TRUE表示成功,其他表示失败
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_CreateUser(Pointer lpUserID, NETDEV_USER_DETAIL_INFO_S pstUserDetailInfo);

	/**
	 * 修改用户信息
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    pstUserInfo             用户信息请参见结构体#NETDEV_USER_INFO_S
	 * @return TRUE表示成功,其他表示失败
	 *1、仅管理员用户支持修改权限，管理员用户修改其他用户信息不需要携带旧密码
	 *2、操作员及普通用户只能修改自己的密码
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_ModifyUser(Pointer lpUserID, NETDEV_USER_MODIFY_DETAIL_INFO_S pstUserInfo);

	/**
	 * 删除用户信息
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    pszUserName             用户名
	 * @return TRUE表示成功,其他表示失败
	 * @note 支持win64 支持NVR
	 * @note 
	 */
	public boolean NETDEV_DeleteUser(Pointer lpUserID, String pszUserName);

	/**
	 * 重启设备
	 * Restart device
	 * @param   lpUserID     用户登录句柄 User login ID
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 *
	 * */
	public boolean NETDEV_Reboot(Pointer lpUserID);

	/**
	 * 恢复出厂设置  Restore to factory default settings
	 * @param   lpUserID     用户登录句柄 User login ID
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note 保留网络配置和用户配置,其他参数恢复到出厂设置. Restore all parameters to factory settings, except network settings and user settings.
	 */
	public boolean NETDEV_RestoreConfig(Pointer lpUserID);

	/**
	 * 开启手动录像 Start manual record
	 * @param    lpUserID                用户登录句柄 User login ID
	 * @param    pstManualRecordCfg      手动录像参数信息 Manual record config
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.

     * @note 支持Win32 支持VMS
	*/
	public boolean NETDEV_StartManualRecord(Pointer lpUserID, NETDEV_MANUAL_RECORD_CFG_S stManualRecordCfg);

	/**
	 * 停止手动录像 Stop manual record
	 * @param    lpUserID                用户登录句柄 User login ID
	 * @param    pstManualRecordCfg      手动录像参数信息 Manual record config
	 * @return TRUE表示成功,其他表示失败 TRUE means success, any other value indicates failure.
     * @note 支持Win32 支持VMS
	 *
	 * */
	public boolean NETDEV_StopManualRecord(Pointer lpUserID, NETDEV_MANUAL_RECORD_CFG_S stManualRecordCfg);

	/**
	 * 修改设备名称 Set device name
	 * @param  lpUserID         用户登录句柄 User login ID
	 * @param  pszDeviceName    设备名称  Device name
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_ModifyDeviceName(Pointer lpUserID, String pszDeviceName);

	/**
	 * 获取设备的配置信息  Get configuration information of device
	 * @param    lpUserID                用户登录句柄 User login ID
	 * @param    dwChannelID             通道号 Channel ID
	 * @param    dwCommand               设备配置命令,参见# NETDEV_CONFIG_COMMAND_E  Device configuration commands, see #NETDEV_CONFIG_COMMAND_E
	 * @param [INOUT]  lpOutBuffer           接收数据的缓冲指针 Pointer to buffer that receives data
	 * @param [OUT]  dwOutBufferSize         接收数据的缓冲长度(以字节为单位),不能为0 Length (in byte) of buffer that receives data, cannot be 0.
	 * @param [OUT]  pdwBytesReturned        实际收到的数据长度指针,不能为NULL  Pointer to length of received data, cannot be NULL.
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 * - 1.巡航路径ID不可修改.  Route ID cannot be modified.
	 * - 2.新增巡航路径时,默认按顺序新增.  New routes are added one after another.
	 * - 3.删除.开始.停止巡航路径时,pstCruiseInfo中只需要填写巡航路径ID即可.  When deleting, starting or stoping a patrol route, enter route ID in pstCruiseInfo.
	 */
	public boolean NETDEV_GetDevConfig(Pointer  lpUserID,int dwChannelID,int dwCommand,Pointer lpOutBuffer,int dwOutBufferSize, IntByReference pdwBytesReturned);


	/**
	 * 设置设备的配置信息  Modify device configuration information
	 * @param    lpUserID            用户登录句柄 User login ID
	 * @param    dwChannelID         通道号 Channel ID
	 * @param    dwCommand           设备配置命令,参见#NETDEV_CONFIG_COMMAND_E  Device configuration commands, see #NETDEV_CONFIG_COMMAND_E
	 * @param    lpInBuffer          输入数据的缓冲指针 Pointer to buffer of input data
	 * @param    dwInBufferSize      输入数据的缓冲长度(以字节为单位) Length of input data buffer (byte)
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure
	 */
	public boolean NETDEV_SetDevConfig(Pointer  lpUserID,int dwChannelID,int dwCommand,Pointer lpInBuffer,int dwInBufferSize);

	/**
	 * 注册客流量统计上报回调函数 Register callback function that used for count passenger flow
	 * @param  lpUserID                 用户登录句柄  User login ID
	 * @param  cbPassengerFlowStatisticCallBack    需要注册的回调函数  NETDEV_PassengerFlowStatisticCallBack_PF
	 * @param  lpUserData                用户数据  User data
	 */
	public boolean NETDEV_SetPassengerFlowStatisticCallBack(Pointer lpUserID, NETDEV_PassengerFlowStatisticCallBack_PF cbPassengerFlowStatisticCallBack, Pointer lpUserData);

	/**
	 * 注册车牌识别上报回调函数
	 * @param  lpUserID                  用户登录句柄  User login ID
	 * @param  cbCarPlateCallBack         需要注册的回调函数 NETDEV_CarPlateCallBack_PF
	 * @param  lpUserData                用户数据  User data
	 */
	public boolean NETDEV_SetCarPlateCallBack(Pointer lpUserID, NETDEV_CarPlateCallBack_PF cbCarPlateCallBack, Pointer lpUserData);

	/**
	 * 注册人脸抓拍上报回调函数
	 * @param  lpUserID                 用户登录句柄  User login ID
	 * @param  cbFaceSnapshotCallBack    需要注册的回调函数NETDEV_FaceSnapshotCallBack_PF
	 * @param  lpUserData                用户数据  User data
	 */
	public boolean NETDEV_SetFaceSnapshotCallBack(Pointer lpUserID, NETDEV_FaceSnapshotCallBack_PF cbFaceSnapshotCallBack, Pointer lpUserData);

	/**
	 * 注册回调函数，接收报警消息等
	 * Register callback function and receive alarm information, etc.
	 * @param  lpUserID              用户登录ID User login ID
	 * @param  cbAlarmMessCallBack   回调函数NETDEV_AlarmMessCallBack_PF_V30
	 * @param  lpUserData            用户数据 User data
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
     * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_SetAlarmCallBack_V30(Pointer lpUserID, NETDEV_AlarmMessCallBack_PF_V30 cbAlarmMessCallBack, Pointer lpUserData);

	/**
	 * 注册sdk接收异常.重连等消息的回调函数  Callback function to register SDK, receive exception and reconnection messages, etc.
	 * @param  cbExceptionCallBack       接收异常消息的回调函数,回调当前异常的相关信息NETDEV_ExceptionCallBack_PF
	 * @param  lpUserData                用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetExceptionCallBack(NETDEV_ExceptionCallBack_PF cbExceptionCallBack, Pointer lpUserData);

	/**
	 * 注册结构化报警消息回调函数（同时回调登录ID,用以区分不同设备） Register callback function and receive alarm information, etc. (Call back login ID at the same time to distinguish different devices)
	 * @param  lpUserID                   用户登录句柄 User login ID
	 * @param  cbAlarmMessCallBack        回调函数 Callback function
	 * @param  lpUserData                 用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	boolean NETDEV_SetStructAlarmCallBack(Pointer lpUserID,NETDEV_StructAlarmMessCallBack_PF cbAlarmMessCallBack,Pointer lpUserData);

	/**
	 * 获取错误码  Get error codes
	 * @return 错误码 Error codes
	 * @note 支持Win32 支持VMS
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public int NETDEV_GetLastError();

	/**
	 * 查询所有人员库的容量信息
	 * @param   lpUserID     用户登录句柄 User login ID
	 * @param    dwTimeOut              连接超时时间
	 * @param [OUT]  pstCapacityList   所有人员库的容量信息
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_GetPersonLibCapacity(Pointer lpUserID, int dwTimeOut, NETDEV_PERSON_LIB_CAP_LIST_S pstCapacityList);

	/**
	 * 创建人员库信息                                Create Person libraries information
	 * @param   lpUserID                         用户登录句柄 User login ID
	 * @param   pstLibraryList                   人员库信息 Person library information
	 * @param [OUT]  *pudwID                         创建库生成的库ID create library generated libry ID
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_CreatePersonLibInfo(Pointer lpUserID, NETDEV_LIB_INFO_S pstPersonLibInfo, IntByReference pudwID);

	/**
	 * 查询所有已创建的人员库信息 Get all Person libraries information
	 * @param   lpUserID         用户登录句柄 User login ID
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextPersonLibInfo、NETDEV_FindClosePersonLibList等函数的参数。
	 * @note无
	 */
	public Pointer NETDEV_FindPersonLibList(Pointer lpUserID);

	/**
	 * 逐个获取查找到的 人脸库 信息
	 * @param   lpFindHandle           查找句柄
	 * @param [OUT] pstPersonLibInfo       保存 人脸库 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextPersonLibInfo(Pointer lpFindHandle, NETDEV_LIB_INFO_S pstPersonLibInfo);

	/**
	 * 关闭查找 人脸库，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindClosePersonLibList(Pointer lpFindHandle);


	/**
	 * 修改人员库信息  Modify Person libraries information
	 * @param   lpUserID         用户登录句柄 User login ID
	 * @param   pstLibraryList   人员库信息 Person library information
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_ModifyPersonLibInfo(Pointer lpUserID, NETDEV_PERSON_LIB_LIST_S pstPersonLibList);

	/**
	 * 删除指定的人员库    Delete designated Person libraries information
	 * @param   lpUserID     用户登录句柄 User login ID
	 * @param   udwPersonLibID   人员库ID Person library ID
	 * @param   pstFlagInfo   人员库删除标志
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_DeletePersonLibInfo(Pointer lpUserID, int udwPersonLibID, NETDEV_DELETE_DB_FLAG_INFO_S pstFlagInfo);

	/**
	 * 条件查询人员信息
	 * @param  lpUserID 用户登录句柄
	 * @param  udwPersonLibID 人员库ID
	 * @param  pstQueryInfo 人脸信息查询条件
	 * @param [OUT] pstQueryResultInfo 人脸信息查询返回结果
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextPersonInfo、NETDEV_FindClosePersonInfoList等函数的参数
	 * @note
	 */
	public Pointer NETDEV_FindPersonInfoList(Pointer lpUserID, int udwPersonLibID, NETDEV_PERSON_QUERY_INFO_S pstQueryInfo,  NETDEV_BATCH_OPERATE_BASIC_S pstQueryResultInfo);

	/**
	 * 逐个获取查找到的 人员 信息
	 * @param   lpFindHandle            查找句柄
	 * @param [OUT] pstPersonInfo          保存 人员信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextPersonInfo(Pointer lpFindHandle, NETDEV_PERSON_INFO_S pstPersonInfo);

	/**
	 * 关闭查找 人员信息，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindClosePersonInfoList(Pointer lpFindHandle);


	/**
	 * 新增指定的人员信息 Add designated Person information
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   udwPersonLibID       人员库ID Person library ID
	 * @param   pstPersonInfoList    人员信息列表 Person information list
	 * @param [OUT]  pstPersonResultList 人员信息结果列表 Person information result list
	 * @return TRUE表示成功,其他表示失败
	 * @note pstPersonResultList->pstPersonList need malloc by caller
	keep pstPersonResultList->udwNum == pstPersonInfoList->udwNum
	 */
	public boolean NETDEV_AddPersonInfo(Pointer lpUserID, int udwPersonLibID, NETDEV_PERSON_INFO_LIST_S pstPersonInfoList, NETDEV_PERSON_RESULT_LIST_S pstPersonResultList);

	/**
	 * 修改指定的人员信息 Modify designated Person information
	 * @param   lpUserID             用户登录句柄 User login ID
	 * @param   udwPersonLibID       人员库ID Person library ID
	 * @param   pstPersonInfoList    人员信息列表 Person information list
	 * @param [OUT]  pstPersonResultList 人员信息结果列表 Person information result list
	 * @return TRUE表示成功,其他表示失败
	 * @note pstPersonResultList->pstPersonList need malloc by caller
	keep pstPersonResultList->udwNum == pstPersonInfoList->udwNum
	 */
	public boolean NETDEV_ModifyPersonInfo(Pointer lpUserID, int udwPersonLibID, NETDEV_PERSON_INFO_LIST_S pstPersonInfoList, NETDEV_PERSON_RESULT_LIST_S pstPersonResultList);

	/**
	 * 删除指定的人员信息 Delete designated Person information
	 * @param   lpUserID         用户登录句柄 User login ID
	 * @param   udwPersonLibID   人员库ID Person library ID
	 * @param   udwPersonID      人员ID Person ID
	 * @param   udwLastChange    最后修改时间 Last modify time
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_DeletePersonInfo(Pointer lpUserID, int udwPersonLibID, int udwPersonID, int udwLastChange);

	/**
	 * 批量删除人员信息
	 * @param  lpUserID             用户登录ID
	 * @param  udwPersonLibID       人脸库ID
	 * @param  pstIDList            人脸成员列表
	 * @param [OUT] pstBatchList        批量操作返回信息
	 * @return 查询句柄,返回0表示失败，
	 * @note 仅VMS支持
	 */
	public boolean NETDEV_DeletePersonInfoList(Pointer lpUserID, int udwPersonLibID, NETDEV_BATCH_OPERATE_MEMBER_LIST_S pstIDList, NETDEV_BATCH_OPERATOR_LIST_S pstResutList);

	/**
	 * 查询人脸识别记录
	 * @param   lpUserID                   用户登录ID
	 * @param   pstFindCond                查询条件
	 * @param [OUT] pstResultInfo              人脸识别记录信息
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindFaceNextRecordDetail、NETDEV_FindFaceCloseRecordDetail等函数的参数。
	 * @note     查询完成之后需要保证调用NETDEV_FindFaceNextRecordDetail将所有数据取出，否则会造成内存泄露
	 */
	public Pointer NETDEV_FindFaceRecordDetailList(Pointer lpUserID, NETDEV_ALARM_LOG_COND_LIST_S pstFindCond, NETDEV_SMART_ALARM_LOG_RESULT_INFO_S  pstResultInfo);

	/**
	 * 逐个获取查找到的 人脸识别记录信息
	 * @param   lpFindHandle                    查找句柄
	 * @param [OUT] pstRecordInfo                   保存 人脸识别记录 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextFaceRecordDetail(Pointer lpFindHandle, NETDEV_FACE_RECORD_SNAPSHOT_INFO_S pstRecordInfo);

	/**
	 * 关闭查找 人脸识别记录，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseFaceRecordDetail(Pointer lpFindHandle);



	/**
	 * 查询所有人脸布控任务
	 * @param   lpUserID              用户登录ID
	 * @param   udwChannelID          通道ID，仅NVR查询通道布控信息时使用
	 * @param   pstQueryInfo          查询条件，仅NVR支持
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextPersonMonitorInfo、NETDEV_FindClosePersonMonitorList等函数的参数
	 * @note
	 */
	public Pointer NETDEV_FindPersonMonitorList(Pointer lpUserID, int udwChannelID, NETDEV_MONITOR_QUERY_INFO_S pstQueryInfo);

	/**
	 * 逐个获取查找到的 布控任务 信息
	 * @param   lpFindHandle            查找句柄
	 * @param [OUT] pstMonitorInfo          保存 布控任务 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 *.      返回NETDEV_E_NEED_MORE_MEMORY说明分配不足，并返回实际应申请的内存大小；涉及的数据：pstMonitorInfo->udwLinkStrategyNum、
	pstMonitorInfo->stMonitorRuleInfo.udwChannelNum
	 */
	public boolean NETDEV_FindNextPersonMonitorInfo(Pointer lpFindHandle, NETDEV_MONITION_INFO_S pstMonitorInfo);

	/**
	 * 关闭查找 布控任务，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindClosePersonMonitorList(Pointer lpFindHandle);

	/**
	 * 新增单个人脸布控任务
	 * @param     lpUserID                      用户登录ID
	 * @param [INOUT]    pstMonitorInfo                保存 布控任务 信息的指针  成功返回布控任务序号
	 * @param [INOUT] pstMonitorResultInfo          添加布控后设备返回的实际布控结果
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note  pstMonitorResultInfo->udwChannelNum不应小于pstMonitorInfo stMonitorRuleInfo.udwChannelNum
	pstMonitorResultInfo->udwChannelNum must be Greater thanpstMonitorInfo stMonitorRuleInfo.udwChannelNum
	 */
	public boolean NETDEV_AddPersonMonitorInfo(Pointer lpUserID, NETDEV_MONITION_INFO_S pstMonitorInfo, NETDEV_MONITOR_RESULT_INFO_S pstMonitorResultInfo);

	/**
	 * 删除单个人脸布控任务
	 * @param   lpUserID                      用户登录ID
	 * @param   udwID                          布控ID
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_DeletePersonMonitorInfo(Pointer lpUserID, int udwID);

	/**
	 * 批量删除人脸布控任务
	 * @param   lpUserID                      用户登录ID
	 * @param [INOUT] pstResultList               返回信息列表  输入布控要删除的所有布控ID
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_BatchDeletePersonMonitorInfo(Pointer lpUserID,  NETDEV_BATCH_OPERATOR_LIST_S pstResultList);

	/**
	 * 查询单个人脸布控任务配置信息
	 * @param   lpUserID                    用户登录ID
	 * @param [INOUT] pstMonitorInfo            保存 布控任务 信息的指针，输入布控ID，成功返回配置信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note pudwMonitorChlIDList由上层申请；接口失败(NETDEV_E_NEED_MORE_MEMORY)时通过udwChannelNum判断是否内存申请过小
	 */
	public boolean NETDEV_GetPersonMonitorRuleInfo(Pointer lpUserID, NETDEV_MONITION_INFO_S pstMonitorInfo);

	/**
	 * 设置单个人脸布控任务配置信息
	 * @param   lpUserID                    用户登录ID
	 * @param  pstMonitorInfo               保存 布控任务 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetPersonMonitorRuleInfo(Pointer lpUserID, NETDEV_MONITION_INFO_S pstMonitorInfo);


	/**
	 * 注册速人脸报警消息回调函数（同时回调登录ID,用以区分不同设备） Register callback function and receive alarm information, etc. (Call back login ID at the same time to distinguish different devices)
	 * @param  lpUserID                   用户登录句柄 User login ID
	 * @param  cbAlarmMessCallBack        回调函数 Callback function
	 * @param  lpUserData                 用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean  NETDEV_SetPersonAlarmCallBack(Pointer lpUserID, NETDEV_PersonAlarmMessCallBack_PF cbAlarmMessCallBack, Pointer lpUserData);

	/**
	 * 订阅智能事件
	 * @param  lpUserID              用户登录ID
	 * @param  pstSubscribeInfo      订阅信息
	 * @param [INOUT] pstSmartInfo       智能事件信息，成功返回订阅ID
	 * @return TRUE表示成功，其他表示失败
	 * @note   订阅前需要先调用NETDEV_SetAlarmCallBack_V30接口注册回调函数
	 * -
	 */
	public boolean NETDEV_SubscribeSmart(Pointer lpUserID,  NETDEV_SUBSCRIBE_SMART_INFO_S pstSubscribeInfo, NETDEV_SMART_INFO_S pstSmartInfo);

	/**
	 * 取消订阅智能事件
	 * @param  lpUserID            用户登录ID
	 * @param  pstSmartInfo         智能事件
	 * @return TRUE表示成功，其他表示失败
	 * @note
	 * -
	 */
	public boolean NETDEV_UnsubscribeSmart(Pointer lpUserID, NETDEV_SMART_INFO_S pstSmartInfo);

	/**
	 * LAPI告警订阅
	 * @param  lpUserID                                      用户登录句柄
	 * @param  pstSubInfo           告警订阅请求
	 * @param [OUT] pstSubSuccInfo  订阅成功返回信息
	 * @return TRUE表示成功,其他表示失败
	 * @note Type字段指定订阅类型
	 */
	public boolean NETDEV_SubscibeLapiAlarm(Pointer lpUserID, NETDEV_LAPI_SUB_INFO_S pstSubInfo, NETDEV_SUBSCRIBE_SUCC_INFO_S pstSubSuccInfo);

	/**
	 * 取消LAPI告警订阅
	 * @param  lpUserID               用户登录句柄
	 * @param  udwID           告警订阅ID
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_UnSubLapiAlarm(Pointer lpUserID, int udwID);

	/**
	 * 获取系统图片信息
	 * @param    lpUserID                     用户登录ID User login ID
	 * @param    pszURL                       图片URL picture url
	 * @param    udwSize                      加密前数据大小
	 * @param [OUT]   pszdata                     图片数据(需动态分配内存) picture data
	 * @return TRUE表示成功，其他表示失败
	 * @note无
	 */
	public boolean NETDEV_GetSystemPicture(Pointer lpUserID, Pointer pszURL, int udwSize, Pointer pszdata);

	/**
	 * 查询单个人脸识别记录的人脸图片信息
	 * @param   lpUserID                    用户登录ID
	 * @param  udwRecordID                  人脸识别告警记录ID
	 * @param  udwFaceImageType              人脸通行记录类型
	 * @param [OUT] pstFileInfo                 人脸图片信息
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextFaceRecordDetail、NETDEV_FindCloseFaceRecordDetail等函数的参数。
	 * @note     查询完成之后需要保证调用NETDEV_FindNextFaceRecordDetail将所有数据取出，否则会造成内存泄露
	 */
	public boolean NETDEV_GetFaceRecordImageInfo(Pointer lpUserID, int udwRecordID, int udwFaceImageType, NETDEV_FILE_INFO_S pstFileInfo);

	/**
	 * 查询全部车辆库信息列表
	 * @param  lpUserID          用户登录ID
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextVehicleLibInfo、NETDEV_FindCloseVehicleLibList等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindVehicleLibList(Pointer lpUserID);

	/**
	 * 逐个获取查找到的 车辆库 信息
	 * @param   lpFindHandle           查找句柄
	 * @param [OUT] pstVehicleLibInfo      保存 车辆库 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextVehicleLibInfo(Pointer lpFindHandle, NETDEV_LIB_INFO_S pstVehicleLibInfo);

	/**
	 * 关闭查找 车辆库，释放资源
	 close finding vehicleDB Release resources
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseVehicleLibList(Pointer lpFindHandle);

	/**
	 * 新增单个车辆库信息
	 * add vehicleDB information
	 * @param  lpUserID                   用户登录ID User login ID
	 * @param [INOUT] pstVehicleLibInfo       车库信息VehicleDB info
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_AddVehicleLibInfo(Pointer lpUserID, NETDEV_LIB_INFO_S pstVehicleLibInfo );



	/**
	 * 修改指定的车辆库信息
	 * Modify the specified vehicleDB information
	 * @param  lpUserID                  用户登录ID User login ID
	 * @param  pstVehicleLibList         车辆库列表 Vehicle Lib List
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_ModifyVehicleLibInfo(Pointer lpUserID, NETDEV_PERSON_LIB_LIST_S pstVehicleLibList);

	/**
	 * 删除指定的车辆库信息
	 * delete the specified vehicleDB information
	 * @param  lpUserID                   用户登录ID User login ID
	 * @param  udwVehicleLibID            车辆库ID Vehicle DB ID
	 * @param  pstDelLibFlag              删除库信息的标志位
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_DeleteVehicleLibInfo(Pointer lpUserID, int udwVehicleLibID, NETDEV_DELETE_DB_FLAG_INFO_S pstDelLibFlag);

	/**
	 * 批量添加车辆成员信息
	 * @param  lpUserID                用户登录ID
	 * @param  udwLibID                车辆库ID
	 * @param  pstVehicleMemberList    车辆信息列表
	 * @param [OUT] pstResultList          批量添加返回结果信息列表
	 * @return 查询句柄,返回0表示失败，
	 * @note
	 */
	public boolean NETDEV_AddVehicleMemberList(Pointer lpUserID, int udwLibID, NETDEV_VEHICLE_INFO_LIST_S pstVehicleMemberList,
											   NETDEV_BATCH_OPERATOR_LIST_S pstResultList);

	/**
	 * 获取单个车辆成员详细信息
	 * get vehicleDB information
	 * @param  lpUserID                        用户登录ID User login ID
	 * @param  udwVehicleID                    车辆IDVehicle ID
	 * @param [OUT] pstVehicleDetailInfo           车辆详细信息 Vehicle Detail info
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetVehicleMemberInfo(Pointer lpUserID, int udwVehicleID, NETDEV_VEHICLE_DETAIL_INFO_S pstVehicleDetailInfo);

	/**
	 * 删除指定车辆成员信息
	 * @param  lpUserID                  用户登录ID
	 * @param  udwLibID                  车辆库ID
	 * @param  udwVehicleID              车辆ID
	 * @return 查询句柄,返回0表示失败，
	 * @note
	 */
	public boolean NETDEV_DelVehicleInfo(Pointer lpUserID, int udwLibID, int udwVehicleID);

	/**
	 * 批量删除车辆成员信息
	 * @param  lpUserID                  用户登录ID
	 * @param  udwLib                    库序号
	 * @param  pstVehicleMemberList      车辆成员列表
	 * @param [OUT] pstBatchList             批量操作返回信息
	 * @return 查询句柄,返回0表示失败，
	 * @note
	 */
	public boolean NETDEV_DelVehicleMemberList(Pointer lpUserID, int udwLib,
											   NETDEV_VEHICLE_INFO_LIST_S pstVehicleMemberList,
											   NETDEV_BATCH_OPERATOR_LIST_S pstBatchList);

	/**
	 * 修改指定车辆库中车辆信息
	 * modify vehicleDB information
	 * @param  lpUserID                        用户登录ID User login ID
	 * @param  udwVehicleLibID                 车辆库IDVehicle ID
	 * @param  pstVehicleDetailInfo            车辆详细信息 Vehicle Detail info
	 * @param [OUT] pstResultList                  批量操作返回信息 Batch operate result info
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_ModifyVehicleMemberInfo(Pointer lpUserID, int udwVehicleLibID,
												  NETDEV_VEHICLE_INFO_LIST_S pstVehicleMemberList,
												  NETDEV_BATCH_OPERATOR_LIST_S pstResultList);

	/**
	 * 条件查询车辆成员详细信息
	 * @param   lpUserID         用户登录ID
	 * @param   udwVehicleLibID  库序号
	 * @param   pstFindCond      查询条件
	 * @param [OUT] pstFaceDBList    人脸库基本信息
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextVehicleMemberDetail、NETDEV_FindCloseVehicleMemberDetail等函数的参数。
	 * @note    1、人脸库中成员的基本信息由NETDEV_FindNextVehicleMemberDetail查询返回，pstFaceDBList只带回成员的基本信息
	 *@           2、调用成功后需要调用NETDEV_FindNextVehicleMemberDetail将数据取完，否则会出现内存泄露
	 */
	public Pointer NETDEV_FindVehicleMemberDetailList(Pointer lpUserID,  int udwVehicleLibID,
													  NETDEV_PERSON_QUERY_INFO_S pstFindCond,
													  NETDEV_BATCH_OPERATE_BASIC_S pstDBMemberList);

	/**
	 * 逐个获取查找到的 车辆成员 信息
	 * @param   lpFindHandle           查找句柄
	 * @param [OUT] pstFaceMemberInfo      保存 车辆库中成员 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextVehicleMemberDetail(Pointer lpFindHandle, NETDEV_VEHICLE_DETAIL_INFO_S pstVehicleMemberInfo);

	/**
	 * 关闭查找 车辆成员，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseVehicleMemberDetail(Pointer lpFindHandle);

	/**
	 * 条件查询车辆识别记录的详细信息
	 * @param   lpUserID                    用户登录ID
	 * @param  pstFindCond                  查询条件
	 * @param [OUT] pstResultInfo               查询的记录信息
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindVehicleNextRecordInfo、NETDEV_FindVehicleCloseRecordInfo等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindVehicleRecordInfoList(Pointer lpUserID, NETDEV_ALARM_LOG_COND_LIST_S pstFindCond,
													NETDEV_SMART_ALARM_LOG_RESULT_INFO_S  pstResultInfo);

	/**
	 * 逐个获取查找到的车辆识别记录信息
	 * @param   lpFindHandle                    查找句柄
	 * @param [OUT] pstRecordInfo                   保存车辆识别记录信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	图片数据需要取出另存，否则在调用NETDEV_FindVehicleCloseRecordInfo接口后内存将被释放
	 */
	public boolean NETDEV_FindNextVehicleRecordInfo(Pointer lpFindHandle, NETDEV_VEHICLE_RECORD_INFO_S pstRecordInfo);

	/**
	 * 关闭查找车辆识别记录，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseVehicleRecordList(Pointer lpFindHandle);

    /**
	* 条件查询非机动车通行记录
	* @param   lpUserID                     用户登录ID
	* @param   pstFindCond                  查询条件
	* @param [OUT] pstResultInfo                查询结果
	* @return                                   查询句柄,返回0表示失败，其他值作为NETDEV_FindNextNonVehRecordInfo、NETDEV_FindCloseNonVehRecordList等函数的参数。
	* @note
	*/
	public Pointer NETDEV_FindNonVehRecordList(Pointer lpUserID, NETDEV_ALARM_LOG_COND_LIST_S pstFindCond, NETDEV_BATCH_OPERATE_BASIC_S  pstResultInfo);

	/**
	* 逐个获取查找到的非机动车信息
	* @param   lpFindHandle                    查找句柄
	* @param [OUT] pstRecordInfo                   条件查询非机动车通行记录的指针
	* @return                                      TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	* @note                                        返回失败说明查询结束 A returned failure indicates the end of search.
	                                               图片数据需要取出另存，否则在调用NETDEV_FindCloseNonVehRecordList接口后内存将被释放
	*/
	public boolean NETDEV_FindNextNonVehRecordInfo(Pointer lpFindHandle, NETDEV_NON_MOTOR_VEH_RECORD_S pstRecordInfo);

	/**
	* 关闭查找查询非机动车通行记录释放资源
	* @param  lpFindHandle                     文件查找句柄
	* @return                                      TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	* @note
	*/
	public boolean NETDEV_FindCloseNonVehRecordList(Pointer lpFindHandle);

	/**
	 * 查询单个车辆识别记录的车辆图片信息
	 * @param   lpUserID                    用户登录ID
	 * @param  udwRecordID                  车辆识别记录ID
	 * @param [INOUT] pstFileInfo                 车辆图片信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note  pstFileInfo内存由使用者维护，入参时需指定udwSize大小，内存不够调用失败时，udwSize会返回实际需要大小
	对应错误码：NETDEV_E_NEED_MORE_MEMORY   用户分配内存不够；
	 */
	public boolean NETDEV_GetVehicleRecordImageInfo(Pointer lpUserID, int udwRecordID, NETDEV_FILE_INFO_S pstFileInfo);

	/**
	 * 向指定的车辆库中批量划归车辆成员
	 * .Batch assigned to the vehicle member in the specified database
	 * @param  lpUserID                  用户登录ID User login ID
	 * @param  udwVehicleLibID           车辆库ID CaVehicleLibID
	 * @param  pstMemberList             批量划归车辆成员ID信息 Batch assigned vehicle member ID information
	 * @param [OUT] pstBatchResultList               批量划归车辆信息返回结果 Batch assigned vehicle member ID result
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_AddVehicleLibMember(Pointer lpUserID, int udwVehicleLibID,
											  NETDEV_BATCH_OPERATE_MEMBER_LIST_S pstMemberList,
											  NETDEV_BATCH_OPERATOR_LIST_S pstBatchResultList);

	/**
	 * 批量取消指定的车辆库中车辆成员划归
	 * .Batch cancellation to the vehicle member in the specified database
	 * @param  lpUserID                  用户登录ID User login ID
	 * @param  udwVehicleLibID           车辆库ID VehicleLibID
	 * @param  pstMemberList             批量取消车辆成员ID信息 Batch cancellation vehicle member ID information
	 * @param [OUT] pstBatchResultList               批量取消车辆信息返回结果 Batch cancellation vehicle member ID result
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_DeleteVehicleLibMember(Pointer lpUserID, int udwVehicleLibID,
												 NETDEV_BATCH_OPERATE_MEMBER_LIST_S pstMemberList,
												 NETDEV_BATCH_OPERATOR_LIST_S pstBatchResultList);

	/**
	 * 新增单个车辆布控任务
	 * @param   lpUserID                      用户登录ID
	 * @param [INOUT]  pstMonitorInfo                布控任务信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 车辆布控比对照片不超过2M,内存由使用者维护
	udwMonitorID 车辆布控任务序号此处作为出参使用，其余参数为入参
	 */
	public boolean NETDEV_AddVehicleMonitorInfo(Pointer lpUserID, NETDEV_MONITION_INFO_S pstMonitorInfo);

	/**
	 * 批量删除车辆布控任务
	 * @param   lpUserID用户登录ID
	 * @param [INOUT] pstBatchList              信息列表
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_DeleteVehicleMonitorInfo(Pointer lpUserID, NETDEV_BATCH_OPERATOR_LIST_S pstBatchList);

	/**
	 * 查询车辆识别的所有布控任务
	 * @param   lpUserID              用户登录ID
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextVehicleMonitorInfo、NETDEV_FindCloseVehicleMonitorInfo等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindVehicleMonitorList(Pointer lpUserID);

	/**
	 * 逐个获取查找到的车辆布控任务信息
	 * @param   lpFindHandle            查找句柄
	 * @param [OUT] pstMonitorInfo          保存 布控任务 信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note  车辆布控比对照片内存由使用者维护，入参时，需要指定接收图片缓存大小，失败时会返回实际需要的大小
	如果没有布控图片时，布控图片的大小将会被置为0;
	图片数据需要取出另存，否则在调用NETDEV_FindVehicleCloseRecordInfo接口后内存将被释放;
	 */
	public boolean NETDEV_FindNextVehicleMonitorInfo(Pointer lpFindHandle, NETDEV_MONITION_INFO_S pstVehicleMonitorInfo);

	/**
	 * 关闭查找车辆布控任务，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseVehicleMonitorList(Pointer lpFindHandle);

	/**
	 * 查询单个车辆布控任务配置信息
	 * @param   lpUserID                    用户登录ID
	 * @param   udwID                       车辆布控ID
	 * @param [INOUT] pstMonitorInfo            布控任务信息 输入布控ID,成功时返回配置信息
	udwMonitorID 车辆布控任务序号 IN
	stMonitorRuleInfo 车辆布控任务配置信息 OUT
	stMonitorRuleInfo.stVehicleImage.udwSize 文件大小 INOUT
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 车辆布控比对照片内存由使用者维护，入参时，需要指定接收图片缓存大小，失败时会返回实际需要的大小
	对应错误码：NETDEV_E_NEED_MORE_MEMORY   用户分配内存不够；
	如果没有布控图片时，布控图片的大小将会被置为0;
	 */
	public boolean NETDEV_GetVehicleMonitorInfo(Pointer lpUserID, int udwID, NETDEV_MONITION_RULE_INFO_S pstMonitorInfo);

	/**
	 * 设置单个车辆布控任务配置信息
	 * @param   lpUserID                    用户登录ID
	 * @param   udwID                       车辆布控ID
	 * @param  pstMonitorInfo            布控任务信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 车辆布控比对照片不超过2M,内存由使用者维护
	 */
	public boolean NETDEV_SetVehicleMonitorInfo(Pointer lpUserID, int udwID, NETDEV_MONITION_RULE_INFO_S pstMonitorInfo);

	/**
	 * 注册回调函数，接收车牌识别报警消息等
	 * Register callback function and receive alarm information, etc.
	 * @param  lpUserID                     用户登录ID User login ID
	 * @param  cbVehicleAlarmMessCallBack   回调函数 Callback function
	 * @param  lpUserData                   用户数据 User data
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetVehicleAlarmCallBack(Pointer lpUserID, NETDEV_VehicleAlarmMessCallBack_PF cbVehicleAlarmMessCallBack, Pointer lpUserData);

	/**
	 * 注册回调函数，接收停车场事件信息等
	 * @param  lpUserID                     用户登录ID
	 * @param  cbParkAlarmMessCallBack      接收数据回调函数
	 * @param  lpUserData                   用户数据
	 * @return TRUE表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_SetParkEventCallBack(Pointer lpUserID, NETDEV_ParkEventMessCallBack_PF cbParkAlarmMessCallBack, Pointer lpUserData);





	/**
	 * 下发第三方支付订单
	 * @param    lpUserID                     用户登录ID User login ID
	 * @param    pstPayOrder                  订单信息   Order information
	 * @param [OUT]  pstCost                      停车费用信息 Parking cost information
	 * @return TRUE表示成功，其他表示失败
	 * @note无
	 */
	public boolean NETDEV_IssuePayOrder(Pointer lpUserID, NETDEV_PARK_PAY_ORDER_INFO_S pstPayOrder, NETDEV_PARK_COST_S pstCost);


	/**
	 * 注册速通门报警消息回调函数（同时回调登录ID,用以区分不同设备） Register callback function and receive alarm information, etc. (Call back login ID at the same time to distinguish different devices)
	 * @param  lpUserID                   用户登录句柄 User login ID
	 * @param  cbAlarmMessCallBack        回调函数 Callback function
	 * @param  lpUserData                 用户数据 User data
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetAlarmFGCallBack(Pointer lpUserID, NETDEV_AlarmMessFGCallBack_PF cbAlarmMessCallBack, Pointer lpUserData);

	/**
	 * 查看门禁授权组列表
	 * @param  lpUserID                                      用户登录ID
	 * @param  pstFindCond                                   查询条件
	 * @param [OUT] pstResultInfo                                实际查询结果
	 * @return 查询句柄，返回NULL表示失败，其他作为NETDEV_FindNextACSPermissionGroupInfo,NETDEV_FindCloseACSPermissionGroupInfo等函数的参数
	 * @note 查询之后需要调用NETDEV_FindNextACSPermissionGroupInfo和NETDEV_FindCloseACSPermissionGroupInfo将数据获取完，否则会造成内存泄露
	 */
	public Pointer NETDEV_FindACSPermissionGroupList(Pointer lpUserID, NETDEV_PERSON_QUERY_INFO_S pstQueryCond, NETDEV_BATCH_OPERATE_BASIC_S pstResultInfo);
	/**
	 * 获取下一条记录
	 * @param  lpFindHandle                              门禁授权组列表信息列表句柄
	 * @param [OUT] pstACSPermissionInfo                     门禁授权组列表信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextACSPermissionGroupInfo( Pointer lpFindHandle,NETDEV_ACS_PERMISSION_INFO_S pstACSPermissionInfo);

	/**
	 * 关闭查询记录资源
	 * @param  lpFindHandle                                  门禁授权组列表句柄
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseACSPermissionGroupList(Pointer lpFindHandle);

	/**
	 * 添加人员授权组信息
	 * @param  lpUserID                 用户登录ID
	 * @param  pstPermissionGroupInfo        授权组信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_AddACSPersonPermissionGroup(Pointer lpUserID, NETDEV_ACS_PERMISSION_INFO_S pstPermissionGroupInfo,IntByReference pUdwGroupID);
	/**
	 * 修改人员授权组信息
	 * @param  lpUserID                 用户登录ID
	 * @param  pstPermissionInfo        授权组信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_ModifyACSPersonPermissionGroup(Pointer lpUserID, NETDEV_ACS_PERMISSION_INFO_S pstPermissionInfo);
	/**
	 * 删除人员授权组信息
	 * @param  lpUserID                 用户登录ID
	 * @param  pstPermissionIDList      权限ID数组
	 * @param [INOUT]
	 * @param [OUT]
	 * @return
	 */
	public boolean NETDEV_DeleteACSPersonPermissionGroup(Pointer lpUserID, NETDEV_OPERATE_LIST_S pstPermissionIDList,NETDEV_BATCH_OPERATOR_LIST_S pstResutList);

	/**
	 * 获取单个授权组信息
	 * @param  lpUserID                                              用户登录ID
	 * @param  udwPermissionGroupID                                  授权组id
	 * @param [INOUT] pstAcsPerssionInfo                                 权限组信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetSinglePermGroupInfo(Pointer lpUserID,int udwPermissionGroupID,NETDEV_ACS_PERMISSION_INFO_S pstAcsPerssionInfo);


	/**
	 * 门禁人员管理
	 * @param  lpUserID                                      用户登录ID
	 * @param  dwCommand                                     门禁人员管理命令可参考#NETDEV_ACS_PERSON_COMMOND_TYPE_E
	 * @param [INOUT] pstACSPersonInfo                           门禁人员信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_ACSPersonCtrl(Pointer lpUserID,int dwCommand,NETDEV_ACS_PERSON_INFO_S pstACSPersonInfo);

	/**
	 * 批量添加人员信息
	 * @param  lpUserID                 用户登录ID
	 * @param  pstACSPersonList         人员列表   其中单张图片大小为2M
	 * @param [OUT] pstResultList           返回列表
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_AddACSPersonList(Pointer lpUserID, NETDEV_ACS_PERSON_LIST_S pstACSPersonList,NETDEV_XW_BATCH_RESULT_LIST_S  pstResultList);

	/**
	 * 批量删除门禁人员信息
	 * @param  lpUserID                                      用户登录ID
	 * @param [INOUT] pstBatchCtrlInfo                           批量控制信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_DeleteACSPersonList(Pointer lpUserID,NETDEV_FACE_BATCH_LIST_S pstBatchCtrlInfo);

	/**
	 * 获取门禁人员信息列表
	 * @param  lpUserID                                      用户登录ID
	 * @param  pstQueryCond                                  门禁人员查询条件
	 * @param [OUT] pstResultInfo                                返回信息
	 * @return 查询句柄，返回NULL表示失败，其他作为NETDEV_FindNextACSPersonInfo,NETDEV_FindCloseACSPersonInfo等函数的参数
	 */
	public Pointer NETDEV_FindACSPersonList(Pointer lpUserID, NETDEV_PERSON_QUERY_INFO_S pstQueryCond, NETDEV_BATCH_OPERATE_BASIC_S pstResultInfo);

	/**
	 * 获取下一个门禁人员信息
	 * @param  lpFindHandle                                  门禁人员信息列表句柄
	 * @param [OUT] pstACSPersonInfo                             门禁人员信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextACSPersonInfo(Pointer lpFindHandle,NETDEV_ACS_PERSON_BASE_INFO_S pstACSPersonInfo);

	/**
	 * 关闭门禁人员信息列表资源
	 * @param  lpFindHandle                                      门禁人员信息列表句柄
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseACSPersonInfo(Pointer lpFindHandle);

	/**
	 * 查询出入记录
	 * @param  lpUserID                                      用户登录ID
	 * @param  pstFindCond                                   出入记录查询条件
	 * @param [OUT] pstResultInfo                                出入记录实际总条数
	 * @return 查询句柄，返回NULL表示失败，其他作为NETDEV_FindNextACSAttendanceLog,NETDEV_FindCloseACSAttendanceLogList等函数的参数
	 * @note 查询之后需要调用NETDEV_FindNextACSAttendanceLog和NETDEV_FindCloseACSAttendanceLogList将数据获取完，否则会造成内存泄露
	 */
	public Pointer NETDEV_FindACSAttendanceLogList(Pointer lpUserID,NETDEV_ALARM_LOG_COND_LIST_S pstFindCond,NETDEV_BATCH_OPERATE_BASIC_S pstResultInfo);

	/**
	 * 获取下一条出入记录
	 * @param  lpFindHandle                              出入记录信息列表句柄
	 * @param [OUT] pstACSLogInfo                            出入记录信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextACSAttendanceLog(Pointer lpFindHandle,NETDEV_ACS_ATTENDANCE_LOG_INFO_S pstACSLogInfo);

	/**
	 * 关闭查询出入记录资源
	 * @param  lpFindHandle                                  出入记录信息列表句柄
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseACSAttendanceLogList(Pointer lpFindHandle);

	/**
	 * 获取指定人员所持门禁卡信息
	 * @param  lpUserID                                      用户登录ID
	 * @param  udwACSPersonID                                门禁人员信息编号
	 * @param [OUT] pstACSPersonCardInfo                                门禁卡信息
	 * @return TRUE表示成功，其他表示失败，
	 */
	public boolean NETDEV_GetACSPersonCardInfo(Pointer lpUserID,int udwACSPersonID,NETDEV_ACS_PERSON_CARD_INFO_S pstACSPersonCardInfo);


	/**
	 * 绑定指定人员的门卡信息（即开卡）
	 * @param  lpUserID                                      用户登录ID
	 * @param  udwACSPersonID                                门禁人员信息编号
	 * @param [INOUT] pstACSPersonCardInfo                       门禁卡信息    udwCardID为输出参数
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_AddACSPersonCardInfo(Pointer lpUserID,int udwACSPersonID,NETDEV_ACS_PERSON_CARD_INFO_S pstACSPersonCardInfo);

	/**
	 * 删除指定人员的门卡信息(即退卡)
	 * @param  lpUserID                                       用户登录ID
	 * @param  udwACSPersonID                                      门禁人员信息编号
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_DeleteACSPersonCardInfo(Pointer lpUserID,int udwACSPersonID);

	/**
	 * 访客签离
	 * @param  lpUserID              用户登录ID
	 * @param  udwPersonID           人员编号
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_ACSPersonSignout(Pointer lpUserID, int udwPersonID);

	/**
	 * 查询访客记录
	 * @param  lpUserID                                      用户登录ID
	 * @param  pstFindCond                                   访客记录查询条件
	 * @param [OUT] pstResultInfo                                访客记录实际总条数
	 * @return 查询句柄，返回NULL表示失败，其他作为NETDEV_FindNextACSVisitLog,NETDEV_FindCloseACSVisitLog等函数的参数
	 */
	public Pointer NETDEV_FindACSVisitLogList(Pointer lpUserID,NETDEV_ALARM_LOG_COND_LIST_S pstFindCond,NETDEV_BATCH_OPERATE_BASIC_S pstResultInfo);

	/**
	 * 获取下一条访客记录
	 * @param  lpFindHandle                              出入记录信息列表句柄
	 * @param [OUT] pstACSLogInfo                            出入记录信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextACSVisitLog(Pointer lpFindHandle,NETDEV_ACS_VISIT_LOG_INFO_S pstACSLogInfo);

	/**
	 * 关闭查询访客记录资源
	 * @param  lpFindHandle                                  出入记录信息列表句柄
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseACSVisitLog(Pointer lpFindHandle);

	/**
	 * 添加访客黑名单
	 * @param  lpUserID                  用户登录ID
	 * @param  pstBlackListInfo          黑名单信息
	 *@param [OUT] pUdwBlackListID          黑名单ID
	 * @return
	 */
	public boolean NETDEV_AddACSPersonBlackList(Pointer lpUserID, NETDEV_ACS_PERSON_BLACKLIST_INFO_S pstBlackListInfo, IntByReference pUdwBlackListID);

	/**
	 * 删除访客黑名单
	 * @param  lpUserID                  用户登录ID
	 * @param  pstBlackList               黑名单信息列表
	 * @return
	 */
	public boolean NETDEV_DeleteACSPersonBlackList(Pointer lpUserID, NETDEV_OPERATE_LIST_S pstBlackList);

	/**
	 * 修改访客黑名单信息
	 * @param  lpUserID                  用户登录ID
	 * @param  pstBlackListInfo          黑名单信息
	 * @return
	 */
	public boolean NETDEV_ModifyACSPersonBlackList(Pointer lpUserID, NETDEV_ACS_PERSON_BLACKLIST_INFO_S pstBlackListInfo);

	/**
	 * 获取指定访客黑名单信息
	 * @param  lpUserID                  用户登录ID
	 * @param  pstBlackListInfo          黑名单信息，其中udwBlackListID作为入参传入
	 * @return
	 */
	public boolean NETDEV_GetACSPersonBlackList(Pointer lpUserID,NETDEV_ACS_PERSON_BLACKLIST_INFO_S pstBlackListInfo);

	/**
	 * 获取访客黑名单列表
	 * @param  lpUserID                                      用户登录ID
	 * @param  pstFindCond                                   查询条件
	 * @param [OUT] pstResultInfo                                实际查询结果
	 * @return 查询句柄，返回NULL表示失败，其他作为NETDEV_FindNextACSPersonBlackList,NETDEV_FindCloseACSPersonBlackList等函数的参数
	 * @note 查询之后需要调用NETDEV_FindNextACSPersonBlackList和NETDEV_FindCloseACSPersonBlackList将数据获取完，否则会造成内存泄露
	 */
	public Pointer NETDEV_FindACSPersonBlackList(Pointer lpUserID, NETDEV_PAGED_QUERY_INFO_S pstQueryCond, NETDEV_BATCH_OPERATE_BASIC_S pstResultInfo);

	/**
	 * 获取下一条记录
	 * @param  lpFindHandle                              访客黑名单列表信息列表句柄
	 * @param [OUT] pstACSPermissionInfo                     访客黑名单列表信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextACSPersonBlackListInfo( Pointer lpFindHandle,NETDEV_ACS_PERSON_BLACKLIST_INFO_S pstBlackListInfo);
	/**
	 * 关闭查询记录资源
	 * @param  lpFindHandle                                 访客黑名单列表句柄
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseACSPersonBlackList(Pointer lpFindHandle);

	/**
	 * 获取指定人员授权信息
	 * @param  lpUserID                       用户登录ID
	 * @param  udwPersonID                    人员ID
	 * @param [INOUT] pstPermissionInfo           人员授权信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetACSPersonPermission(Pointer lpUserID,int udwPersonID,NETDEV_ACS_DOOR_PERMISSION_INFO_S pstPermissionInfo);

	/**
	 * 设置指定人员授权信息
	 * @param  lpUserID                       用户登录ID
	 * @param  udwPersonID                      ID
	 * @param  pstPermissionInfo              人员授权信息
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_SetACSPersonPermission(Pointer lpUserID, int udwPersonID, NETDEV_ACS_DOOR_PERMISSION_INFO_S pstPermissionInfo);

	/**
	 * 门禁通道控制
	 * @param  lpUserID                                      用户登录ID
	 * @param  dwChannelID                                   通道号
	 * @param  dwCommand                                     门禁通道控制命令可参考#NETDEV_DOORCTRL_ACTION_TYPE_E
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_DoorCtrl(Pointer lpUserID,int dwChannelID,int dwCommand);

	/**
	 * 门禁通道批量控制
	 * @param  lpUserID                                      用户登录ID
	 * @param  dwCommand                                     门禁通道控制命令可参考#NETDEV_DOORCTRL_ACTION_TYPE_E
	 * @param  pstBatchCtrlInfo                              批量控制信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_DoorBatchCtrl(Pointer lpUserID,int dwCommand,NETDEV_OPERATE_LIST_S pstBatchCtrlInfo);

	/**
	 * 获取设备系统时间配置 Get device System time configuration
	 * @param   lpUserID    用户id
	 * @param [OUT]  pstSystemTimeInfo    时间配置结构体指针  Pointer to time configuration structure
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 * @note 支持win32 支持VMS
	 */
	public boolean  NETDEV_GetSystemTimeCfg(Pointer lpUserID, NETDEV_TIME_CFG_S stSystemTimeInfo);

	/**
	 * 设置设备系统时间配置 Set device system time configuration
	 * @param   lpUserID    用户id
	 * @param   pstSystemTimeInfo    时间配置结构体指针  Pointer to time configuration structure
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 * @note 支持win32 支持VMS
	 */
	public boolean NETDEV_SetSystemTimeCfg(Pointer lpUserID, NETDEV_TIME_CFG_S pstSystemTimeInfo);

	/**
	 * 获取映射端口 Get UPnP net state info
	 * @param    lpUserID     用户登录句柄 User login ID
	 * @param    pstNatState  网络端口号状态信息 UPnP nat state info
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持NVR 支持IPC
	 */
	public boolean NETDEV_GetUpnpNatState(Pointer lpUserID, NETDEV_UPNP_NAT_STATE_S pstNatState);

	/**
	 * 设置映射端口 Set UPnP net state info
	 * @param    lpUserID                  用户登录句柄 User login ID
	 * @param    pstNatState               网络端口号状态信息 UPnP nat state info
	 * @return TRUE表示成功,其他表示失败  TRUE means success, and any other value means failure.
	 * @note 支持win64 支持IPC
	 */
	public boolean NETDEV_SetUpnpNatState(Pointer lpUserID, NETDEV_UPNP_NAT_STATE_S pstNatState);

	/**
	 * 开启/关闭Telnet
	 * @param    lpUserID                    用户登录ID User login ID
	 * @param    bEnable                     telnet状态
	 * @return TRUE表示成功，其他表示失败
	 * @note 支持win64 支持NVR
	 */
	public boolean NETDEV_EnableTelnet(Pointer lpUserID, int bEnable);

	/**
	 * 根据通道类型和通道ID获取通道详细信息
	 * @param  lpUserID              用户登录ID
	 * @param  dwChnID               通道ID
	 * @param  dwChnType             通道类型,参见# NETDEV_CHN_TYPE_E
	 * @param [INOUT] lpOutBuffer        接收数据的缓冲指针
	 * @param  dwOutBufferSize       接收数据的缓冲长度(以字节为单位)，不能为0
	 * @param [OUT] pdwBytesReturned     实际收到的数据长度指针，不能为NULL
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_GetChnDetailByChnType(Pointer lpUserID, int dwChnID, int dwChnType, Pointer lpOutBuffer, int dwOutBufferSize, IntByReference pdwBytesReturned);

	/**
	 * 根据通道类型和通道ID设置报警输出通道的信息
	 * @param  lpUserID              用户登录ID
	 * @param  dwChnID               通道ID
	 * @param  dwChnType             通道类型,参见# NETDEV_CHN_TYPE_E
	 * @param  lpOutBuffer          接收数据的缓冲指针
	 * @param  dwOutBufferSize       接收数据的缓冲长度(以字节为单位)，不能为0
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_SetChnDetailByChnType(Pointer lpUserID, int dwChnID, int dwChnType, Pointer lpOutBuffer, int dwOutBufferSize);

	/**
	 * 多通道开始客流量统计查询
	 * @param  lpUserID                用户登录ID
	 * @param  pstStatisticCond        客流量统计结构体
	 * @param [OUT] pudwSearchID           客流量查询ID
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_StartMultiTrafficStatistic(Pointer lpUserID, NETDEV_MULTI_TRAFFIC_STATISTICS_COND_S pstStatisticCond, IntByReference pudwSearchID);

	/**
	 * 获取客流量统计进度
	 * @param   lpUserID               用户登录ID
	 * @param   udwSearchID            客流量查询ID
	 * @param [OUT] pudwProgress           客流量统计进度
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_GetTrafficStatisticProgress(Pointer lpUserID, int udwSearchID, IntByReference pudwProgress);

	/**
	 * 停止客流量查询
	 * @param  lpUserID                        用户登录ID
	 * @param  udwSearchID                     客流量查询ID
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_StopTrafficStatistic(Pointer lpUserID, int udwSearchID);

	/**
	 * 获取客流量统计信息列表
	 * @param  lpUserID                用户登录ID
	 * @param  udwSearchID             客流量查询ID
	 * @return 查询句柄(作为NETDEV_FindNextTrafficStatisticInfo, NETDEV_FindCloseTrafficStatisticInfo)，NULL表示失败
	 */
	public Pointer NETDEV_FindTrafficStatisticInfoList(Pointer lpUserID, int udwSearchID);

	/**
	 * 逐个查询获取到的客流量信息
	 * @param  lpFindHandle                查找句柄
	 * @param [OUT] pstStatisticInfo           客流量查询信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindNextTrafficStatisticInfo(Pointer lpFindHandle, NETDEV_TRAFFIC_STATISTICS_INFO_S pstStatisticInfo);

	/**
	 * 关闭查找，释放资源
	 * @param  lpFindHandle
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_FindCloseTrafficStatisticInfo(Pointer lpFindHandle);

	/**
	 * 导出配置文件业务
	 * @param    lpUserID                  用户登录ID User login ID
	 * @param    pszConfigPath             配置文件路径（包含文件名称,后缀名为tgz）
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_GetConfigFile(Pointer lpUserID, String pszConfigPath);

	/**
	 * 导入配置文件业务
	 * @param    lpUserID                  用户登录ID User login ID
	 * @param    pszConfigPath             配置文件路径（包含文件名称,命名格式：设备型号_IP地址_config.tgz, 如：HIC5621E-L-U_192.168.3.112_config.tgz）
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_SetConfigFile(Pointer lpUserID, String pszConfigPath);

	/**
	 * 本地升级设备自身
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    dwUpgradeType           升级类型，参考#NETDEV_UPGRADE_TYPE_E
	 * @param [INOUT]  pszTaskNo             设备返回的任务号,建议长度#NETDEV_LEN_64
	 * @return TRUE表示成功,其他表示失败
	 * @note 临时接口，仅供升级IPC使用,解决IPC本地升级线程启动时间需要约10s问题
	 * @note 调用此接口后需等待10s左右再调用 NETDEV_UploadFirmware
	 */
	public boolean NETDEV_UpgradeDevice(Pointer lpUserID, int dwUpgradeType, String pszTaskNo);

	/**
	 * 本地升级设备自身上传升级包
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    pszPath                 本地升级包路径
	 * @param   pszTaskNo                任务号
	 * @return TRUE表示成功,其他表示失败
	 * @note 临时接口，仅供IPC本地升级使用
	 */
	public boolean NETDEV_UploadDeviceFirmware(Pointer lpUserID, String pszPath, String pszTaskNo);

	/**
	 * 通过通道号获取通道升级状态
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    dwChannelID             通道ID
	 * @param [OUT]  pstUpgradeStatus        升级状态
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_GetUpgradeStatus(Pointer lpUserID, int dwChannelID, NETDEV_UPGRADE_STATUS_S pstUpgradeStatus);

	/**
	 * 设备通道升级
	 * @param    lpUserID                用户登录ID User login ID
	 * @param    pstUpgradeInfo          需升级设备信息指针
	 * @param [INOUT]  pszTaskNo            设备返回的任务号,建议长度#NETDEV_LEN_64
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_UpgradeDeviceChl(Pointer lpUserID, NETDEV_UPGRADE_DEVICE_S pstUpgradeInfo, String pszTaskNo);

	/**
	 * 获取设备信息
	 * @param  lpUserID                 用户登录ID
	 * @param [OUT] pstDeviceInfo         设备信息
	 * @return TRUE表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_GetDeviceBaseInfo(Pointer lpUserID, NETDEV_DEVICE_BASE_INFO_S pstDeviceInfo);

	/**
	 * 获取SDK的版本信息 Get SDK version information
	 * @return 返回int类型数据 SDK版本信息 SDK version information
	 * @note
	 * - 在两个高字节中高8位表示主版本,低八位表示次版本.两个低字节表示附加版本号如0x01080000：表示版本为1.8.0.0.
	 * - The two high bytes,The high-8-bit indicate the major version, and the low-8-bytes indicate the minor version.Two low bytes for additional version numbers For example, 0x01080000 means version 1.8.0.0
	 */
	public int NETDEV_GetSDKVersion();

	/**
	 * 修改设备IP地址（无需登录）
	 * @param    pstDevAddrInfo         要修改的设备地址信息
	 * @return TRUE表示成功,其他表示失败
	 * @note
	 */
	public boolean NETDEV_ModifyDeviceAddr(NETDEV_DEV_ADDR_INFO_S pstDevAddrInfo);

	/**
	 * 查询视频通道信息  Query video channel info
	 * @param    lpUserID           用户登录句柄 User login ID
	 * @param    dwChannelID        通道号 Channel ID
	 * @param [OUT]  pstVideoChlInfo    视频通道信息 video channel info
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_QueryVideoChlInfo(Pointer lpUserID, int dwChannelID, NETDEV_VIDEO_CHL_DETAIL_INFO_S pstVideoChlInfo);

	/**
	 * 获取通道设备基本信息列表
	 * @param    lpUserID                用户登录ID User login ID
	 * @return 业务号,返回0表示失败,其他值作为NETDEV_FindNextChlDeviceInfo等函数的参数.
	 * @note 此函数返回值为通道设备基本信息列表业务号,若返回值为非0,则查询通道设备基本信息列表成功：
	 *         一.将上述业务号作为NETDEV_FindNextDeviceChlInfo函数的入参lpFindHandle,多次调用NETDEV_FindNextDeviceChlInfo函数,以逐个获取详细通道设备基本信息.
	 *         二.查询结束后,必须以上述业务号作为NETDEV_FindCloseDeviceChlList函数的入参lpFindHandle,调用NETDEV_FindCloseDeviceChlList函数,以释放资源,关闭查找.
	 */
	public Pointer NETDEV_FindDevChlBasicInfoList(Pointer lpUserID);

	/**
	 * 逐个获取通道设备基本信息
	 * @param    lpFindHandle                查询Handle
	 * @param [OUT]  pstDeviceInfo               设备信息结构体指针
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_FindNextDevChlBasicInfo(Pointer lpFindHandle, NETDEV_DEVICE_CHL_INFO_S pstDeviceInfo);

	/**
	 * 关闭获取通道设备基本信息
	 * @param    lpFindHandle                查询Handle
	 * @return TRUE表示成功,其他表示失败
	 * @note无
	 */
	public boolean NETDEV_FindCloseDevChlBasicInfo(Pointer lpFindHandle);

	/**
	 * 获取实况码流URL Obtain Live view stream url
	 * @param   lpUserID             用户登录ID User login ID
	 * @param   dwChannelID          通道号 Channel number
	 * @param   dwStreamType         码流类型 参见#NETDEV_LIVE_STREAM_INDEX_E   Stream type see enumeration#NETDEV_LIVE_STREAM_INDEX_E
	 * @param [OUT] pszStreamUrl         码流URL Stream URL,内存长度要求大于等于NETDEV_LEN_260 The length must exceed NETDEV_LEN_260
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetStreamUrl(Pointer lpUserID, int dwChannelID, int dwStreamType, Pointer pszStreamUrl);

	/**
	 * 获取回放URL Obtain replay url
	 * @param   lpUserID             用户登录ID User login ID
	 * @param   dwChannelID          通道号 Channel number
	 * @param   dwStreamType         码流类型 参见#NETDEV_LIVE_STREAM_INDEX_E   Stream type see enumeration#NETDEV_LIVE_STREAM_INDEX_E
	 * @param [OUT] pszReplayUrl  码流URL,内存长度要求大于等于NETDEV_LEN_260 The length must exceed NETDEV_LEN_260
	 * @return TRUE表示成功,其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_GetReplayUrl(Pointer lpUserID, int dwChannelID, int dwStreamType, Pointer pszReplayUrl);

	/**
	 * 获取语音广播组通道的状态
	 * @param  lpPlayHandle           语音广播句柄
	 * @param [OUT] pstGroupInfo          通道状态列表
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_GetVoiceBroadcastChlStatus(Pointer lpPlayHandle, NETDEV_VOICE_BROADCAST_GROUP_INFO_S pstGroupInfo);

	/**
	 * 新建语音广播组
	 * @parma  lpUserID              用户登录ID
	 * @param  pstChnList            通道列表
	 * @return 返回语音广播句柄，NULL表示失败
	 */
	public Pointer NETDEV_CreateVoiceBroadcastGroup(Pointer lpUserID, NETDEV_OPERATE_LIST_S pstChnList);

	/**
	 * 修改语音广播组
	 * @param  lpPlayHandle          语音广播句柄
	 * @param  pstModifyInfo         修改语音广播组信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_ModifyVoiceBroadcastGroup(Pointer lpPlayHandle, NETDEV_MODIFY_VOICE_BROADCAST_INFO_S pstModifyInfo);

	/**
	 * 开启/关闭某个广播通道声音
	 * @param  lpPlayHandle          语音广播句柄
	 * @param  pstCtrlInfo           控制信息
	 * @return TRUE表示成功，其他表示失败
	 */
	public boolean NETDEV_ModifyVoiceBroadcastStatus(Pointer lpPlayHandle, NETDEV_VOICE_BROADCAST_CTRL_INFO_S pstCtrlInfo);

	/**
	 * 设置T2U最大负载
	 * @param    dwT2UPayload         T2U最大负载,MTU设置范围:101-1500 ，默认值是1500。
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 */
	public boolean NETDEV_SetT2UPayLoad(int dwT2UPayload);

	/**
	 * 根据日志类型、时间查找日志信息 Search NVR log by log type and time
	 * @param   lpUserID              用户登录 ID User login ID
	 * @param   pstLogFindCond        日志查询条件 Log search condition
	 * @return 日志查询业务号,返回NETDEV_E_FAILED表示失败，其他值作为NETDEV_CloseFindLog等函数的参数。
	Log search service number. NETDEV_E_FAILED means failure, and any other value is used as the parameter of functions like NETDEV_CloseFindLog.
	 * @note 支持VMS、NVR，操作主、子类型字段不同
	 */
	public Pointer NETDEV_FindLogInfoList(Pointer lpUserID, NETDEV_FIND_LOG_COND_S pstLogFindCond);

	/**
	 * 逐个获取查找到的日志信息 Obtain logone by one
	 * @param   lFindHandle           日志查找句柄 Log search handle
	 * @param [OUT] pstFindData           保存日志信息的指针 Pointer to saved log info
	 * @return NETDEV_E_SUCCEED表示成功，其他表示失败 NETDEV_E_SUCCEED means success, and any other value means failure
	 * @note
	 */
	public boolean NETDEV_FindNextLogInfo(Pointer lpFindHandle, NETDEV_LOG_INFO_S pstLogInfo);

	/**
	 * 关闭日志查找，释放资源 Close log search and release resource
	 * @param   lFindHandle           文件查找句柄 File search handle
	 * @return NETDEV_E_SUCCEED表示成功，其他表示失败 NETDEV_E_SUCCEED means success, and any other value means failure
	 * @note
	 */
	public boolean NETDEV_FindCloseLogInfo(Pointer lpFindHandle);

	/**
	 * 根据时间查询设备告警
	 * @param   lpUserID             用户登录ID
	 * @param   pstAlarmFindCond     告警查询条件
	 * @return 告警查询业务号,返回NETDEV_E_FAILED表示失败，其他值作为NETDEV_CloseFindAlarm等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindAlarmInfoList(Pointer lpUserID,  NETDEV_FIND_ALARM_COND_S pstAlarmFindCond);

	/**
	 * 逐个获取查找到的告警信息
	 * @param   lFindHandle    日志查找句柄
	 * @param [OUT] pstAlarmInfo   保存告警信息
	 * @return NETDEV_E_SUCCEED表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_FindNextAlarmInfo(Pointer lpFindHandle, NETDEV_FIND_ALARM_INFO_S pstAlarmInfo);

	/**
	 * 关闭告警查询，释放资源
	 * @param   lFindHandle  文件查找句柄
	 * @return NETDEV_E_SUCCEED表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_FindCloseAlarmInfo(Pointer lpFindHandle);

	/**
	 * 获取告警日志列表
	 * @param  lpUserID                  用户登录ID
	 * @param  pstFindCond               查询条件
	 * @param [OUT] pdwTotalRealRow          告警日志记录实际总条数
	 * @return 查询句柄,返回0表示失败，其他值作为NETDEV_FindNextAlarmLog、NETDEV_FindCloseAlarmLog等函数的参数。
	 * @note 1、支持分页查询
	 */
	public Pointer NETDEV_FindAlarmLogList(Pointer lpUserID,  NETDEV_ALARM_LOG_COND_LIST_S pstFindCond, IntByReference pdwTotalRealRow);

	/**
	 * 逐个获取查找到的告警日志
	 * @param   lpFindHandle                 查找句柄
	 * @param [OUT] pstAlarmLogInfo              保存告警日志信息的指针
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note 返回失败说明查询结束 A returned failure indicates the end of search.
	 */
	public boolean NETDEV_FindNextAlarmLog(Pointer lpFindHandle, NETDEV_ALARM_LOG_INFO_S pstAlarmLogInfo);

	/**
	 * 关闭查找 告警日志，释放资源
	 * @param  lpFindHandle  文件查找句柄
	 * @return TRUE表示成功，其他表示失败 TRUE means success, and any other value means failure.
	 * @note
	 */
	public boolean NETDEV_FindCloseAlarmLog(Pointer lpFindHandle);

	/**
	 * 获取告警联动抓图URL
	 * @param   lpUserID                     用户登录
	 * @param   pstAlarmSnapShotCond         告警抓图获取条件
	 * @return  查询句柄,返回NULL表示失败，其他值作为NETDEV_GetNextAlarmSnapShotURL、NETDEV_CloseGetAlarmSnapShotURL等函数的参数。
	 * @note
	 */
	public Pointer NETDEV_FindAlarmSnapShotURL(Pointer lpUserID, NETDEV_ALARM_SNAPSHOT_COND_S pstAlarmSnapShotCond);

	/**
	 * 获取下一张图片信息
	 * @param   lpFindHandle                     查询句柄
	 * @param [OUT]  pstAlarmPicInfo         告警抓图图片信息
	 * @return  TRUE表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_FindNextAlarmSnapShotURL(Pointer lpFindHandle, NETDEV_ALARM_SNAPSHOT_PIC_S pstAlarmPicInfo);

	/**
	 * 关闭告警联动抓图FindHandle
	 * @param   lpFindHandle                     查询句柄
	 * @return  TRUE表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_FindCloseAlarmSnapShotURL(Pointer lpFindHandle);

	/**
	 * 保存告警抓图
	 * @param   lpUserID                     用户登录
	 * @param   pstPicFileInfo           告警图片信息
	 * @return  TRUE表示成功，其他表示失败
	 * @note
	 */
	public boolean NETDEV_SaveSnapShotFile(Pointer lpUserID, NETDEV_PIC_FILE_INFO_S pstPicFileInfo);

	/**
	* 启动目标检索
	* @param    lpUserID                    用户登录句柄 User login ID
	* @param    pstStartInfo                查询开始信息 Query start information
	* @param [OUT]  pudwSearchID                业务号 Search ID
	* @return TRUE表示成功,其他表示失败
	* @note无
	*/
	public boolean NETDEV_StartObjectSearch(Pointer lpUserID, NETDEV_QUERY_CHN_CONDITION_S pstStartInfo, IntByReference pudwSearchID);
	
	/**
	* 获取目标检索查询进度
	* @param    lpUserID                    用户登录句柄 User login ID
	* @param    udwSearchID                 业务号 Search ID
	* @param [OUT]  pudwPercent                 查询进度 Query Percent
	* @return TRUE表示成功,其他表示失败
	* @note无
	*/
	public boolean NETDEV_GetObjectSearchProg(Pointer lpUserID, int udwSearchID, IntByReference pudwPercent);

	/**
	* 查询目标检索结果
	* @param    lpUserID                    用户登录句柄 User login ID
	* @param    pstQueryCond                查询条件 Query Condition
	* @param [OUT]  pstQueryResult              查询结果 Query Result
	* @return 此函数返回值为目标检索结果查询查询业务号,若返回值为非0,则查询目标检索结果成功：
	*         一.将上述业务号作为NETDEV_FindNextObjectSearchInfo函数的入参lpFindHandle,多次调用NETDEV_FindNextObjectSearchInfo函数,以逐个获取目标检索结果信息.
	*         二.查询结束后,必须以上述业务号作为NETDEV_FindCloseObjectSearchList函数的入参lpFindHandle,调用NETDEV_FindCloseObjectSearchList函数,以释放资源,关闭查找.
	* @note无
	*/
	public Pointer NETDEV_FindObjectSearchList(Pointer lpUserID, NETDEV_PIC_QUERY_COND_S pstQueryCond, NETDEV_PIC_QUERY_RESULT_S pstQueryResult);
	
	/**
	* 逐个获取查找到的目标检索结果
	* @param    lpFindHandle                    查找句柄 Query handle
	* @param [INOUT]  pstObjectResultInfo             查询到的目标检索结果信息 Object Result information
	* @return TRUE表示成功,其他表示失败
	* @note无
	*/
	public boolean NETDEV_FindNextObjectSearchInfo(Pointer lpFindHandle, NETDEV_OBJECT_RESULT_INFO_S pstObjectResultInfo);
	
	/**
	* 关闭目标检索结果查找,释放资源
	* @param    lpFindHandle                    图片查找句柄 Qearch handle
	* @return TRUE表示成功,其他表示失败
	* @note
	*/
	public boolean NETDEV_FindCloseObjectSearchList(Pointer lpFindHandle);
	
	/**
	* 停止目标检索
	* @param    lpUserID                        用户登录句柄 User login ID
	* @param    udwSearchID                     业务号 Search ID
	* @return TRUE表示成功,其他表示失败
	* @note
	*/
	public boolean NETDEV_StopObjectSearch(Pointer lpUserID, int udwSearchID);
	
	/**
	* 获取指定告警的关联数据 获取查询句柄 
	* @param   lpUserID                          用户登录ID User login ID
    * @param   dwAlarmID                         告警 ID Alarm ID
    * @return 0表示失败,其他表示成功,并作为NETDEV_FindNextAlarmRelatedDataInfo、NETDEV_FindCloseAlarmRelatedDataList的句柄查询权限信息
    * @note VMS支持
	*/
	public Pointer NETDEV_FindAlarmRelatedDataList(Pointer lpUserID, int dwAlarmID);
	
	/**
	*  获取指定告警的关联数据 查找
	* @param   lpFindHandle                查找句柄
	* @param [OUT] pstAlarmRelatedData         告警关联数据
	* @return TRUE表示成功，其他表示失败
	* @note VMS、NVR支持
	*/
	public boolean NETDEV_FindNextAlarmRelatedDataInfo(Pointer lpFindHandle, NETDEV_ALARM_RELATED_DATA_S pstAlarmRelatedData);
	
	/**
	*  获取指定告警的关联数据 关闭查找释放资源
	* @param   lpFindHandle                查找句柄
	* @return TRUE表示成功，其他表示失败
	* @note VMS、NVR支持
	*/
	public boolean NETDEV_FindCloseAlarmRelatedDataList(Pointer lpFindHandle);
	
	/**
	* 获取设备能力集 Obtain device capability
	* @param    lpUserID                用户登录句柄 User login ID
	* @param   dwChannelID              通道号 Channel ID
	* @param    dwCommand               设备能力类型指令 NETDEV_CAPABILITY_COMMOND_E
	* @param [OUT]  lpOutBuffer             接收数据的缓冲指针 Pointer to buffer that receives data
	* @param [OUT]  dwOutBufferSize         接收数据的缓冲长度(以字节为单位)，不能为0 Length (in byte) of buffer that receives data, cannot be 0.
	* @param [OUT]  pdwBytesReturned        实际收到的数据长度指针，不能为NULL  Pointer to length of received data, cannot be NULL.
	* @return TRUE表示成功，其他表示失败      TRUE means success, and any other value means failure.
	* @note
	*/
	public boolean NETDEV_GetDeviceCapability(Pointer lpUserID, int dwChannelID, int dwCommand, Pointer lpOutBuffer, int  dwOutBufferSize, IntByReference pdwBytesReturned);

	
	/**
	* 导入音频文件
	* @param   lpUserID                        用户登录ID User login ID
	* @param   pszFilePath                     音频文件路径 导入音频须为PCM格式，文件大小不得超过100K
	* @return TRUE表示成功，其他表示失败
	* @note 
	*/
	public boolean NETDEV_ImportAudioFile(Pointer lpUserID, String  pszFilePath);
	
	/**
	* 查询音频输出参数
	* @param   lpUserID                        用户登录ID User login ID
	* @param   udwChannelID                    通道ID Channel ID
	* @param [OUT] pstAudioOutputCfg               音频输出参数 Audio OutPut Config
	* @return TRUE表示成功，其他表示失败
	* @note 
	*/
	public boolean NETDEV_GetAudioOutputCfg(Pointer lpUserID,  int udwChannelID,  NETDEV_AUDIO_OUTPUT_CFG_S pstAudioOutputCfg);
	
	/**
	* 设置音频输出参数
	* @param   lpUserID                        用户登录ID User login ID
	* @param   udwChannelID                    通道ID Channel ID
	* @param   pstAudioOutputCfg               音频输出参数 Audio OutPut Config
	* @return TRUE表示成功，其他表示失败
	* @note 
	*/
	public boolean NETDEV_SetAudioOutputCfg(Pointer lpUserID, int udwChannelID, NETDEV_AUDIO_OUTPUT_CFG_S pstAudioOutputCfg);

}