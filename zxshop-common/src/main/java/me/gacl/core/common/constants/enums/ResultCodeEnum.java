package me.gacl.core.common.constants.enums;

public enum ResultCodeEnum {
	/**
	 * 成功 
	 */
	RESULT_SUCCESS(1,"成功"),
	/**
	 * 服务器异常 操作操时
	 */
	RESULT_SYSERROR(9999,"呀！出错了");
	
	private int code;
	private String desc;
	
	private ResultCodeEnum(int code,String desc) {
        this.code = code;
        this.desc = desc;

    }
	
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public String toString(){
		return code+":"+desc;
	}
}
