import React, {Component} from 'react';

class CreateAccount extends Component{
    constructor(props){
        super(props);
        this.state = {
            username : "",
            password : "",
            gender: "",
            age: 0,
            ustaRating: 0
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

    genderHandler = (event) => {
        this.setState(
            {
                gender: event.target.value
            }
        );
    }

    ageHandler = (event) => {
        this.setState(
            {
                age: event.target.value
            }
        );
    }

    ustaRatingHandler = (event) => {
        
        this.setState(
            {
                ustaRating: event.target.value
            }
        );
    }

    submitHandler = (event) => {
        window.alert(this.state.password + this.state.username + this.state.ustaRating + this.state.age);
        event.preventDefault();
    }

    render() {
        return(
        <div>
            <form >
            <div>
                <h1>Please enter information for your account</h1>
                <label>Username</label>
                <input type="text" value={this.state.username} onChange={this.usernameHandler}></input>
                <label>Password</label>
                <input type="password" value={this.state.password} onChange={this.passwordHandler}></input>
                <label>Gender</label>
                <select>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
                <label>Age</label>
                <input type="number" value={this.state.age} onChange={this.ageHandler}></input>
                <label>USTA Rating</label>
                <input type="number" value={this.state.ustaRating} onChange={this.ustaRatingHandler}></input>
                <button type="submit" onClick={this.submitHandler}>Create account</button>
            </div>
            </form>
        </div>) 
        
    }
}

export default CreateAccount;