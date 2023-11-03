.PHONY: build clean update test

update:
	bazel run @unpinned_maven//:pin

build:
	bazel build //...

test:
	bazel test //... --sandbox_debug

clean:
	bazel clean