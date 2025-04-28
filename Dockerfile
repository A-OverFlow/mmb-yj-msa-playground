# Java 17 버전 기반 이미지
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 jar 파일 복사
COPY ./build/libs/*.jar app.jar

# 포트 오픈 (Spring Boot 서버 포트)
EXPOSE 8085

# 실행
ENTRYPOINT ["java", "-jar", "app.jar"]