if git ls-remote --exit-code --heads origin dev &>/dev/null; then
    echo "Branch exists in the remote repository."
else
    echo "Branch does not exist in the remote repository."
fi
