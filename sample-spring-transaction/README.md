# 测试例子数据库ddl
```
-- 创建数据库，并设置字符集为utf8mb4和排序规则为utf8mb4_general_ci
CREATE DATABASE my_test CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- 切换到刚创建的数据库
USE my_test;

-- 创建表，并设置字符集为utf8mb4和排序规则为utf8mb4_general_ci
CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

```