import React, {Component} from 'react';

class ManageUserPage extends Component{
    constructor(props) {
        super(props);

        this.state = {

        }
    }

    deactivateAccount(event) {

    }

    activateAccount(event) {

    }

    deleteAccountHandler(event) {

    }

    modifyUserHandler(event) {

    }

    render() {
        return (
            <div>
                <h1>Welcome back, Robbie</h1>
                <button onClick={this.activateAccount}>Activate Account</button>
                <button onClick={this.deleteAccountHandler}>Deleted Account</button>
                <button onClick={this.modifyUserHandler}>Deleted Account</button>
            </div>
        )
    }
}

export default ManageUserPage;