package com.nama.jdbcclientdemo.model;

import java.time.Instant;

public record Person(Long id, String firstName, String lastName, Instant createdAt) {
}