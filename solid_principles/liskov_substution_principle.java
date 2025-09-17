// BAD - Violates LSP
abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        // Eagle can fly - correct implementation
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Ostrich cannot fly - dummy/incorrect implementation!
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}

// ----------------------------------separator---------------------------------------------------------
// GOOD - Follows LSP
abstract class Bird {
    abstract void move();
}

abstract class FlyingBird extends Bird {
    abstract void fly();
    
    @Override
    void move() {
        fly();
    }
}

abstract class NonFlyingBird extends Bird {
    abstract void walk();
    
    @Override
    void move() {
        walk();
    }
}

class Eagle extends FlyingBird {
    @Override
    public void fly() {
        // Eagle flies
    }
}

class Ostrich extends NonFlyingBird {
    @Override
    public void walk() {
        // Ostrich walks
    }
}
