# Proxy 패턴

Proxy 패턴은 다른 객체에 대한 대리자(Proxy)를 제공하여, 객체에 대한 접근을 제어하고 추가적인 기능을 제공하는 Structural Design Pattern(구조 패턴) 중 하나입니다. 이 패턴은 객체의 접근을 간접적으로 관리함으로써 객체에 대한 추가적인 작업을 수행하거나, 객체에 대한 접근을 제한하고 보안을 강화하는데 사용됩니다.

## 주요 구성 요소

1. **Subject (주체)**: 실제 객체와 대리자 객체가 공유하는 인터페이스를 정의합니다. 주체는 클라이언트와 대리자 사이의 공통 인터페이스를 나타냅니다.

2. **RealSubject (실제 주체)**: 주체의 실제 구현을 나타냅니다. 실제 주체는 주로 시간이 오래 걸리거나 공간을 많이 차지하는 작업 등을 수행하는 클래스입니다.

3. **Proxy (대리자)**: 실제 주체에 대한 참조를 유지하고, 실제 주체의 작업을 수행하기 전 또는 후에 추가적인 기능을 제공합니다. Proxy 클래스는 주체와 동일한 인터페이스를 구현하여 클라이언트에게 주체와 동일하게 보이도록 합니다.

## 작동 방식

1. 클라이언트는 Proxy 객체를 사용하여 실제 주체에 접근합니다. Proxy 객체는 실제 주체에 대한 참조를 가지고 있습니다.

2. Proxy 객체는 클라이언트의 요청을 받아 실제 주체에 전달합니다. 이때, Proxy는 추가적인 작업을 수행하거나 실제 주체에 접근을 제한할 수 있습니다.

3. 실제 주체는 Proxy 객체로부터 받은 요청을 처리하고, 결과를 다시 Proxy를 통해 클라이언트에게 반환합니다.

## 활용 예시

Proxy 패턴은 다음과 같은 상황에서 유용하게 사용될 수 있습니다:

- 실제 객체의 생성 비용이 높거나, 많은 시간이 소요되는 작업이 포함된 경우
- 객체에 대한 접근을 제어하고, 보안을 강화하려는 경우
- 객체에 대한 추가적인 기능을 제공하고 싶은 경우 (예: 로깅, 캐싱, 인증 등)

## 장점

- 실제 객체의 생성과 초기화를 늦추어 불필요한 자원 소비를 방지합니다.
- 객체에 대한 접근을 간접적으로 관리함으로써 보안을 강화하거나, 객체에 추가적인 기능을 제공할 수 있습니다.
- 클라이언트 코드가 실제 객체와 Proxy 객체를 동일하게 다룰 수 있어 유연성을 높입니다.

## 단점

- Proxy 객체를 추가함으로써 코드의 복잡성이 증가할 수 있습니다.
- Proxy 객체를 잘못 설계하면 성능 저하나 오버헤드가 발생할 수 있습니다.
