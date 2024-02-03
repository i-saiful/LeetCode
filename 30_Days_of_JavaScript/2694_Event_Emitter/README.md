# 2694. Event Emitter

- Problem: [https://leetcode.com](https://leetcode.com/problems/event-emitter)

```javascript
class EventEmitter {
    events = {}
    /**
     * @param {string} eventName
     * @param {Function} callback
     * @return {Object}
     */
    subscribe(eventName, callback) {
        this.events[eventName] = this.events[eventName] || []
        this.events[eventName].push(callback)
        return {
            unsubscribe: () => {
                this.events[eventName] = this.events[eventName].filter(fn => fn !== callback)
            }
        };
    }
    
    /**
     * @param {string} eventName
     * @param {Array} args
     * @return {Array}
     */
    emit(eventName, args = []) {
        const resutl = []
        if(this.events[eventName]){
            for(let fn of this.events[eventName]){
                resutl.push(fn(...args))
            }
        }
        return resutl
    }
}

/**
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */
```