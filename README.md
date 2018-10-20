Bạn có thể chạy theo 1 cách được hướng dẫn như sau đây 
(trong trường hợp không thể chạy thì hãy đưa nó cho 1 người có kinh nghiệm 1 chút về SPRING-BOOT và MAVEN, họ sẽ giúp bạn)

# DB
step1: Cài đặt/Sử dụng hệ quản trị cơ sở dữ liệu mysql
step2: Tạo cơ sở dữ liệu có tên: db_example, username/password lần lượt là root/mysql, hoặc tạo tuỳ ý và điều chỉnh thông số trong file application.property cho khớp 3 thông tin này để chạy.

spring.datasource.url=jdbc:mysql://localhost:3306/db_example
spring.datasource.username=root
spring.datasource.password=mysql

# MAVEN
setup theo link (https://maven.apache.org/) hoặc sử dụng mvnw (mavenwapper) 

# APP
step1: vào foder app mở cmd,
step2: chạy lần lượt từng lệnh sau trên cửa sổ cmd:
"mvn clean install"
"cd target"
"java -jar tnademo-0.0.1-SNAPSHOT.jar"

Ví dụ:

cd /Users/un/Downloads/tnademo 
mvn clean install
cd target
java -jar tnademo-0.0.1-SNAPSHOT.jar

# test
truy cập: 
http://localhost:8080/

