package com.xiongxin.sample;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //1. 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("/home/xiongxin/Code/java/samples/question-mark/src/main/java");
        gc.setOpen(false);
        gc.setFileOverride(true);
        gc.setBaseResultMap(true);//生成基本的resultMap
        gc.setBaseColumnList(false);//生成基本的SQL片段
        gc.setAuthor("lihaodong");// 作者
        mpg.setGlobalConfig(gc);
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setEntity("entity.java");
        mpg.setTemplate(templateConfig);


        //2. 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("org.mariadb.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/question");
        mpg.setDataSource(dsc);

        //3. 策略配置globalConfiguration中
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix("");// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//        strategy.setSuperEntityClass("com.xiongxin.sample.domain.DO");
        strategy.setInclude("question"); // 需要生成的表
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);

        //4. 包名策略配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.xiongxin.sample");
        pc.setEntity("domain.DO");
        pc.setMapper("dao");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }
}
