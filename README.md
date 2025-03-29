# shop-demo-server

## 项目依赖介绍
### 1. **Lombok**
通过注解简化 Java 代码编写，自动生成常用方法（如 `getter`、`setter`、`toString`、`构造函数` 等）。例如，使用 `@Data` 注解可一键生成类的基础方法，减少冗余代码，提升开发效率。

### 2. **Spring Boot DevTools**
专为开发阶段设计的工具，核心功能包括：
- **自动重启**：代码修改后自动重启应用，无需手动启停。
- **静态资源刷新**：修改 CSS、JS 等静态资源时，自动触发浏览器刷新。
- **禁用模板缓存**：开发时禁用 Thymeleaf 等模板引擎的缓存，确保页面实时显示修改效果。

### 3. **Spring Web**
用于构建 Web 应用，支持以下能力：
- 处理 HTTP 请求，开发 RESTful 接口。
- 集成 Spring MVC，实现控制器（Controller）、请求映射（`@RequestMapping`）等 Web 开发功能。
- 支持异步请求处理、文件上传等常见 Web 场景。

### 4. **Spring Session**
管理用户会话（Session），解决分布式系统或微服务架构下的会话共享问题：
- 将会话数据存储到 Redis、数据库等外部介质，避免单机会话限制。
- 统一管理用户登录状态，确保多节点应用的会话一致性。

### 5. **Spring Security**
保障应用安全，提供以下功能：
- **认证（Authentication）**：验证用户身份（如用户名密码、OAuth2 登录）。
- **授权（Authorization）**：控制用户对资源的访问权限（如角色权限、接口权限）。
- 防范常见安全攻击（如 CSRF、XSS），提供安全的会话管理和密码加密等机制。

### 6. **MyBatis Framework**
一款优秀的 ORM（对象关系映射）框架，作用包括：
- 简化数据库操作，通过 XML 或注解配置 SQL 语句，映射 Java 对象与数据库表。
- 提供动态 SQL、缓存管理等功能，高效执行数据库增删改查操作。

### 7. **MySQL Driver**
提供 Java 应用连接 MySQL 数据库的驱动程序：
- 建立应用与 MySQL 数据库的连接，执行 SQL 语句，获取查询结果。
- 是 MyBatis 等数据库操作框架与 MySQL 交互的基础依赖。
