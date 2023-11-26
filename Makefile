.PHONY: build clean update test

update:
	bazel run @unpinned_maven//:pin

build:
	bazel build //...

test:
	bazel test --test_output=all --notest_keep_going --cache_test_results=no //...

run:
	bazel run //api:run_local

pin:
	bazel run @unpinned_maven//:pin

clean:
	bazel clean