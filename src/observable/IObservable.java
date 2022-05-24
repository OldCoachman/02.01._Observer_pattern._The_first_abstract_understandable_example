package observable;

import observer.IObserver;

interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void inform();
}
