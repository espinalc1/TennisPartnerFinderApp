import React, {Component} from 'react';
import axios from "axios"

class UserRequest extends Component {

    constructor(props) {
        super(props);

        this.state = {
            post: []
        }
    }

    updateUserProfile(userObj) {
        axios.post("https://jsonplaceholder.typicode.com/users")
            .then(respond => {
                if(respond.error === "409"){
                    window.alert("this username has been registered.");
                } else {
                    window.alert("account registered!")
                }
                
            })
            .catch(error => {
                console.log(error);
            })
    }

    registration(inputObj) {
        axios.post("https://jsonplaceholder.typicode.com/users")
            .then(respond => {
                if(respond.error === "409"){
                    window.alert("this username has been registered.");
                } else {
                    window.alert("account registered!")
                }
                
            })
            .catch(error => {
                console.log(error);
            })
    }

    componentDidMount(){
        axios.get("https://jsonplaceholder.typicode.com/users")
            .then(respond => {
                console.log(respond);
                this.setState({
                    post: respond.data
                })
            })
            .catch(error => {
                console.log(error);
            })
    }


}