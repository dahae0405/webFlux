# webFlux
웹플럭스


# 구성
1. 라이브러리
2. 외부설정값을 관리하는 파일 : yml 
: 계층구조와 prefix중복을 제거할 수 있어 가독성 좋음
: cf. property VS yml 차이점 https://url.kr/ajxd7q  
- 

# 어노테이션
1. @Profile("h2")
: profiles를 h2로 설정하였습니다. 
: 어플리케이션을 실행할때, profile에 따라서 DB를 선택할 수 있기 위함입니다.
2. @Value("${ ~~ }") 
: 환경변수값을 가져옵니다.
4. 


# H2관련 기능 ( h2-console, sql )  적용
1. h2-console config 설정 
2. h2-database DB정보설정 및 sql적용 config 설정
3. resource하위 sql ( user, boards 테이블 및 데이터 적재 ) 를 생성했다.
4. localhost:9091 접속 후, jdbc:h2:mem:testdb 설정 후 접근하여 테스트한다.
:H2 DB연결이 초기화될때, resources에 넣어두었던 sql이 실행된것

