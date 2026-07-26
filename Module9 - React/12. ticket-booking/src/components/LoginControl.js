import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class LoginControl extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    handleLogin = () => {
        this.setState({
            isLoggedIn: true
        });
    }

    handleLogout = () => {
        this.setState({
            isLoggedIn: false
        });
    }

    render() {

        const isLoggedIn = this.state.isLoggedIn;

        let button;
        let page;

        if (isLoggedIn) {
            button = (
                <button onClick={this.handleLogout}>
                    Logout
                </button>
            );

            page = <UserPage />;
        }
        else {
            button = (
                <button onClick={this.handleLogin}>
                    Login
                </button>
            );

            page = <GuestPage />;
        }

        return (
            <div>
                {button}
                <br /><br />
                {page}
            </div>
        );
    }
}

export default LoginControl;