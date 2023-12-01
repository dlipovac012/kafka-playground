# Kafka + Bazel + Spring Boot playground

Playgrounds monorepo for experimenting with different technologies.
Currently, in use:
- Kafka
- JUnit5
- Bazel
- Spring Boot

### Prerequisites:
- Bazilisk (Bazel wrapper)
- Java 17 (Azul Zulu)

### Cheatsheet:

- To update `maven_install.json`, run:
```bash
bazel run @unpinned_maven//:pin
```

### Setting `kubectl` context to minikube
```bash
kubectl config use-context docker-desktop
```