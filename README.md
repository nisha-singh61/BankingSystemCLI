# Multithreaded Banking & Transaction Engine (CLI)

A robust, thread-safe console-based banking application built in Core Java. This project simulates concurrent account operations, multi-threaded deposits, and secure money transfers while preventing race conditions and deadlocks.

---

## 🚀 Key Features
* **Thread-Safe Account Operations:** Utilizes `ReentrantLock` per account to ensure mutual exclusion during simultaneous deposits and withdrawals.
* **Concurrent Storage:** Built using `ConcurrentHashMap` to support thread-safe, high-performance in-memory account management across multiple threads.
* **Deadlock Prevention:** Implements strict global lock-ordering (comparing account numbers lexicographically) during multi-account fund transfers to avoid circular wait conditions.
* **Custom Exception Handling:** Gracefully handles business logic failures (e.g., `InsufficientBalanceException`, `AccountNotFoundException`, `IllegalArgumentException`) without application crashes.
* **Concurrency Stress Testing:** Includes an automated stress test runner powered by `ExecutorService` to execute simultaneous transactions safely.

---

## 🗂️ Project Architecture & File Structure

```text
src/
│
├── InsufficientBalanceException.java   # Custom runtime exception for low funds
├── AccountNotFoundException.java       # Custom runtime exception for missing accounts
├── Account.java                        # Thread-safe model containing balance and ReentrantLock
├── BankService.java                    # Business logic layer (ConcurrentHashMap & Transfers)
└── Main.java                           # Interactive CLI menu & multithreaded stress test runner
