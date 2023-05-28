package cn.timelost.aws.vo;

import cn.timelost.aws.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: hyw
 * @Date: 2022/12/25 9:59
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 5085403015235441808L;
    private Integer code;
    private String msg;
    private T data;
    private Long timestamp = System.currentTimeMillis();
    private int[] permission;

    public static ResultVo<Void> success() {
        ResultVo<Void> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = ResultEnum.SUCCESS.getMessage();
        return ResultVO;
    }

    public static <T> ResultVo<T> success(T data) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = ResultEnum.SUCCESS.getMessage();
        ResultVO.data = data;
        return ResultVO;
    }
    public static <T> ResultVo<T> success(T data,int[] permission) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = ResultEnum.SUCCESS.getMessage();
        ResultVO.data = data;
        ResultVO.permission=permission;
        return ResultVO;
    }

    public static ResultVo<Void> successMsg(String msg) {
        ResultVo<Void> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = msg;
        return ResultVO;
    }

    public static <T> ResultVo<T> fail(ResultEnum resultEnum) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = resultEnum.getCode();
        ResultVO.msg = resultEnum.getMessage();
        return ResultVO;
    }

    public static <T> ResultVo<T> fail(ResultEnum resultEnum, String msg) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = resultEnum.getCode();
        ResultVO.msg = msg;
        return ResultVO;
    }

    public static <T> ResultVo<T> fail(String msg) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.ERROR.getCode();
        ResultVO.msg = msg;
        return ResultVO;
    }
}
