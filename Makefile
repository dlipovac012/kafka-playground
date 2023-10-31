.PHONY: build test clean

build:
	bazel build //...

test:
	bazel test //...

#run: $@

all:
	build

clean:
	bazel clean