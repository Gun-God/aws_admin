package cn.timelost.aws.entity.vo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExportExcelField {
    // 记录字段名
    String title() default "未知列名";
    // 预设列宽
    int width() default 10;
    // 预设允许的最大列宽
    int maxWidth() default 30;
    // 列顺序，越小越靠前
    int order() default 65535;
    // 该列是否自适应列宽
    boolean autoSized() default true;
}
