import React, { Component } from 'react';

class EventExamples extends Component {
    constructor() {
        super();

        this.state = {
            counter: 0
        };
    }

    increment = () => {
        this.setState({
            counter: this.state.counter + 1
        });
    };

    decrement = () => {
        this.setState({
            counter: this.state.counter - 1
        });
    };

    sayHello = () => {
        alert("Hello! Have a Nice Day.");
    };

    increase = () => {
        this.increment();
        this.sayHello();
    };

    welcome = (msg) => {
        alert(msg);
    };

    onPress = () => {
        alert("I was clicked");
    };

    render() {
        return (
            <div>

                <h2>Counter Example</h2>

                <h3>Counter : {this.state.counter}</h3>

                <button onClick={this.increase}>
                    Increment
                </button>

                &nbsp;

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button
                    onClick={() => this.welcome("Welcome")}
                >
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.onPress}>
                    OnPress
                </button>

            </div>
        );
    }
}

export default EventExamples;