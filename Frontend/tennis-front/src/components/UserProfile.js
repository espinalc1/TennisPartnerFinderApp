import React, {Component} from 'react';

class UserProfile extends Component{
    constructor(props) {
        super(props);

        this.state = {

        }
    }

    editProfileHandler(event) {

    }

    logOutHandler(event) {

    }

    userStatusHandler(event) {

    }

    render() {
        return (
            <div>
                <h1>Welcome back, Robbie</h1>
                <button onClick={this.editProfileHandler}>Edit Profile</button>
                <button onClick={this.userStatusHandler}>Set status to "I am available!"</button>
                <button onClick={this.logOutHandler}>Log Out</button>
            </div>
        )
    }
}

export default UserProfile;