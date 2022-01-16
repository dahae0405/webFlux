# webFlux
웹플럭스

# 0. 목차
### 0-1. mvc http 게시판 
### 0-1-1. webflux http 게시판 
### 0-2. mvc http webSocket서버 웹채팅

---

# 1. webflux http 게시판 



## 1-1. 요구사항
- Reactive에 맞는 webflux라이브러리 사용
- mvc와 개념 및 코드 비교


## 1-2. 프로젝트 spec 구성
1-2-1. propreties > yml 
-> 설정 값을 한 곳에 관리
: 계층구조와 prefix중복을 제거할 수 있어 가독성 좋음
: cf. property VS yml 차이점 https://url.kr/ajxd7q  

1-2-2. view > thymeleaf
-> thymeleaf를 사용하여 View를 추가 (implementation 'org.springframework.boot:spring-boot-starter-thymeleaf' ) 

1-2-3. DB > H2
-> 휘발성 데이터로 DB연결 없이 빠른 테스트.

1-2-4. DB > Mysql
-> MySQL DB를 추가 ( implementation 'dev.miku:r2dbc-mysql ) 


--- 

## 1-3. 기능
### 1-3-1. 공통
1. DB별 코드 분기 > @Profile("h2")
: profiles를 h2로 설정하였습니다. 
: 어플리케이션을 실행할때, profile에 따라서 DB를 선택할 수 있기 위함입니다.

2. 외부 설정값 호출 > @Value("${ ~~ }") 
: 환경변수값을 가져옵니다.

### 1-3-2. H2 라이브러리 
1. h2-console > 웹에서 DB데이터 조회
-> h2-console config 설정 

2. 테스트 sql 등록 
-> h2-database DB정보설정 및 sql적용 config 설정
-> resource하위 sql ( user, boards 테이블 및 데이터 적재 ) 를 생성했다.
-> localhost:9091 접속 후, jdbc:h2:mem:testdb 설정 후 접근하여 테스트한다.
: H2 DB연결이 초기화될때, resources에 넣어두었던 sql이 실행된것

### 1-3-3. JPA 라이브러리 

1. 매핑할 테이블 지정
-> @Table

2. 시간 오브젝트 자동 생성 
-> @EnableR2dbcAuditing
: 주로, update/create Date에 적용


### 1-3-4. Mysql
-> 대중성.. 
https://doitnow-man.tistory.com/91


--- 

## 
참고 https://tries1.github.io/spring/2021/01/04/spring_async5.html
