/**
 * Created by zak on 5/3/16.
 */
import React from 'react';
import ReactDOM from 'react-dom';
import Hello from './hello';
import Comment from './comment.jsx';

ReactDOM.render(<Hello />, document.getElementById('app'));
ReactDOM.render(<CommentBox />, document.getElementById('content'));
