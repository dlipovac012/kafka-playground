.PHONY: build test clean

build:
	bazel build //...

test:
	bazel test //...

clean:
	bazel clean