package cn.timelost.aws.entity.vo;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExportExcelSheet {
    //sheet
    String value();
}
