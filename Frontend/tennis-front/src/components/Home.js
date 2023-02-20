import React, {Component} from 'react';
import CreateAccount from "./CreateAccount"

class Home extends Component{
    constructor(props){
        super(props);
        this.state = {
            username : "",
            password : ""
        }
    }

    usernameHandler = (event) => {
        this.setState({
            username: event.target.value
        });
    }

    passwordHandler = (event) => {
        this.setState(
            {
                password: event.target.value
            }
        );
    }

    loginHandler = (event) => {
        alert(`username: ${this.state.username} password: ${this.state.password}`);
        event.preventDefault();
    }

    render() {
        return(
        <div>
            <form onSubmit={this.loginHandler}>
            <div>
                <h1>Please login with you account</h1>
                <label>Username</label>
                <input type="text" value={this.state.username} onChange={this.usernameHandler}></input>
                <label>Password</label>
                <input type="password" value={this.state.password} onChange={this.passwordHandler}></input>
                <button type="submit">Login</button>
                <button type="submit">Create account</button>
                <CreateAccount></CreateAccount>
            </div>
            </form>
        </div>) 
        
    }
}

export default Home;