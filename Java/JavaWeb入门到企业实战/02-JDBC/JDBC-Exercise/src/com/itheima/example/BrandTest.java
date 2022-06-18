package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.pojo.Brand;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 * 品牌数据的增删改查操作
 */
public class BrandTest {
    @Test
    /**
     * 查询所有
     */
    public static void testSelectAll() throws Exception {
        // 获取 Druid Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/zhihaozhuang/IdeaProjects/JDBC-Exercise/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        // 定义 SQL 语句
        String sql = "select * from tb_brand;";
        // 获取 Prepared Statement 对象
        PreparedStatement ptsmt = conn.prepareStatement(sql);
        // 执行 SQL
        ResultSet rs = ptsmt.executeQuery();
        // 处理结果 List<Brand>
        Brand brand = null;
        ArrayList<Brand> brands = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
            brands.add(brand);
        }
        System.out.println(brands);
        // 释放资源
        rs.close();
        ptsmt.close();
        conn.close();
    }

    /**
     * 添加
     *
     * @throws Exception
     */
    @Test
    public static void testAdd() throws Exception {
        // 接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘有限公司";
        int ordered = 25;
        String description = "环绕世界2.5圈";
        int status = 1;
        // 获取 Druid Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/zhihaozhuang/IdeaProjects/JDBC-Exercise/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        // 定义 SQL 语句
        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status) values(?,?,?,?,?);";
        // 获取 Prepared Statement 对象
        PreparedStatement ptsmt = conn.prepareStatement(sql);
        // 设置参数
        ptsmt.setString(1, brandName);
        ptsmt.setString(2, companyName);
        ptsmt.setInt(3, ordered);
        ptsmt.setString(4, description);
        ptsmt.setInt(5, status);
        // 执行 SQL
        int count = ptsmt.executeUpdate();
        // 处理结果
        System.out.println(count > 0);
        // 释放资源
        ptsmt.close();
        conn.close();
    }

    /**
     * 修改
     */
    @Test
    public static void testUpdateById() throws Exception {
        // 接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 20;
        String description = "环绕世界2圈";
        int status = 1;
        int id = 4;
        // 获取 Druid Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/zhihaozhuang/IdeaProjects/JDBC-Exercise/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        // 定义 SQL 语句
        String sql = "update tb_brand\n" +
                "set brand_name = ?,\n" +
                "company_name = ?,\n" +
                "ordered=?,\n" +
                "description=?,\n" +
                "status=?\n" +
                "where id = ?;";
        // 获取 Prepared Statement 对象
        PreparedStatement ptsmt = conn.prepareStatement(sql);
        // 设置参数
        ptsmt.setString(1, brandName);
        ptsmt.setString(2, companyName);
        ptsmt.setInt(3, ordered);
        ptsmt.setString(4, description);
        ptsmt.setInt(5, status);
        ptsmt.setInt(6, id);
        // 执行 SQL
        int count = ptsmt.executeUpdate();
        // 处理结果
        System.out.println(count > 0);
        // 释放资源
        ptsmt.close();
        conn.close();
    }

    /**
     * 删除
     */
    @Test
    public static void testDeleteById() throws Exception {
        int id = 4;
        // 获取 Druid Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/zhihaozhuang/IdeaProjects/JDBC-Exercise/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        // 定义 SQL 语句
        String sql = "delete from tb_brand where id = ?;";
        // 获取 Prepared Statement 对象
        PreparedStatement ptsmt = conn.prepareStatement(sql);
        ptsmt.setInt(1, id);
        // 执行 SQL
        int count = ptsmt.executeUpdate();
        // 处理结果
        System.out.println(count > 0);
        // 释放资源
        ptsmt.close();
        conn.close();
    }

}
