# Flyweight 패턴

Flyweight 패턴은 객체들 간에 공유 가능한 데이터를 효율적으로 관리하여 메모리 사용량을 줄이는 Structural Design Pattern(구조 패턴) 중 하나입니다. 이 패턴은 많은 수의 유사한 객체들이 존재하지만 상태가 유사하거나 동일한 경우, 중복된 데이터를 공유함으로써 메모리 사용을 최소화합니다. 이를 통해 대량의 객체를 효율적으로 생성하고 관리할 수 있습니다.

## 주요 구성 요소

1. **Flyweight (플라이웨이트)**: 공유 가능한 객체를 나타내는 인터페이스 또는 추상 클래스입니다. Flyweight 인터페이스는 공유 상태를 관리하는 메서드를 선언합니다.

2. **ConcreteFlyweight (구체적 플라이웨이트)**: Flyweight 인터페이스를 구현한 클래스로, 실제로 공유 가능한 객체를 나타냅니다. 공유 가능한 상태를 가질 수 있습니다.

3. **FlyweightFactory (플라이웨이트 팩토리)**: Flyweight 객체들을 생성하고 관리하는 팩토리 클래스입니다. FlyweightFactory는 이미 생성된 Flyweight 객체들을 캐싱하여 중복 생성을 방지합니다.

4. **Client (클라이언트)**: Flyweight 객체들을 사용하는 클라이언트 코드입니다. Client는 FlyweightFactory를 통해 Flyweight 객체들을 요청합니다.

## 작동 방식

1. Flyweight 패턴에서는 중복되는 데이터를 공유 가능한 상태로 정의합니다. 이러한 공유 가능한 상태를 Flyweight 객체라고 합니다.

2. FlyweightFactory 클래스는 Flyweight 객체들을 생성하고 관리합니다. 이미 생성된 Flyweight 객체들은 캐싱하여 중복 생성을 방지합니다.

3. 클라이언트 코드에서는 FlyweightFactory를 통해 Flyweight 객체를 요청하고, 공유 가능한 상태를 설정합니다.

4. 클라이언트 코드에서 Flyweight 객체를 사용하면서 필요한 상태를 설정하여 동작합니다. Flyweight 객체는 공유되는 상태와 클라이언트별로 다르게 유지되는 상태를 가집니다.

## 활용 예시

Flyweight 패턴은 다음과 같은 상황에서 유용하게 사용될 수 있습니다:

- 대량의 객체들이 존재하고 이들이 유사한 상태를 가지는 경우 (예: 문자열, 이미지 객체 등)
- 객체들의 생성 비용이 높고, 많은 수의 객체들을 효율적으로 관리해야 하는 경우
- 상태를 공유하는 객체들을 캐싱하여 성능을 개선해야 하는 경우

## 장점

- 메모리 사용을 줄여 대량의 객체를 효율적으로 생성하고 관리할 수 있습니다.
- 공유 상태를 갖는 객체들을 중복 생성하는 것을 방지하여 자원을 절약합니다.
- 유사한 객체들을 관리하기 쉽고, 성능 향상을 이룰 수 있습니다.

## 단점

- 공유 상태와 고유 상태의 구분이 필요하며, 객체의 설계와 관리가 복잡해질 수 있습니다.
- 객체들의 상태가 변경되는 경우 주의가 필요하며, 모든 클라이언트들에게 영향을 미칠 수 있습니다.
