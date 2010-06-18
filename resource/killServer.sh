#!/bin/bash
head -n 1 ${1}/postmaster.pid | xargs kill
