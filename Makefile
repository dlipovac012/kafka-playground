.PHONY: build clean update test

update:
	bazel run @unpinned_maven//:pin

build:
	bazel build //...

test:
	bazel test //...

clean:
	bazel clean