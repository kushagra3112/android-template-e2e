#!/bin/sh

echo "Running static analysis with ktlint:"

./gradlew ktlint

status=$?

if [ "$status" = 0 ] ; then
  echo "Static analysis ran successfully."
  exit 0
else
  echo "Static analysis failed. Formatting with ktlint."
  ./gradlew ktlintFormat
  commitMessage=$(cat $1)
  git add .
  git commit -m "$commitMessage" --no-verify
  exit 0
fi