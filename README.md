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
