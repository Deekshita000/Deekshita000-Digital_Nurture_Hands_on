import React, { Component } from 'react';

class CurrencyConvertor extends Component {

    constructor() {
        super();

        this.state = {
            rupees: "",
            euro: ""
        };
    }

    handleChange = (event) => {
        this.setState({
            rupees: event.target.value
        });
    };

    handleSubmit = () => {

        const euroValue = (this.state.rupees / 90).toFixed(2);

        this.setState({
            euro: euroValue
        });

        alert("Converted Successfully");
    };

    render() {

        return (

            <div>

                <h2>Currency Convertor</h2>

                <label>Indian Rupees :</label>

                <input
                    type="number"
                    value={this.state.rupees}
                    onChange={this.handleChange}
                />

                <br /><br />

                <button onClick={this.handleSubmit}>
                    Convert
                </button>

                <h3>Euro : € {this.state.euro}</h3>

            </div>

        );
    }
}

export default CurrencyConvertor;