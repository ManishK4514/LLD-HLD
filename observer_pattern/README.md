# Observer Pattern

## 🔹 What is the Observer Pattern?

The Observer Pattern is a behavioral design pattern where an object (Subject/Publisher) maintains a list of dependents (Observers/Subscribers) and automatically notifies them of any state changes.

---

### 👉 Real-world Analogy

- **YouTube Channel (Subject):** Users subscribe to it.
- **Subscribers (Observers):** Get notified whenever a new video is uploaded.

---

## 🔹 Structure of the Pattern

### **Subject (Publisher)**
- Keeps track of observers.
- Provides methods to attach/detach observers.
- Notifies observers when a change happens.

### **Observer (Subscriber)**
- Defines an interface to receive updates from the subject.

### **ConcreteSubject**
- Implements Subject and maintains state.
- Notifies observers when state changes.

### **ConcreteObserver**
- Implements Observer and updates itself based on Subject changes.