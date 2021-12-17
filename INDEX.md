### 🚀 step1
- 현재 코드를 분석 하면서 어떤 점을 고치고 싶은지 니즈를 파악해본다.

### 🚀 step2
- 상속 기반의 이벤트로 변경 해본다.
- 이벤트 객체를 만들기 위해 ApplicationEvent 를 상속 받아 데이터 전달을 위해 객체를 만들어본다.
- 이벤트 객체로 부터 전달 받을 EventListener 구현체를 만들어본다.
- ApplicationEventPublisher 를 주입 받아서 이벤트를 발행 시킨다.
- 테스트 코드 작성 
  > Mockito 활용

### 📖 살펴볼 객체
- `AbstractApplicationContext` 를 intellij 의 diagram 을 통해서 구조를 살펴보면 `ApplicationEventPublisher` 를 상속 받고 있습니다.
- `AbstractApplicationContext`::publishEvent 메소드를 보면 이벤트의 발행이 어떻게 되는지 알 수 있습니다.
> 조금 설명을 드리면  위의 메소드 안에서 ApplicationEventMulticaster 를 주입 받아 이벤트를 실행 시키는데 구현체 중 `SimpleApplicationEventMulticater` 를 살펴보면 (위와 같이 다이어그램으로 표현) multicastEvent 메소드를 통해서 빈으로 등록된 이벤트 객체를 실행을 합니다

### 🚀 step3
- 추가 기능(어드민에서 쿠폰 및 환영 메시지를 보낼 수 있는 기능이 있다.)
- `@EventListener` 어노테이션을 활용해 코드를 변경 해보자.
    - >스프링 4.2 부터 ApplicationEvent 를 상속 받아 객체를 생성하지 않아도 이벤트 객체 처럼 활용할 수 있다.  `ApplicationListenerMethodAdapter` 객체에서 어노테이션을 찾아서 실행
- 어드민에 알람을 보내는 중에 예외처리를 해보자
    - >`@TransactionalEventListener` 를 활용해 트랜잭션 단위를 제어해보자.
- 비동기 활용
  - >`@EnableAsync` 와 `@Async` 를 활용해 비동기 처리를 해보자.

### 🚀 step4
- Domain Event
    - > AbstractAggregateRoot 를 상속 받아 이벤트를 제공
    - >registerEvent 를 통해 jpa의 save 를 명시적으로 할 때 마다 이벤트를 발행
