예를들어 Spring Security 처럼 사용이 고정되어 있는 경우

* Account라는 라이브러리 인터페이스를 받아서 처리는 경우

CustomAccount 라는 객체를 새성하고 Account라는 인터페이스를 구현한다.

그렇게 되면 Account라는 인터페이스를 받아서 처리하는 모든 곳에서 CustomAccount를 사용할 수 있다.
