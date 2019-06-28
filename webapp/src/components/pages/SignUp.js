import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from "@material-ui/core/TextField";

function SignUp() {
    return (
        <div style={contentStyle}>
            <h1>Sign up</h1>
            <TextField
                id="standard-name"
                label="First name"
                margin="normal"
            />
            <TextField
                id="standard-name"
                label="Last name"
                margin="normal"
            />
            <TextField
                id="standard-name"
                label="Email"
                margin="normal"
            />
            <TextField
                id="standard-name"
                label="Login"
                margin="normal"
            />
            <TextField
                id="standard-password-input"
                label="Password"
                type="password"
                autoComplete="current-password"
                margin="normal"
            />
            <TextField
                id="standard-password-input"
                label="Confirm password"
                type="password"
                autoComplete="current-password"
                margin="normal"
            />

            <Button href={"/"} style={addButtonStyle}>Sign up</Button>
        </div>
    )
}

const addButtonStyle = {
    background: 'linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)',
    border: 0,
    borderRadius: 30,
    boxShadow: '0 3px 5px 2px rgba(255, 105, 135, .3)',
    color: 'white',
    height: 48,
    padding: '0 30px',
    margin: '10px',
    marginTop:'20px'
};

const contentStyle = {
    textAlign: 'center',
    height: '90vh',
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center'
};

export default SignUp

