# Largest Tree Values Algorithm in Java

This repository contains an algorithm to return the largest values of a binary tree.

## Problem

Given a binary tree, return the largest values of each level.

## Solution

1. Use the algorithm to scan the tree and an auxiliary list.
2. For each element on its tree level:
    - If the list has an index equal to the level, replace it with the largest value.
    - If not, add it to the list.
